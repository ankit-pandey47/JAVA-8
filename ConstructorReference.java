//A constructor reference in Java is used to refer to a constructor using the ClassName::new syntax. 
class Sample {
    Sample() {
        System.out.println("I am the constructor of the sample class....");
        System.out.println("I also do work for the interfaces.....");
    }
}

@FunctionalInterface
interface myinterface {
    public Sample show();
}

public class ConstructorReference {
    public static void main(String[] args) {

        // we have to define the method of interface BUT we want the content of sample
        // class constructoe so we will refer to the constructor of the Sample class
        // using constructor reference as below structure:

        myinterface inf = Sample::new;
        Sample sam = inf.show(); // This will invoke the constructor and return a Sample object
        System.out.println(sam);

    }
}
