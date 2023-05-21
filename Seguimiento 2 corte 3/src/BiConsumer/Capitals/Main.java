package BiConsumer.Capitals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Colombia", "Greece", "Japan");
        List<String> list2 = Arrays.asList("Bogota", "Athens", "Tokio");

        List<String> result = new ArrayList<>();

        BiConsumer<String, String> biConsumer = (s1, s2) -> result.add(s1 + " " + s2);

        for(int i=0; i<list1.size(); i++) {
            biConsumer.accept(list1.get(i), list2.get(i));
        }
        System.out.println(result); // [apple grape, banana kiwi, orange pineapple]
    }
}
