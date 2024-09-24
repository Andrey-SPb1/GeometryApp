package org.javacode;

import org.javacode.shapes.Circle;
import org.javacode.utils.GeometryUtils;

public class GeometryUtilRunner {

    public static void main(String[] args) {

        GeometryUtils utils = new GeometryUtils();
        double difference = utils.areaDifference(new Circle(10), new Circle(20));
        System.out.println(difference);

        double converted = utils.convertCmToMm(100);
        System.out.println("100cm = " + converted + "mm");
    }

}
