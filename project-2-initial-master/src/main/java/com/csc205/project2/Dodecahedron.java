package com.csc205.project2;

public class Dodecahedron extends Shape {

    //private variable for the edge length of the dodecahedron
    //edge length is needed to calculate the surface area and volume
    private double eLength;

    public Dodecahedron() {
        super();
        this.eLength = 0.0;
    }

    public Dodecahedron(double v) {
        super();
        this.eLength = v;
    }

    public double getLength() {return eLength;}

    public void setLength() {
        this.eLength = eLength;
    }

    @Override
    public double surfaceArea() {
        return 3.0 * (Math.sqrt(25.0 + (10.0 * Math.sqrt(5.0))) * Math.pow(eLength, 2));
    }

    @Override
    public double volume() {
        return (1.0/4.0) * (15.0 + 7.0 * Math.sqrt(5.0)) * Math.pow(eLength, 3 );
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dodecahedron {");
        sb.append("edge length=").append(eLength);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
