package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class employeePopupController implements Initializable {

    @FXML
    public Button btn_reject; // the reject changes button
    database db;
    @FXML
    AnchorPane anchorPane;
    @FXML
    TextField eNum; //employee number
    @FXML
    TextField sNum; //Seniority
    @FXML
    TextField lName; //Name, last
    @FXML
    TextField fName; //Name, first
    @FXML
    TextField pos; //Position
    @FXML
    TextField pNum; //Phone Number
    @FXML
    TextField siNum; //Social Insurance Number
    @FXML
    TextField dob; //Date of Birth
    @FXML
    TextField gender; //Gender
    @FXML
    TextField address; //Address
    @FXML
    TextField city; //City
    @FXML
    TextField province; //Province
    @FXML
    TextField postalCode; //Postal Code
    @FXML
    TextField mon; //Monday availability
    @FXML
    TextField tues; //Tuesday availability
    @FXML
    TextField wed; //Wenesday availability
    @FXML
    TextField thur; //Thursday availability
    @FXML
    TextField fri; //Friday availability
    @FXML
    TextField sat; //Saturday availability
    @FXML
    TextField sun; //Sunday availability
    @FXML
    TextField fullPartTime; //Full time or part time
    @FXML
    TextField jobType; // temporary, permanent, contract, other
    @FXML
    TextField wage; //cost to employ this employee for an hour
    @FXML
    TextField bNum; //bank Number
    @FXML
    TextField tNum; //Transit Number
    @FXML
    TextField aNum; //Account Number
    @FXML
    ToggleButton btn_allowEditing; // the button to be able to edit an employee
    @FXML
    Button btn_confirm; // the confirm changes button
    String employeeNumber2;


    public void initListeners() {

        btn_confirm.setOnAction(event -> {
                    try {
                        pushDatabase();
                        db.updateNum(eNum.getText());
                        Stage stage = (Stage) btn_reject.getScene().getWindow();
                        stage.close();

                    } catch (Exception e) {

                    }
                }
        );

    }

    @FXML
    public void rejectChanges(ActionEvent event) {
        Stage stage = (Stage) btn_reject.getScene().getWindow();
        stage.close();
    }


    @FXML
    public void pushDatabase() throws Exception {
        //this function will be the function that can add employee information to the database
        //if it is being used to add a new employee, it will put that employee's info into a new
        //part of the database. If it is being used to update an employee, it will put the employee's
        //info in their part of the database. Instead of only changing the updated parts, it may be
        //easier to override all of the employee's info. If only the updated info is changed, then
        //there shouldn't be much of a difference.

        //also this function should be written by brandon, since he's the database dude

        User user = new User();

        user.fullTimePartTime = fullPartTime.getText();
        user.employmentType = jobType.getText();
        user.pay = wage.getText();
        user.bankNumber = bNum.getText();
        user.bankNumber = bNum.getText();
        user.transitNum = tNum.getText();
        user.accountNumber = aNum.getText();
        user.address = address.getText();
        user.city = city.getText();
        user.province = province.getText();
        user.postalCode = postalCode.getText();
        user.position = pos.getText();
        user.phoneNumber = pNum.getText();
        user.monday = mon.getText();
        user.tuesday = tues.getText();
        user.wednesday = wed.getText();
        user.thursday = thur.getText();
        user.friday = fri.getText();
        user.saturday = sat.getText();
        user.sunday = sun.getText();
        user.employeeNumber = eNum.getText();
        user.senorityValue = sNum.getText();
        user.lastName = lName.getText();
        user.firstName = fName.getText();
        user.SIN = siNum.getText();
        user.DOB = dob.getText();
        user.gender = gender.getText();

        db.insert(user);


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            initListeners();
            db = new database();

            employeeNumber2 = db.getNumber();

            eNum.setText(employeeNumber2);

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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
