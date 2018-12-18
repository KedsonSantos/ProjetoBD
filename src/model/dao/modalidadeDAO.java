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
import model.bean.Modalidadeclass;

public class modalidadeDAO {
    
    public void create(Modalidadeclass a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO modalidades (modalidade, mensalidade, pagar)VALUE(?, ?, ?)");
            stmt.setString(1, a.getModalidade());
            stmt.setString(2, a.getMensalidade());
            stmt.setDouble(3, a.getValor());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Falha no cadasto!"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
    public List<Modalidadeclass> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Modalidadeclass> mod = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM modalidades");
            rs = stmt.executeQuery();
            while(rs.next()){
                
                Modalidadeclass mods = new Modalidadeclass();
                mods.setId(rs.getInt("id"));
                mods.setModalidade(rs.getString("modalidade"));
                mods.setMensalidade(rs.getString("mensalidade"));
                mods.setValor(rs.getDouble("pagar"));
                
                mod.add(mods);
                
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(modalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return mod;
    }
    public List<Modalidadeclass> readDesc(String desc){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Modalidadeclass> mods = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM modalidades WHERE modalidade LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
                
                
                Modalidadeclass mod = new Modalidadeclass();
                mod.setId(rs.getInt("id"));
                mod.setModalidade(rs.getString("modalidade"));
                mod.setMensalidade(rs.getString("mensalidade"));
                mod.setValor(rs.getDouble("pagar"));
                
                mods.add(mod);
                
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(modalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return mods;
    }

    public void update(Modalidadeclass a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE modalidades SET modalidade = ?, mensalidade = ?, pagar = ? WHERE id = ?");
            stmt.setString(1, a.getModalidade());
            stmt.setString(2, a.getMensalidade());
            stmt.setDouble(3, a.getValor());
            stmt.setInt(4, a.getId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modalidade atualizada com sucesso!");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Falha na atualização!" +ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    public void delete(Modalidadeclass a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM modalidades WHERE id = ?");
            stmt.setInt(1, a.getId());
                      
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modalidade excluída com sucesso");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Falha na exclusão de modalidade"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }    
}
