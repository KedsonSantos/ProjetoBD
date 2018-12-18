package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.ClassFuncionarios;
import model.bean.classAlunos;
import model.dao.alunosDAO;
import model.dao.funcionarioDAO;
import static view.Alunos.jTable1;

public final class funcionarios extends javax.swing.JFrame {

    public funcionarios() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
    public void readJTable(){
    
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setNumRows(0);
    funcionarioDAO adao = new funcionarioDAO();
    adao.read().forEach((fu) -> {
        modelo.addRow(new Object[]{
            fu.getId(),
            fu.getNome(),
            fu.getCpf(),
            fu.getRg(),
            fu.getDataNasc(),
            fu.getTelefone1(),
            fu.getEmail(),
            fu.getSexo(),
            fu.getSalario()
           
        });
    });
    }
    public void readJTableDesc(String desc){
    
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setNumRows(0);
    funcionarioDAO adao = new funcionarioDAO();
    adao.readDesc(desc).forEach((fu) -> {
        modelo.addRow(new Object[]{
            fu.getId(),
            fu.getNome(),
            fu.getCpf(),
            fu.getRg(),
            fu.getDataNasc(),
            fu.getTelefone1(),
            fu.getEmail(),
            fu.getSexo(),
            fu.getSalario()
           
        });
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionários");
        setMinimumSize(new java.awt.Dimension(1030, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(0, 51, 255));

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jDesktopPane1.add(jFormattedTextField3);
        jFormattedTextField3.setBounds(290, 290, 130, 30);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Funcionários");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(340, 20, 310, 30);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "cpf", "rg", "dataNasci", "telefone", "email", "sexo", "salario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("Alunos cadastrados");
        jTable1.setName(""); // NOI18N
        jTable1.setSurrendersFocusOnKeystroke(true);
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

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 1000, 140);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pesquisar:");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(280, 70, 80, 29);
        jDesktopPane1.add(jTextField1);
        jTextField1.setBounds(360, 70, 310, 30);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(680, 70, 63, 30);

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(450, 390, 80, 30);

        jButton3.setText("Atualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3);
        jButton3.setBounds(330, 390, 100, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(20, 300, 60, 20);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email:");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(20, 340, 50, 20);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Rg:");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(250, 340, 70, 20);
        jDesktopPane1.add(jTextField2);
        jTextField2.setBounds(80, 290, 150, 30);
        jDesktopPane1.add(jTextField3);
        jTextField3.setBounds(80, 330, 150, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ndjbdhbf.png"))); // NOI18N
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(40, 20, 230, 70);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sexo:");
        jDesktopPane1.add(jLabel9);
        jLabel9.setBounds(720, 340, 80, 20);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cpf:");
        jDesktopPane1.add(jLabel10);
        jLabel10.setBounds(250, 300, 70, 20);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Data de Nascimento:");
        jDesktopPane1.add(jLabel11);
        jLabel11.setBounds(430, 300, 150, 20);

        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jDesktopPane1.add(jFormattedTextField4);
        jFormattedTextField4.setBounds(580, 290, 120, 30);

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jDesktopPane1.add(jFormattedTextField2);
        jFormattedTextField2.setBounds(510, 330, 190, 30);

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Telefone:");
        jDesktopPane1.add(jLabel12);
        jLabel12.setBounds(430, 340, 80, 20);

        jRadioButton1.setText("Masculino");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jRadioButton1);
        jRadioButton1.setBounds(800, 330, 100, 30);

        jRadioButton2.setText("Feminino");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jRadioButton2);
        jRadioButton2.setBounds(900, 330, 90, 30);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(290, 330, 130, 30);
        jDesktopPane1.add(jTextField4);
        jTextField4.setBounds(800, 290, 150, 30);

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Salário:");
        jDesktopPane1.add(jLabel14);
        jLabel14.setBounds(720, 300, 60, 20);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 1024, 530);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
            java.util.logging.Logger.getLogger(funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new funcionarios().setVisible(true);
            }
        });
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        readJTableDesc(jTextField1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    if (jTable1.getSelectedRow() != -1){
        ClassFuncionarios p = new ClassFuncionarios();
        funcionarioDAO dao = new funcionarioDAO();
        
        p.setNome(jTextField2.getText());
        p.setEmail(jTextField3.getText());
        p.setCpf(jFormattedTextField3.getText());
        p.setRg(jFormattedTextField1.getText());
        p.setDataNasc(jFormattedTextField4.getText());
        p.setTelefone1(jFormattedTextField2.getText());
        p.setSalario(Double.parseDouble(jTextField4.getText()));
        
        if(jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
            p.setSexo(jRadioButton1.getText());
        }else{
            jRadioButton2.setSelected(true);
            jRadioButton1.setSelected(false);
            p.setSexo(jRadioButton2.getText());
        }
        
        p.setId((int)jTable1.getValueAt(jTable1.getSelectedRow(), 0));

            dao.update(p);
            readJTable();

            
            jTextField1.setText("");
            jTextField3.setText("");
            jTextField2.setText("");
            jFormattedTextField3.setText("");
            jFormattedTextField1.setText("");
            jFormattedTextField2.setText("");        
            jFormattedTextField4.setText("");
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);

            
    }else{
    JOptionPane.showMessageDialog(null, "Escolhe algo na tabela pra atualizar man");
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if (jTable1.getSelectedRow() != -1){
        ClassFuncionarios p = new ClassFuncionarios();
        funcionarioDAO dao = new funcionarioDAO();
        
        p.setId((int)jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            
            dao.delete(p);
            readJTable();
    }else{
    JOptionPane.showMessageDialog(null, "Escolhe algo na tabela pra excluir man");
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (jRadioButton2.isSelected()){
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
    if (jTable1.getSelectedRow() != -1){
        jTextField2.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jFormattedTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jFormattedTextField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jFormattedTextField4.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        jFormattedTextField2.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
        jTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
        jTextField4.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString());
    }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    if (jTable1.getSelectedRow() != -1){
        jTextField2.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jFormattedTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jFormattedTextField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jFormattedTextField4.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        jFormattedTextField2.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
        jTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
        jTextField4.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString());
    }
    }//GEN-LAST:event_jTable1MouseClicked

/*    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new funcionarios().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
