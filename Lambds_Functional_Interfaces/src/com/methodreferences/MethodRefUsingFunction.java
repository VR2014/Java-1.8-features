package com.methodreferences;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodRefUsingFunction {
    public static void main(String[] args) {
        Function<String,String> ref=(s)->s.toUpperCase();
        Function<String,String> methodRef=String:: toUpperCase;

        System.out.println(ref.apply("Java8"));
        System.out.println(methodRef.apply("Method ref "));

        Function<String,String> combine=methodRef.andThen(String:: trim);
        System.out.println(methodRef.apply("Method ref Java 8"));

    }
}
