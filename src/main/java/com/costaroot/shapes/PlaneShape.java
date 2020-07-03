package com.costaroot.shapes;

import com.costaroot.metrics.AreaMeasurable;
import com.costaroot.metrics.PerimeterMeasurable;
import com.costaroot.vertex.Vertex2D;

import java.util.Arrays;
import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    private final List<Vertex2D> vertex2D;

    public PlaneShape(List<Vertex2D> vertex2D, String name) {
        super(Arrays.asList(), name);
        this.vertex2D = vertex2D;
    }

    public List<Vertex2D> getVertex2D() {
        return vertex2D;
    }

    @Override
    public String toString() {
        return "{" + " Figure Name: " + getName() + " Area= " + getArea() + " Perimeter = " +
                getPerimeter() + "}\n" + vertex2D;
    }
}
