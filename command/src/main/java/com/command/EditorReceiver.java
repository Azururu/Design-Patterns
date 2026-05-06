package com.command;

public class EditorReceiver {
    private int cursorX, cursorY;
    private boolean[][] pixels;

    public EditorReceiver() {
        cursorX = 0;
        cursorY = 0;
        pixels = new boolean[8][8];
    }

    public void moveCursor(int x, int y) {
        if (cursorX + x < 0 || cursorX + x >= pixels.length || cursorY + y < 0 || cursorY + y >= pixels[0].length) {
            System.out.println("Cannot move cursor out of bounds!");
            return;
        }
        cursorX += x;
        cursorY += y;
        System.out.println("Cursor moved to: (" + cursorX + ", " + cursorY + ")");
    }
    
    public void togglePixel() {
        if (cursorX >= 0 && cursorX < pixels.length && cursorY >= 0 && cursorY < pixels[0].length) {
            pixels[cursorX][cursorY] = !pixels[cursorX][cursorY];
            System.out.println("Pixel at (" + cursorX + ", " + cursorY + ") toggled to: " + pixels[cursorX][cursorY]);
        } else {
            System.out.println("Cursor is out of bounds!");
        }
    }

    public void generateCode() {
        System.out.println("int[][] pixelArt = {");

        for (int i = 0; i < pixels.length; i++) {
            System.out.print("    {");
            for (int j = 0; j < pixels[i].length; j++) {
                System.out.print("        " + (pixels[j][i] ? "1" : "0"));
                if (j < pixels[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("    }");
        }
        System.out.println("};");
    }



    public boolean[][] getPixels() {
        return pixels;
    }

    public int getCursorX() {
        return cursorX;
    }

    public int getCursorY() {
        return cursorY;
    }
}
