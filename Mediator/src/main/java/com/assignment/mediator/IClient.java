package com.assignment.mediator;

public interface IClient {
    void sendMessage(String recipient, String message);
    void receiveMessage(Client sender, String message);
}
