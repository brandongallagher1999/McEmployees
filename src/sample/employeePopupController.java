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
import javafx.stage.Stage;


import javax.xml.soap.Text;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class employeePopupController implements Initializable{

    @FXML AnchorPane anchorPane;
    @FXML TextField eNum; //employee number
    @FXML TextField sNum; //Seniority
    @FXML TextField lName; //Name, last
    @FXML TextField fName; //Name, first
    @FXML TextField pos; //Position
    @FXML TextField pNum; //Phone Number
    @FXML TextField siNum; //Social Insurance Number
    @FXML TextField dob; //Date of Birth
    @FXML TextField gender; //Gender
    @FXML TextField address; //Address
    @FXML TextField city; //City
    @FXML TextField province; //Province
    @FXML TextField postalCode; //Postal Code
    @FXML TextField mon; //Monday availability
    @FXML TextField tues; //Tuesday availability
    @FXML TextField wed; //Wenesday availability
    @FXML TextField thur; //Thursday availability
    @FXML TextField fri; //Friday availability
    @FXML TextField sat; //Saturday availability
    @FXML TextField sun; //Sunday availability
    @FXML TextField fullPartTime; //Full time or part time
    @FXML TextField jobType; // temporary, permanent, contract, other
    @FXML TextField wage; //cost to employ this employee for an hour
    @FXML TextField bNum; //bank Number
    @FXML TextField tNum; //Transit Number
    @FXML TextField aNum; //Account Number


    @FXML Button btn_btn_allowEditing1;



    @FXML public void addEmployee(){
        //this will set all the textboxes to blank, and allow them to be filled in by the user
        //once the user has completed all of the text boxes, there will be a confirm button that
        //they can press that will add the employee information to the database
        eNum.setText("");
        sNum.setText("");
        lName.setText("");
        fName.setText("");
        pos.setText("");
        pNum.setText("");
        siNum.setText("");
        dob.setText("");
        gender.setText("");
        address.setText("");
        city.setText("");
        province.setText("");
        postalCode.setText("");
        mon.setText("");
        tues.setText("");
        wed.setText("");
        thur.setText("");
        fri.setText("");
        sat.setText("");
        sun.setText("");
        fullPartTime.setText("");
        jobType.setText("");
        wage.setText("");
        bNum.setText("");
        tNum.setText("");
        aNum.setText("");
    }

    public void setEditableBank(boolean value){

    }

    public void setEditableLocation(boolean value){
        address.setEditable(!value);
        city.setEditable(!value);
        province.setEditable(!value);
        postalCode.setEditable(!value);
        mon.setEditable(!value);
        tues.setEditable(!value);
        wed.setEditable(!value);
        thur.setEditable(!value);
        fri.setEditable(!value);
        sat.setEditable(!value);
        sun.setEditable(!value);
    }


    public void setEditableIdentification(boolean value) {
        eNum.setEditable(!value);
        sNum.setEditable(!value);
        lName.setEditable(!value);
        fName.setEditable(!value);
        pos.setEditable(!value);
        pNum.setEditable(!value);
        siNum.setEditable(!value);
        dob.setEditable(!value);
        gender.setEditable(!value);

    }

    @FXML public void makeEditable(){
        eNum.setEditable(true);
        sNum.setEditable(true);
        lName.setEditable(true);
        fName.setEditable(true);
        pos.setEditable(true);
        pNum.setEditable(true);
        siNum.setEditable(true);
        dob.setEditable(true);
        gender.setEditable(true);
        address.setEditable(true);
        city.setEditable(true);
        province.setEditable(true);
        postalCode.setEditable(true);
        mon.setEditable(true);
        tues.setEditable(true);
        wed.setEditable(true);
        thur.setEditable(true);
        fri.setEditable(true);
        sat.setEditable(true);
        sun.setEditable(true);
        fullPartTime.setEditable(true);
        jobType.setEditable(true);
        wage.setEditable(true);
        bNum.setEditable(true);
        tNum.setEditable(true);
        aNum.setEditable(true);
    }

    @FXML public void makeNotEditable(){
        eNum.setEditable(false);
        sNum.setEditable(false);
        lName.setEditable(false);
        fName.setEditable(false);
        pos.setEditable(false);
        pNum.setEditable(false);
        siNum.setEditable(false);
        dob.setEditable(false);
        gender.setEditable(false);
        address.setEditable(false);
        city.setEditable(false);
        province.setEditable(false);
        postalCode.setEditable(false);
        mon.setEditable(false);
        tues.setEditable(false);
        wed.setEditable(false);
        thur.setEditable(false);
        fri.setEditable(false);
        sat.setEditable(false);
        sun.setEditable(false);
        fullPartTime.setEditable(false);
        jobType.setEditable(false);
        wage.setEditable(false);
        bNum.setEditable(false);
        tNum.setEditable(false);
        aNum.setEditable(false);

    }



    @FXML public void deleteEmployee(){
        //this function will remove all of a selected employee's information from the database
        //it should probably require a confirmation before firing somebody
        //should employee numbers be re-useable?


    }



    @FXML public void pushDatabase(){
        //this function will be the function that can add employee information to the database
        //if it is being used to add a new employee, it will put that employee's info into a new
        //part of the database. If it is being used to update an employee, it will put the employee's
        //info in their part of the database. Instead of only changing the updated parts, it may be
        //easier to override all of the employee's info. If only the updated info is changed, then
        //there shouldn't be much of a difference.

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        eNum.setEditable(false);
        sNum.setEditable(false);
        lName.setEditable(false);
        fName.setEditable(false);
        pos.setEditable(false);
        pNum.setEditable(false);
        siNum.setEditable(false);
        dob.setEditable(false);
        gender.setEditable(false);

        address.setEditable(false);
        city.setEditable(false);
        province.setEditable(false);
        postalCode.setEditable(false);
        mon.setEditable(false);
        tues.setEditable(false);
        wed.setEditable(false);
        thur.setEditable(false);
        fri.setEditable(false);
        sat.setEditable(false);
        sun.setEditable(false);
    }
}
