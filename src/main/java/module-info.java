module com.example.aplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires javafx.base;
    requires javafx.graphics;


    opens controladores to javafx.fxml;

    exports com.example.aplication;
    exports controladores;

    opens com.example.aplication to javafx.fxml;
}