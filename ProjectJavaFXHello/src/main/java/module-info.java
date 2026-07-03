module com.example.projectjavafxhello {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectjavafxhello to javafx.fxml;
    exports com.example.projectjavafxhello;
}