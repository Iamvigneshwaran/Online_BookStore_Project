import java.sql.*;
import java.util.Scanner;
import java.sql.*;

public class User {
  public static void main(String[] args) {
	 
    String name = null, email = null, address = null, bookname;
    int pin, no = 0, i;
    User bs = new User();
    bs.userdetails(name, email, address, no);
    Bookstore b=new Bookstore();
	  b.bookstore();
  }

  public void userdetails(String name, String email, String address, int no) {
    Scanner sc = new Scanner(System.in);
    System.out.println("*********WELCOME TO ONLINE BOOKSTORE*********");
    System.out.println("Register your details to buy a book");

    System.out.println("Enter your name:");
    name = sc.next();
    System.out.println("Enter your ph.no:");
    no = sc.nextInt();
    System.out.println("Enter your email id:");
    email = sc.next();
    System.out.println("Enter your address:");
    address = sc.next();
    System.out.println("Registered Successfully!!!!!");
    
    

        
  
	   try{
		   
		   String query ="insert into customers values(?,?,?,?);";
	    	
		   System.out.println(query);
   	   Class.forName("com.mysql.jdbc.Driver");
   	   
   	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","vignesh");
   	   PreparedStatement ps=con.prepareStatement(query);
   	   
   	   ps.setString(1, name);
   	   ps.setInt(2, no);
   	   ps.setString(3, email);
   	   ps.setString(4, address);
   	   int rows = ps.executeUpdate();
   	   
   		   System.out.println("number of rows affected :"+rows);
   	   
   	   con.close();
      }
      
      catch(Exception e){
   	   System.out.println(e.toString());
      }
  }   

  
  
  
  
}


