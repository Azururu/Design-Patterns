public class Main {
    public static void main(String[] args) {
        UIFactory factory = new AFactory();

        Button button = factory.createButton("OK");
        TextField textField = factory.createTextField("Hello");
        CheckBox checkbox = factory.createCheckBox("✓");

        button.display();
        textField.display();
        checkbox.display();

        button.setText("Submit");
        button.display();
    }
}
