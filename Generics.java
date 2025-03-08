//Generics in Java allow you to create classes, interfaces, and methods that can operate on different types (data types) while ensuring type safety at compile time. In simple terms, Generics allow you to create a class or method that can work with any type of object (Integer, String, etc.) without changing the code.

// why we use it :

//Type Safety → Prevents runtime errors by catching type mismatches at compile time.
// Code Reusability → Write a single class/method that works with different data types.
// Eliminates Typecasting → Avoids explicit typecasting when retrieving data.

import java.util.ArrayList;

class myclass<T> {
    T container;

    void show() {
        System.out.println(
                "value of container is : " + container + " And it is of type : " + container.getClass().getName());
    }
}

public class Generics {
    public static void main(String[] args) {

        // myclass m = new myclass(); // here our class in T type means its variable can
        // store data of any type
        myclass<Integer> m = new myclass(); // now myclass have Integer in place of T type
        // m.container = "ankit";
        m.container = 12;
        m.show();

        // how it is used in collection framework'
        // without generics :

        ArrayList l = new ArrayList<>();
        l.add(12);
        l.add("Ankit");

        // In this case our list can store element of any type , list be like [1,"ankit"
        // , 12 , 'c' , 12.90]
        // so why we need generics list
        // it allow us to save a sepcific type of elemt in list which we have to tell
        // while creating object
        // suppose we want to take I/P from user only integer and have to save it in
        // list wothout generics and accidently a user give string input then it does
        // not show any excetion and save the string that is the problem so we use
        // generics wherewe have to specify thr type while creating object

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(45);
        // l1.add("Ankit"); // it give errror now

        // NOTE : Object classs is superclass of all other class directly or indirectly
        // so creating a variable of Objet type means it can store element of any data
        // type
        Object x = 12;
        System.out.println(x);
        x = "ANKIt";
        System.out.println(x);

    }
}