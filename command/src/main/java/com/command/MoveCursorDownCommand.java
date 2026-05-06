package com.command;

public class MoveCursorDownCommand implements Command {

    private EditorReceiver receiver;

    public MoveCursorDownCommand(EditorReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.moveCursor(0, 1);
    }
    
}
