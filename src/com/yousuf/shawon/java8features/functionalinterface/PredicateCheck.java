package com.yousuf.shawon.java8features.functionalinterface;

import com.yousuf.shawon.java8features.util.MyCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by user on 1/29/2017.
 */
public class PredicateCheck implements MyCheck {



    @Override
    public void check() {

        // Predicate is a built-in functional interface.
        // Predicates are boolean-valued functions of one argument.

        List<Integer> intList = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9) );
        System.out.println(intList);

        intList.removeIf(i ->  i%2 ==0 );
        // intList.removeIf(mPredicate);
        System.out.println(intList);

        String str = "This is String";
        String searchStr = "is";

        Predicate<String> predicate = s -> s.contains(searchStr);

        //test - Evaluates this predicate on the given argument.
        boolean isFound = predicate.test(str);   // true

        // negate - Returns a predicate that represents the logical negation of this predicate.
        boolean isNotFound = predicate.negate().test(str);  // false


        Predicate<String> predicate1 = s -> s.contains("isa");
        Predicate<String> predicate2 = s -> s.contains("is");

        // or - Returns a composed predicate that represents a short-circuiting logical OR of this predicate and another.
        boolean isFoundAny = predicate1.or(predicate2).test(str);  // true

        //and - Returns a composed predicate that represents a short-circuiting logical AND of this predicate and another
        boolean isFoundBoth = predicate1.and(predicate2).test(str);  // false




    }

    Predicate<Integer> mPredicate = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            return integer % 2 == 1;
        }
    };

}
