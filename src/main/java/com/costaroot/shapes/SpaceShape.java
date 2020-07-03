package com.costaroot.shapes;

import com.costaroot.metrics.AreaMeasurable;
import com.costaroot.metrics.VolumeMeasurable;
import com.costaroot.vertex.Vertex3D;

import java.util.List;

public abstract class SpaceShape extends Shape implements VolumeMeasurable, AreaMeasurable {

    public SpaceShape(List<Vertex3D> vertex3D, String name) {
        super(vertex3D, name);
    }

    @Override
    public String toString() {
        return "{" + " Figure Name: " + getName() + " Area= " + getArea() +
                " Volume= " + getVolume() +
                "\n" + super.getVertices();
    }
}
