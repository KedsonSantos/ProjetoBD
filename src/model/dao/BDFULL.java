package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BDFULL {
    public void deletarBD(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DROP TABLE alunos");
            stmt.execute();
            stmt = con.prepareStatement("DROP TABLE funcionario");
            stmt.execute();
            stmt = con.prepareStatement("DROP TABLE usuario");
            stmt.execute();
            stmt = con.prepareStatement("DROP TABLE modalidades");
            stmt.execute();
            stmt = con.prepareStatement("DROP TABLE treinos");
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Falha na exclusão de aluno"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }    
    }
