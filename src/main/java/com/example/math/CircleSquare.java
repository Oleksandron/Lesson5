package com.example.math;
import java.util.Scanner;

public class CircleSquare {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        int radius = in.nextInt();
        long area = Math.round(Math.PI * Math.pow(radius, 2));
        System.out.printf("Площадь круга с радиусом %d равна %d \n", radius, area);
    }

}
