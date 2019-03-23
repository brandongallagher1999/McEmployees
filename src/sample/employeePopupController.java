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


    @FXML ToggleButton btn_allowEditing; // the button to be able to edit an employee
    @FXML ToggleButton btn_delete; // the button to delete an employee

    @FXML Button btn_confirm; // the confirm changes button
    @FXML Button btn_reject; // the reject changes button





    public void addEmployee(){
        fullPartTime.setText("");
        jobType.setText("");
        wage.setText("");
        bNum.setText("");
        tNum.setText("");
        aNum.setText("");

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

        eNum.setText("");
        sNum.setText("");
        lName.setText("");
        fName.setText("");
        pos.setText("");
        pNum.setText("");
        siNum.setText("");
        dob.setText("");
        gender.setText("");

        btn_allowEditing.setSelected(true);
        makeEditable();
    }

    public void makeEditable(){
        fullPartTime.setEditable(btn_allowEditing.isSelected());
        jobType.setEditable(btn_allowEditing.isSelected());
        wage.setEditable(btn_allowEditing.isSelected());
        bNum.setEditable(btn_allowEditing.isSelected());
        tNum.setEditable(btn_allowEditing.isSelected());
        aNum.setEditable(btn_allowEditing.isSelected());

        address.setEditable(btn_allowEditing.isSelected());
        city.setEditable(btn_allowEditing.isSelected());
        province.setEditable(btn_allowEditing.isSelected());
        postalCode.setEditable(btn_allowEditing.isSelected());
        mon.setEditable(btn_allowEditing.isSelected());
        tues.setEditable(btn_allowEditing.isSelected());
        wed.setEditable(btn_allowEditing.isSelected());
        thur.setEditable(btn_allowEditing.isSelected());
        fri.setEditable(btn_allowEditing.isSelected());
        sat.setEditable(btn_allowEditing.isSelected());
        sun.setEditable(btn_allowEditing.isSelected());

        eNum.setEditable(btn_allowEditing.isSelected());
        sNum.setEditable(btn_allowEditing.isSelected());
        lName.setEditable(btn_allowEditing.isSelected());
        fName.setEditable(btn_allowEditing.isSelected());
        pos.setEditable(btn_allowEditing.isSelected());
        pNum.setEditable(btn_allowEditing.isSelected());
        siNum.setEditable(btn_allowEditing.isSelected());
        dob.setEditable(btn_allowEditing.isSelected());
        gender.setEditable(btn_allowEditing.isSelected());

    }

    public void initListeners(){

        btn_allowEditing.setOnAction(event -> {
           makeEditable();
        });

        btn_delete.setOnAction(event -> {
            deleteEmployee();
        });

    }

    @FXML public void deleteEmployee(){
        //this function will remove all of a selected employee's information from the database
        //it should probably require a confirmation before firing somebody
        //should employee numbers be re-useable?
        System.out.println("'You're fired' - Trump");
        //bad taste of a joke? eh, it's to make sure the function can get called right
    }

    @FXML public void pushDatabase(){
        //this function will be the function that can add employee information to the database
        //if it is being used to add a new employee, it will put that employee's info into a new
        //part of the database. If it is being used to update an employee, it will put the employee's
        //info in their part of the database. Instead of only changing the updated parts, it may be
        //easier to override all of the employee's info. If only the updated info is changed, then
        //there shouldn't be much of a difference.

        //also this function should be written by brandon, since he's the database dude


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
