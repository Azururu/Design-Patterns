public class NoviceState extends LevelState {

    public NoviceState(Character character) {
        super(character);
        character.setHealth(10);
        character.displayStats();
        character.readUserOptions();
    }

    @Override
    void train() {
        Character character = this.getCharacter();
        character.setExp(character.getExp() + 1);
        if (character.getExp() >= 5) {
            character.setLevelState(new IntermediateState(character));
            character.setExp(0);
            character.setLevel("Intermediate");
        }
        character.displayStats();
        character.readUserOptions();
    }

    @Override
    void meditate() {
        System.out.println("You can't meditate at this level.");
    }

    @Override
    void fight() {
        System.out.println("You can't fight at this level.");
    }
}
