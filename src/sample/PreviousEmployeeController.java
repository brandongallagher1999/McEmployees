package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class PreviousEmployeeController implements Initializable {

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
    @FXML
    Button btn_reject; // the reject changes button

    @FXML
    Button btn_delete;

    boolean pressedConfirm = false;


    boolean pushed = false;


    public void makeEditable() {
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

        sNum.setEditable(btn_allowEditing.isSelected());
        lName.setEditable(btn_allowEditing.isSelected());
        fName.setEditable(btn_allowEditing.isSelected());
        pos.setEditable(btn_allowEditing.isSelected());
        pNum.setEditable(btn_allowEditing.isSelected());
        siNum.setEditable(btn_allowEditing.isSelected());
        dob.setEditable(btn_allowEditing.isSelected());
        gender.setEditable(btn_allowEditing.isSelected());

    }

    public User getCurrentUser() {
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
        user.phoneNumber = pNum.getText();
        user.position = pos.getText();
        user.province = province.getText();
        user.postalCode = postalCode.getText();
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
        user.postalCode = pos.getText();
        user.SIN = siNum.getText();
        user.DOB = dob.getText();
        user.gender = gender.getText();

        return user;
    }

    private void closeWindow() {
        Stage stage = (Stage) btn_delete.getScene().getWindow();
        stage.close();
    }

    public void initListeners() {

        btn_allowEditing.setOnAction(event -> makeEditable());


        btn_confirm.setOnAction(event -> {
                    try {
                        db.delete(eNum.getText());
                        User user = this.getCurrentUser();
                        db.insert(user);
                        Stage stage = (Stage) btn_reject.getScene().getWindow();
                        stage.close();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );

        btn_reject.setOnAction(e -> {
            closeWindow();
        });

        btn_delete.setOnAction(e ->
        {
            try {
                db.delete(eNum.getText());
                closeWindow();
            } catch (Exception et) {
                et.printStackTrace();
            }
        });

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

        User user = this.getCurrentUser();

        db.insert(user);


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            initListeners();
            db = new database();
            FileHandlerLocal handler = new FileHandlerLocal();
            eNum.setText(handler.getField(0));
            sNum.setText(handler.getField(1));
            lName.setText(handler.getField(2));
            fName.setText(handler.getField(3));
            pos.setText(handler.getField(4));
            pNum.setText(handler.getField(5));
            siNum.setText(handler.getField(6));
            dob.setText(handler.getField(7));
            gender.setText(handler.getField(8));
            address.setText(handler.getField(9));
            city.setText(handler.getField(10));
            province.setText(handler.getField(11));
            postalCode.setText(handler.getField(12));
            mon.setText(handler.getField(13));
            tues.setText(handler.getField(14));
            wed.setText(handler.getField(15));
            thur.setText(handler.getField(16));
            fri.setText(handler.getField(17));
            sat.setText(handler.getField(18));
            sun.setText(handler.getField(19));
            fullPartTime.setText(handler.getField(20));
            jobType.setText(handler.getField(21));
            wage.setText(handler.getField(22));
            bNum.setText(handler.getField(23));
            tNum.setText(handler.getField(24));
            aNum.setText(handler.getField(25));


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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
