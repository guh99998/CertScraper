module com.evora.certscraper {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.evora.certscraper;
    exports com.evora.certscraper.controller;

    opens com.evora.certscraper.controller to javafx.fxml;
}