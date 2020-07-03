package com.costaroot.shapes;

import com.costaroot.vertex.Vertex;
import com.costaroot.vertex.Vertex2D;

import java.util.*;

public class Triangle extends PlaneShape{
    public Triangle (Vertex2D a, Vertex2D b, Vertex2D c){
        super(Arrays.asList(a,b,c),"Triangle");
    }

    @Override
    public double getArea() {
        List <Vertex2D> list = this.getVertex2D();
        double p;
        p = this.getPerimeter()*0.5;
        return Math.sqrt(p*(p - list.get(0).getDistance(list.get(1))) *
                (p - list.get(0).getDistance(list.get(2))) *
                (p - list.get(1).getDistance(list.get(2))));
    }

    @Override
    public double getPerimeter() {
       List <Vertex2D> list = this.getVertex2D();
       return list.get(0).getDistance(list.get(1))+list.get(0).getDistance(list.get(2))+
               list.get(1).getDistance(list.get(2));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
