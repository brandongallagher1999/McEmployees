package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class employeeMainController implements Initializable {

    @FXML
    AnchorPane anchorPane;
    @FXML
    ScrollPane scrollPane;
    @FXML
    VBox vbox_List;
    @FXML
    Button Btn_E_Add;


    private ArrayList<Button> employees;
    private ArrayList<User> users;
    private database db;

    @FXML
    public void switchSceneAdmin() throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("adminPage.fxml"));
        anchorPane.getChildren().setAll(test);
    }

    @FXML
    public void importEmployee() throws IOException {

    }

    @FXML
    public void openPopup(String fxml) throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource(fxml));

        Scene scene = new Scene(test);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.getIcons().add(new Image("icon.gif"));
        stage.setTitle("Employee Information");
        stage.show();

    }


    public void initListeners() {
        Btn_E_Add.setOnAction(e -> {
            try {
                openPopup("Employee_Info_Popup.fxml");
            } catch (Exception et) {
                et.printStackTrace();
            }

        });
        for (Button employee : employees) {
            employee.setOnAction(event -> {
                try {
                    FileHandlerLocal handler = new FileHandlerLocal();
                    handler.clear();
                    handler.output(employee.getText().substring(3, 12));
                    openPopup("Employee_Info_Popup_Existing.fxml");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }

    public void initialize(URL url, ResourceBundle rb) {
        try {
            employees = new ArrayList<>();
            users = new ArrayList<>();
            db = new database();

            users = db.retrieveAllUsers();
            Thread thread = new Thread(() -> {
                for (User user : users) {
                    employees.add(new Button());
                }

                for (int i = 0; i < employees.size(); i++) {
                    employees.get(i).setText("ID:" + users.get(i).employeeNumber + ", " + users.get(i).firstName + " " + users.get(i).lastName + ", " + users.get(i).address + ", " + users.get(i).city);
                }

                for (Button temp : employees) {
                    temp.setPrefWidth(1200);
                }
                for (Button button : employees) {
                    vbox_List.getChildren().add(button);
                }
                initListeners();
                scrollPane.setContent(vbox_List);
            });
            thread.start();

//            for (User user : users) {
//                employees.add(new Button());
//            }
//
//            for (int i = 0; i < employees.size(); i++) {
//                employees.get(i).setText("ID:" + users.get(i).employeeNumber + ", " + users.get(i).firstName + " " + users.get(i).lastName + ", " + users.get(i).address + ", " + users.get(i).city);
//            }
//
//            for (Button temp : employees) {
//                temp.setPrefWidth(1200);
//            }
//            for (Button button : employees) {
//                vbox_List.getChildren().add(button);
//            }

//            initListeners();
//            scrollPane.setContent(vbox_List);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
