//A lambda expression is a concise way to represent an anonymous function (a function without a name). It is used primarily for implementing functional interfaces (interfaces with a single abstract method) in Java.

@FunctionalInterface
interface myinterface {

    abstract void show();

}

public class lambdaExpression {

    public static void main(String[] args) {

        // we want to define the method of fucntional interface
        // no need to make another class which implements interface and define the
        // method
        // But we have lambda expression to do it in easy way

        myinterface i = () -> System.out.println("I am show");

        i.show();

        myinterface i2 = () -> System.out.println("I am show for 2nd object");
        i2.show();

    }
}
