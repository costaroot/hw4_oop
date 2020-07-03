package com.costaroot.shapes;

import com.costaroot.vertex.Vertex;

import java.util.List;

public abstract class Shape {
    private final List<Vertex> vertices;
    private final String name;

    public Shape(List<Vertex> vertices, String name) {
        this.vertices = vertices;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "vertices=" + vertices +
                ", name='" + name + '\'' +
                '}';
    }
}
