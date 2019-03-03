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
        Parent root = FXMLLoader.load(getClass().getResource("Employee_Info_Popup.fxml"));
        primaryStage.setTitle("Employee Main");
        primaryStage.setScene(new Scene(root, 640, 360));
        primaryStage.show();
        /*
        * Some quick notes about the employee info popup
        * If the employee is being viewed, the text boxes should be uneditable
        * The amount of tabs, and the number of items in the tabs is going to change. We don't know what we need yet, so placeholders for now
        * Having the popup actually pop up is going to be done either later today or tomorrow
        * If a new employee is being added, a notice box will pop up for unfilled info
        * If a current employee is being editied, a confirmation box will pop up for edits
        * the notice box and confirmation box will be done later today or tomorrow 
        * */


    }


    public static void main(String[] args) {
        launch(args);
    }
}
