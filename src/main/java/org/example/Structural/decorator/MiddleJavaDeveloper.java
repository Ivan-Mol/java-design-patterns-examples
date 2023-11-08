package org.example.Structural.decorator;

public class MiddleJavaDeveloper extends DeveloperDecorator {

    public MiddleJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "code review";
    }

    @Override
    public void writeCode() {
        super.writeCode();
        System.out.println(makeCodeReview());;
    }
}
