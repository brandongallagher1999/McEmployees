package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;


public class Main extends Application {

    public Stage mainStage;
    Scene main;

    public static String johnTest;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        // First Screen to appear, being the login page


        //I added the extra line so that i can just comment and uncomment instead of
        //changing the fxml file - Zan
        //Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("adminPage.fxml"));

        main = new Scene(root, 1280, 720);

        primaryStage.setResizable(false);
        primaryStage.setTitle("McEmployees Version 1.0"); // until someone can figure out
        // how to change the title when we change the .fxml files, this is gonna be the
        // title for all pages
        primaryStage.setScene(main);
        primaryStage.getIcons().add(new Image("icon.gif"));
        primaryStage.show();


    }
}
