package com.yousuf.shawon.java8features.lambda;

import com.yousuf.shawon.java8features.util.MyCheck;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by user on 1/27/2017.
 */
public class LambdaCheck implements MyCheck{

    int instanceValue;

    @Override
    public void check(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        // print each item

        // In java 7
        //Imperative way
        System.out.println("Java 7: imperative way");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Using Consumer anonymous class
        System.out.println("Using Consumer anonymous class");
        // Used Consumer class for print elements. This will be replaced by lambda expression later
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });


        // .................Using lambda expression............................
         System.out.println("Using lambda expression");
        // Here actually we replace the Consumer class with the lambda expression as Consumer class is Functional Interface
        list.forEach((Integer integer) -> System.out.println(integer));

        System.out.println();

        // We can use local variable in lambda expression in from the outer scope.
        // But the difference from anonymous class is local variable should not need to be declare final
        // Changing the value of local variable inside lambda expression is prohibited.
        // Reinitialize or changing the value of local variable which is used in lambda expression is also prohibited
        // We have both read and write access to class instance fields and static variables within lambda expressions.

        int addValue = 10;
        list.forEach( (Integer integer) -> {
           // addValue = 20;    // This will not work as this variable used in lambda expression so it will
                                // treat as implicitly final variable
            instanceValue = 10; // This is valid. Class instance field read and write is valid
            System.out.println(integer);

        }
        );



    }


}
