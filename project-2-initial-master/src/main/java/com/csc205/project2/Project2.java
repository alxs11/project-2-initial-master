package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        /*ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);

        shapes.forEach(System.out::println);*/

        /*
        The following code works with the code given.
         */

        Sphere sphere = new Sphere(2.0);
        System.out.println(sphere);

        Dodecahedron dodecahedron = new Dodecahedron(2.0);
        System.out.println(dodecahedron);

        Tetrahedron tetrahedron = new Tetrahedron(2.0);
        System.out.println(tetrahedron);

        Cuboid cuboid = new Cuboid(2.0, 2.0, 2.0);
        System.out.println(cuboid);

    }

}/*Output
Sphere {radius=2.0, surface area=50.26548245743669, volume=33.510321638291124}
Dodecahedron {edge length=2.0, surface area=82.58291522827041, volume=61.30495168499706}
Tetrahedron {edge length=2.0, surface area=6.928203230275509, volume=0.9428090415820635}
Cuboid {length=2.0, breadth=2.0, height=2.0, surface area=24.0, volume=8.0}
*/

