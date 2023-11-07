package org.example.Structural.adapter;

public class Adapter extends Application implements Database {
    @Override
    public void post() {
        saveObject();
    }

    @Override
    public void get() {
        getObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void remove() {
        removeObject();
    }
}
