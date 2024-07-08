package com.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    Function<String, String> value = (name) -> name.toUpperCase();
    Function<String, String> values = (val) -> val.replace('b', 'j');

    public void toCap(String mystring) {
        System.out.println(value.apply(mystring));
    }

    public void toConcat(String mystring) {

        System.out.println(value.andThen(values).apply(mystring));
        System.out.println(value.compose(values).apply(mystring));
    }

    public static void main(String[] args) {
        new FunctionExample().toCap("Vamsi");
        new FunctionExample().toConcat("bobbyy");

        /*
        Apply --> this will take the input
        andthen -> it will apply the 1st one and on the result it will perform the 2nd one
        compose -> which is into parameters that will execute 1st later it will go with 1st one.
         */
    }
}
