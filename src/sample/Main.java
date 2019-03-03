package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
    /*
     * Stuff to do
     * For Employee Main Page
     *   1) Home button functionality
     *   2) RHS button(s) scrolling (Done)
     *   3) Employee List (Done)
     *   4) RHS button(s) functionality
     *    a) Info
     *    b) Add Employee
     *    c) Delete Employee
     *       i) Confirmation Popup
     *    d) Edit Employee
     *   5) Employee List Scrolling (Done?)
     *   6) Employee List Information
     *    a) Last Name
     *    b) First Name
     *    c) Position
     * For Employee Info Popup
     *   1) Exiting from popup back to Employee Main Page
     *   2) Information Textboxes
     *   3) Information Tabs (Tab Pane)
     *   4) Add/Edit/View Differences
     *    a) Add Employee
     *       i) Missing Information Popup
     *    b) Edit Employee
     *    c) View Employee
     * For General
     *   1)
     * */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Employee_Main.fxml"));
        primaryStage.setTitle("Employee Main");
        primaryStage.setScene(new Scene(root, 1280, 720));
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
