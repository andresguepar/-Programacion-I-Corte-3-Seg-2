package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<IceCream> ice = Arrays.asList(
                new IceCream("Vanilla", 8),
                new IceCream("Lemon Pie", 10),
                new IceCream("French Vanilla", 15),
                new IceCream("Tangerine", 6)
        );

        Predicate<IceCream> isGourmet = iceCream -> iceCream.getPrice() >= 10;

        List<IceCream> gourmet = ice.stream()
                .filter(isGourmet)
                .collect(Collectors.toList());
        System.out.println("Gourmet flavor are:");
        System.out.println(gourmet);
    }

    static class IceCream {
        private String name;
        private int price;

        public IceCream(String name, int price ) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
