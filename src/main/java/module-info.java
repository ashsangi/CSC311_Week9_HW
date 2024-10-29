module com.example.csc311_week9_hw {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc311_week9_hw to javafx.fxml;
    exports com.example.csc311_week9_hw;
}