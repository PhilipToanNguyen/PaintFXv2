module com.example.obj2000ny {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.obj2000ny to javafx.fxml;
    exports com.example.obj2000ny;
}