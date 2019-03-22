package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class employeePopupController {

    @FXML AnchorPane anchorPane;

    @FXML public void addEmployee(){
        //this will set all the textboxes to blank, and allow them to be filled in by the user
        //once the user has completed all of the text boxes, there will be a confirm button that
        //they can press that will add the employee information to the database

    }

    @FXML public void viewEmployee(boolean edit){
        //this function will bring up the employee info popup with the information of a single employee
        //the edit bool will determine if the user can edit the employee's information or not
        //and will change if the edit employee or view employee buttons are pressed


    }

    @FXML public void deleteEmployee(){
        //this function will remove all of a selected employee's information from the database
        //it should probably require a confirmation before firing somebody
        //should employee numbers be re-useable?


    }



    @FXML public void pushDatabase(){
        //this function will be the function that can add employee information to the database
        //if it is being used to add a new employee, it will put that employee's info into a new
        //part of the database. If it is being used to update an employee, it will put the employee's
        //info in their part of the database. Instead of only changing the updated parts, it may be
        //easier to override all of the employee's info. If only the updated info is changed, then
        //there shouldn't be much of a difference.

    }

}
