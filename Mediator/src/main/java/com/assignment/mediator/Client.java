package com.assignment.mediator;

import java.util.List;

public class Client implements IClient {
    private IMediator mediator;
    private String userName;
    private Controller controller;

    public Client(IMediator mediator, String userName) {
        this.mediator = mediator;
        this.userName = userName;
    }

    // Send a message to recipient through mediator
    @Override
    public void sendMessage(String recipient, String message) {
        mediator.sendMessage(this, recipient, message);
    }

    // Receive a message from a sender and forward it to the controller
    @Override
    public void receiveMessage(Client sender, String message) {
        controller.handleDisplayMessage(sender, message);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public String getUserName() {
        return userName;
    }

    public List<String> getRecipients() {
        return mediator.getRecipients();
    }
}
