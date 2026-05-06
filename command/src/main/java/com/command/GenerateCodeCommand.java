package com.command;

public class GenerateCodeCommand implements Command {

    private EditorReceiver receiver;

    public GenerateCodeCommand(EditorReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.generateCode();
    }
    
}
