package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.ClassFuncionarios;

public class funcionarioDAO {
    
    public void create(ClassFuncionarios a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO funcionario (nome, cpf, rg, dataNasc, telefone1, email, sexo, salario)VALUE(?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getCpf());
            stmt.setString(3, a.getRg());
            stmt.setString(4, a.getDataNasc());
            stmt.setString(5, a.getTelefone1());
            stmt.setString(6, a.getEmail());
            stmt.setString(7, a.getSexo());
            stmt.setDouble(8, a.getSalario());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Falha no cadasto!"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
    public List<ClassFuncionarios> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ClassFuncionarios> funcionarios = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM funcionario");
            rs = stmt.executeQuery();
            while(rs.next()){
                
                ClassFuncionarios funcionario = new ClassFuncionarios();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setDataNasc(rs.getString("dataNasc"));
                funcionario.setTelefone1(rs.getString("telefone1"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setSalario(rs.getDouble("salario"));
                funcionario.setSexo(rs.getString("sexo"));
                
                funcionarios.add(funcionario);
                
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(funcionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return funcionarios;
    }
    public List<ClassFuncionarios> readDesc(String desc){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ClassFuncionarios> funcionarios = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM funcionario WHERE nome LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
                
               ClassFuncionarios funcionario = new ClassFuncionarios();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setDataNasc(rs.getString("dataNasc"));
                funcionario.setTelefone1(rs.getString("tel1"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setSalario(rs.getDouble("salario"));
                funcionario.setSexo(rs.getString("sexo"));
                
                funcionarios.add(funcionario);
                
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(alunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return funcionarios;
    }

    public void update(ClassFuncionarios a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE funcionario SET nome = ?, cpf = ?, rg = ?, dataNasc = ?, telefone1 = ?, email = ?, sexo = ?, salario = ? WHERE id = ?");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getCpf());
            stmt.setString(3, a.getRg());
            stmt.setString(4, a.getDataNasc());
            stmt.setString(5, a.getTelefone1());
            stmt.setString(6, a.getEmail());
            stmt.setString(7, a.getSexo());
            stmt.setDouble(8, a.getSalario());
            stmt.setInt(9, a.getId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Falha na atualização!" +ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    public void delete(ClassFuncionarios a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM funcionario WHERE id = ?");
            stmt.setInt(1, a.getId());
                      
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Falha na exclusão de funcionário"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }    
}
