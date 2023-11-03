package org.example.creational.abstractfactory.model.reseller;

import org.example.creational.abstractfactory.model.Tester;

public class AutoTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("test reseller code");
    }
}
