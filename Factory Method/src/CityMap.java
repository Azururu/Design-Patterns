public class CityMap extends Map {

    @Override
    public Tile createTile() {
        int randomNum = (int)(Math.random() * 3);
        return switch (randomNum) {
            case 0 -> new RoadTile();
            case 1 -> new ForestTile();
            default -> new BuildingTile();
        };
    }
}
