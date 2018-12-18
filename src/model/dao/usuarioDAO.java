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
import model.bean.Usuario;

public class usuarioDAO {
    
        public boolean checkLogin(String login, String senha){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            boolean check = false;
            try {
                stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ? and senha = ?");

                stmt.setString(1, login);
                stmt.setString(2, senha);
                rs = stmt.executeQuery();

                if(rs.next()){
                    check = true;
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
            return check;
    
        }
        
   public List<Usuario> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuariodao = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();
            while(rs.next()){
                
                Usuario usuarios = new Usuario();
                usuarios.setId(rs.getInt("id"));
                usuarios.setLogin(rs.getString("login"));
                usuarios.setSenha(rs.getString("senha"));

                usuariodao.add(usuarios);
                
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return usuariodao;
    }
   
    public void update(Usuario u){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE usuario SET login = ?, senha = ? WHERE id = ?");
            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getSenha());
            stmt.setInt(3, u.getId());
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário e senha atualizados com sucesso!");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Falha na atualização de senha!" +ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }    
}