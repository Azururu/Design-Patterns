public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setFileName("test_log.txt");
        logger.writeLine("Hello World!");
        logger.writeLine(":)");
        logger.writeLine("This is a test log file.");
        logger.writeLine("Goodbye World!");
        logger.close();
    }
}
