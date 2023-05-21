package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> iceCream = new ArrayList<>();
        iceCream.add("Vanilla");
        iceCream.add("Chocolate");
        iceCream.add("Lemon Pie");
        iceCream.add("Strawberry");
        iceCream.remove("Chocolate");

        Consumer<String> capitals = ice -> iceCream.set(iceCream.indexOf(ice), ice.toUpperCase());

        iceCream.forEach(capitals);

        System.out.println(iceCream);
    }
}
