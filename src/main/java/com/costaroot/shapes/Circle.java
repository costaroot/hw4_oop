package com.costaroot.shapes;

import com.costaroot.vertex.Vertex;
import com.costaroot.vertex.Vertex2D;

import java.util.*;

public class Circle extends PlaneShape{
    private double radius;

    public Circle (Vertex2D vertex, String name, double radius){
        super(Arrays.asList(vertex),name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI* Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "radius=" + radius;
    }
}
