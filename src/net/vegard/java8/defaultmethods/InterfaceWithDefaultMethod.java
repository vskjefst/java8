package net.vegard.java8.defaultmethods;

public interface InterfaceWithDefaultMethod {

    void anInterfaceMethod();

    default void aDefaultMethod() {
        System.out.println("I'm the default method!");
    }

}
