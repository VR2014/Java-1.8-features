package com.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
  static  Consumer<Student> name=(student)-> System.out.print(student.getName());
   static Consumer<Student>act=(std)->System.out.println(std.getActivities());
    static Consumer<Student>val=(std)->System.out.println(std.getGender());

    public static void printNames(){
        Consumer<Student> data=(student)->{
            System.out.println(student);
        };
        List<Student> studentlist=StudentDataBase.getAllStudents();
        studentlist.forEach(data);
    }

    public static void printNamesAndActivities(){
        List<Student> stdList=StudentDataBase.getAllStudents();
        stdList.forEach(name.andThen(act));
    }
    public static void printNamesAndActivitieswithConditions(){
        List<Student> stdList=StudentDataBase.getAllStudents();
        stdList.forEach((st ->{
            if(st.getGradeLevel()>=3 && st.getGpa()>=2){
                name.andThen(act).andThen(val).accept(st);
            }
        }));
    }
    public static void main(String[] args) {
        Consumer<String> value=(s)->System.out.println(s.toUpperCase());
        value.accept("vamsi");
        printNames();
        System.out.println("printNamesAndActivities");
        printNamesAndActivities();
        System.out.println("printNamesAndActivitieswithConditions");
        printNamesAndActivitieswithConditions();
    }
}
