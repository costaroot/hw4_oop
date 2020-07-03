package com.costaroot.shapes;

import com.costaroot.vertex.Vertex3D;

import java.util.Arrays;

public class SquarePyramid extends SpaceShape {
    private double baseWidth;
    private double pyramidHeight;

    public SquarePyramid(Vertex3D vertex3D, String name, double baseWidth, double pyramidHeight) {
        super(Arrays.asList(vertex3D), name);
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public double getArea() {
        return Math.pow(baseWidth, 2) + 2 * baseWidth * Math.sqrt(Math.pow(pyramidHeight, 2) +
                Math.pow(baseWidth, 2) / 4.0);
    }

    @Override
    public double getVolume() {
        return Math.pow(baseWidth, 2) * pyramidHeight / 3.0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "baseWidth=" + baseWidth +
                ", piramidHeight=" + pyramidHeight +
                '}';
    }
}
