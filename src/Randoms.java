import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected PrimitiveIterator.OfInt randomitterator;
    protected int min, max;

    public Randoms(int min, int max) {
        randomitterator = new Random().ints(min, (max + 1)).iterator();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {


            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return randomitterator.nextInt();
            }
        };

    }
}


