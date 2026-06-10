module com.evora.certscraper {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.evora.certscraper to javafx.fxml;
    exports com.evora.certscraper;
}