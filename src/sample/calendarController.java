package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class calendarController {

    @FXML
    AnchorPane anchorPane; // variable name HAS to correspond to fx:id

    @FXML
    public void switchSceneAdmin() throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("adminPage.fxml"));
        anchorPane.getChildren().setAll(test);
    }

    @FXML
    public void openPopup() throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("Selected_Days_Popup.fxml"));
        Scene scene = new Scene(test);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.getIcons().add(new Image("icon.gif"));
        stage.setTitle("Staff for Selected Day");
        stage.show();

    }

    public void initialize(URL url, ResourceBundle rb) {


    }
}
