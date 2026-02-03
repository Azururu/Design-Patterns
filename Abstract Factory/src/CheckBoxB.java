public class CheckBoxB extends CheckBox {
    public CheckBoxB(String text) {
        super(text);
    }

    @Override
    void display() {
        System.out.println("+++");
        System.out.println("[ " + text + " ]");
        System.out.println("+++");
    }
}