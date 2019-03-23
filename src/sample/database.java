package sample;

import java.sql.*;
import java.util.ArrayList;
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

    //John again, how long until the database won't cause a bunch of errors on a computer
    //without it set up on? 'cuz that's something that we'll need in the final version

    /*
    employeenumber | lastname  | firstname | position | phonenumber  |    dob     | gender |    address     |  city  | province | postalcode
     | monday | tuesday | wednesday | thursday | friday | saturday | sunday | fulltimeparttime | employementtype | banknumber | transitnum |
      accountnumber | timeoffdate | timeoffreason | isadmin | sin | senorityvalue | hourlypay
     */
    public void insert(User user) throws SQLException {
        //insert into schema.table values()

        //DO NOT TOUCH THIS
        String query = "insert into public.user values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
        st.setString(i++, user.bankNumber);
        st.setString(i++, user.transitNum);
        st.setString(i++, user.accountNumber);
        st.setString(i++, user.timeOffDate);
        st.setString(i++, user.timeOffReason);
        st.setString(i++, user.isAdmin);
        st.setString(i++, user.SIN);
        st.setString(i++, user.senorityValue);
        st.setString(i++, user.pay);

        st.executeUpdate();

        st.close();


    }

    public boolean login(Account account) throws Exception {

        String query = "select * from public.admin where username=? and password=MD5(?)"; //checks if admin exists with username and hashed password.

        PreparedStatement st = conn.prepareStatement(query);
        st.setString(1, account.username);
        st.setString(2, account.password);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            return true;
        }

        rs.close();
        st.close();
        return false;
    }


    public void updateNum(String number) throws Exception
    {
        //total cheesy dumb function that allows me to insert into a row index. it actually truncates then next function adds to it. garbage code.
        PreparedStatement st3 = conn.prepareStatement("TRUNCATE public.number");
        st3.executeUpdate();
        st3.close();

        //inserting into database the number + 1
        Integer temp = Integer.parseInt(number);
        temp += 1;
        String newNumber = temp.toString();
        PreparedStatement st2 = conn.prepareStatement("insert into public.number values(?)");
        st2.setString(1, newNumber);
        st2.executeUpdate();
        st2.close();
    }

    public String getNumber() throws Exception {
        //Getting from database
        Statement st = conn.createStatement();
        String query = "SELECT number FROM public.number";
        ResultSet rs = st.executeQuery(query);

        String number;
        rs.next();
        number = rs.getString("number");
        Integer numberInt = Integer.parseInt(number);
        numberInt += 1;
        rs.close();
        st.close();

        String newNumber = numberInt.toString();

        return newNumber;



    }

    public ArrayList<User> retrieveAllUsers() throws Exception //function turning into --> public User[] retrieveAllUsers()
    {
        Statement st = conn.createStatement();
        String query = "select * from public.user";
        ResultSet rs = st.executeQuery(query);

        ArrayList<User> users = new ArrayList<>();

        while (rs.next()) {
            User user = new User();
            user.employeeNumber = rs.getString("employeenumber");
            user.lastName = rs.getString("lastname");
            user.firstName = rs.getString("firstname");
            user.position = rs.getString("position");
            user.phoneNumber = rs.getString("phonenumber");
            user.DOB = rs.getString("dob");
            user.gender = rs.getString("gender");
            user.address = rs.getString("address");
            user.city = rs.getString("city");
            user.province = rs.getString("province");
            user.postalCode = rs.getString("postalcode");
            user.monday = rs.getString("monday");
            user.tuesday = rs.getString("tuesday");
            user.wednesday = rs.getString("wednesday");
            user.thursday = rs.getString("thursday");
            user.friday = rs.getString("friday");
            user.saturday = rs.getString("saturday");
            user.sunday = rs.getString("sunday");
            user.fullTimePartTime = rs.getString("fulltimeparttime");
            user.employmentType = rs.getString("employementtype");
            user.bankNumber = rs.getString("banknumber");
            user.transitNum = rs.getString("transitnum");
            user.accountNumber = rs.getString("accountnumber");
            user.timeOffDate = rs.getString("timeoffdate");
            user.timeOffReason = rs.getString("timeoffreason");
            user.isAdmin = rs.getString("isadmin");
            user.SIN = rs.getString("sin");
            user.senorityValue = rs.getString("senorityvalue");
            user.pay = rs.getString("hourlypay");

            users.add(user);

        }

        rs.close();
        st.close();
        return users;


    }

}
