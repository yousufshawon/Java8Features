package com.yousuf.shawon.java8features;

import com.yousuf.shawon.java8features.functionalinterface.*;
import com.yousuf.shawon.java8features.lambda.LambdaCheck;

import java.util.Comparator;

/**
 * Created by user on 1/27/2017.
 */
public class Worker {

    public void doStuff(){

        // Test Lambda
        LambdaCheck lambdaCheck = new LambdaCheck();
        System.out.println("Lambda Check");
        lambdaCheck.check();
        System.out.println();

        ConsumerCheck consumerTest = new ConsumerCheck();
        System.out.println("Consumer Check");
        consumerTest.check();
        System.out.println();

        PredicateCheck predicateCheck = new PredicateCheck();
        System.out.println("Predicate Check");
        predicateCheck.check();
        System.out.println();

        ComparatorCheck comparatorCheck = new ComparatorCheck();
        System.out.println("Comparator Check");
        comparatorCheck.check();
        System.out.println();

        SupplierCheck supplierCheck = new SupplierCheck();
        System.out.println("Supplier Check");
        supplierCheck.check();
        System.out.println();

        BiFunctionCheck biFunctionCheck = new BiFunctionCheck();
        System.out.println("BiFunction Check");
        biFunctionCheck.check();
        System.out.println();

        UnaryOperatorCheck unaryOperatorCheck = new UnaryOperatorCheck();
        System.out.println("UnaryOperator Check");
        unaryOperatorCheck.check();
        System.out.println();

    }

}
