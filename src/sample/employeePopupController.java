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


    @FXML ToggleButton btn_allowEditing1;
    @FXML ToggleButton btn_allowEditing2;
    @FXML ToggleButton btn_allowEditing3;



    public void setEditableBank(){
        fullPartTime.setEditable(btn_allowEditing3.isSelected());
        jobType.setEditable(btn_allowEditing3.isSelected());
        wage.setEditable(btn_allowEditing3.isSelected());
        bNum.setEditable(btn_allowEditing3.isSelected());
        tNum.setEditable(btn_allowEditing3.isSelected());
        aNum.setEditable(btn_allowEditing3.isSelected());
    }

    public void setEditableLocation(){
        address.setEditable(btn_allowEditing2.isSelected());
        city.setEditable(btn_allowEditing2.isSelected());
        province.setEditable(btn_allowEditing2.isSelected());
        postalCode.setEditable(btn_allowEditing2.isSelected());
        mon.setEditable(btn_allowEditing2.isSelected());
        tues.setEditable(btn_allowEditing2.isSelected());
        wed.setEditable(btn_allowEditing2.isSelected());
        thur.setEditable(btn_allowEditing2.isSelected());
        fri.setEditable(btn_allowEditing2.isSelected());
        sat.setEditable(btn_allowEditing2.isSelected());
        sun.setEditable(btn_allowEditing2.isSelected());
    }


    public void setEditableIdentification() {
        eNum.setEditable(btn_allowEditing1.isSelected());
        sNum.setEditable(btn_allowEditing1.isSelected());
        lName.setEditable(btn_allowEditing1.isSelected());
        fName.setEditable(btn_allowEditing1.isSelected());
        pos.setEditable(btn_allowEditing1.isSelected());
        pNum.setEditable(btn_allowEditing1.isSelected());
        siNum.setEditable(btn_allowEditing1.isSelected());
        dob.setEditable(btn_allowEditing1.isSelected());
        gender.setEditable(btn_allowEditing1.isSelected());

    }

    public void initListeners(){

        btn_allowEditing1.setOnAction(event ->
        {
            setEditableIdentification();
        });

        btn_allowEditing2.setOnAction(event -> {
            setEditableLocation();
        });

        btn_allowEditing3.setOnAction(event ->
        {
            setEditableBank();
        });

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

        initListeners();

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
}
