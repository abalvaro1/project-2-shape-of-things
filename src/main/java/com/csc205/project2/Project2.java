package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
/*
 * Author: Amethyst Alvaro , Ray Hedgecock
 * Date: 09/28/2023
 * Project 2: The Shape of Things
 * Desc:Demonstration of inheritance and polymorphism through Shape radius, surface area, and volume using interface, abstract, and subclasses.
 */
public class Project2 {

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        ThreeDimensionalShape cone = new Cone(5.0, 2.0);

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(cone);

        shapes.forEach(System.out::println);

        /*
        The following code works with the code given.
         */

       /* Sphere Sphere = new Sphere(2.0);
        System.out.println(sphere);
        System.out.println();
        Cube Cube = new Cube(5.0);
        System.out.println(cube);
        System.out.println();
        Cylinder Cylinder = new Cylinder(4.0, 1.0);
        System.out.println(cylinder);
        System.out.println();
        Cone Cone = new Cone(5.0, 1.0);
        System.out.println(cone); */
    }

}

