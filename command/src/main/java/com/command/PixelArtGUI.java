package com.command;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class PixelArtGUI extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/command/main.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        EditorController controller = loader.getController();
        controller.setScene(scene);

        stage.setTitle("Pixel Art Editor");
        stage.setScene(scene);
        stage.show();
    }
}
