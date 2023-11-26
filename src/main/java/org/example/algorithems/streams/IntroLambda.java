package org.example.algorithems.streams;

interface Greeting {
    void greet();
}
public class IntroLambda implements  Greeting {
    public void greet() {
        System.out.println("Hello World!");
    }

    void printGreeting(Greeting greeting) {
        greeting.greet();
    }
    public static void main(String[] args) {
        IntroLambda obj = new IntroLambda();
        obj.printGreeting(obj);
        obj.printGreeting(new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello World! from inner class");
            }
        });
        obj.printGreeting(()-> {
                System.out.println("Hello World! from lambda");
                }
        );

        obj.printGreeting(()-> System.out.println("Hello World! from single line lambda"));
    }
}
