package com.csc205.project2;

public class Tetrahedron extends Shape {

    //private variable for the edge length of a tetrahedron
    private double eLength;

    public Tetrahedron() {
        super();
        this.eLength = 0.0;
    }

    public Tetrahedron(double v) {
        super();
        this.eLength = v;
    }

    public double getLength() {
        return eLength;
    }

    public void setLength() {
        this.eLength = eLength;
    }

    @Override
    public double surfaceArea() {
        return Math.sqrt(3) * Math.pow(eLength, 2);
    }

    @Override
    public double volume() {
        return (Math.sqrt(2) / 12) * Math.pow(eLength, 3);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Tetrahedron {");
        sb.append("edge length=").append(eLength);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
