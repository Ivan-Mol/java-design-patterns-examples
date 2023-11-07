package org.example.Structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {new BankSystem(new JavaDeveloper()),new ExchangeSystem(new PhpDeveloper())};

        for (Program program:programs) {
            program.developProgram();
        }
    }
}
