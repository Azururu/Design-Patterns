public abstract class Map {
    public abstract Tile createTile();

    public void display() {
        Tile[][] tiles = new Tile[5][5];
        for (int y = 0; y < tiles.length; y++) {
            for (int x = 0; x < tiles[y].length; x++) {
                tiles[y][x] = createTile();
            }
        }

        for (Tile[] row : tiles) {
            for (Tile tile : row) {
                System.out.print(tile.getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
