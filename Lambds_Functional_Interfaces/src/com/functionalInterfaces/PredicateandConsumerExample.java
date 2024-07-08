package com.functionalInterfaces;



import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateandConsumerExample {

   static  Predicate<Student>p = (p)-> p.getGpa()>4;
    Predicate<Student>p1 = (p1)-> p1.getGpa()>3;
    Predicate<Student> p2 =(p2)-> p2.getGradeLevel()>3;


    BiConsumer<String, List<String>> studentBiconsumer=(name,activities)->{
        System.out.println(name + " : " + activities);
    };
    Consumer<Student> studentvalidations=(s->{
        if(p1.and(p2).test(s)){
            studentBiconsumer.accept(s.getName(),s.getActivities());
        }
    });



    private void printNameAndActivites(List<Student> listOfStudents) {
        listOfStudents.forEach(studentvalidations);
    }

    public static void main(String[] args) {
        List<Student> listOfStudents=StudentDataBase.getAllStudents();

        new PredicateandConsumerExample().printNameAndActivites(listOfStudents);


    }




}
