public class WildernessMap extends Map {

    @Override
    public Tile createTile() {
        int randomNum = (int)(Math.random() * 3);
        return switch (randomNum) {
            case 0 -> new SwampTile();
            case 1 -> new WaterTile();
            default -> new ForestTile();
        };
    }
}
