package JDBC;

import java.sql.*;

public class JDBC {

    private static final String url="jdbc:mysql://localhost:3306/learnsql";
    private static final String username="root";
    private static final String password="root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,username,password);
      //  Statement st=con.createStatement();
      //  String query="select name,score,age from student";
      //  ResultSet rs=st.executeQuery(query);
        //while(rs.next()){
          //  String name=rs.getString("name");
            //Double marks=rs.getDouble("score");
         //   int age=rs.getInt("age");
         //   System.out.println(name);
         //   System.out.println(marks);
          //  System.out.println(age);
       // }
      //  String query=String.format("Insert into cou(name,price)"+"values('%s',%f)","sql",85.45);
        //String query=String.format("update cou SET name='%s' where id=%d","mysql",2);
       // String query=String.format("delete from cou where id=%d",3);
     //   int res=st.executeUpdate(query);
     //   if(res>0){
      //      System.out.println("success");
      //  }
     //   else{
     //       System.out.println("failed");
      //  }
        //String query="delete from cou where id=?";
  //  String query="insert into cou(name,price) values(?,?)";
   //     PreparedStatement pst=con.prepareStatement(query);
   //     pst.setInt(1,1);

      //   pst.setString(1,"cloud");
     //    pst.setDouble(2,4);
   //     int res = pst.executeUpdate();
 //       if(res>0){
  //          System.out.println("success");
 //       }
  //      else{
 //           System.out.println("failed");
 //       }


 //   }
//}
        String query = "insert into cou(name, price) values (?, ?)";

        PreparedStatement pst = con.prepareStatement(query);

        pst.setString(1, "cloud");
        pst.setDouble(2, 4.0);

        int res = pst.executeUpdate();

      //  String query = "delete from cou where id=?";

       // PreparedStatement pst = con.prepareStatement(query);

       // pst.setInt(1, 1);

       // int res = pst.executeUpdate();

        if (res > 0) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }

        pst.close();
        con.close();
    }
}
