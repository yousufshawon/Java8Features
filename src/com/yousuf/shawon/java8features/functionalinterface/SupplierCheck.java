package com.yousuf.shawon.java8features.functionalinterface;

import com.yousuf.shawon.java8features.util.MyCheck;

import java.util.*;
import java.util.function.Supplier;

/**
 * Created by user on 1/29/2017.
 */
public class SupplierCheck implements MyCheck {
    @Override
    public void check() {

        // Supplier is a functional interface and can therefore be used as the assignment target for a lambda expression
        // or method reference.

        List<String> names = Arrays.asList("Abu", "Yousuf", "Shawon");
        Supplier<String> greetSupplier = () -> "Hello ";

        for (int i = 0; i < names.size(); i++) {
            System.out.println(greetSupplier.get() + names.get(i));
        }

        System.out.println();


        Map<String, String> map = new HashMap<String, String>(){
            { put("Demon", "Naughty");put("Angel", "Nice");}
        };

        String person = "Demon";

        Optional<String> disposition1 = Optional.ofNullable(map.get(person));
        System.out.println( "Disposition of "
                + person + " = "
                + disposition1.orElseGet(() -> "Unknown") );

        person = "Demo";
        Optional<String> disposition2 = Optional.ofNullable(map.get(person));
        System.out.println( "Disposition of "
                + person + " = "
                + disposition2.orElseGet(() -> "Unknown") );

        System.out.println();

        // Constructor Reference
        Supplier<Person> personSupplier1 = Person::new;
        Person person1 = personSupplier1.get();
        System.out.println(person1);



    }


    public class Person{
        String name;
        String address;

        public Person() {
            name = "Default";
            address = "Bangladesh";
        }

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
}
