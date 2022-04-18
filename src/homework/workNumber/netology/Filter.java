package homework.workNumber.netology;

import java.util.function.Predicate;

public class Filter {
    public Predicate<Integer> isPositiveAndEven = x -> x > 0 && x % 2 == 0;
}
