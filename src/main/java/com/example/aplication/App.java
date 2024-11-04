package com.example.aplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utilidades.Rutas;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(Rutas.TABLA));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(),800,600);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.sizeToScene();
        stage.setWidth(700);
        stage.setHeight(600);
        stage.centerOnScreen();

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}