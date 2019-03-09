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
    public void switchScene(String fxml)
    {
        System.out.println("clicked!");



       // primaryStage.setTitle("Login Page");
       // primaryStage.setScene(main);
     //   primaryStage.show();
    }


    public Stage mainStage;
    //FXMLLoader fxmlLoader;


    @Override
    public void start(Stage primaryStage) throws Exception{
        mainStage = primaryStage;
        // First Screen to appear, being the login page'

        Parent root = FXMLLoader.load(getClass().getResource("Employee_Main.fxml"));

        main = new Scene(root, 1280,720);

        primaryStage.setTitle("Login Page");
        primaryStage.setScene(main);
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
