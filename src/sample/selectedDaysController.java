package sample;

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


import javax.xml.soap.Text;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class selectedDaysController {

    @FXML Label currDish; // Current Dishwashers
    @FXML Label maxDish; // Max Dishwasher
    @FXML Label currMan; // Current Managers
    @FXML Label maxMan; // Max Managers
    @FXML Label currCook; // Current line Cooks
    @FXML Label maxCook; // Max Line Cooks
    @FXML Label currWait; // Current Wait Staff
    @FXML Label maxWait; // Max Wait Staff
    @FXML Label currJanitor; // current Janitors
    @FXML Label maxJanitor; // Max Janitors

    private int dishCurr = 0; // number of current dishwashers
    private int dishMax = 6; // number of max dishwashers
    private int manCurr = 0; // number of current managers
    private int manMax = 6; // number of max managers
    private int cookCurr = 0; // number of current cooks
    private int cookMax = 6; // number of max cooks
    private int waitCurr = 0 ; // number of current waiters
    private int waitMax = 6; // number of max waiters
    private int janitorCurr = 0; // number of current janitors
    private int janitorMax= 6; // number of max janitors

    @FXML public void addDish(){
        dishMax += 1;
        maxDish.setText(String.valueOf(dishMax));
    }
    @FXML public void removeDish(){
        if(dishMax > dishCurr){
            dishMax -= 1;
            maxDish.setText(String.valueOf(dishMax));
        }
    }
    @FXML public void selectDish(){
        dishCurr += 1;
        currDish.setText(String.valueOf(dishCurr));
    }
    @FXML public void addMan(){
        manMax += 1;
        maxMan.setText(String.valueOf(manMax));
    }
    @FXML public void removeMan(){
        if(manMax > manCurr){
            manMax -= 1;
            maxMan.setText(String.valueOf(manMax));
        }
    }
    @FXML public void selectMan(){
        manCurr += 1;
        currMan.setText(String.valueOf(manCurr));
    }
    @FXML public void addCook(){
        cookMax += 1;
        maxCook.setText(String.valueOf(cookMax));
    }
    @FXML public void removeCook(){
        if(cookMax > cookCurr){
            cookMax -= 1;
            maxCook.setText(String.valueOf(cookMax));
        }
    }
    @FXML public void selectCook(){
        cookCurr += 1;
        currCook.setText(String.valueOf(cookCurr));
    }
    @FXML public void addWait(){
        waitMax += 1;
        maxWait.setText(String.valueOf(waitMax));
    }
    @FXML public void removeWait(){
        if(waitMax>waitCurr){
            waitMax -= 1;
            maxWait.setText(String.valueOf(waitMax));
        }
    }
    @FXML public void selectWait(){
        waitCurr += 1;
        currWait.setText(String.valueOf(waitCurr));
    }
    @FXML public void addJanitor(){
        janitorMax += 1;
        maxJanitor.setText(String.valueOf(janitorMax));
    }
    @FXML public void removeJanitor(){
        if(janitorMax > janitorCurr){
            janitorMax -= 1;
            maxJanitor.setText(String.valueOf(janitorMax));
        }
    }
    @FXML public void selectJanitor(){
        janitorCurr += 1;
        currJanitor.setText(String.valueOf(janitorCurr));
    }

}
