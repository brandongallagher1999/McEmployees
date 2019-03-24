package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

/**
 * Create an anchor pane that can store additional data.
 */
public class DateNodeAction extends AnchorPane {

    // Date associated with this pane
    private LocalDate date;

    /**
     * Create a anchor pane node. Date is not assigned in the constructor.
     * @param children children of the anchor pane
     */
    public DateNodeAction(Node... children) {
        super(children);
        // Add action handler for mouse clicked
        this.setOnMouseClicked(e -> {
            try{

                popup();
            }catch (IOException ex) {

            }

        });
    }

    public void popup() throws IOException {
        Parent test = FXMLLoader.load(getClass().getResource("Selected_Days_Popup.fxml"));
        Scene scene = new Scene(test);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.getIcons().add(new Image("icon.gif"));
        stage.setTitle("Staff for Selected Day");
        stage.show();

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
