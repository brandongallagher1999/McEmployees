package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class selectedDaysController {

    @FXML
    Label currDish; // Current Dishwashers
    @FXML
    Button dS1; // Dishwasher Shift 1
    @FXML
    Button dS2; // Dishwasher Shift 2
    @FXML
    Button dS3; // Dishwasher Shift 3
    @FXML
    Button dS4; // Dishwasher Shift 4
    @FXML
    Button dS5; // Dishwasher Shift 5
    @FXML
    Button dS6; // Dishwasher Shift 6
    @FXML
    Button dS7; // Dishwasher Shift 7
    @FXML
    Button dS8; // Dishwasher Shift 8
    @FXML
    Button dS9; // Dishwasher Shift 9
    @FXML
    Button dS10; // Dishwasher Shift 10
    @FXML
    Label maxDish; // Max Dishwasher

    @FXML
    Label currMan; // Current Managers
    @FXML
    Button mS1; // Manger Shift 1
    @FXML
    Button mS2; // Manger Shift 2
    @FXML
    Button mS3; // Manger Shift 3
    @FXML
    Button mS4; // Manger Shift 4
    @FXML
    Button mS5; // Manger Shift 5
    @FXML
    Button mS6; // Manger Shift 6
    @FXML
    Button mS7; // Manger Shift 7
    @FXML
    Button mS8; // Manger Shift 8
    @FXML
    Button mS9; // Manger Shift 9
    @FXML
    Button mS10; // Manager Shift 10
    @FXML
    Label maxMan; // Max Managers

    @FXML
    Label currCook; // Current line Cooks
    @FXML
    Button cS1; // Line Cook Shift 1
    @FXML
    Button cS2; // Line Cook Shift 2
    @FXML
    Button cS3; // Line Cook Shift 3
    @FXML
    Button cS4; // Line Cook Shift 4
    @FXML
    Button cS5; // Line Cook Shift 5
    @FXML
    Button cS6; // Line Cook Shift 6
    @FXML
    Button cS7; // Line Cook Shift 7
    @FXML
    Button cS8; // Line Cook Shift 8
    @FXML
    Button cS9; // Line Cook Shift 9
    @FXML
    Button cS10; // Line Cook Shift 10
    @FXML
    Label maxCook; // Max Line Cooks

    @FXML
    Label currWait; // Current Wait Staff
    @FXML
    Button wS1; // Wait Staff Shift 1
    @FXML
    Button wS2; // Wait Staff Shift 2
    @FXML
    Button wS3; // Wait Staff Shift 3
    @FXML
    Button wS4; // Wait Staff Shift 4
    @FXML
    Button wS5; // Wait Staff Shift 5
    @FXML
    Button wS6; // Wait Staff Shift 6
    @FXML
    Button wS7; // Wait Staff Shift 7
    @FXML
    Button wS8; // Wait Staff Shift 8
    @FXML
    Button wS9; // Wait Staff Shift 9
    @FXML
    Button wS10; // Wait Staff Shift 10
    @FXML
    Label maxWait; // Max Wait Staff

    @FXML
    Label currJanitor; // current Janitors
    @FXML
    Button jS1; // Janitor Shift 1
    @FXML
    Button jS2; // Janitor Shift 2
    @FXML
    Button jS3; // Janitor Shift 3
    @FXML
    Button jS4; // Janitor Shift 4
    @FXML
    Button jS5; // Janitor Shift 5
    @FXML
    Button jS6; // Janitor Shift 6
    @FXML
    Button jS7; // Janitor Shift 7
    @FXML
    Button jS8; // Janitor Shift 8
    @FXML
    Button jS9; // Janitor Shift 9
    @FXML
    Button jS10; // Janitor Shift 10
    @FXML
    Label maxJanitor; // Max Janitors

    private int dishCurr = 0; // number of current dishwashers
    private int dishMax = 6; // number of max dishwashers
    private int manCurr = 0; // number of current managers
    private int manMax = 6; // number of max managers
    private int cookCurr = 0; // number of current cooks
    private int cookMax = 6; // number of max cooks
    private int waitCurr = 0; // number of current waiters
    private int waitMax = 6; // number of max waiters
    private int janitorCurr = 0; // number of current janitors
    private int janitorMax = 6; // number of max janitors


    public void updateDishShifts() {
        //holy fuck i feel terrible writing this code
        //the moment i figure out why an array of buttons doesn't work,
        //i am going to yeet this abomination of a function to
        //hell and back. What's even worse is that i'm gonna need
        //4 more of these clusterfuck functions for the other
        //4 positions. this is going to be the number 1 priority for me
        //when i'm refactoring this shit.
        if (dishMax == 0) {
            dS1.setPrefHeight(0);
            dS1.setMinHeight(0);
            dS1.setVisible(false);
        }
        if (dishMax == 1) {
            dS1.setPrefHeight(50);
            dS1.setVisible(true);
            dS2.setPrefHeight(0);
            dS2.setMinHeight(0);
            dS2.setVisible(false);
        }
        if (dishMax == 2) {
            dS2.setPrefHeight(50);
            dS2.setVisible(true);
            dS3.setPrefHeight(0);
            dS3.setMinHeight(0);
            dS3.setVisible(false);
        }
        if (dishMax == 3) {
            dS3.setPrefHeight(50);
            dS3.setVisible(true);
            dS4.setPrefHeight(0);
            dS4.setMinHeight(0);
            dS4.setVisible(false);
        }
        if (dishMax == 4) {
            dS4.setPrefHeight(50);
            dS4.setVisible(true);
            dS5.setPrefHeight(0);
            dS5.setMinHeight(0);
            dS5.setVisible(false);
        }
        if (dishMax == 5) {
            dS5.setPrefHeight(50);
            dS5.setVisible(true);
            dS6.setPrefHeight(0);
            dS6.setMinHeight(0);
            dS6.setVisible(false);
        }
        if (dishMax == 6) {
            dS6.setPrefHeight(50);
            dS6.setVisible(true);
            dS7.setPrefHeight(0);
            dS7.setMinHeight(0);
            dS7.setVisible(false);
        }
        if (dishMax == 7) {
            dS7.setPrefHeight(50);
            dS7.setVisible(true);
            dS8.setPrefHeight(0);
            dS8.setMinHeight(0);
            dS8.setVisible(false);
        }
        if (dishMax == 8) {
            dS8.setPrefHeight(50);
            dS8.setVisible(true);
            dS9.setPrefHeight(0);
            dS9.setMinHeight(0);
            dS9.setVisible(false);
        }
        if (dishMax == 9) {
            dS9.setPrefHeight(50);
            dS9.setVisible(true);
            dS10.setPrefHeight(0);
            dS10.setMinHeight(0);
            dS10.setVisible(false);
        }
        if (dishMax == 10) {
            dS10.setPrefHeight(50);
            dS10.setVisible(true);
        }
    }

    public void updateManShifts() {
        if (manMax == 0) {
            mS1.setPrefHeight(0);
            mS1.setMinHeight(0);
            mS1.setVisible(false);
        }
        if (manMax == 1) {
            mS1.setPrefHeight(50);
            mS1.setVisible(true);
            mS2.setPrefHeight(0);
            mS2.setMinHeight(0);
            mS2.setVisible(false);
        }
        if (manMax == 2) {
            mS2.setPrefHeight(50);
            mS2.setVisible(true);
            mS3.setPrefHeight(0);
            mS3.setMinHeight(0);
            mS3.setVisible(false);
        }
        if (manMax == 3) {
            mS3.setPrefHeight(50);
            mS3.setVisible(true);
            mS4.setPrefHeight(0);
            mS4.setMinHeight(0);
            mS4.setVisible(false);
        }
        if (manMax == 4) {
            mS4.setPrefHeight(50);
            mS4.setVisible(true);
            mS5.setPrefHeight(0);
            mS5.setMinHeight(0);
            mS5.setVisible(false);
        }
        if (manMax == 5) {
            mS5.setPrefHeight(50);
            mS5.setVisible(true);
            mS6.setPrefHeight(0);
            mS6.setMinHeight(0);
            mS6.setVisible(false);
        }
        if (manMax == 6) {
            mS6.setPrefHeight(50);
            mS6.setVisible(true);
            mS7.setPrefHeight(0);
            mS7.setMinHeight(0);
            mS7.setVisible(false);
        }
        if (manMax == 7) {
            mS7.setPrefHeight(50);
            mS7.setVisible(true);
            mS8.setPrefHeight(0);
            mS8.setMinHeight(0);
            mS8.setVisible(false);
        }
        if (manMax == 8) {
            mS8.setPrefHeight(50);
            mS8.setVisible(true);
            mS9.setPrefHeight(0);
            mS9.setMinHeight(0);
            mS9.setVisible(false);
        }
        if (manMax == 9) {
            mS9.setPrefHeight(50);
            mS9.setVisible(true);
            mS10.setPrefHeight(0);
            mS10.setMinHeight(0);
            mS10.setVisible(false);
        }
        if (manMax == 10) {
            mS10.setPrefHeight(50);
            mS10.setVisible(true);
        }
    }

    public void updateCookShifts() {
        if (cookMax == 0) {
            cS1.setPrefHeight(0);
            cS1.setMinHeight(0);
            cS1.setVisible(false);
        }
        if (cookMax == 1) {
            cS1.setPrefHeight(50);
            cS1.setVisible(true);
            cS2.setPrefHeight(0);
            cS2.setMinHeight(0);
            cS2.setVisible(false);
        }
        if (cookMax == 2) {
            cS2.setPrefHeight(50);
            cS2.setVisible(true);
            cS3.setPrefHeight(0);
            cS3.setMinHeight(0);
            cS3.setVisible(false);
        }
        if (cookMax == 3) {
            cS3.setPrefHeight(50);
            cS3.setVisible(true);
            cS4.setPrefHeight(0);
            cS4.setMinHeight(0);
            cS4.setVisible(false);
        }
        if (cookMax == 4) {
            cS4.setPrefHeight(50);
            cS4.setVisible(true);
            cS5.setPrefHeight(0);
            cS5.setMinHeight(0);
            cS5.setVisible(false);
        }
        if (cookMax == 5) {
            cS5.setPrefHeight(50);
            cS5.setVisible(true);
            cS6.setPrefHeight(0);
            cS6.setMinHeight(0);
            cS6.setVisible(false);
        }
        if (cookMax == 6) {
            cS6.setPrefHeight(50);
            cS6.setVisible(true);
            cS7.setPrefHeight(0);
            cS7.setMinHeight(0);
            cS7.setVisible(false);
        }
        if (cookMax == 7) {
            cS7.setPrefHeight(50);
            cS7.setVisible(true);
            cS8.setPrefHeight(0);
            cS8.setMinHeight(0);
            cS8.setVisible(false);
        }
        if (cookMax == 8) {
            cS8.setPrefHeight(50);
            cS8.setVisible(true);
            cS9.setPrefHeight(0);
            cS9.setMinHeight(0);
            cS9.setVisible(false);
        }
        if (cookMax == 9) {
            cS9.setPrefHeight(50);
            cS9.setVisible(true);
            cS10.setPrefHeight(0);
            cS10.setMinHeight(0);
            cS10.setVisible(false);
        }
        if (cookMax == 10) {
            cS10.setPrefHeight(50);
            cS10.setVisible(true);
        }
    }

    public void updateWaitShifts() {
        if (waitMax == 0) {
            wS1.setPrefHeight(0);
            wS1.setMinHeight(0);
            wS1.setVisible(false);
        }
        if (waitMax == 1) {
            wS1.setPrefHeight(50);
            wS1.setVisible(true);
            wS2.setPrefHeight(0);
            wS2.setMinHeight(0);
            wS2.setVisible(false);
        }
        if (waitMax == 2) {
            wS2.setPrefHeight(50);
            wS2.setVisible(true);
            wS3.setPrefHeight(0);
            wS3.setMinHeight(0);
            wS3.setVisible(false);
        }
        if (waitMax == 3) {
            wS3.setPrefHeight(50);
            wS3.setVisible(true);
            wS4.setPrefHeight(0);
            wS4.setMinHeight(0);
            wS4.setVisible(false);
        }
        if (waitMax == 4) {
            wS4.setPrefHeight(50);
            wS4.setVisible(true);
            wS5.setPrefHeight(0);
            wS5.setMinHeight(0);
            wS5.setVisible(false);
        }
        if (waitMax == 5) {
            wS5.setPrefHeight(50);
            wS5.setVisible(true);
            wS6.setPrefHeight(0);
            wS6.setMinHeight(0);
            wS6.setVisible(false);
        }
        if (waitMax == 6) {
            wS6.setPrefHeight(50);
            wS6.setVisible(true);
            wS7.setPrefHeight(0);
            wS7.setMinHeight(0);
            wS7.setVisible(false);
        }
        if (waitMax == 7) {
            wS7.setPrefHeight(50);
            wS7.setVisible(true);
            wS8.setPrefHeight(0);
            wS8.setMinHeight(0);
            wS8.setVisible(false);
        }
        if (waitMax == 8) {
            wS8.setPrefHeight(50);
            wS8.setVisible(true);
            wS9.setPrefHeight(0);
            wS9.setMinHeight(0);
            wS9.setVisible(false);
        }
        if (waitMax == 9) {
            wS9.setPrefHeight(50);
            wS9.setVisible(true);
            wS10.setPrefHeight(0);
            wS10.setMinHeight(0);
            wS10.setVisible(false);
        }
        if (waitMax == 10) {
            wS10.setPrefHeight(50);
            wS10.setVisible(true);
        }
    }

    public void updateJanitorShifts() {
        if (janitorMax == 0) {
            jS1.setPrefHeight(0);
            jS1.setMinHeight(0);
            jS1.setVisible(false);
        }
        if (janitorMax == 1) {
            jS1.setPrefHeight(50);
            jS1.setVisible(true);
            jS2.setPrefHeight(0);
            jS2.setMinHeight(0);
            jS2.setVisible(false);
        }
        if (janitorMax == 2) {
            jS2.setPrefHeight(50);
            jS2.setVisible(true);
            jS3.setPrefHeight(0);
            jS3.setMinHeight(0);
            jS3.setVisible(false);
        }
        if (janitorMax == 3) {
            jS3.setPrefHeight(50);
            jS3.setVisible(true);
            jS4.setPrefHeight(0);
            jS4.setMinHeight(0);
            jS4.setVisible(false);
        }
        if (janitorMax == 4) {
            jS4.setPrefHeight(50);
            jS4.setVisible(true);
            jS5.setPrefHeight(0);
            jS5.setMinHeight(0);
            jS5.setVisible(false);
        }
        if (janitorMax == 5) {
            jS5.setPrefHeight(50);
            jS5.setVisible(true);
            jS6.setPrefHeight(0);
            jS6.setMinHeight(0);
            jS6.setVisible(false);
        }
        if (janitorMax == 6) {
            jS6.setPrefHeight(50);
            jS6.setVisible(true);
            jS7.setPrefHeight(0);
            jS7.setMinHeight(0);
            jS7.setVisible(false);
        }
        if (janitorMax == 7) {
            jS7.setPrefHeight(50);
            jS7.setVisible(true);
            jS8.setPrefHeight(0);
            jS8.setMinHeight(0);
            jS8.setVisible(false);
        }
        if (janitorMax == 8) {
            jS8.setPrefHeight(50);
            jS8.setVisible(true);
            jS9.setPrefHeight(0);
            jS9.setMinHeight(0);
            jS9.setVisible(false);
        }
        if (janitorMax == 9) {
            jS9.setPrefHeight(50);
            jS9.setVisible(true);
            jS10.setPrefHeight(0);
            jS10.setMinHeight(0);
            jS10.setVisible(false);
        }
        if (janitorMax == 10) {
            jS10.setPrefHeight(50);
            jS10.setVisible(true);
        }
    }

    @FXML
    public void addDish() {
        if (dishMax < 10) {
            dishMax += 1;
            updateDishShifts();
            maxDish.setText(String.valueOf(dishMax));
        }
    }

    @FXML
    public void removeDish() {
        if (dishMax > 0) {
            if (dishMax <= dishCurr) {
                dishCurr = dishMax - 1;
            }
            dishMax -= 1;

            updateDishShifts();
            maxDish.setText(String.valueOf(dishMax));
            currDish.setText(String.valueOf(dishCurr));
        }

    }

    @FXML
    public void selectDish() throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("Staff_Day_Popup.fxml"));
        Scene scene = new Scene(test);
        Stage stage = new Stage();
        stage.getIcons().add(new Image("icon.gif"));
        stage.setScene(scene);
        stage.setTitle("Dishwashers avaliable");
        stage.show();
        dishCurr += 1;
        currDish.setText(String.valueOf(dishCurr));
    }

    @FXML
    public void addMan() {
        if (manMax < 10) {
            manMax += 1;
            updateManShifts();
            maxMan.setText(String.valueOf(manMax));
        }
    }

    @FXML
    public void removeMan() {
        if (manMax > 0) {
            if (manMax <= manCurr) {
                manCurr = manMax - 1;
            }
            manMax -= 1;
            updateManShifts();
            maxMan.setText(String.valueOf(manMax));
            currMan.setText(String.valueOf(manCurr));
        }
    }

    @FXML
    public void selectMan() throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("Staff_Day_Popup.fxml"));
        Scene scene = new Scene(test);
        Stage stage = new Stage();
        stage.getIcons().add(new Image("icon.gif"));
        stage.setScene(scene);
        stage.setTitle("Managers avaliable");
        manCurr += 1;
        currMan.setText(String.valueOf(manCurr));

    }

    @FXML
    public void addCook() {
        if (cookMax < 10) {
            cookMax += 1;
            updateCookShifts();
            maxCook.setText(String.valueOf(cookMax));
        }
    }

    @FXML
    public void removeCook() {
        if (cookMax > 0) {
            if (cookMax <= cookCurr) {
                cookCurr = cookMax - 1;
            }
            cookMax -= 1;
            updateCookShifts();
            maxCook.setText(String.valueOf(cookMax));
            currCook.setText(String.valueOf(cookCurr));
        }
    }

    @FXML
    public void selectCook() throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("Staff_Day_Popup.fxml"));
        Scene scene = new Scene(test);
        Stage stage = new Stage();
        stage.getIcons().add(new Image("icon.gif"));
        stage.setScene(scene);
        stage.setTitle("Line Cooks avaliable");
        cookCurr += 1;
        currCook.setText(String.valueOf(cookCurr));
    }

    @FXML
    public void addWait() {
        if (waitMax < 10) {
            waitMax += 1;
            updateWaitShifts();
            maxWait.setText(String.valueOf(waitMax));
        }
    }

    @FXML
    public void removeWait() {
        if (waitMax > 0) {
            if (waitMax <= waitCurr) {
                waitCurr = waitMax - 1;
            }
            waitMax -= 1;
            updateWaitShifts();
            maxWait.setText(String.valueOf(waitMax));
            currWait.setText(String.valueOf(waitCurr));
        }
    }

    @FXML
    public void selectWait() throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("Staff_Day_Popup.fxml"));
        Scene scene = new Scene(test);
        Stage stage = new Stage();
        stage.getIcons().add(new Image("icon.gif"));
        stage.setScene(scene);
        stage.setTitle("Wait Staff avaliable");
        waitCurr += 1;
        currWait.setText(String.valueOf(waitCurr));
    }

    @FXML
    public void addJanitor() {
        if (janitorMax < 10) {
            janitorMax += 1;
            updateJanitorShifts();
            maxJanitor.setText(String.valueOf(janitorMax));
        }
    }

    @FXML
    public void removeJanitor() {
        if (janitorMax > 0) {
            if (janitorMax <= janitorCurr) {
                janitorCurr = janitorMax - 1;
            }
            janitorMax -= 1;
            updateJanitorShifts();
            maxJanitor.setText(String.valueOf(janitorMax));
            currJanitor.setText(String.valueOf(janitorCurr));
        }
    }

    @FXML
    public void selectJanitor() throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("Staff_Day_Popup.fxml"));
        Scene scene = new Scene(test);
        Stage stage = new Stage();
        stage.getIcons().add(new Image("icon.gif"));
        stage.setScene(scene);
        stage.setTitle("Janitors avaliable");
        janitorCurr += 1;
        currJanitor.setText(String.valueOf(janitorCurr));
    }

}
