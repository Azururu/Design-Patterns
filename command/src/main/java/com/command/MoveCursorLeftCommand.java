package com.command;

public class MoveCursorLeftCommand implements Command {

    private EditorReceiver receiver;

    public MoveCursorLeftCommand(EditorReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.moveCursor(-1, 0);
    }
}