package com.command;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class EditorController {

    private EditorReceiver receiver;
    private EditorInvoker invoker;

    @FXML
    private GridPane grid;

    @FXML
    private Button genBtn;

    private Rectangle[][] cells = new Rectangle[8][8];

    @FXML
    public void initialize() {
        receiver = new EditorReceiver();
        invoker = new EditorInvoker(
            new MoveCursorUpCommand(receiver),
            new MoveCursorDownCommand(receiver),
            new MoveCursorLeftCommand(receiver),
            new MoveCursorRightCommand(receiver),
            new TogglePixelCommand(receiver),
            new GenerateCodeCommand(receiver)
        );
        createGrid();
        reDrawGrid();
    }

    private void createGrid() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle cell = new Rectangle();
                
                cell.widthProperty().bind(grid.widthProperty().divide(8));
                cell.heightProperty().bind(grid.heightProperty().divide(8));

                cell.setStyle("-fx-fill: white; -fx-stroke: black;");
                grid.add(cell, j, i);
                cells[i][j] = cell;
            }
        }
    }

    
    private void reDrawGrid() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                cells[j][i].setFill(
                    receiver.getPixels()[i][j]
                        ? javafx.scene.paint.Color.BLACK
                        : javafx.scene.paint.Color.WHITE
                );

                cells[i][j].setStroke(javafx.scene.paint.Color.BLACK);
                cells[i][j].setStrokeWidth(1);
            }
        }

        cells[receiver.getCursorY()][receiver.getCursorX()]
            .setStroke(javafx.scene.paint.Color.RED);
        cells[receiver.getCursorY()][receiver.getCursorX()]
            .setStrokeWidth(3);
    }

    @FXML
    private void handleGenerate() {
        invoker.generateCode();
    }

    public void setScene(Scene scene) {
        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP -> invoker.moveUp();
                case DOWN -> invoker.moveDown();
                case LEFT -> invoker.moveLeft();
                case RIGHT -> invoker.moveRight();
                case SPACE -> invoker.togglePixel();
            }
            reDrawGrid();
        });
    }

}
