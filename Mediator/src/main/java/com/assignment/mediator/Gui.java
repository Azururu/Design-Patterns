package com.assignment.mediator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Gui extends Application {

    private Mediator mediator;

    @Override
    public void start(Stage stage) throws Exception {

        List<Client> clients = new ArrayList<>();

        mediator = new Mediator();

        for (int i = 0; i < 3; i++) {
            clients.add(createClient("User" + (i + 1), mediator));
        }
        for (Client client : clients) {
            populateClient(client);
        }
    }

    // Create client and register it with mediator
    private Client createClient(String userName, Mediator mediator) {
        Client client = new Client(mediator, userName);
        mediator.registerClient(client);
        return client;
    }

    // Populate client window
    private void populateClient(Client client) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/assignment/mediator/window.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();

        linkControllers(client, controller);

        Stage stage = new Stage();
        stage.setScene(new javafx.scene.Scene(root));
        stage.setTitle(client.getUserName());
        stage.show();
    }

    // Link client and controller
    private void linkControllers(Client client, Controller controller) {
        client.setController(controller);
        controller.setClient(client);
    }
}
