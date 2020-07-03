package com.costaroot.shapes;


import com.costaroot.vertex.Vertex3D;

import java.util.Arrays;

public class Sphere extends SpaceShape{
    private double radius;

    public Sphere (Vertex3D vertex3D, String name,double radius){
        super(Arrays.asList(vertex3D),name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getVolume() {
        return 4* Math.PI*Math.pow(radius,3)/3.0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "radius=" + radius +
                '}';
    }
}
