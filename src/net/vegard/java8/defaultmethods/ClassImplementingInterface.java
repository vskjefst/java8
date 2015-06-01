package net.vegard.java8.defaultmethods;

public class ClassImplementingInterface implements InterfaceWithDefaultMethod {
    @Override
    public void anInterfaceMethod() {
        System.out.println("I'm the implemented interface method!");
    }

    public static void main(final String[] args) {
        ClassImplementingInterface aClass = new ClassImplementingInterface();
        aClass.anInterfaceMethod();
        aClass.aDefaultMethod();
    }

}
