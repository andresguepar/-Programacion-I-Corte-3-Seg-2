package BiFunction;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, String> comparar = (a, b) -> {
            if (a.equals(b)) {
                return "Numbers are equals";
            } else if (a > b) {
                return "The first one is bigger" ;
            } else {
                return "The second one is bigger";
            }

        };

        String resultado = comparar.apply(2,6);
        System.out.println("Numbers are 2 and 6");
        System.out.println(resultado);
    }
}
