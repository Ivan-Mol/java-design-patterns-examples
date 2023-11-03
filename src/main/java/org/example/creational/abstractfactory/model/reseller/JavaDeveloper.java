package org.example.creational.abstractfactory.model.reseller;

import org.example.creational.abstractfactory.model.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("write Java code");
    }
}
