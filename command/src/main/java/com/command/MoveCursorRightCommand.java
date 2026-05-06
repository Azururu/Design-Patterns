package com.command;

public class MoveCursorRightCommand implements Command {

    private EditorReceiver receiver;

    public MoveCursorRightCommand(EditorReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.moveCursor(1, 0);
    }
}
