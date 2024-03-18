module com.internshala.connect4app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.internshala.connect4app to javafx.fxml;
    exports com.internshala.connect4app;
}