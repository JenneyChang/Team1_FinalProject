package team1_finalproject.supporting_classes;

import java.sql.*;

/**
  *  @Course: SDEV 450 ~ Java Programming III - Enterprise Java
  *  @Author Name: Jeremy DeHay
  *  @Assignment Name: team1_finalproject.supporting_classes
  *  @Date: Nov 29, 2018
  *  @Subclass DBQueries Description:
  */
//Imports

//Begin Subclass DBQueries
public class DBQueries {
    private Statement stmt;
    private static String sRequiredPassword;
    
    public DBQueries(Connection conn) throws SQLException {
        stmt = conn.createStatement();
    }
    
    public static boolean checkPW(String enteredPW) {
        System.out.println("entered pw: " + enteredPW + " actual pw: " + sRequiredPassword);
        return enteredPW.equals(sRequiredPassword);
    }
    
    /**
     * pull username and password to test database connection.
     * @return 
     */
    String retrieveUser() {
        String sName = null;
        String sPassword = null;
        ResultSet result;
        String query = "SELECT * FROM User";
        try {
            result = stmt.executeQuery(query);
            while (result.next()) {
                sName = result.getString("program_username");
                sPassword = result.getString("program_password");
            }
        } catch (SQLException e) {
            System.out.println("Error getting info:\n" + e);
        }
        sRequiredPassword = sPassword;      // For pw validation
        return "Name is: " + sName + " and password is " + sPassword + "\n";
    }

} // End Subclass DBQueries

/*
 (                         *     
 )\ )                    (  `    
(()/(  (   (   (  (  (   )\))(   
 /(_)) )\  )\  )\ )\ )\ ((_)()\  
(_))_ ((_)((_)((_|(_|(_)(_()((_) 
 |   \| __\ \ / / | | __|  \/  | 
 | |) | _| \ V / || | _|| |\/| | 
 |___/|___| \_/ \__/|___|_|  |_| 
      https://is.gd/RGR0UQ                  
*/