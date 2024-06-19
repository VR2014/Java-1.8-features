package com.functionalInterfaces;


import java.util.List;
import java.util.function.BiConsumer;

import static com.functionalInterfaces.StudentDataBase.getAllStudents;

public class BiConsumerExample {
    public static void main(String[] args) {

        /*
       consumer and Biconsumer doesn't return any values
        those will consume the parameter and perform the operations
        accept method will take parameters
        andThen method is used of taking multiple methods
         */
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a : " + a + " b: " + b);
        };
        biConsumer.accept("vamsi", "good Boy");

        // Operations
        BiConsumer<Integer, Integer> multipley = (a, b) -> {
            System.out.println("mul value : " + (a * b));
        };
        BiConsumer<Integer, Integer> devision = (a, b) -> {
            System.out.println(a / b);
        };
        BiConsumer<Integer, Integer> sub = (a, b) -> {
            System.out.println(a - b);
        };
        sub.andThen(devision).andThen(multipley).accept(8, 6);

        // using Student database will perform multiple

        List<Student> allStudents = StudentDataBase.getAllStudents();
        BiConsumer<String, List<String>> con = (name, act) -> {
            System.out.println("Name : " + name + " Activities : " + act);
        };

        allStudents.forEach(k -> {
                    con.accept(k.getName(), k.getActivities());
                }
        );
    }
}
