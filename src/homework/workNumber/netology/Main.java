package homework.workNumber.netology;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    private static final DataList data = new DataList();
    private static final List<Integer> intList = data.getIntList();
    private static final List<Integer> newList = new ArrayList<>();
    private static final Filter filter = new Filter();
    public static Consumer<Integer> println = System.out::println;

    public static void main(String[] args) {
        filter();
        sorted();
        print();
    }

    private static void filter() {
        for (int item : intList) {
            if (filter.isPositiveAndEven.test(item)) {
                newList.add(item);
            }
        }
    }

    private static void sorted() {
        Collections.sort(newList);
    }

    private static void print() {
        for (int item : newList) {
            println.accept(item);
        }
    }
}
