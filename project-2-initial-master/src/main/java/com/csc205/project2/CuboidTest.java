package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

    @Test
    void surfaceArea() {
        double expected = 6.0;
        double actual = new Cuboid(1.0, 1.0, 1.0).surfaceArea();
        assertEquals(expected, actual);
    }

    @Test
    void volume() {
        double expected = 1.0;
        double actual = new Cuboid(1.0, 1.0, 1.0).volume();
        assertEquals(expected, actual);
    }
}