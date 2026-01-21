public class BFactory extends UIFactory {
    @Override
    public void createButton(String text) {
        ButtonB buttonB = new ButtonB();
    }

    @Override
    public void createTextField(String text) {
        TextFieldB textFieldB = new TextFieldB();
    }

    @Override
    public void createCheckBox(String text) {
        CheckBoxB checkBoxB = new CheckBoxB();
    }
}
