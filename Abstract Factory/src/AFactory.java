public class AFactory extends UIFactory {
    @Override
    public void createButton(String text) {
        ButtonA buttonA = new ButtonA();
    }

    @Override
    public void createTextField(String text) {
        TextFieldA textFieldA = new TextFieldA();
    }

    @Override
    public void createCheckBox(String text) {
        CheckBoxA checkBoxA = new CheckBoxA();
    }
}
