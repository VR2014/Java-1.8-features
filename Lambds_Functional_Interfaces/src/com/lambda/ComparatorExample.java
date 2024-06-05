package com.lambda;

import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        //Legacy way
        Comparator<Integer> numCompar = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of comparator is : " + numCompar.compare(2, 5));
        //Using Lambda
        Comparator<Integer> compareLambda = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of comparator is : " + compareLambda.compare(5, 3));

        //Using Single Line
        Comparator<Integer> compareLambdas = ( a,  b) -> a.compareTo(b);
        System.out.println("Result of comparator is  90 and 3: " + compareLambdas.compare(90, 3));
    }
}
