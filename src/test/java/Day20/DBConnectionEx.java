package Day20;

import java.sql.*;


public class DBConnectionEx {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/automation";
        String userName = "root";
        String password = "root";
        String query = "SELECT * FROM customer";
        try{
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("customer_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String city = rs.getString("city");
                String state = rs.getString("state");
                String postalCode = rs.getString("postal_code");
                String country = rs.getString("country");
                String timeStamp = rs.getTimestamp("created_at").toString();
                String temp = rs.getString("temp");
                String customercol = rs.getString("customercol");

                System.out.println("id = "+id+
                "First Name : "+firstName+
                "Last Name : "+lastName+
                "Email: "+email+
                "Phone: "+phone+
                "Address: "+address+
                "City: "+city+
                "State: "+state+
                "Postal Code: "+postalCode+
                "Country: "+country+
                "Time Stamp: "+timeStamp+
                "Temp: "+temp+
                "Customer Column: "+customercol );

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}
