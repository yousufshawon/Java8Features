package com.yousuf.shawon.java8features.functionalinterface;

import com.yousuf.shawon.java8features.util.MyCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 1/29/2017.
 */
public class UnaryOperatorCheck implements MyCheck {
    @Override
    public void check() {

        // UnaryOperator is a functional interface and can therefore be used as the assignment target for a lambda expression
        // or method reference.
        // Represents an operation on a single operand that produces a result of the same type as its operand.
        // This is a specialization of Function for the case where the operand and result are of the same type.

        List<Integer> numList = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9) );
        System.out.println(numList);

        numList.replaceAll( v-> v+10 );
        System.out.println(numList);


    }
}
