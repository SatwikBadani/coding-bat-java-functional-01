package org.example.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list where each integer is multiplied with itself.
 *
 *
 * square([1, 2, 3]) → [1, 4, 9]
 * square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
 * square([]) → []
 */
public class FPSquare {

    public static void main(String[] args) {
        List<Integer> squareResult = square(new ArrayList<>(List.of(1, 2, 3)));
        squareResult.stream().forEach(System.out::println);
    }

    public static List<Integer> square(List<Integer> nums) {
        return nums.stream().map(num -> num*num).collect(Collectors.toList());
    }
}
