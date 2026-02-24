public class Main {
    public static void main(String[] args) {
        Printer printer;

        printer = new BasicPrinter();
        printer.print("Example message");

        printer = new EncryptedDecorator(new BasicPrinter());
        printer.print("Example message");

        printer = new XMLDecorator(new BasicPrinter());
        printer.print("Example message");

        printer = new EncryptedDecorator(new XMLDecorator(new BasicPrinter()));
        printer.print("Example message");
    }
}