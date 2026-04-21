package com.assignment.mediator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mediator implements IMediator {

    private Map<String, Client> clients;

    public Mediator() {
        clients = new HashMap<>();
    }

    // Forward the message to the recipient
    @Override
    public void sendMessage(Client sender, String recipient, String message) {
        if (!clients.containsKey(recipient) || message.isEmpty()) {
            return;
        }
        Client recipientClient = clients.get(recipient);
        recipientClient.receiveMessage(sender, message);
    }

    // Register the client
    @Override
    public void registerClient(Client client) {
        clients.put(client.getUserName(), client);
    }

    // Get all registered clients
    public List<String> getRecipients() {
        return clients.keySet().stream().toList();
    }
}
