package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
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

    @FXML private Button btn_adminScreen;

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

        btn_adminScreen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                try{
                    System.out.println("clicked!");
                    Parent root = FXMLLoader.load(getClass().getResource("adminPage.fxml"));
                    Stage primaryStage = new Stage();
                    Scene main = new Scene(root, 1280,720);

                    primaryStage.setTitle("Login Page");
                    primaryStage.setScene(main);
                    primaryStage.show();
                }catch(IOException e){
                    e.printStackTrace();
                }




            }
        });

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

   /* private Scene secondScene;

    public void setSecondScene(Scene scene) {
        secondScene = scene;
    }

    public void openSecondScene(ActionEvent actionEvent) {
        Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(secondScene);
    }*/

    private void initImages(){
        btn_forgotPassword.setGraphic(new ImageView(image_forgotPassword));
        btn_forgotPassword.setStyle((IDLE_BUTTON_STYLE));
    }


    //Starting function, first thing to be called in Controller.java
    public void initialize(){

        initImages();

        listeners();
        System.out.println("we are back to initialize.");

    }

}