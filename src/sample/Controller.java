package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    // CSS Options

    final String IDLE_BUTTON_STYLE = "-fx-background-color: transparent;";

    //_____________________________________________________________________________________________________

    //Images

    Image image_forgotPassword = new Image(getClass().getResourceAsStream("forgetPassword.png"));


    //_____________________________________________________________________________________________________

    //Buttons
    //Next screens
    @FXML
    AnchorPane anchorPane;
    //database object YOU NEED THIS.
    database db;

    //_____________________________________________________________________________________________________

    //TextFields
    @FXML
    private Button btn_login;
    @FXML
    private Button btn_forgotPassword;

    //____________________________________________________________________________________________________


    //Labels
    @FXML
    private TextField text_username;

    //____________________________________________________________________________________________________
    @FXML
    private PasswordField password_password;

    //Initialize listeners for events like button presses, etc
    @FXML
    private Label lbl_Login; //The variable name corresponds to the FX:ID in the .fxml file it's binded to.


//    @FXML
//    public void switchScene() throws IOException{
//        Parent test = FXMLLoader.load(getClass().getResource("adminPage.fxml"));
//
//        anchorPane.getChildren().setAll(test);
//
//    }

    private void listeners() {

        btn_login.setOnAction(event -> {
            try {
                System.out.println(text_username.getText());
                if (db.login(new Account(text_username.getText(), password_password.getText()))) {
                    File file = new File("log.txt");
                    FileWriter writer = new FileWriter(file, true);
                    BufferedWriter writer2 = new BufferedWriter(writer);
                    writer2.write("\n "+ "Logged in at: " + new Date().toString());
                    writer2.close();
                    writer.close(); //update the login log.txt              shit comment btw

                    Parent test = FXMLLoader.load(getClass().getResource("adminPage.fxml"));

                    anchorPane.getChildren().setAll(test);
                } else {
                    System.out.println("wrong account");
                }


            } catch (Exception e) {

            }
//
        });
    }


    private void initImages() {
        btn_forgotPassword.setGraphic(new ImageView(image_forgotPassword));
        btn_forgotPassword.setStyle((IDLE_BUTTON_STYLE));
    }


    //Starting function, first thing to be called in Controller.java
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            db = new database();
            initImages();

            listeners();
        } catch (Exception e) {
            //empty hahahahahaha
        }


    }

}