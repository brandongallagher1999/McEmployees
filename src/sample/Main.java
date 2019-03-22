package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    public Stage mainStage;
    Scene main;

    public static void main(String[] args) {
        launch(args);
    }
    //FXMLLoader fxmlLoader;

    public void switchScene(String fxml) {
        System.out.println("clicked!");

        // primaryStage.setTitle("Login Page");
        // primaryStage.setScene(main);
        //   primaryStage.show();
    }

    //senorityValue | employeeNumber | lastName | firstName | position | phoneNumber | SIN | DOB | gender | address | city | province | postalCode | monday | tuesday | wednesday | thursday | friday |
// saturday | sunday | fullTimePartTime | employmentType | cost | timePerCost | bankNumber | transitNum | accountNumber | timeOffDate | timeOffReason | isAdmin
    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        // First Screen to appear, being the login page

        Parent root = FXMLLoader.load(getClass().getResource("adminPage.fxml"));


        main = new Scene(root, 1280, 720);

        //database db = new database();
        //TESTING CASE COMMENT IT OUT IF YOU ARE NOT BRANDON (DONT HAVE DATABASE)

        //COMMENT STARTING HERE
        /*
        User user = new User();
        user.senorityValue = "1";
        user.employeeNumber = "11";
        user.lastName = "gallagher";
        user.firstName = "john";
        user.position = "1";
        user.phoneNumber = "905-243-9305";
        user.SIN = "100";
        user.DOB = "09/20/1999";
        user.gender = "male";
        user.address = "1700 simcoe st";
        user.city = "oshawa";
        user.province = "ontario";
        user.postalCode = "L1G4X9";
        user.monday = "false";
        user.tuesday = "false";
        user.wednesday = "false";
        user.thursday = "false";
        user.friday = "false";
        user.saturday = "false";
        user.sunday = "false";
        user.fullTimePartTime = "full Time";
        user.employmentType = "manager";
        user.pay = "$1000";
        user.bankNumber = "4234523";
        user.transitNum = "12000";
        user.accountNumber = "1000";
        user.timeOffDate = "forever";
        user.timeOffReason = "lazy";
        user.isAdmin = "true";
        db.insert(user);
//        db.retrieve();
        //COMMENT END HERE TO RUN WITHOUT DATABASE
        */
        primaryStage.setResizable(false);
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(main);
        primaryStage.show();


    }
}
