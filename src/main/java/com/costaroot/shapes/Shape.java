package com.costaroot.shapes;

import com.costaroot.vertex.Vertex;
import com.costaroot.vertex.Vertex2D;

import java.util.*;

public abstract class Shape {
    private List <Vertex> vertices;
    private String name;

    public Shape ( List<Vertex> vertices, String name){
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
