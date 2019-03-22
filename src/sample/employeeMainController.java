package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class employeeMainController implements Initializable{

    @FXML AnchorPane anchorPane;
    @FXML ScrollPane scrollPane;
    @FXML VBox vbox_List;


    ArrayList<Button> employees;
    ArrayList<User> users;
    database db;

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

    public void initListeners(){
        for(Button employee : employees){

        }
    }
    public void initialize(URL url, ResourceBundle rb){
        try
        {
            employees = new ArrayList<>();
            users = new ArrayList<>();
            db = new database();

            users = db.retrieveAllUsers();

            for (User user : users) {
                employees.add(new Button());
            }

            for (int i = 0; i < employees.size(); i++) {
                employees.get(i).setText(users.get(i).firstName + " " + users.get(i).lastName + ", " + users.get(i).address + ", " + users.get(i).city);
            }

            for (Button temp : employees){
                temp.setPrefWidth(1200);
            }
            for(Button button : employees){
                vbox_List.getChildren().add(button);
            }

            initListeners();
            scrollPane.setContent(vbox_List);



        }
        catch(Exception e)
        {
            e.printStackTrace();
        }








    }
}
