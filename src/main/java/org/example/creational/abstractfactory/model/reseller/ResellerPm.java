package org.example.creational.abstractfactory.model.reseller;

import org.example.creational.abstractfactory.model.ProjectManager;

public class ResellerPm implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("manage Reseller Project");
    }
}
