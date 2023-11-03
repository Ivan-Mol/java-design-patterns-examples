package org.example.creational.abstractfactory.model.banking;

import org.example.creational.abstractfactory.model.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("write php code");
    }
}
