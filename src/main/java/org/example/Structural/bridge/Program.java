package org.example.Structural.bridge;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public void developProgram() {
    }
}
