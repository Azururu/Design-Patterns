
public class CheckBoxA extends CheckBox {
    public CheckBoxA(String text) {
        super(text);
    }

    @Override
    void display() {

        System.out.println("---");
        System.out.println("[ " + text + " ]");
        System.out.println("---");
    }
}