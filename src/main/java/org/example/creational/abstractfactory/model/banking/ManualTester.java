package org.example.creational.abstractfactory.model.banking;

import org.example.creational.abstractfactory.model.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("test code");
    }
}
