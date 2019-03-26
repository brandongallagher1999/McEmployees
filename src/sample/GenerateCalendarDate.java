package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;


public class GenerateCalendarDate {

    private ArrayList<DateNodeAction> allCalendarDays = new ArrayList<>(35);
    private VBox view;
    private Text currentMonth;
    private YearMonth currentYearMonth;

    /**
     * Generated a calendar on CalendarView.fxml
     */
    public GenerateCalendarDate(YearMonth yearMonth) {
        currentYearMonth = yearMonth;
        // Create the calendar grid pane
        GridPane calendar = new GridPane();
        calendar.setPrefSize(1280, 720);
        calendar.setGridLinesVisible(true);
        // Create rows and columns using anchor panes for the calendar
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                DateNodeAction ap = new DateNodeAction();
                ap.setPrefSize(200,200);
                calendar.add(ap,j,i);
                allCalendarDays.add(ap);
            }
        }
        // Days of the week labels
        Text[] dayNames = new Text[]{ new Text("Sunday"), new Text("Monday"), new Text("Tuesday"),
                                        new Text("Wednesday"), new Text("Thursday"), new Text("Friday"),
                                        new Text("Saturday") };
        GridPane dayLabels = new GridPane();
        dayLabels.setPrefWidth(600);
        Integer col = 0;
        for (Text txt : dayNames) {
            AnchorPane ap = new AnchorPane();
            ap.setPrefSize(200, 10);
            ap.setBottomAnchor(txt, 5.0);
            ap.getChildren().add(txt);
            dayLabels.add(ap, col++, 0);
        }
        // Create currentMonth and buttons to change month
        currentMonth = new Text();
        currentMonth.setFont(Font.font ("Arial", 20));
        currentMonth.setFill(Color.RED);

        Button previousMonth = new Button("Previous Month");
        previousMonth.setPrefWidth(400);
        previousMonth.setStyle("-fx-text-fill: #0000ff");
        previousMonth.setOnAction(e -> previousMonth());

        Button nextMonth = new Button("Next Month");
        nextMonth.setPrefWidth(400);
        nextMonth.setStyle("-fx-text-fill: #0000ff");
        nextMonth.setOnAction(e -> nextMonth());

        HBox titleBar = new HBox(previousMonth, currentMonth, nextMonth);
        titleBar.setAlignment(Pos.BASELINE_CENTER);
        titleBar.setSpacing(100);


        // Populate calendar with the appropriate day numbers
        generateCalendar(yearMonth);

        // Create the calendar view
        view = new VBox(titleBar, dayLabels, calendar);
    }

    /**
     * Set the days of the calendar to correspond to the correct date position
     */
    public void generateCalendar(YearMonth yearMonth) {
        // Get the date to start with
        LocalDate calendarDate = LocalDate.of(yearMonth.getYear(), yearMonth.getMonthValue(), 1);
        // Loop back the day until it is SUNDAY
        while (!calendarDate.getDayOfWeek().toString().equals("SUNDAY") ) {
            calendarDate = calendarDate.minusDays(1);
        }
        // Populate the calendar
        for (DateNodeAction ap : allCalendarDays) {
            if (ap.getChildren().size() != 0) {
                ap.getChildren().remove(0);
            }
            Text txt = new Text(String.valueOf(calendarDate.getDayOfMonth()));
            ap.setDate(calendarDate);
            ap.setTopAnchor(txt, 5.0);
            ap.setLeftAnchor(txt, 5.0);
            ap.getChildren().add(txt);
            calendarDate = calendarDate.plusDays(1);
        }
        // Change the month of the calendar
        currentMonth.setText(yearMonth.getMonth().toString() + " " + String.valueOf(yearMonth.getYear()));
    }

    /**
     * Move the month back by one
     */
    private void previousMonth() {
        currentYearMonth = currentYearMonth.minusMonths(1);
        generateCalendar(currentYearMonth);
    }

    /**
     * Move the month forward by one
     */
    private void nextMonth() {
        currentYearMonth = currentYearMonth.plusMonths(1);
        generateCalendar(currentYearMonth);
    }

    public VBox getView() {
        return view;
    }

    public ArrayList<DateNodeAction> getAllCalendarDays() {
        return allCalendarDays;
    }

    public void setAllCalendarDays(ArrayList<DateNodeAction> allCalendarDays) {
        this.allCalendarDays = allCalendarDays;
    }
}
