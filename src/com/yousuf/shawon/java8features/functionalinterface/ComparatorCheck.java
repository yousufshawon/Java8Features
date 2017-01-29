package com.yousuf.shawon.java8features.functionalinterface;

import com.yousuf.shawon.java8features.util.MyCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 1/29/2017.
 */
public class ComparatorCheck implements MyCheck {



    @Override
    public void check() {

        // Comparators are well known from older versions of Java. Java 8 adds various default methods to the interface.
        // Comparator is a functional interface and can therefore be used as the assignment target for a lambda expression
        // or method reference.

        List<String> nameList= new ArrayList<>(Arrays.asList("Abu", "Yousuf", "Shawon"));
        System.out.println(nameList);

        nameList.sort((x, y) -> x.compareTo(y)  );
        System.out.println(nameList);


        List<String> fruitList= new ArrayList<>(Arrays.asList("Orange", "Apple", "Banana"));
        System.out.println(fruitList);

        // Sort respect to toString() method
        fruitList.sort(Comparator.comparing( String::toString));
        System.out.println(fruitList);

    }
}
