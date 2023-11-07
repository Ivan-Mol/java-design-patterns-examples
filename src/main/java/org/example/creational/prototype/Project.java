package org.example.creational.prototype;

public class Project implements Copyable {
    private Long id;
    private String name;
    private String sourceCode;

    public Project(Long id, String name, String sourceCode) {
        this.id = id;
        this.name = name;
        this.sourceCode = sourceCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        return new Project(id,name,sourceCode);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
