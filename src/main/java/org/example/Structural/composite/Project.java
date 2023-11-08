package org.example.Structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer javaDevFirst = new JavaDeveloper();
        Developer javaDevSecond = new JavaDeveloper();
        Developer PhpDev = new PhpDeveloper();

        team.addDeveloper(javaDevFirst);
        team.addDeveloper(javaDevSecond);
        team.addDeveloper(PhpDev);

        team.writeCode();

    }
}
