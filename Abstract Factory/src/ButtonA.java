public class ButtonA extends Button {
    public ButtonA(String text) {
        super(text);
    }

    @Override
    void display() {
        System.out.println("-----");
        System.out.println("[ " + text + " ]");
        System.out.println("-----");
    }
}