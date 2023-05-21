package Sorted;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> iceCream = Arrays.asList("Vanilla", "Caramel", "Choco Mint","Lemon Pie", "French Vanilla","Tangerine");

        iceCream.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
