package sample;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.StageStyle;

import javax.xml.soap.Text;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.ArrayList;

public class staffDayController implements Initializable {

    @FXML VBox staffList;
    @FXML Label position;
    @FXML Label current;
    @FXML Label max;

    
    // I need to make the information on this page change depend on how it is brought up. I don't
    // know how to do that.

    private ArrayList<Button> employees;
    private ArrayList<User> users;
    private ArrayList<User> specUsers;
    private database db;




    public void initialize(URL url, ResourceBundle rb){

        try{
            employees = new ArrayList<>();
            users = new ArrayList<>();
            specUsers = new ArrayList<>();
            db = new database();

            users = db.retrieveAllUsers();

            for (User user: users){
                //if(user.position == position.getText()){
                    employees.add(new Button());
                    specUsers.add(user);
                //}
            }

            for(int i = 0; i < employees.size(); i ++){
                employees.get(i).setText(specUsers.get(i).lastName + ", " + specUsers.get(i).firstName);
            }

            for(Button temp : employees){
                temp.setPrefWidth(540);
            }

            for(Button button : employees){
                staffList.getChildren().add(button);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

    }


}
