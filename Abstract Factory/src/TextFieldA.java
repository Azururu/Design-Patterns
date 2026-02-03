public class TextFieldA extends TextField {
    public TextFieldA(String text) {
        super(text);
    }

    @Override
    void display() {
        System.out.println("------------");
        System.out.println("[ " + text + " ]");
        System.out.println("------------");
    }
}