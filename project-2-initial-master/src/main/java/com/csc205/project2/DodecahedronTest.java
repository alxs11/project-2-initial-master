package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DodecahedronTest {

    @Test
    void surfaceArea() {
        double expected = 20.645728807067602;
        double actual = new Dodecahedron(1.0).surfaceArea();
        assertEquals(expected, actual);
    }

    @Test
    void volume() {
        double expected = 7.663118960624632;
        double actual = new Dodecahedron(1.0).volume();
        assertEquals(expected, actual);
    }
}