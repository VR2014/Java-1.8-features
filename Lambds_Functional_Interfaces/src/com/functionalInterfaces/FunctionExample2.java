package com.functionalInterfaces;

import java.util.*;
import java.util.function.Function;

public class FunctionExample2 {

   static Function<List<Student>, Map<String,Double>> studentFunction=(student ->{
        Map<String,Double> studentDetailsMap=new HashMap<>();
        student.forEach(s->{
           // if(PredicateandConsumerExample.p.test(s)) {
                studentDetailsMap.put(s.getName(), s.getGpa());
          //  }
        });
        return studentDetailsMap;
    });
    public static void main(String[] args) {
        List<Student> myStudentdetails= StudentDataBase.getAllStudents();
        System.out.println(studentFunction.apply(myStudentdetails));
    }
}
