import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class B {
	static void getMarks()  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your Id:");
		int id=sc.nextInt();
		Connection conn=C.getConnection();
		String sqlQ="select * from score where id=?;";
		PreparedStatement state;
		try {
			state = conn.prepareStatement(sqlQ);
			state.setInt(1, id);
			ResultSet rs=state.executeQuery();
				while(rs.next()) {
					System.out.println("Your Total Score:"+"\n"+rs.getInt(2));
					System.out.println("Your remark is:");
					if(rs.getInt(2)<10 && rs.getInt(2)>=8) {
						System.out.println("Class A");
				}
					else if(rs.getInt(2)>=6 && rs.getInt(2)<8){
						System.out.println("Class B");
					}else if(rs.getInt(2)>=5) {
						System.out.println("Class C");
						}
					else{
						System.out.println("Fails");
					}}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		
static void add() throws SQLException {
	
	System.out.println("FOR START QUIZE TYPE START HERE");
Scanner sc1=new Scanner(System.in);	
	String s=sc1.next();
	Connection conn=C.getConnection();
String sql="Select * ,rand() as random_value from getquize order by rand(); ";
PreparedStatement statement =conn.prepareStatement(sql);

ResultSet rs=statement.executeQuery();
int i=1;
while(rs.next()) {
	System.out.println("                          "+"Que"+i+"."+rs.getString(1));	
	i++;
    System.out.println("                          "+rs.getString(2)+"\n"+"                          "+
	rs.getString(3)+"\n"+"                          "+rs.getString(4)+"\n"+"                          "+rs.getString(5));
    Scanner sc=new Scanner(System.in);
    String str=sc.next();

    if(str.equals(rs.getString(6))) {
    	A.count++;
    	System.out.println("CORRECT ANSWER"+"\n"+"Total Score :"+A.count);
    }else {
    	System.out.println("INCORRECT ANSWER"+"\n"+"Total Score :"+A.count);
    }
    System.out.println("===========================================================================================================================================================================================================");
    System.out.println("CLICK N FOR NEXT QUESTION");
	String s1=sc.next();
	if(s1.equals("n")) {
		
	}else {
		break;
		}
}}}
	
	
	
	
		
	
	

