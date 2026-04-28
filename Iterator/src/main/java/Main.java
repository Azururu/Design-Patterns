import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ISequence sequence = new FibonacciSequence();
        Iterator<Integer> iterator = sequence.iterator();
        for (int i = 0; i < 10; i++) {
            System.out.println(iterator.next());
        }
    }
}
