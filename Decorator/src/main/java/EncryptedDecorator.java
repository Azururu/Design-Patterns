public class EncryptedDecorator extends PrinterDecorator {
    private final int shift = 3;

    public EncryptedDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        String encrypted = encrypt(message);
        super.print(encrypted);
    }

    public void decryptAndPrint(String message){
        String decrypted = decrypt(message);
        super.print(decrypted);
    }

    private String encrypt(String message) {
        StringBuilder result = new StringBuilder();
        for (char c : message.toCharArray()) {
            result.append((char) (c + shift));
        }
        return result.toString();
    }

    private String decrypt(String message) {
        StringBuilder result = new StringBuilder();
        for (char c : message.toCharArray()) {
            result.append((char) (c - shift));
        }
        return result.toString();
    }
}
