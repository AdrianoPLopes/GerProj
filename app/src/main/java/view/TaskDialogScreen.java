/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import GerProj.controller.TaskController;
import GerProj.model.Project;
import GerProj.model.Task;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano
 */
public class TaskDialogScreen extends javax.swing.JDialog {

    TaskController controller;
    Project project;
    
    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        controller = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelToolbarTask = new javax.swing.JPanel();
        jLabelTask = new javax.swing.JLabel();
        jLabelTaskAdd = new javax.swing.JLabel();
        jPanelBackgroundTask = new javax.swing.JPanel();
        jLabelTaskName = new javax.swing.JLabel();
        jTextFieldTaskName = new javax.swing.JTextField();
        jLabelTaskDescription = new javax.swing.JLabel();
        jScrollPaneTaskDescription = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jLabelTaskDeadline = new javax.swing.JLabel();
        jLabelTaskNote = new javax.swing.JLabel();
        jScrollPaneTaskNote = new javax.swing.JScrollPane();
        jTextAreaNotes = new javax.swing.JTextArea();
        jFormattedTextFielddeadLine = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 600));

        jPanelToolbarTask.setBackground(new java.awt.Color(0, 153, 51));

        jLabelTask.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTask.setForeground(java.awt.Color.white);
        jLabelTask.setText("Tarefa");

        jLabelTaskAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-icon-png-2459.png"))); // NOI18N
        jLabelTaskAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTaskAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelToolbarTaskLayout = new javax.swing.GroupLayout(jPanelToolbarTask);
        jPanelToolbarTask.setLayout(jPanelToolbarTaskLayout);
        jPanelToolbarTaskLayout.setHorizontalGroup(
            jPanelToolbarTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolbarTaskLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTask, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTaskAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelToolbarTaskLayout.setVerticalGroup(
            jPanelToolbarTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolbarTaskLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelTask)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelToolbarTaskLayout.createSequentialGroup()
                .addComponent(jLabelTaskAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelBackgroundTask.setBackground(java.awt.Color.white);

        jLabelTaskName.setText("Nome");

        jTextFieldTaskName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldTaskName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaskNameActionPerformed(evt);
            }
        });

        jLabelTaskDescription.setText("Descri��o");

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaDescription.setRows(5);
        jScrollPaneTaskDescription.setViewportView(jTextAreaDescription);

        jLabelTaskDeadline.setText("Prazo");

        jLabelTaskNote.setText("Notas");

        jTextAreaNotes.setColumns(20);
        jTextAreaNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaNotes.setRows(5);
        jScrollPaneTaskNote.setViewportView(jTextAreaNotes);

        jFormattedTextFielddeadLine.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout jPanelBackgroundTaskLayout = new javax.swing.GroupLayout(jPanelBackgroundTask);
        jPanelBackgroundTask.setLayout(jPanelBackgroundTaskLayout);
        jPanelBackgroundTaskLayout.setHorizontalGroup(
            jPanelBackgroundTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTaskName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldTaskName)
                    .addComponent(jLabelTaskDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneTaskDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jLabelTaskDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTaskNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneTaskNote)
                    .addComponent(jFormattedTextFielddeadLine))
                .addContainerGap())
        );
        jPanelBackgroundTaskLayout.setVerticalGroup(
            jPanelBackgroundTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTaskName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTaskDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTaskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTaskDeadline)
                .addGap(10, 10, 10)
                .addComponent(jFormattedTextFielddeadLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTaskNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTaskNote, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelToolbarTask, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBackgroundTask, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelToolbarTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBackgroundTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTaskNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTaskNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTaskNameActionPerformed

    private void jLabelTaskAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaskAddMouseClicked
        
      try {
          if(!jTextFieldTaskName.getText().isEmpty() 
                  && !jFormattedTextFielddeadLine.getText().isEmpty()) {
          Task task = new Task();
          task.setIdProject(project.getId());
          task.setName(jTextFieldTaskName.getText());
          task.setDescription(jTextAreaDescription.getText());
          task.setIsCompleted(false);
          task.setNotes(jTextAreaNotes.getText());
          
          
          SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
          Date deadLine = null;
          
          deadLine = dateFormat.parse(jFormattedTextFielddeadLine.getText());
          task.setDeadLine(deadLine);
          task.setCreatedAt(new Date());
          task.setUpdatedAt(new Date());
               
          controller.save(task);
          
        
          
          JOptionPane.showMessageDialog(rootPane, "Tarefa Salva com Sucesso.");
          this.dispose();
      } else {
             if(jTextFieldTaskName.getText().isEmpty()){
              JOptionPane.showMessageDialog(rootPane, "A tarefa n�o foi salva, Nome Obrigat�rio.");
             } else 
                 JOptionPane.showMessageDialog(rootPane, "A terefa n�o foi salva, Prazo Obrigat�rio");
             }
          } catch (Exception e) {
          JOptionPane.showMessageDialog(rootPane, e.getMessage());
      }
        
      
    }//GEN-LAST:event_jLabelTaskAddMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFielddeadLine;
    private javax.swing.JLabel jLabelTask;
    private javax.swing.JLabel jLabelTaskAdd;
    private javax.swing.JLabel jLabelTaskDeadline;
    private javax.swing.JLabel jLabelTaskDescription;
    private javax.swing.JLabel jLabelTaskName;
    private javax.swing.JLabel jLabelTaskNote;
    private javax.swing.JPanel jPanelBackgroundTask;
    private javax.swing.JPanel jPanelToolbarTask;
    private javax.swing.JScrollPane jScrollPaneTaskDescription;
    private javax.swing.JScrollPane jScrollPaneTaskNote;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextArea jTextAreaNotes;
    private javax.swing.JTextField jTextFieldTaskName;
    // End of variables declaration//GEN-END:variables

public void setProject(Project project) {
    this.project = project;
}

    private void loadTasks(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}

