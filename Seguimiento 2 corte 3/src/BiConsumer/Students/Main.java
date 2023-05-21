package BiConsumer.Students;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main {
        public static void main(String[] args) {

            Map<String, Integer> studentGrades = new HashMap<>();
            studentGrades.put("Arnulfo", 5);
            studentGrades.put("Pepito", 4);
            studentGrades.put("Pepita", 3);
            studentGrades.put("Dayana", 2);

            BiConsumer<String, Integer> printGrade = (name, grade) ->
                    System.out.println(name + ": " + grade);


            studentGrades.forEach(printGrade);
        }


}



