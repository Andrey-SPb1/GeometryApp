package org.javacode;

import org.javacode.shapes.Circle;
import org.javacode.shapes.Rectangle;
import org.javacode.shapes.Triangle;

public class GeometryLibraryRunner {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.printf("""
                Circle:
                Perimeter = %.2f
                Area = %.2f
                """
                , circle.getPerimeter(), circle.getArea()
        );

        Triangle triangle = new Triangle(10, 8, 10, 10);
        System.out.printf("""
                Triangle:
                Perimeter = %.2f
                Area = %.2f
                """
                , triangle.getPerimeter(), triangle.getArea()
        );

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.printf("""
                Rectangle:
                Perimeter = %.2f
                Area = %.2f
                """
                , rectangle.getPerimeter(), rectangle.getArea()
        );

    }
}