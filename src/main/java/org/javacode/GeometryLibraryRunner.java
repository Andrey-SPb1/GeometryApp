package org.javacode;

import org.javacode.shapes.Circle;
import org.javacode.shapes.Rectangle;
import org.javacode.shapes.Triangle;

public class GeometryLibraryRunner {

    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.printf("""
                Circle:
                Perimeter = %.2f
                Area = %.2f
                """
                , circle.getPerimeter(10), circle.getArea(10)
        );

        Triangle triangle = new Triangle();
        System.out.printf("""
                Triangle:
                Perimeter = %.2f
                Area = %.2f
                """
                , triangle.getPerimeter(10, 20, 30), triangle.getArea(10, 15)
        );

        Rectangle rectangle = new Rectangle();
        System.out.printf("""
                Rectangle:
                Perimeter = %.2f
                Area = %.2f
                """
                , rectangle.getPerimeter(10, 20), rectangle.getArea(10, 20)
        );

    }
}