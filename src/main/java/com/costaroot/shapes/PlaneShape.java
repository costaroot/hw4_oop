package com.costaroot.shapes;

import com.costaroot.metrics.AreaMeasurable;
import com.costaroot.metrics.PerimeterMeasurable;
import com.costaroot.vertex.Vertex2D;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(List<Vertex2D> vertex2D, String name) {
        super(vertex2D, name);
    }

    @Override
    public String toString() {
        return "{" + " Figure Name: " + getName() + " Area= " + getArea() + " Perimeter = " +
                getPerimeter() + "}\n" + super.getVertices();
    }
}
