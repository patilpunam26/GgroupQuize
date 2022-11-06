import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class A {
		static int count=0;
   public static void main(String[] args) {
			System.out.println(" ************************************************************************************* W_E_L_C_O_M_E***********************************************************************           ");
			Scanner sc1=new Scanner(System.in);
			System.out.println("STUDENT NAME(FULL NAME):");
			String name=sc1.nextLine();
			System.out.println("STUDENT ID:");
			Connection conn=C.getConnection();
			 int id=sc1.nextInt();
			String sqlq="Select * from score";
			PreparedStatement stat;
			 int b=0;
			try {
				stat = conn.prepareStatement(sqlq);
				 ResultSet set=stat.executeQuery();
				    ArrayList<Integer>al=new ArrayList<Integer>();
				   for(int i=0;i<=al.size()-1;i++) {
				    	 if(id==al.get(i) ) {
				    		 b++;
				    		System.out.println("YOU ALREADY ATTEMP THE QUIZE...SO YOU CANNOT ATTEMP AGAIN..");
				    		break;
				    	 }else {
				    		 
				    	 }
				    	 }
				    	  while(set.next()) {
				    	al.add( set.getInt(3));}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			   
			
			 if(b==0) {
			    try {
					B.add();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} 
			    System.out.println("Total score of"+" "+name+">>"+A.count);
			  String sqlQ="insert into score(studentName,totalMarks,id) values(?,?,?)  ";
				PreparedStatement state;
				try {
					state = conn.prepareStatement(sqlQ);
					state.setString(1, name);
					state.setInt(2, count);
					state.setInt(3, id);
				    state.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				 System.out.println("YOU WANT SCORE OF YOURS THEN TYPE Y");
			String st=sc1.next();
			if(st.equals("y")) 
				B.getMarks();
			System.out.println("\n	");
			
			System.out.println("FOR FETCHING THE DATA FOR ALL STUDENT TYPE Y");
			String str=sc1.next();
			if(str.equals(str)) {
				C.getData();
			}}}}
			
			   
	



