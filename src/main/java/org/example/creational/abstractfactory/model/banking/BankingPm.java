package org.example.creational.abstractfactory.model.banking;

import org.example.creational.abstractfactory.model.ProjectManager;

public class BankingPm implements ProjectManager {
    @Override
   public void manageProject(){
        System.out.println("manage bank project");
    }
}
