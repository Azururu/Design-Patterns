package com.command;

public class EditorInvoker {
    private Command moveUpCommand;
    private Command moveDownCommand;
    private Command moveLeftCommand;
    private Command moveRightCommand;
    private Command togglePixelCommand;
    private Command generateCodeCommand;

    public EditorInvoker(Command moveUpCommand, Command moveDownCommand, Command moveLeftCommand, Command moveRightCommand, Command togglePixelCommand, Command generateCodeCommand) {
        this.moveUpCommand = moveUpCommand;
        this.moveDownCommand = moveDownCommand;
        this.moveLeftCommand = moveLeftCommand;
        this.moveRightCommand = moveRightCommand;
        this.togglePixelCommand = togglePixelCommand;
        this.generateCodeCommand = generateCodeCommand;
    }

    public void moveUp() {
        moveUpCommand.execute();
    }

    public void moveDown() {
        moveDownCommand.execute();
    }

    public void moveLeft() {
        moveLeftCommand.execute();
    }

    public void moveRight() {
        moveRightCommand.execute();
    }

    public void togglePixel() {
        togglePixelCommand.execute();
    }

    public void generateCode() {
        generateCodeCommand.execute();
    }
}
