package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;


public class database {


    String url = "jdbc:postgresql://localhost:5432/postgres";
    Connection conn;

    Properties props;

    public database() throws SQLException {
        props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "password");
        props.setProperty("ssl", "false");

        conn = DriverManager.getConnection(url, props);


    }


    //select * from public.user; displays all the entries in schema public and table user
    //TRUNCATE public.user; removes all entries. DO not use unless you have too please. (removes all the users)


    //holy shit watch how large and inefficient this comment below will be.

    //John here, we could probably remove some stuff to make this more manageable
    //cost and time per cost could just be turned into hourlyRate for one
    //and since everything is a string now, the monday/tuesday/wednesday/ etc strings can all be turned into one string
    //which has the short form of the days of the week on it instead of 7 strings


    /*
    employeeNumber | lastName | firstName | position | phoneNumber |     DOB      | gender |  address   | city |    province    | postalCode |
    monday  | tuesday | wednesday | thursday | friday | saturday | sunday | fullTimePartTime | employmentType |   cost    |
     timePerCost | bankNumber | transitNum | accountNumber | timeOffDate | timeOffReason | isAdmin | SIN  | senorityValue
     */
    public void insert(User user) throws SQLException {
        //insert into schema.table values()

        //DO NOT TOUCH THIS
        String query = "insert into public.user values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement st = conn.prepareStatement(query);
        int i = 1;
        st.setString(i++, user.employeeNumber);
        st.setString(i++, user.lastName);
        st.setString(i++, user.firstName);
        st.setString(i++, user.position);
        st.setString(i++, user.phoneNumber);
        st.setString(i++, user.DOB);
        st.setString(i++, user.gender);
        st.setString(i++, user.address);
        st.setString(i++, user.city);
        st.setString(i++, user.province);
        st.setString(i++, user.postalCode);
        st.setString(i++, user.monday);
        st.setString(i++, user.tuesday);
        st.setString(i++, user.wednesday);
        st.setString(i++, user.thursday);
        st.setString(i++, user.friday);
        st.setString(i++, user.saturday);
        st.setString(i++, user.sunday);
        st.setString(i++, user.fullTimePartTime);
        st.setString(i++, user.employmentType);
        st.setString(i++, user.cost);
        st.setString(i++, user.timePerCost);
        st.setString(i++, user.bankNumber);
        st.setString(i++, user.transitNum);
        st.setString(i++, user.accountNumber);
        st.setString(i++, user.timeOffDate);
        st.setString(i++, user.timeOffReason);
        st.setString(i++, user.isAdmin);
        st.setString(i++, user.SIN);
        st.setString(i++, user.senorityValue);

        st.executeUpdate();

        //  st.close();


    }

}
