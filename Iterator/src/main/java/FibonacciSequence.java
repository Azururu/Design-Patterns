import java.util.Iterator;

public class FibonacciSequence implements ISequence {

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(this);
    }

    public int generateFibonacciNumber(int previous, int current) {
        return previous + current;
    }
}
