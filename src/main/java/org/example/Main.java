package org.example;

import java.util.Arrays;
import java.util.List;



public class Main {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        List<Integer> doubledNumbers = evenNumbers.stream()
                .map(n -> n * 2).sorted(Integer::compareTo).toList();


        int sum = doubledNumbers.stream()
                .reduce(0, Integer::sum);


        System.out.println("Processed Numbers:");
        doubledNumbers.forEach(System.out::println);


        List<Integer> processedNumbersList = doubledNumbers.stream()
                .toList();


        System.out.println("Sum of all numbers: " + sum);


        System.out.println("Collected Processed Numbers List: " + processedNumbersList);
    }
}
