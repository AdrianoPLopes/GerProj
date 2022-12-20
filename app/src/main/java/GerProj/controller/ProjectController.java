package GerProj.controller;


import GerProj.model.Project;
import GerProj.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adriano
 */
public class ProjectController {
    
    public void save(Project project) throws SQLException {

        String sql = "INSERT INTO projects(name,"
                + " description,"
                + " createdAt,"
                + " updatedAt)"
                + " VALUES (?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            //Cria uma conexão com o banco
            conn = ConnectionFactory.getConnection();
            
            //Cria um PreparedStatement, classe usada para executar a query
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            
            //executa a sql para iserção de dados 
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException ("Erro ao salvar o projeto", ex);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }
        
                
    }
    

public void update(Project project) throws SQLException{
    String sql = "UPDATE projects SET "
            + "name = ?, "
            + "description = ?, "
            + "createdAt = ?, "
            + "updatedAt = ? "
            + "WHERE id = ?";
            
        Connection conn = null;
        PreparedStatement statement = null;
    
        
        try {
            conn = ConnectionFactory.getConnection();
            
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());
            
            //Executa a sql para iserção de dados
            statement.execute();            
        } catch(SQLException ex) {
            throw new RuntimeException("Erro ao atualizar o projeto", ex);
        } finally {
            ConnectionFactory.closeConnection(conn,statement);
            
            if(statement != null){
                statement.close();
            }
        }
        
        }

public void removeById(int idProject) throws SQLException{
    String sql = "DELETE FROM projects WHERE id = ?";
                        
        Connection conn = null;
        PreparedStatement statement = null;
    
        
        try {
            conn = ConnectionFactory.getConnection();
            
            statement = conn.prepareStatement(sql);
            
            statement.setInt(1, idProject);
            
            //Executa a sql para iserção de dados
            statement.execute();            
        } catch(SQLException ex) {
            throw new RuntimeException("Erro ao deletar o projeto", ex);
        } finally {
            ConnectionFactory.closeConnection(conn,statement);
            
            if(statement != null){
                statement.close();
            }
        }
        
        }

 public List<Project> getAll(){
     
     String sql ="SELECT * FROM projects";
     
     List<Project> projects = new ArrayList<>();
     
     Connection conn = null;
     
     PreparedStatement statement = null;
     
     ResultSet resultSet = null;
     
     try {
         conn = ConnectionFactory.getConnection();
         statement = conn.prepareStatement(sql);
        
         resultSet = statement.executeQuery();
            
         while (resultSet.next()) {
             
             Project project = new Project();
             
             project.setId(resultSet.getInt("id"));
             project.setName(resultSet.getString("name"));
             project.setDescription(resultSet.getString("description"));
             project.setCreatedAt(resultSet.getDate("createdAt"));
             project.setUpdatedAt(resultSet.getDate("updatedAt"));
             
             projects.add(project);
             }       
     } catch (SQLException ex) {
         throw new RuntimeException("Erro ao buscar projetos", ex);
     } finally {
         ConnectionFactory.closeConnection(conn, statement, resultSet);
     }
     return projects;
     
 }
}