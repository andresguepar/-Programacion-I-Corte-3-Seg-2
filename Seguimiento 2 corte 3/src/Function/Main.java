package Function;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> addPrefix = str -> "The best sweet is " + str;

        String result = addPrefix.apply("Ice Cream");

        System.out.println(result);
    }
}
