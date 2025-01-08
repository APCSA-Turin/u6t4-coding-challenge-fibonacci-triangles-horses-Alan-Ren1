package com.example.project;

public class Main {
    public static void main(String[] args) {
        Fibonacci fib0 = new Fibonacci(5);
        Fibonacci fib1 = new Fibonacci(11);
        Fibonacci fib2 = new Fibonacci(20);
        Fibonacci[] fibonaccis = {fib0, fib1, fib2};
        for (Fibonacci fib : fibonaccis) {
            System.out.println(fib.getSequence().length);
        }
    }
}