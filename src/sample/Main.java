package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    Scene main;
    public void switchScene(String fxml){
        System.out.println("clicked!");

       // primaryStage.setTitle("Login Page");
       // primaryStage.setScene(main);
     //   primaryStage.show();
    }


    public Stage mainStage;
    //FXMLLoader fxmlLoader;

//senorityValue | employeeNumber | lastName | firstName | position | phoneNumber | SIN | DOB | gender | address | city | province | postalCode | monday | tuesday | wednesday | thursday | friday |
// saturday | sunday | fullTimePartTime | employmentType | cost | timePerCost | bankNumber | transitNum | accountNumber | timeOffDate | timeOffReason | isAdmin
    @Override
    public void start(Stage primaryStage) throws Exception{
        mainStage = primaryStage;
        // First Screen to appear, being the login page'

        Parent root = FXMLLoader.load(getClass().getResource("Employee_Main.fxml"));

        main = new Scene(root, 1280,720);

        database db = new database();

        User user = new User();
        user.senorityValue = 1;
        user.employeeNumber = "11";
        user.lastName = "gallagher";
        user.firstName = "brandon";
        user.position = "1";
        user.phoneNumber = "905-243-9305";
        user.SIN = 100;
        user.DOB = "09/20/1999";
        user.gender = "male";
        user.address = "1700 simcoe st";
        user.city = "oshawa";
        user.province = "ontario";
        user.postalCode = "L1G4X9";
        user.monday = false;
        user.tuesday = false;
        user.wednesday = false;
        user.thursday = false;
        user.friday = false;
        user.saturday = false;
        user.sunday = false;
        user.fullTimePartTime = "full Time";
        user.employmentType = "manager";
        user.cost = "$100";
        user.timePerCost = "100";
        user.bankNumber = "4234523";
        user.transitNum = "12000";
        user.accountNumber = "1000";
        user.timeOffDate = "forever";
        user.timeOffReason = "lazy";
        user.isAdmin = true;


        db.insert(user);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(main);
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
