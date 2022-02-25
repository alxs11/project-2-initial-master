package com.csc205.project2;

public class Cuboid extends Shape {

    //private variables for length, breadth, and width of a cuboid
    private double length;
    private double breadth;
    private double height;

    public Cuboid() {
        super();
        this.length = 0.0;
        this.breadth = 0.0;
        this.height = 0.0;
    }

    public Cuboid(double l, double b, double h) {
        super();
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public double surfaceArea() {
        return 2 * ((length * breadth) + (breadth * height) + (height * length));
    }

    @Override
    public double volume() {
        return length * breadth * height;
    }

    public String toString() {
            final StringBuilder sb = new StringBuilder("Cuboid {");
            sb.append("length=").append(length);
            sb.append(", breadth=").append(breadth);
            sb.append(", height=").append(height);
            sb.append(", surface area=").append(surfaceArea());
            sb.append(", volume=").append(volume());
            sb.append('}');
            return sb.toString();
    }

}
