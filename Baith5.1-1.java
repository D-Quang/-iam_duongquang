package Connect;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class executeUpdate {
	public static void main(String[] args) throws SQLException {
        try (
            Connection con = ConnectionUtils.openConnection();
            Statement st = con.createStatement();
        ) {
         int numberRowsAffected;
//            // Insert
            String sqlInsert = "INSERT INTO books "
                    + " VALUE('1006', 'A Teaspoon of Java', 'Hoang anh', 22.22,22);";
            numberRowsAffected = st.executeUpdate(sqlInsert);
            System.out.println("Affected rows after inserted: " + numberRowsAffected);
 
            // Update
            String sqlUpdate = "UPDATE books SET qty='11' WHERE id=1006";
            numberRowsAffected = st.executeUpdate(sqlUpdate);
            System.out.println("Affected rows after updated: " + numberRowsAffected);
 
            // Delete
            String sqlDelte = "DELETE FROM books WHERE id=1006";
            numberRowsAffected = st.executeUpdate(sqlDelte);
            System.out.println("Affected rows after deleted: " + numberRowsAffected);
        }
    }
}

