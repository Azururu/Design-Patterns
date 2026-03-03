import java.util.Scanner;

public class Character {

    private LevelState levelState;

    Scanner scanner = new Scanner(System.in);

    private final String name;
    private String level = "Novice";
    private int health = 10;
    private int exp = 0;

    public Character() {
        System.out.println("Choose a name:\n");
        name = scanner.nextLine();
        levelState = new NoviceState(this);
    }

    public void playGame() {
        while (true) {
            if (levelState == null) {
                System.out.println("Level is null.");
                return;
            }
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "1":
                    levelState.train();
                    break;
                case "2":
                    levelState.meditate();
                    break;
                case "3":
                    levelState.fight();
                    break;
            }
        }
    };

    public void readUserOptions() {
        System.out.println("-- Choose an action --");
        System.out.println("1. Train");
        System.out.println("2. Meditate");
        System.out.println("3. Fight");
    }

    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
        System.out.println("Experience: " + exp);
        System.out.println();
    }

    public void setLevelState(LevelState levelState) {
        this.levelState = levelState;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
