package org.example.Structural.bridge;

public class ExchangeSystem extends Program{
    @Override
    public void developProgram() {
        System.out.println("Exchange development");
        developer.writeCode();
    }

    protected ExchangeSystem(Developer developer) {
        super(developer);
    }
}
