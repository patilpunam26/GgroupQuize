import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C {
static void getData() {
		Connection conn=getConnection();
		String sql="select * from score order by totalmarks;";
		PreparedStatement state1;
		try {
			state1 = conn.prepareStatement(sql);
			ResultSet rs1=state1.executeQuery();
			int i=1;
			System.out.println("STUDENT NAME "+"\t"+"\t"+"\t"+"STUDENT ID"+"\t"+"TOTAL MARKS");
			while(rs1.next()) {
				System.out.println(i+"."+rs1.getString(1)+"\t"+"\t"+rs1.getInt(3)+"\t"+"\t"+rs1.getInt(2));
				i++;
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
public static Connection getConnection() {
		
		Connection connection=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/minidb?characterEncoding=utf8";
		connection=DriverManager.getConnection(url, "root", "root");
		
	} catch (ClassNotFoundException |SQLException e) {
		e.printStackTrace();
	}
		return connection;
		}}


