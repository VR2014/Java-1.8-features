package com.methodreferences;

import com.functionalInterfaces.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstucorRef {
    //default Constutor
    static Supplier<Student>conref=Student::new;

    static Function<String,Student> paraRef=Student::new;
    public static void main(String[] args) {
        System.out.println(conref.get());
        System.out.println(paraRef.apply("VamsiKishore reddy"));

    }
}
