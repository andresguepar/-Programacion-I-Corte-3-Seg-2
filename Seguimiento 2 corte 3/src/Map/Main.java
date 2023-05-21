package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Vanilla", "Caramel", "Choco Mint", "Lemon Pie");

        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(words);
        System.out.println("How many letters have each world?");
        System.out.println(wordLengths);
    }
}
