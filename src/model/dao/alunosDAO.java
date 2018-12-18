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
import model.bean.classAlunos;

public class alunosDAO {
    
    public void create(classAlunos a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO alunos (nome, email, endereco, bairro, cpf, rg, dataNasc, tel1, cel1, sexo)VALUE(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getEmail());
            stmt.setString(3, a.getEndereco());
            stmt.setString(4, a.getBairro());
            stmt.setString(5, a.getCpf());
            stmt.setString(6, a.getRg());
            stmt.setString(7, a.getDataNasc());
            stmt.setString(8, a.getTelefone1());
            stmt.setString(9, a.getCelular());
            stmt.setString(10, a.getSexo());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Falha no cadasto!"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
    public List<classAlunos> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<classAlunos> alunos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM alunos");
            rs = stmt.executeQuery();
            while(rs.next()){
                
                classAlunos aluno = new classAlunos();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEmail(rs.getString("email"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setBairro(rs.getString("bairro"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setRg(rs.getString("rg"));
                aluno.setDataNasc(rs.getString("dataNasc"));
                aluno.setTelefone1(rs.getString("tel1"));
                aluno.setCelular(rs.getString("cel1"));
                aluno.setSexo(rs.getString("sexo"));
                
                alunos.add(aluno);
                
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(alunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return alunos;
    }
    public List<classAlunos> readDesc(String desc){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<classAlunos> alunos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM alunos WHERE nome LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
                
                classAlunos aluno = new classAlunos();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEmail(rs.getString("email"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setBairro(rs.getString("bairro"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setRg(rs.getString("rg"));
                aluno.setDataNasc(rs.getString("dataNasc"));
                aluno.setTelefone1(rs.getString("tel1"));
                aluno.setCelular(rs.getString("cel1"));
                aluno.setSexo(rs.getString("sexo"));

                alunos.add(aluno);
                
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(alunosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return alunos;
    }

    public void update(classAlunos a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE alunos SET nome = ?, email = ?, endereco = ?, bairro = ?, cpf = ?, rg = ?, dataNasc = ?, tel1 = ?, cel1 = ?, sexo = ? WHERE id = ?");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getEmail());
            stmt.setString(3, a.getEndereco());
            stmt.setString(4, a.getBairro());
            stmt.setString(5, a.getCpf());
            stmt.setString(6, a.getRg());
            stmt.setString(7, a.getDataNasc());
            stmt.setString(8, a.getTelefone1());
            stmt.setString(9, a.getCelular());
            stmt.setString(10, a.getSexo());
            stmt.setInt(11, a.getId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso!");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Falha na atualização!" +ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    public void delete(classAlunos a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM alunos WHERE id = ?");
            stmt.setInt(1, a.getId());
                      
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Falha na exclusão de aluno"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }    
}
