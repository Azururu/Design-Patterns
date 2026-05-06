package com.command;

public class TogglePixelCommand implements Command {
    
    private EditorReceiver receiver;

    public TogglePixelCommand(EditorReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.togglePixel();
    }
    
}
