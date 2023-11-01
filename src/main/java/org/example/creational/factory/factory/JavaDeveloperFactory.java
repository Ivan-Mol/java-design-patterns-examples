package org.example.creational.factory.factory;

import org.example.creational.factory.model.Developer;
import org.example.creational.factory.model.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
