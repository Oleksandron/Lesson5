package com.example.math;

public class ClassMath {
    public static void main(String[] args) {

    double result = Math.abs(-13.5);//abs(double value): возвращает абсолютное значение для аргумента value
        System.out.println(result);
        double result1 = Math.acos(1);//acos(double value): возвращает арккосинус value.
        // Параметр value должен иметь значение от -1 до 1
        System.out.println(result1);
        double result2 = Math.asin(1);//asin(double value): возвращает арксинус value.
        // Параметр value должен иметь значение от -1 до 1
        System.out.println(result2);
        double result3 = Math.atan(1);//atan(double value): возвращает арктангенс value
        System.out.println(result3);
        double result4 = Math.cbrt(27); // cbrt(double value): возвращает кубический корень числа value
        System.out.println(result4);
        double result5 = Math.ceil(2.34); // ceil(double value): возвращает наименьшее
        // целое число с плавающей точкой, которое не меньше value
        System.out.println(result5);
        double result6 = Math.cos(9.75);//возвращает косинус угла d
        System.out.println(result6);
        double result7 = Math.cosh(5.25);//возвращает гиперболический косинус угла d
        System.out.println(result7);
        double result8 = Math.exp(3.97);//возвращает основание натурального логарифма, возведенное в степень d
        System.out.println(result8);
        double result9 = Math.floor(2.56); //floor(double d): возвращает наибольшее целое число, которое не больше d
        System.out.println(result9);
        System.out.println(Math.floorDiv(1, 2)); // floorDiv(int a, int b):
        System.out.println(Math.floorDiv(7, 2)); // возвращает целочисленный
        System.out.println(Math.floorDiv(9, 2)); // результат деления a на b
        double result10 = Math.log(4.46); // возвращает натуральный логарифм числа a
        System.out.println(result10);
        double result11 = Math.log1p(25.56); // возвращает натуральный логарифм числа (d + 1)
        System.out.println(result11);
        double result12 = Math.log10(17); // возвращает десятичный логарифм числа d
        System.out.println(result12);
        double result13 = Math.max(17,55); // max(double a, double b): возвращает максимальное число из a и b
        System.out.println(result13);
        double result14 = Math.min(99,22); // min(double a, double b): возвращает минимальное число из a и b
        System.out.println(result14);
        double result15 = Math.pow(33,91); // pow(double a, double b): возвращает число a, возведенное в степень b
        System.out.println(result15);
        double result16 = Math.random(); // random(): возвращает случайное число от 0.0 до 1.0
        System.out.println(result16);
        System.out.println(Math.rint(2)); // rint(double value): возвращает число
        System.out.println(Math.rint(2.3)); //
        System.out.println(Math.rint(2.5)); // double, которое представляет
        System.out.println(Math.rint(2.5001)); //
        System.out.println(Math.rint(2.8)); // ближайшее к числу value целое число
        System.out.println(Math.round(2.3)); //round(double d): возвращает число d,
        System.out.println(Math.round(2.5)); //
        System.out.println(Math.round(2.5001)); //
        System.out.println(Math.round(2.8)); //округленное до ближайшего целого числа
        System.out.println(Math.scalb(5, 3)); // 5*2*2*2 = 40    scalb(double value, int factor): возвращает
        System.out.println(Math.scalb(3, 4)); // 3*2*2*2*2 = 48  произведение числа value на 2 в степени factor
        System.out.println(Math.signum(2.3)); //возвращает число 1, если число value положительное, и -1, если значение
        System.out.println(Math.signum(-2.3)); //value отрицательное, если value равно 0, то возвращает 0

    }
 }

