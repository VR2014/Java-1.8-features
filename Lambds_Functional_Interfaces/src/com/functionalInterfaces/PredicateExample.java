package com.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p = (i) -> {
        return i % 2 == 0;
    };
 static Predicate<Integer> p1 = (i) -> i > 20;

 public static void predicateAnd(){
     System.out.println(" presicate And : "+p.and(p1).test(10));
 }
    public static void predicateOr(){
        System.out.println(" presicate OR : "+ p.or(p1).test(7));
    }
    public static void predicateNegate(){
        System.out.println(" presicate negate : " +p.or(p1).negate().test((9)));
    }
    public static void main(String[] args) {
        System.out.println(p.test(4));
        System.out.println(p.test(8));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
