package com.methodreferences;

import com.functionalInterfaces.Student;
import com.functionalInterfaces.StudentDataBase;

import java.util.function.Consumer;

public class MethodRefUsingConsumer {
    public static void main(String[] args) {
        Consumer<Student> s1= s->System.out.println(s);

        Consumer<Student> s=Student::printActivities;

        StudentDataBase.getAllStudents().forEach(s1);
        StudentDataBase.getAllStudents().forEach(s);
    }
}
