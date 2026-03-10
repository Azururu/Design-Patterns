public class SelectionSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        selectionSort(array);
    }

    private void selectionSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int min_idx = i;

            for (int j = i +1; j < length; j++) {
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = array[i];
            array[i] = array[min_idx];
            array[min_idx] = temp;
        }
    }
}
