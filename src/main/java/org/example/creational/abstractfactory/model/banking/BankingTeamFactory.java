package org.example.creational.abstractfactory.model.banking;

import org.example.creational.abstractfactory.model.Developer;
import org.example.creational.abstractfactory.model.ProjectManager;
import org.example.creational.abstractfactory.model.ProjectTeamFactory;
import org.example.creational.abstractfactory.model.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public ProjectManager getPm() {
        return new BankingPm();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }
}
