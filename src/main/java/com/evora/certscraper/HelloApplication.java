package com.evora.certscraper;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
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

        Text scenetitle = new Text("VENDEDOR");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label cpfVendedor = new Label("CPF Vendedor:");
        grid.add(cpfVendedor, 0, 1);

        TextField cpfVendedorField = new TextField();
        cpfVendedorField.setPromptText("123.456.789-00");
        grid.add(cpfVendedorField, 1, 1);

        Label rgVendedor = new Label("RG Vendedor");
        grid.add(rgVendedor, 2, 1);

        TextField rgVendedorField = new TextField();
        rgVendedorField.setPromptText("12.345-67");
        grid.add(rgVendedorField, 3, 1);

        Label nomeVendedor = new Label("Nome Vendedor:");
        grid.add(nomeVendedor, 0, 2);

        TextField nomeVendedorField = new TextField();
        nomeVendedorField.setPromptText("João da Silva");
        grid.add(nomeVendedorField, 1, 2);

        Label dataNascimento = new Label("Data de Nascimento:");
        grid.add(dataNascimento, 0, 3);

        TextField dataNascimentoField = new TextField();
        dataNascimentoField.setPromptText("01/01/1900");
        grid.add(dataNascimentoField, 1, 3);

        Label cepEndereco = new Label("CEP:");
        grid.add(cepEndereco, 0, 4);

        TextField cepEnderecoField = new TextField();
        cepEnderecoField.setPromptText("00.000-000");
        grid.add(cepEnderecoField, 1, 4);

        Label ruaEndereco = new Label("Rua:");
        grid.add(ruaEndereco, 0, 5);

        TextField ruaEnderecoField = new TextField();
        ruaEnderecoField.setPromptText("Rua ABC");
        grid.add(ruaEnderecoField, 1, 5);

        Label numeroEndereco = new Label("Número");
        grid.add(numeroEndereco, 2, 5);

        TextField numeroEnderecoField = new TextField();
        numeroEnderecoField.setPromptText("999");
        grid.add(numeroEnderecoField, 3, 5);

        Label bairroEndereco = new Label("Bairro:");
        grid.add(bairroEndereco, 0, 6);

        TextField bairroEnderecoField = new TextField();
        bairroEnderecoField.setPromptText("Centro");
        grid.add(bairroEnderecoField, 1, 6);

        Label cidadeEndereco = new Label("Cidade:");
        grid.add(cidadeEndereco, 0, 7);

        TextField cidadeEnderecoField = new TextField();
        cidadeEnderecoField.setPromptText("São Paulo");
        grid.add(cidadeEnderecoField, 1, 7);

        Label ufEndereco = new Label("UF:");
        grid.add(ufEndereco, 2, 7);

        TextField ufEnderecoField = new TextField();
        ufEnderecoField.setPromptText("SP");
        grid.add(ufEnderecoField, 3, 7);

        final Text actiontarget = new Text();
            grid.add(actiontarget, 1, 6);

        GridPane.setHgrow(nomeVendedorField, Priority.ALWAYS);
        nomeVendedor.setMaxWidth(Double.MAX_VALUE);

        Scene scene = new Scene(grid, 700, 700);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
