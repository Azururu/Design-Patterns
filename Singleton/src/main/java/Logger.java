import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private Logger() {
        openWriter();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    BufferedWriter writer;
    String fileName = "log.txt";

    public void setFileName(String fileName)  {
        close();
        this.fileName = fileName;
        openWriter();
    }

    public void writeLine(String message) {
        try {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            System.out.println( "Error writing to file: " + fileName);
            e.printStackTrace();
        }
    }

    private void openWriter() {
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            System.out.println( "Error opening file: " + fileName);
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.out.println( "Error closing file: " + fileName);
            e.printStackTrace();
        }
    }
}
