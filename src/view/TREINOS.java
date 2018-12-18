/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Modalidadeclass;
import model.bean.treinos;
import model.dao.modalidadeDAO;
import model.dao.treinosDAO;
import static view.Alunos.jTable1;

/**
 *
 * @author Kedson Santos
 */
public final class TREINOS extends javax.swing.JFrame {

    /**
     * Creates new form Modalidades
     */
    public TREINOS() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
    public void readJTable(){
    
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setNumRows(0);
    treinosDAO adao = new treinosDAO();
    adao.read().forEach((fu) -> {
        modelo.addRow(new Object[]{
            fu.getId(),
            fu.getExercicio(),
            fu.getGrupoMuscular()
           
        });
    });
    }
    public void readJTableDesc(String desc){
    
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setNumRows(0);
    treinosDAO adao = new treinosDAO();
    adao.readDesc(desc).forEach((fu) -> {
        modelo.addRow(new Object[]{
            fu.getId(),
            fu.getExercicio(),
            fu.getGrupoMuscular()

           
        });
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CADASTRAR = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MODALIDADES");
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 100, 0, 0);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "EXERCÍCIO", "GRUPO MUSCULAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 60, 610, 190);

        CADASTRAR.setText("CADASTRAR");
        CADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTRARActionPerformed(evt);
            }
        });
        jPanel1.add(CADASTRAR);
        CADASTRAR.setBounds(90, 400, 120, 30);

        jButton1.setText("ATUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 400, 110, 30);

        jButton2.setText("EXCLUIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(480, 400, 100, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR EXERCÍCIOS:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 330, 170, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EXERCÍCIOS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 10, 170, 50);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(200, 330, 170, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GRUPO MUSCULAR");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 270, 150, 17);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EXERCÍCIO:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 270, 90, 20);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(140, 260, 150, 30);

        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(380, 330, 90, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABDOMEM", "PEITO", "PERNA", "DORSAL", "OMBRO", "BÍCEPS", "ANTEBRAÇO", "TRÍCEPS", "GLÚTEOS", " " }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(460, 260, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void CADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTRARActionPerformed
    treinos t = new treinos();
    treinosDAO td = new treinosDAO();
    
    t.setExercicio(jTextField3.getText());
    t.setGrupoMuscular(jComboBox2.getSelectedItem().toString());
    td.create(t);
    readJTable();
    jTextField3.setText("");
    }//GEN-LAST:event_CADASTRARActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if (jTable1.getSelectedRow() != -1){
    treinos t = new treinos();
    treinosDAO td = new treinosDAO();
    
        t.setExercicio(jTextField3.getText());
        t.setGrupoMuscular(jComboBox2.getSelectedItem().toString());
        
        /*if(jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            m.setMensalidade(jRadioButton1.getText());
        }if(jRadioButton3.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            m.setMensalidade(jRadioButton3.getText());
        }if(jRadioButton2.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false); 
            m.setMensalidade(jRadioButton2.getText());
        }*/
    
        t.setId((int)jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        td.update(t);
        readJTable();
        jTextField3.setText("");
}   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTable1.getSelectedRow() != -1){
        treinos t = new treinos();
        treinosDAO td = new treinosDAO();
        
        t.setId((int)jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            
            td.delete(t);
            readJTable();
    }else{
    JOptionPane.showMessageDialog(null, "Escolhe algo na tabela man");
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        readJTableDesc(jTextField1.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
    if (jTable1.getSelectedRow() != -1){
        jTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
    }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    if (jTable1.getSelectedRow() != -1){
        jTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
    }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(TREINOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TREINOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TREINOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TREINOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TREINOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CADASTRAR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}