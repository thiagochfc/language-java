package application;

import db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtualizarDados {
    
    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = DB.getConnection();
            ps = conn.prepareStatement(
                    "UPDATE seller "
                  + "SET BaseSalary = BaseSalary + ? "
                  + "WHERE "
                  + "(DepartmentId = ?)"
            );
            
            ps.setDouble(1, 200.0);
            ps.setInt(2, 2);
            
            int rowsAffected = ps.executeUpdate();
            
            System.out.println("Done! Rows Affected: " + rowsAffected);
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }
    
}
