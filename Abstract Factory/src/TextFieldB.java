public class TextFieldB extends TextField {
    public TextFieldB(String text) {
        super(text);
    }

    @Override
    void display() {
        System.out.println("++++++++++++");
        System.out.println("[ " + text + " ]");
        System.out.println("++++++++++++");
    }
}