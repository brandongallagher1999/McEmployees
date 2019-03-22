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

public class employeeMainController {

    @FXML AnchorPane anchorPane;


    @FXML public void switchSceneAdmin() throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("adminPage.fxml"));
        anchorPane.getChildren().setAll(test);
    }

    @FXML public void openPopup() throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("Employee_Info_Popup.fxml"));

        Scene scene = new Scene(test);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void initialize(URL url, ResourceBundle rb){



    }
}
