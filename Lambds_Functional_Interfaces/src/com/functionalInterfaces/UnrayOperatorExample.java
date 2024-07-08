package com.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnrayOperatorExample {

    static UnaryOperator<String> unary = (s) -> s.toUpperCase().replace('A', 'B');

    public static void main(String[] args) {
        System.out.println(unary.apply("Vamsi"));

        /*
        where the input and out values are same there we can use this unary operator directly . no neeed of use function

         */

    }
}
