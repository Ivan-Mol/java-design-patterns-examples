package org.example.creational.abstractfactory.model.reseller;

import org.example.creational.abstractfactory.model.Developer;
import org.example.creational.abstractfactory.model.ProjectManager;
import org.example.creational.abstractfactory.model.ProjectTeamFactory;
import org.example.creational.abstractfactory.model.Tester;
import org.example.creational.abstractfactory.model.banking.BankingPm;

public class ResellerTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProjectManager getPm() {
        return new BankingPm();
    }

    @Override
    public Tester getTester() {
        return new AutoTester();
    }
}
