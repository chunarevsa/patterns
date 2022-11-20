package com.example.patterns.creational.prototype;

public class Project implements CopyAble {
    private int id;
    private String name;
    private String source;

    @Override
    public Object copy() {
        Project copy = new Project((id+1), name, source);
        return copy;
    }

    public Project(int id, String name, String source) {
        this.id = id;
        this.name = name;
        this.source = source;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                '}';
    }

}
