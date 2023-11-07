package org.example.creational.prototype;

public class VSRunner {
    public static void main(String[] args) {
        Project project = new Project(1L,"Test Project","codeExample");
        System.out.println(project);
        ProjectFactory projectFactory = new ProjectFactory(project);
        System.out.println("==========");
        Project copy = projectFactory.cloneProject();
        System.out.println(copy);
    }
}
