/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.bean.classAlunos;
import model.dao.alunosDAO;
import view.Alunos;

/**
 *
 * @author 20161174010004
 */
public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        txtEnde = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Cadastro");
        setMinimumSize(new java.awt.Dimension(700, 600));
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(0, 51, 255));

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cadastrar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(510, 460, 130, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ndjbdhbf.png"))); // NOI18N
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(30, 0, 200, 60);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome:");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(50, 140, 70, 20);
        jDesktopPane1.add(txtNome);
        txtNome.setBounds(50, 160, 410, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cadastro de Alunos");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(210, 60, 400, 70);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CPF:");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(50, 200, 40, 21);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data de Nascimento:");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(50, 260, 160, 20);

        jRadioButton1.setText("Masculino");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jRadioButton1);
        jRadioButton1.setBounds(300, 280, 80, 30);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sexo:");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(300, 260, 60, 20);

        jRadioButton2.setText("Feminino");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jRadioButton2);
        jRadioButton2.setBounds(380, 280, 80, 30);
        jDesktopPane1.add(txtEmail);
        txtEmail.setBounds(300, 340, 160, 30);
        jDesktopPane1.add(txtEnde);
        txtEnde.setBounds(50, 460, 190, 30);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RG:");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(300, 200, 50, 20);

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Bairro:");
        jDesktopPane1.add(jLabel13);
        jLabel13.setBounds(300, 440, 110, 20);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Endereço:");
        jDesktopPane1.add(jLabel10);
        jLabel10.setBounds(50, 440, 110, 20);

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Celular:");
        jDesktopPane1.add(jLabel12);
        jLabel12.setBounds(50, 380, 100, 20);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Telefone:");
        jDesktopPane1.add(jLabel11);
        jLabel11.setBounds(50, 320, 100, 20);

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Email:");
        jDesktopPane1.add(jLabel17);
        jLabel17.setBounds(300, 320, 110, 20);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(290, 260, 20, 20);

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");
        jDesktopPane1.add(jLabel16);
        jLabel16.setBounds(40, 140, 20, 20);

        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");
        jDesktopPane1.add(jLabel18);
        jLabel18.setBounds(40, 200, 20, 20);

        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("*");
        jDesktopPane1.add(jLabel20);
        jLabel20.setBounds(40, 260, 20, 20);

        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("*");
        jDesktopPane1.add(jLabel22);
        jLabel22.setBounds(40, 320, 20, 20);

        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("*");
        jDesktopPane1.add(jLabel23);
        jLabel23.setBounds(40, 380, 20, 20);

        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("*");
        jDesktopPane1.add(jLabel24);
        jLabel24.setBounds(40, 440, 20, 20);
        jDesktopPane1.add(txtBairro);
        txtBairro.setBounds(300, 460, 160, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/perfill.png"))); // NOI18N
        jDesktopPane1.add(jLabel15);
        jLabel15.setBounds(500, 150, 140, 130);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jDesktopPane1.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(300, 220, 160, 30);

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jDesktopPane1.add(jFormattedTextField2);
        jFormattedTextField2.setBounds(50, 340, 190, 30);

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jDesktopPane1.add(jFormattedTextField3);
        jFormattedTextField3.setBounds(50, 220, 190, 30);

        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jDesktopPane1.add(jFormattedTextField4);
        jFormattedTextField4.setBounds(50, 280, 190, 30);

        try {
            jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jDesktopPane1.add(jFormattedTextField5);
        jFormattedTextField5.setBounds(50, 400, 190, 30);

        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setText("*");
        jDesktopPane1.add(jLabel26);
        jLabel26.setBounds(290, 440, 20, 20);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 740, 590);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (jRadioButton2.isSelected()){
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        classAlunos p = new classAlunos();
        alunosDAO dao = new alunosDAO();

        p.setNome(txtNome.getText());
        p.setEmail(txtEmail.getText());
        p.setEndereco(txtEnde.getText());
        p.setBairro(txtBairro.getText());
        p.setCelular(jFormattedTextField5.getText());
        p.setCpf(jFormattedTextField3.getText());
        p.setRg(jFormattedTextField1.getText());
        p.setTelefone1(jFormattedTextField2.getText());
        p.setDataNasc(jFormattedTextField4.getText());
        
        if(jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
            p.setSexo(jRadioButton1.getText());
        }else{
            jRadioButton2.setSelected(true);
            jRadioButton1.setSelected(false);
            p.setSexo(jRadioButton2.getText());
        }

        if(txtNome.getText().equals("") || txtEmail.getText().equals("") || txtEnde.getText().equals("") || jFormattedTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Cadastro não efetuado, algum dos campos não foi informado!");
        }else{
            dao.create(p);
            Alunos tabela = new Alunos();
            tabela.readJTable();
            txtNome.setText("");
            txtEmail.setText("");
            txtEnde.setText("");
            txtBairro.setText("");
            jFormattedTextField5.setText("");
            jFormattedTextField3.setText("");
            jFormattedTextField1.setText("");
            jFormattedTextField2.setText("");        
            jFormattedTextField4.setText("");

        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnde;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}