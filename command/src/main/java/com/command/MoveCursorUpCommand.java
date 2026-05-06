package com.command;

public class MoveCursorUpCommand implements Command {
    private EditorReceiver receiver;

    public MoveCursorUpCommand(EditorReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.moveCursor(0, -1);
    }
}
