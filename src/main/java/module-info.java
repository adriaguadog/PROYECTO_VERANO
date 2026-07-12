module org.example.fund_tracker_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fund_tracker_project to javafx.fxml;
    exports org.example.fund_tracker_project;
}