package net.vegard.java8.defaultmethods;

public class ClassImplementingInterfaceOverridingDefaultMethod implements InterfaceWithDefaultMethod {
    @Override
    public void anInterfaceMethod() {
        System.out.println("I'm the implemented interface method!");
    }

    @Override
    public void aDefaultMethod() {
        System.out.println("I'm an overridden default method!");
    }

    public static void main(final String[] args) {
        final ClassImplementingInterfaceOverridingDefaultMethod aClass = new ClassImplementingInterfaceOverridingDefaultMethod();
        aClass.anInterfaceMethod();
        aClass.aDefaultMethod();
    }

}
