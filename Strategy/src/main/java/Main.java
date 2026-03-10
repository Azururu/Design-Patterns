import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] smallArray = generateArray(30);
        int[] largeArray = generateArray(100000);

        testStrategy(new SelectionSortStrategy(), smallArray);
        testStrategy(new MergeSortStrategy(), smallArray);
        testStrategy(new BubbleSortStrategy(), smallArray);

        testStrategy(new SelectionSortStrategy(), largeArray);
        testStrategy(new MergeSortStrategy(), largeArray);
        testStrategy(new BubbleSortStrategy(), largeArray);
    }

    private static int[] generateArray(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    private static void testStrategy(SortingStrategy sortingStrategy, int[] array) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);

        long startTime = System.nanoTime();
        sortingStrategy.sort(arrayCopy);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println(sortingStrategy.getClass().getSimpleName() + ": " + duration + " ns");
    }
}
