package com.costaroot.shapes;

import com.costaroot.vertex.Vertex2D;

import java.util.Arrays;

public class Rectangle extends PlaneShape {
    private final double width;
    private final double height;

    public Rectangle(Vertex2D vertex2D, String name, double width, double height) {
        super(Arrays.asList(vertex2D), name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public String toString() {
        return super.toString() +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
