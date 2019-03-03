package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Window;


public class Controller {

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

    //____________________________________________________________________________________________________


    //Labels

    @FXML private Label lbl_Login; //The variable name corresponds to the FX:ID in the .fxml file it's binded to.

    //____________________________________________________________________________________________________



    //Initialize listeners for events like button presses, etc
    private void listeners()
    {
        btn_login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(text_username.getText());
                if (text_username.getText().equals("test")) {
                    System.out.println("this is working.");
                }
            }
        });
    }


    //Starting function, first thing to be called in Controller.java
    public void initialize(){

        //btn_forgotPassword.setGraphic(new ImageView(image_forgotPassword));
        //btn_forgotPassword.setStyle((IDLE_BUTTON_STYLE));

        //listeners();
        //System.out.println("we are back to initialize.");

    }

}