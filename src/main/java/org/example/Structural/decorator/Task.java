package org.example.Structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();
        developer.writeCode();
        System.out.println("======");
        Developer middle = new MiddleJavaDeveloper(new JavaDeveloper());
        middle.writeCode();
    }
}
