module com.example.praktikum2ad {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.praktikum2ad to javafx.fxml;
    opens com.example.praktikum2ad.model to javafx.fxml;
    exports com.example.praktikum2ad;
    exports com.example.praktikum2ad.model;

}