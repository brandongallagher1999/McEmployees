package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;


public class Controller implements Initializable {

    // CSS Options

    final String IDLE_BUTTON_STYLE = "-fx-background-color: transparent;";

    //_____________________________________________________________________________________________________

    //Images

    Image image_forgotPassword = new Image(getClass().getResourceAsStream("forgetPassword.png"));



    //_____________________________________________________________________________________________________

    //Buttons

    @FXML private Button btn_login;

    @FXML private Button btn_forgotPassword;

    //_____________________________________________________________________________________________________

    //TextFields

    @FXML private TextField text_username;
    @FXML private PasswordField password_password;

    //____________________________________________________________________________________________________


    //Labels

    @FXML private Label lbl_Login; //The variable name corresponds to the FX:ID in the .fxml file it's binded to.

    //____________________________________________________________________________________________________


    //Next screens
    @FXML AnchorPane anchorPane;

    //Initialize listeners for events like button presses, etc


    //database object YOU NEED THIS.
    database db;


    @FXML
    public void switchScene() throws IOException{
        Parent test = FXMLLoader.load(getClass().getResource("adminPage.fxml"));

        anchorPane.getChildren().setAll(test);

    }

    private void listeners()
    {
        
        btn_login.setOnAction(event -> {
            try{
                System.out.println(text_username.getText());
                if(db.login(new Account(text_username.getText(), password_password.getText()))) {
                    Parent test = FXMLLoader.load(getClass().getResource("adminPage.fxml"));
                    anchorPane.getChildren().setAll(test);
                }
                else{
                    System.out.println("wrong account");
                }


            }
            catch(Exception e){

            }
//
        });
    }


    private void initImages(){
        btn_forgotPassword.setGraphic(new ImageView(image_forgotPassword));
        btn_forgotPassword.setStyle((IDLE_BUTTON_STYLE));
    }


    //Starting function, first thing to be called in Controller.java
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        try{
            db = new database();
            initImages();

            listeners();
        }
        catch (Exception e)
        {
            //empty hahahahahaha
        }



    }

}