module com.example.helloword2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloword2 to javafx.fxml;
    exports com.example.helloword2;
}