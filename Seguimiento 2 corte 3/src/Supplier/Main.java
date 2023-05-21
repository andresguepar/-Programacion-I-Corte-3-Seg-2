package Supplier;

import java.util.UUID;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> idSupplier = () -> UUID.randomUUID().toString();

        String randomID = idSupplier.get();

        System.out.println(randomID);
    }
}

