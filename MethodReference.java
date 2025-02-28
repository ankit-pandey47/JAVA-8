
//NOTE : Kindly go through the comments
import java.util.ArrayList;
import java.util.List;

class Sample {
    public static void doTask() {
        System.out.println("doing task....");
        System.out.println("Task Completed");
    }

    public void doWork() {
        System.out.println("I am doing my work....");
    }
}

@FunctionalInterface
interface miinterface {

    public void Handletask();

}

public class MethodReference {
    public static void main(String[] args) {

        // now we want to define the method of fucntional interface
        // no need to make another class which implements interface and define the
        // method
        // we have lambda expression to do it in easy way

        miinterface inf = () -> {
            System.out.println("I am the method of myinterface");
        };
        inf.Handletask();

        // suppose we dont want to define the interface method and we have another class
        // which has a method define in it we have to just refer to that nethod
        // definition for our interface method definition(means interface method
        // definiton will be same as that class method definition )
        // for this , method reference came into existence bcoz we refer to that method
        // now that mehtod can be either static or non-static

        // if method is either (we are using sample class method)

        miinterface inf2 = Sample::doTask; // refering to sample class doTask method whose content get copied to
                                           // HandleTask of interfce
        inf2.Handletask();

        // NOTE : the referred method and the interface's mtehod must same signature

        // if method will be non static -- we first make the object of that class and we
        // refer to method using that object

        Sample sobj = new Sample();

        miinterface inf3 = sobj::doWork;
        inf3.Handletask();

        // Another use of method Reference

        List<Integer> li = List.of(1, 2, 3, 4, 5, 6);

        // lets print it using lambda expression

        // li.stream().forEach(e -> System.out.println(e));

        // now doing same using Method reference

        li.stream().forEach(System.out::println); // here println is a method of printstream class and system.out is
                                                  // a instance of printstream class

    }
}
