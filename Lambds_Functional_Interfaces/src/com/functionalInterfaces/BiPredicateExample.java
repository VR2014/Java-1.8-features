package com.functionalInterfaces;

import java.security.PublicKey;
import java.util.List;
import java.util.function.Predicate;

public class BiPredicateExample {
    static Predicate<Student> gradeLevel = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> gpaFilter = (g) -> g.getGpa() > 3.9;

    public static void filterByGradeLevel() {
        List<Student> myStudents = StudentDataBase.getAllStudents();
        myStudents.forEach((student -> {
            if (gradeLevel.test(student)) {
                System.out.println("gradeLevel  :  " + student);
            }
        }));
    }


    public static void filterByGPA() {
        List<Student> myStudents = StudentDataBase.getAllStudents();
        myStudents.forEach((student -> {
            if (gpaFilter.test(student)) {
                System.out.println("gpaFilter  :  " + student);
            }
        }));
    }

    public static void resuablecode() {
        List<Student> myStudents = StudentDataBase.getAllStudents();
        myStudents.forEach((s) -> {
            if (gpaFilter.and(gradeLevel).test(s)) {
                System.out.println("Studnets who are having gpa >3.9 and grade >3 : " + s);
            }
            if (gpaFilter.or(gradeLevel).test(s)) {
                System.out.println("Studnets who are having gpa >3.9 or grade >3 : " + s);
            }
            if (gpaFilter.or(gradeLevel).negate().test(s)) {
                System.out.println("Studnets who are having gpa >3.9  or - negate grade >3 : " + s);
            }
        });
    }


    public static void main(String[] args) {
        filterByGradeLevel();
        filterByGPA();
        resuablecode();
    }
}
