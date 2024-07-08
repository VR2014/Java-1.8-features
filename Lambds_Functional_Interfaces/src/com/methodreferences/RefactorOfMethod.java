package com.methodreferences;

import com.functionalInterfaces.Student;
import com.functionalInterfaces.StudentDataBase;

import java.util.function.Predicate;

public class RefactorOfMethod {
   static Predicate<Student> p = RefactorOfMethod::greaterThanGradeLevel;

   public static boolean greaterThanGradeLevel(Student s){
       return s.getGradeLevel()>3;
   }

    public static void main(String[] args) {
        System.out.println(p.test(StudentDataBase.studentSupplier.get()));
    }
}

