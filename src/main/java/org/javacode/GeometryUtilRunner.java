package org.javacode;

import org.javacode.ThreeDemensionalShapes.Sphere;
import org.javacode.shapes.Circle;
import org.javacode.utils.GeometryUtils;

public class GeometryUtilRunner {

    public static void main(String[] args) {

        GeometryUtils utils = new GeometryUtils();
        double difference = utils.areaDifference(new Circle(10), new Circle(20));
        System.out.println(difference);

        double difference2 = utils.areaDifference(new Sphere(10), new Sphere(20));
        System.out.println(difference2);

        double converted = utils.convertCmToMm(100);
        System.out.println("100cm = " + converted + "mm");

        double converted2 = utils.convertMmToCm(100);
        System.out.println("100mm = " + converted2 + "cm");
    }

}
