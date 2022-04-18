package homework.workNumber.netology;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMain {
    private static final DataList data = new DataList();
    private static final Stream<Integer> stream = data.getIntList().stream();

    public static void main(String[] args) {

        stream.
                filter(x -> x > 0).
                filter(x -> x % 2 == 0).
                sorted(Comparator.naturalOrder()).
                forEach(System.out::println);
    }
}
