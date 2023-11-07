package org.example.Structural.adapter;

public class DbRunner {
    public static void main(String[] args) {
        Database database = new Adapter();
        database.get();
        database.post();
        database.remove();
        database.update();
    }

}
