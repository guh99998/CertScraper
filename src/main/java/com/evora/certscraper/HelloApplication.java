package com.evora.certscraper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("CERTSCRAPER");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setPadding(new Insets(25, 25, 25, 25));

        FXMLLoader loader = new FXMLLoader(getClass().getResource("vendedor-view.fxml"));
        Scene scene = new Scene(loader.load(), 700, 700);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
