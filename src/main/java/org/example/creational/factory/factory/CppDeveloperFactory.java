package org.example.creational.factory.factory;

import org.example.creational.factory.model.CppDeveloper;
import org.example.creational.factory.model.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
