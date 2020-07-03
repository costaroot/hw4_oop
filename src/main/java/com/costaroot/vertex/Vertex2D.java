package com.costaroot.vertex;

public class Vertex2D extends Vertex{
    private final double x;
    private final double y;

    public Vertex2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Vertex2D{" +
                "x= " + x +
                ", y= " + y +
                '}';
    }

    public double getDistance(Vertex2D point) {
       return Math.sqrt(Math.pow(this.x- point.getX(),2) + Math.pow(this.y - point.getY(),2));
    }
}
