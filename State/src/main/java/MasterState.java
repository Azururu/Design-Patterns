public class MasterState extends LevelState {

    public MasterState(Character character) {
        super(character);
        character.displayStats();
        character.readUserOptions();
    }

    @Override
    void train() {
        System.out.println("Master is already trained");
    }

    @Override
    void meditate() {
        System.out.println("Master has meditated enough");
    }

    @Override
    void fight() {
        System.out.println( "Master has fought enough");
    }
}
