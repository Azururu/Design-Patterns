public class ExpertState extends LevelState {

    public ExpertState(Character character) {
        super(character);
        character.displayStats();
        character.readUserOptions();
    }

    private void levelUp() {
        Character character = this.getCharacter();
        character.setLevelState(new MasterState(character));
        character.setExp(0);
        character.setLevel("Master");
    }

    @Override
    void train() {
        Character character = this.getCharacter();
        character.setExp(character.getExp() + 1);
        if (character.getExp() >= 15) {
            levelUp();
        }
        character.displayStats();
        character.readUserOptions();
    }

    @Override
    void meditate() {
        Character character = this.getCharacter();
        character.setHealth(character.getHealth() + 3);
        character.displayStats();
        character.readUserOptions();
    }

    @Override
    void fight() {
        Character character = this.getCharacter();
        character.setHealth(character.getHealth() - 5);
        character.setExp(character.getExp() + 2);
        if (character.getHealth() <= 0) {
            character.setHealth(0);
            character.setExp(0);
            character.setLevelState(new NoviceState(character));
            character.setLevel("Novice");
            System.out.println("You died.");
        }
        else if (character.getExp() >= 15) {
            levelUp();
        }
        character.displayStats();
        character.readUserOptions();
    }


}
