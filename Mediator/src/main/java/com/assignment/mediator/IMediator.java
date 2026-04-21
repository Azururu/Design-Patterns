package com.assignment.mediator;

import java.util.List;

public interface IMediator {
    void sendMessage(Client sender, String recipient, String message);
    void registerClient(Client client);
    List<String> getRecipients();
}
