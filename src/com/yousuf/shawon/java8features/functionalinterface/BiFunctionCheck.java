package com.yousuf.shawon.java8features.functionalinterface;

import com.yousuf.shawon.java8features.util.MyCheck;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 1/29/2017.
 */
public class BiFunctionCheck implements MyCheck {
    @Override
    public void check() {
        // BiFunction is a functional interface and can therefore be used as the assignment target for a lambda expression
        // or method reference.
        //Represents a function that accepts two arguments and produces a result. This is the two-arity specialization of Function.


        Map<String, Integer> iqMap = new HashMap<String, Integer>(){
            { put("Larry", 40); put("Curly", 100);  put("Moe", 100); }
        };

        System.out.println(iqMap);
        iqMap.replaceAll((k, v) -> v-50);
        System.out.println(iqMap);

    }
}
