package com.csc205.project2;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @org.junit.jupiter.api.Test
    void surfaceArea() {
        double expected = 1.7320508075688772;
        double actual = new Tetrahedron(1.0).surfaceArea();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void volume() {
        double expected = 0.11785113019775793;
        double actual = new Tetrahedron(1.0).volume();
        assertEquals(expected, actual);
    }

}