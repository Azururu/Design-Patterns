public abstract class LevelState {
    private final Character character;

    public LevelState(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    abstract void train();
    abstract void meditate();
    abstract void fight();
}

