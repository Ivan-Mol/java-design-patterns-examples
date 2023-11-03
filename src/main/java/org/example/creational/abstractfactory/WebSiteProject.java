package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.model.banking.ManualTester;
import org.example.creational.abstractfactory.model.banking.PhpDeveloper;
import org.example.creational.abstractfactory.model.banking.BankingPm;

public class WebSiteProject {
    public static void main(String[] args) {
        PhpDeveloper phpDeveloper = new PhpDeveloper();
        ManualTester manualTester = new ManualTester();
        BankingPm bankingPm = new BankingPm();

        System.out.println("Creating project");
        phpDeveloper.writeCode();
        manualTester.testCode();
        bankingPm.manageProject();
    }
}
