package com.costaroot.shapes;

import com.costaroot.vertex.Vertex3D;

import java.util.Arrays;

public class Cuboid extends SpaceShape {
    private final double width;
    private final double height;
    private final double depth;

    public Cuboid(Vertex3D vertex3D, String name, double width, double height, double depth) {
        super(Arrays.asList(vertex3D), name);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return super.toString() +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }

    @Override
    public double getArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }
}
