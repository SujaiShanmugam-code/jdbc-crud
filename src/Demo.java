import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Demo
{
    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcDemo";
        String username = "root";
        String password = "04373sujai";

        Connection con = DriverManager.getConnection(url,username,password);

        System.out.println("CONNECTION ESTABLISHED!");

//        Statement st1 = con.createStatement();
//
        String tableName = "movie";
//
//        String sql1 = "create table "+tableName+"(id int , name varchar(20) , hero varchar(50))";
//
//        System.out.println(sql1);
//
//        st1.executeUpdate(sql1);
//
//        System.out.println("Table"+ tableName +"added!");


//        Statement st2 = con.createStatement();
//
//        String sql2 = "insert into " + tableName + " values (1,'Leo' , 'Vijay')";
//
//        st2.executeUpdate(sql2);
//
//        System.out.println("Value added successfully!");


//        Statement st3 = con.createStatement();
//
//        int id = 2;
//        String name = "Asuran";
//        String hero = "Dhanush";
//
//        String sql3 = "insert into " +tableName+ " values ("+id+",'"+name+"','"+hero+"')";
//
//
//        st3.executeUpdate(sql3);
//
////        System.out.println("Value Added!");
//
//        Statement st4 = con.createStatement();
//
//        int id = 3;
//        String name = "VTV";
//        String hero = "Simbu";
//
//        String sql4 = "insert into " +tableName+ " values ("+id+",'"+name+"','"+hero+"')";
//
//
//        st4.executeUpdate(sql4);
//
//        System.out.println("Value Added!");


//        Statement st5 = con.createStatement();
//
//        int id = 4;
//        String name = "VIP";
//        String hero = "Dhanush";
//
//        String sql5 = "insert into " +tableName+ " values ("+id+",'"+name+"','"+hero+"')";
//
//
//        st5.executeUpdate(sql5);
//
//        System.out.println("Value Added!");



//        Statement st6 = con.createStatement();
//
//        String sql6 = "update movie set name = 'VinnaithandiVaruvaya' where hero = 'simbu'";
//
//       st6.executeUpdate(sql6);
//

//
//        Statement st7 = con.createStatement();
//
//        String sql7 = "delete from movie where id = 4";
//
//        st7.executeUpdate(sql7);

//        int id = 4;
//        String name = "Nayakan";
//        String hero = "KamalHassan";
//
//
//        String sql =  "insert into movie values(?,?,?)";
//
//        PreparedStatement p1 = con.prepareStatement(sql);
//
//        p1.setInt(1,id);
//        p1.setString(2,name);
//        p1.setString(3,hero);
//
//        p1.executeUpdate();
//
//        System.out.println("Successfully Added!");


//        String sql = "drop table course";
//
//        PreparedStatement p2 = con.prepareStatement(sql);
//
//        p2.executeUpdate();

        String name = "ThugLife";

        String sql = "update movie set name = ? where name = 'Nayakan'";

        PreparedStatement p3 = con.prepareStatement(sql);

        p3.setString(1,name);

        p3.executeUpdate();

        System.out.println("One row Updated!");


        con.close();

    }
}
