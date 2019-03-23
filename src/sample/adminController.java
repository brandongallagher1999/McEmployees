package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class adminController implements Initializable  {


    @FXML AnchorPane anchorPane;
    @FXML Label lbl_welcome1;

    database db;



    @FXML public void switchSceneEmployee() throws IOException{
        Parent test = FXMLLoader.load(getClass().getResource("Employee_Main.fxml"));
        anchorPane.getChildren().setAll(test);

    }

    @FXML public void switchSceneLogout() throws IOException{
        Parent test = FXMLLoader.load(getClass().getResource("login.fxml"));
        anchorPane.getChildren().setAll(test);
    }

    @FXML public void switchSceneCalendar() throws IOException{
        Parent test = FXMLLoader.load(getClass().getResource("calendar.fxml"));
        anchorPane.getChildren().setAll(test);

    }

    public void initialize(URL url, ResourceBundle rb){
        try{
            db = new database();
            lbl_welcome1.setText("Welcome " + db.getAdminName());
        }
        catch(Exception e){

        }



    }
}
