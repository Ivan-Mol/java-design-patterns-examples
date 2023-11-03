package org.example.creational.abstractfactory.model;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    ProjectManager getPm();

    Tester getTester();
}
