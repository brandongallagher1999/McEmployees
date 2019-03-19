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
        props.setProperty("password", "password");
        props.setProperty("ssl", "false");

        conn = DriverManager.getConnection(url, props);

        //String url = "jdbc:postgresql://localhost/brandon?user=brandon&password=&ssl=true";
        //Connection conn = DriverManager.getConnection(url);

    }
    //holy shit watch how large and innefficient this comment will be.
    //senorityValue | employeeNumber | lastName | firstName | position | phoneNumber | SIN | DOB | gender | address | city | province | postalCode | monday | tuesday | wednesday | thursday | friday | saturday | sunday | fullTimePartTime | employmentType | cost | timePerCost | bankNumber | transitNum | accountNumber | timeOffDate | timeOffReason
    public void insert(User user) throws SQLException
    {

        String query = "insert into public.user values(1, 'test1', 'test2')";
        PreparedStatement st = conn.prepareStatement(query);

        st.executeUpdate();



    }

}
