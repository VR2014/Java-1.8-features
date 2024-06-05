package com.lambda;

public class RunnableExample {
    public static void main(String[] args) {

        //Legacy
        Runnable runs=new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable from legacy method");
            }
        };
        new Thread(runs).start();

        //Using lambda
        Runnable runlamda=()->{
            System.out.println("Runnable from Lambda method");
        };
        new Thread(runlamda).start();

        //Using Single Line - lambda
        Runnable runlamdas=()->System.out.println("Runnable from Single Line Lambda method");
        new Thread(runlamdas).start();

    new Thread(()->System.out.println("Runnable from Single Line Lambda method-3")).start();
    }
}
