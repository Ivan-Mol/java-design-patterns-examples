package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.model.Developer;
import org.example.creational.abstractfactory.model.ProjectManager;
import org.example.creational.abstractfactory.model.ProjectTeamFactory;
import org.example.creational.abstractfactory.model.Tester;
import org.example.creational.abstractfactory.model.banking.BankingTeamFactory;

public class BankRoject {
    public static void main(String[] args) {
        ProjectTeamFactory bankigFactory = new BankingTeamFactory();
        Developer developer = bankigFactory.getDeveloper();
        Tester tester = bankigFactory.getTester();
        ProjectManager projectManager = bankigFactory.getPm();

        System.out.println("create bank");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
