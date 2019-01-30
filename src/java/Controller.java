package java;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Window;


public class Controller {

    //Images
    Image image_forgotPassword = new Image(getClass().getResourceAsStream("play3.jpg"));


    //
    @FXML private Button btn_forgotPassword;


    @FXML private Label lbl_Login; //The variable name corresponds to the FX:ID in the .fxml file it's binded to.

    public void initialize(){
        lbl_Login.setText("This is a test.");

        btn_forgotPassword.setGraphic(new ImageView(image_forgotPassword));
    }








}
