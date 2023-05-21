package Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<iceCream> ice = Arrays.asList(
                new iceCream("Vanilla", 6),
                new iceCream("Caramel", 7),
                new iceCream("Choco Mint", 12),
                new iceCream("Lemon Pie", 10),
                new iceCream("French Vanilla", 15),
                new iceCream("Tangerine", 6)
        );

        List<iceCream> gourmet = ice.stream()
                .filter(iceCream -> iceCream.getPrice() >= 10)
                .collect(Collectors.toList());

        System.out.println("Gourmet flavors are:");
        System.out.println(gourmet);
    }

    static class iceCream {
        private String flavor;
        private int price;


        public iceCream(String name, int price) {
            this.flavor = name;
            this.price = price;
        }

        public String getName() {
            return flavor;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return flavor;
        }
    }
}
