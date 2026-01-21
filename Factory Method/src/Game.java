public class Game {
    public static void main(String[] args) {
        Map map = createMap();
        map.display();
    }

    public static Map createMap() {
        int randomInt = (int) (Math.random() * 2);
        return switch (randomInt) {
            case 0 -> new CityMap();
            default -> new WildernessMap();
        };
    }
}
