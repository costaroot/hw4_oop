package com.costaroot;

import com.costaroot.shapes.*;
import com.costaroot.vertex.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Shape triangle = new Triangle(new Vertex2D(0,0),new Vertex2D(0,1),new Vertex2D(1,0));
        Shape circle = new Circle(new Vertex2D(-1,0),"Circle",5);
        Shape rectangle = new Rectangle(new Vertex2D(0,0),"Rectangle",5,2);
        Shape pyramid = new SquarePyramid(new Vertex3D(0,0,0),"Squared Pyramid",1,4);
        Shape cuboid = new Cuboid(new Vertex3D(1,1,0),"Cuboid",1,2,3);
        Shape sphere = new Sphere(new Vertex3D(1,0,-1),"Sphere",10);
        List<Shape> shapes = Arrays.asList(triangle,circle,rectangle,pyramid,cuboid,sphere);
        for (Shape shape: shapes) {
            System.out.println(shape.toString());
        }
    }
}
