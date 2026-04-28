import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int previous = 0;
    private int current = 1;

    private FibonacciSequence sequence;

    public FibonacciIterator(FibonacciSequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int nextValue = sequence.generateFibonacciNumber(previous, current);
        previous = current;
        int currentValue = current;
        current = nextValue;
        return currentValue;
    }
}
