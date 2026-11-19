import java.sql.*;

public class abc {
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/JFS00005";
        String username="root";
        String password="Hema@2004";
        //String sql="select * from learner";      //to fetch the data

        //String sql="insert into learner values(?,?,?,?)";     //for insert the data from program

        //String sql="update learner set name=?,age=?,branch=? where id=?";     //to update the data

        String sql="delete from learner where id=?";      //to delete the data

        Connection c= DriverManager.getConnection(url,username,password);
        PreparedStatement p=c.prepareStatement(sql);
        /*ResultSet r =p.executeQuery();                             //to fetch the data
        while(r.next()) {
            /*System.out.println("learner id is: " + r.getInt("id"));
            System.out.println("learner name is: "+r.getString("name"));
            System.out.println("learner age is: "+r.getInt("age"));
            System.out.println("learner branch is: "+r.getString("branch"));*/
            /*System.out.println(r.getInt("id")+" "+r.getString("name")+" "+r.getInt("age")+" "+r.getString("branch"));
        }*/

        /*p.setInt(1,7);        //for insert the data
        p.setString(2,"dhanu");
        p.setInt(3,21);
        p.setString(4,"ece");
        int n=p.executeUpdate();
        System.out.println(n+" inserted successfully");*/

        /*p.setString(1,"hemashree");    //to update the data
        p.setInt(2,21);
        p.setString(3,"ise");
        p.setInt(4,1);
        int n=p.executeUpdate();
        System.out.println(n+" data updated successfully");*/

        p.setInt(1,7);           //to delete the data
        int n=p.executeUpdate();
        System.out.println(n+" data deleted successfully");

    }
}
