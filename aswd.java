

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class aswd{

	    // JDBC URL, username, and password of MySQL server
	    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/task2";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "root";

	    public static void main(String[] args) {
	        try {
	            // Load the JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish a connection
	            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {

	                // Define the SQL query to insert data
	                String sql = "INSERT INTO new_table (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";

	                // Create a PreparedStatement
	                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

	                    // Set values for the parameters
	                    preparedStatement.setInt(1, 101); // empcode
	                    preparedStatement.setString(2, "Jenny"); // empname
	                    preparedStatement.setInt(3, 25); // empage
	                    preparedStatement.setInt(4, 10000); // esalary
	                    
	                    preparedStatement.setInt(1, 102); // empcode
	                    preparedStatement.setString(2, "Jacky"); // empname
	                    preparedStatement.setInt(3, 30); // empage
	                    preparedStatement.setInt(4, 20000); // esalary

	                    preparedStatement.setInt(1, 103); // empcode
	                    preparedStatement.setString(2, "Joe"); // empname
	                    preparedStatement.setInt(3, 20); // empage
	                    preparedStatement.setInt(4, 40000); // esalary

	                    preparedStatement.setInt(1, 104); // empcode
	                    preparedStatement.setString(2, "John"); // empname
	                    preparedStatement.setInt(3, 40); // empage
	                    preparedStatement.setInt(4, 80000); // esalary

	                    preparedStatement.setInt(1, 105); // empcode
	                    preparedStatement.setString(2, "Shameer"); // empname
	                    preparedStatement.setInt(3, 25); // empage
	                    preparedStatement.setInt(4, 90000); // esalary




	                    // Execute the query
	                    int rowsAffected = preparedStatement.executeUpdate();

	                    if (rowsAffected > 0) {
	                        System.out.println("Data inserted successfully.");
	                    } else {
	                        System.out.println("Failed to insert data.");
	                    }
	                }
	            }
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


