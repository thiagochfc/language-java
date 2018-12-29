package application;

import db.DB;
import db.DbIntegrityException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcluirDados {
    
    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = DB.getConnection();
            ps = conn.prepareStatement(
                    "DELETE FROM department "
                            + "WHERE "
                            + "Id = ?"
            );
            
            ps.setInt(1, 2);
            
            int rowsAffected = ps.executeUpdate();
            
            System.out.println("Done! Rows Affected: " + rowsAffected);
        } catch(SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }
        
    }
    
}
