package com.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
   static BinaryOperator<Integer> binary=(a,b)->(a*b);
   static Comparator<Integer> compare= (a,b)->a.compareTo(b);

    public static void main(String[] args) {
        System.out.println(binary.apply(5,7));

        BinaryOperator<Integer> maxby=BinaryOperator.maxBy(compare);
        System.out.println("max value is : "+ maxby.apply(3,5));
        BinaryOperator<Integer> minvalue=BinaryOperator.minBy(compare);
        System.out.println("Min Value is : " + minvalue.apply(8,20));
    }
}
