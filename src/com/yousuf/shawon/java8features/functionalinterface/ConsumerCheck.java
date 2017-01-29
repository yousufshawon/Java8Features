package com.yousuf.shawon.java8features.functionalinterface;

import com.yousuf.shawon.java8features.util.MyCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 1/29/2017.
 */
public class ConsumerCheck implements MyCheck {

    // ................ Consumer........................
    // Consumer is a built-in functional interface.
    // Consumers represent operations to be performed on a single input argument.

    @Override
    public void check() {
        List<Integer> intList = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9) );
        // System.out.println(intList);



        System.out.println("Using lambda expression:");
        intList.forEach((Integer integer) -> System.out.println(integer));

        // Using Method Reference
        System.out.println("Using Method Reference:");
        intList.forEach(System.out::println );
    }
}
