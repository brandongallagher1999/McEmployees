package sample;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Properties;


public class database{


    String url = "jdbc:postgresql://localhost:5432/postgres";
    Connection conn;

    Properties props;
    public database() throws SQLException
    {
        props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "");
        props.setProperty("ssl", "false");

        conn = DriverManager.getConnection(url, props);

        //String url = "jdbc:postgresql://localhost/brandon?user=brandon&password=&ssl=true";
        //Connection conn = DriverManager.getConnection(url);

    }

    public void insert() throws SQLException
    {
        String test = "ffff";
        PreparedStatement st = conn.prepareStatement("insert into main.user values('test1', 'test2')");
     //   st.setString(0, test);
        st.executeUpdate();



    }

}
