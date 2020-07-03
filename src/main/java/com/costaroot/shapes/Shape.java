package com.costaroot.shapes;

import java.util.List;

public abstract class Shape {
    private final List vertices;
    private final String name;

    public Shape(List vertices, String name) {
        this.vertices = vertices;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List getVertices() {
        return vertices;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "vertices=" + vertices +
                ", name='" + name + '\'' +
                '}';
    }
}
