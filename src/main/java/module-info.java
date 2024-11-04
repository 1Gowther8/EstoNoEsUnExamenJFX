module com.example.noesunexamenjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.noesunexamenjfx to javafx.fxml;
    exports com.example.noesunexamenjfx;
}