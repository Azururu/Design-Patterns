public class IntermediateState extends LevelState {

    public IntermediateState(Character character) {
        super(character);
        character.displayStats();
        character.readUserOptions();
    }

    @Override
    void train() {
        Character character = this.getCharacter();
        character.setExp(character.getExp() + 1);
        if (character.getExp() >= 10) {
            character.setLevelState(new ExpertState(character));
            character.setExp(0);
            character.setLevel("Expert");
        }
        character.displayStats();
        character.readUserOptions();
    }

    @Override
    void meditate() {
        Character character = this.getCharacter();
        character.setHealth(character.getHealth() + 2);
        character.displayStats();
        character.readUserOptions();
    }

    @Override
    void fight() {
        System.out.println("Advance to expert level to be able to fight.");
    }
}
