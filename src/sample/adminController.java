package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.YearMonth;
import java.util.ResourceBundle;


public class adminController implements Initializable {


    @FXML
    AnchorPane anchorPane;
    @FXML
    Label lbl_welcome1;

    database db;


    @FXML
    public void switchSceneEmployee() throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("Employee_Main.fxml"));
        anchorPane.getChildren().setAll(test);

    }

    @FXML
    public void switchSceneLogout() throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("login.fxml"));
        anchorPane.getChildren().setAll(test);
    }

    @FXML
    public void switchSceneCalendar() throws IOException {
        Stage primaryStage = new Stage();

        primaryStage.setTitle("Calendar");
        primaryStage.setScene(new Scene(new FullCalendarView(YearMonth.now()).getView()));
        primaryStage.getIcons().add(new Image("icon.gif"));
        primaryStage.show();


    }

    public void initialize(URL url, ResourceBundle rb) {
        try {
            db = new database();
            lbl_welcome1.setText("Welcome " + db.getAdminName() + " to McEmployees Administrative Home");
        } catch (Exception e) {

        }


    }
}
