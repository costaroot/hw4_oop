package com.costaroot.shapes;

import com.costaroot.metrics.AreaMeasurable;
import com.costaroot.metrics.VolumeMeasurable;
import com.costaroot.vertex.Vertex3D;

import java.util.Arrays;
import java.util.List;

public abstract class SpaceShape extends Shape implements VolumeMeasurable, AreaMeasurable {
    private List<Vertex3D> vertex3D;

    public SpaceShape(List<Vertex3D> vertex3D, String name) {
        super(Arrays.asList(), name);
        this.vertex3D = vertex3D;
    }

    public List<Vertex3D> getVertex3D() {
        return vertex3D;
    }

    @Override
    public String toString() {
        return "{" + " Figure Name: " + getName() + " Area= " + getArea() +
                " Volume= " + getVolume() +
                "\nvertex3D= " + vertex3D +
                '}';
    }
}
