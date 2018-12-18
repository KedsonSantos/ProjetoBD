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
import model.bean.treinos;

public class treinosDAO {
    
    public void create(treinos a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO treinos (exercicio, grupoMusc)VALUE(?, ?)");
            stmt.setString(1, a.getExercicio());
            stmt.setString(2, a.getGrupoMuscular());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Falha no cadasto!"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
    public List<treinos> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<treinos> mod = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM treinos");
            rs = stmt.executeQuery();
            while(rs.next()){
                
                treinos mods = new treinos();
                mods.setId(rs.getInt("id"));
                mods.setExercicio(rs.getString("exercicio"));
                mods.setGrupoMuscular(rs.getString("grupoMusc"));
                
                mod.add(mods);
                
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(treinos.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return mod;
    }
    public List<treinos> readDesc(String desc){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<treinos> mods = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM treinos WHERE grupoMusc LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
                
                
                treinos mod = new treinos();
                mod.setId(rs.getInt("id"));
                mod.setExercicio(rs.getString("exercicio"));
                mod.setGrupoMuscular(rs.getString("grupoMusc"));
                
                mods.add(mod);
                
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(treinos.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return mods;
    }

    public void update(treinos a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE treinos SET exercicio = ?, grupoMusc = ? WHERE id = ?");
            stmt.setString(1, a.getExercicio());
            stmt.setString(2, a.getGrupoMuscular());
            stmt.setInt(3, a.getId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "exercicio atualizado com sucesso!");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Falha na atualização!" +ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    public void delete(treinos a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM treinos WHERE id = ?");
            stmt.setInt(1, a.getId());
                      
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "exercicio excluído com sucesso");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Falha na exclusão de modalidade"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }    
}
