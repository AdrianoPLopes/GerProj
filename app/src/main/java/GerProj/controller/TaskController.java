package GerProj.controller;



import GerProj.model.Task;
import GerProj.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TaskController {
    
        
    public void save(Task task) throws SQLException{
        
        
        String sql = "INSERT INTO tasks(idProject,"
                + "name,"
                + "description,"
                + "completed,"
                + "notes,"
                + "deadLine,"
                + "createdAt,"
                + "updatedAt)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
               
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            statement  = conn.prepareStatement(sql);
            
            
            
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.getIsCompleted());            
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadLine().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));            
            
            
            statement.execute();
            
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar a tarefa. ", ex);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
            
            if (statement != null){
                statement.close();
            }
        }
    }
    
    public void update(Task task){
        
        String sql = "UPDATE tasks SET "
                +  "idProject = ?,"
                + "name = ?,"
                + "description = ?,"
                + "notes = ?, "
                + "completed = ?,"
                + "deadLine = ?, "
                + "createdAt = ?, "
                + "updatedAt = ?,"
                + "WHERE id = ?";
                
            Connection conn = null;
            PreparedStatement statement = null;
            
            try {
                //estabelecando a conexão com o banco de dados 
                    conn = ConnectionFactory.getConnection();
                    //preparando a query
                    statement = conn.prepareStatement(sql);
                    
                   //setando os valores do statement
                    statement.setInt(1, task.getIdProject());
                    statement.setString(2, task.getName());
                    statement.setString(3, task.getDescription());
                    statement.setString(4, task.getNotes());
                    statement.setBoolean(5, task.isIsCompleted());
                    statement.setDate(6, new Date(task.getDeadLine().getTime()));
                    statement.setDate(7, new Date(task.getCreatedAt().getTime()));
                    statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
                    statement.setInt(9, task.getId());
                    //executando a query
                    statement.execute();
                    
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar a tarefa", e);
        }
                
        
    }
    
    public void removeById(int taskId) throws SQLException{
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            
            //estabelecendo a conexao com o banco de dados 
            conn = ConnectionFactory.getConnection();
            //preparando a query
            statement = conn.prepareStatement(sql);
            //setando os valores do statement
            statement.setInt(1, taskId);
            //executando a query
            statement.execute();
                        
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar a tarefa" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
            
            if(statement != null) {
                statement.close();
            }
        }
    }
    
    public List<Task> getAll(int idProject){
        String sql = "SELECT * FROM task WHERE idProject = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        //Lista de tarefas que será devolvida quando a chamada do metodo acontecer
        List<Task> tasks = new ArrayList();
        //redundante new ArrayList<Task>
        
        try {
            //criação de concexão
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
           //setando o valor que corresponde ao filtro de busca
            statement.setInt(1, idProject);
            //valor retornado pela execução da query
            resultSet = statement.executeQuery();
            
            //enquanto tiver valor a ser pesquisado será executado
            while(resultSet.next()){
             
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("Notes"));
                task.setIsCompleted(resultSet.getBoolean("completed"));
                task.setDeadLine(resultSet.getDate("deadLine"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatesAt"));
                tasks.add(task);
                
            }
            
            
        } catch (SQLException ex) {
             throw new RuntimeException("Erro ao deletar a tarefa" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }
        
        
        
        
        //Lista de tarefas que foi criada e carregada
        return tasks;
    }
}
