package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class staffDayController implements Initializable {

    @FXML
    VBox staffList;
    @FXML
    Label position;
    @FXML
    Label current;
    @FXML
    Label max;


    // I need to make the information on this page change depend on how it is brought up. I don't
    // know how to do that.

    private ArrayList<Button> employees;
    private ArrayList<User> users;
    private ArrayList<User> specUsers;
    private database db;


    public void initialize(URL url, ResourceBundle rb) {

        try {
            employees = new ArrayList<>();
            users = new ArrayList<>();
            specUsers = new ArrayList<>();
            db = new database();

            users = db.retrieveAllUsers();

            for (User user : users) {
                //if(user.position == position.getText()){
                employees.add(new Button());
                specUsers.add(user);
                //}
            }

            for (int i = 0; i < employees.size(); i++) {
                employees.get(i).setText(specUsers.get(i).lastName + ", " + specUsers.get(i).firstName);
            }

            for (Button temp : employees) {
                temp.setPrefWidth(540);
            }

            for (Button button : employees) {
                staffList.getChildren().add(button);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
