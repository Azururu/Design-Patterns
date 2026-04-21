package com.assignment.mediator;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Client client;

    @FXML
    private TextArea chatArea;
    @FXML
    private TextField messageField;
    @FXML
    private ListView<String> recipientList;

    public void setClient(Client client) {
        this.client = client;
        loadRecipients();
    }

    @FXML
    public void handleSendButtonClick() {
        String message = messageField.getText();

        // Handle empty message
        if (message.isEmpty()) {
            return;
        }

        // Forward message to client
        client.sendMessage(recipientList.getSelectionModel().getSelectedItem(), message);
        messageField.clear();
    }

    @FXML
    public void handleDisplayMessage(Client sender, String message) {
        chatArea.appendText(sender.getUserName() + ": " + message + "\n");
    }

    public void loadRecipients() {
        List<String> recipients = new ArrayList<>(client.getRecipients());
        recipients.remove(client.getUserName());
        recipientList.getItems().addAll(recipients);
    }
}
