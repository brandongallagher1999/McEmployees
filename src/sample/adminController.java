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

public class adminController implements Initializable  {


    @FXML AnchorPane anchorPane;


    @FXML
    public void switchSceneInventory() throws IOException
    {
        Parent test = FXMLLoader.load(getClass().getResource("inventory.fxml"));
        anchorPane.getChildren().setAll(test);
    }

    @FXML
    public void switchSceneEmployee() throws IOException
    {
        Parent test = FXMLLoader.load(getClass().getResource("Employee_Main.fxml"));
        anchorPane.getChildren().setAll(test);
    }

    @FXML
    public void switchSceneLogin() throws IOException
    {
        Parent test = FXMLLoader.load(getClass().getResource("login.fxml"));
        anchorPane.getChildren().setAll(test);
    }

    @FXML
    public void switchSceneCalendar() throws IOException
    {
        Parent test = FXMLLoader.load(getClass().getResource("calendar.fxml"));
        anchorPane.getChildren().setAll(test);
    }

    public void initialize(URL url, ResourceBundle rb){



    }
}
