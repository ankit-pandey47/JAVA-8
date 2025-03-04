// Every Java Programmer is familiar with NullPointerException. It can crash your code. And it is very hard to avoid it without using too many null checks. 

//So, to overcome this, Java 8 has introduced a new class Optional in java.util package. It can help in writing a neat code without using too many null checks. 

// if a value is present then isPresent() returns true and get() returns value

import java.util.Optional;

public class OptionalClasss {
    public static void main(String[] args) {

        String str = null;
        // if (str.equals(null)) // here while checking we will get the error of Cannot
        // invoke because "str" is null
        // System.out.println("String is null");

        // else
        // System.out.println("Length of String is : " + str.length());

        // so to overcome this error of nullpointer we use Optional class
        // how it works
        // below statement -- creates an Optional object that may or may not contain a
        // value, depending on whether str is null.

        Optional<String> opt = Optional.ofNullable(str);

        System.out.println(opt.isPresent()); // returns true if value present else false

        // System.out.println(opt.get());

        // NOTE : get() returns the NoSuchElementException if value not present so we
        // use orElse(argu) method where if value present then it returns the vlaue else
        // returns the argu given to method

        System.out.println(opt.orElse("String is null"));

    }
}
