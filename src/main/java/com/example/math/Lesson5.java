package com.example.math;

public class Lesson5 {

    public static void main(String[] args) {
        //операция сложения двух чисел:
        int a = 10;
        int b = 7;
        int c = a + b;
        int d = 4 + c;
        System.out.println(c);
        System.out.println(d);
        //операция вычитания двух чисел:
        int e = 10;
        int f = 7;
        int g = e - f;
        int h = 4 - g;
        System.out.println(g);
        System.out.println(h);
        //операция умножения двух чисел:
        int k = 10;
        int l = 7;
        int m = k * l;
        int n = m * 5;
        System.out.println(m);
        System.out.println(n);
        //операция деления двух чисел:
        int o = 20;
        int p = 5;
        int q = o / p;
        double r = 22.5 / 4.5;
        System.out.println(q);
        System.out.println(r);
        // результат обрезания дробного до целого числа при делении
        double t = 10 / 4;
        System.out.println(t);
        //результат деления числа с плавающей точкой
        double y = 10.0 / 4;
        System.out.println(y);
        //получение остатка от деления двух чисел:
        int w = 33;
        int u = 5;
        int i = w % u;
        int s = 22 % 4;
        System.out.println(i);
        System.out.println(s);
        //++ (префиксный инкремент)
        int j = ++a;
        System.out.println(a);
        System.out.println(j);
        //++ (постфиксный инкремент)
        int z = b++;
        System.out.println(b);
        System.out.println(z);
        //-- (префиксный декремент)
        int x = --o;
        System.out.println(o);
        System.out.println(x);
        //-- (постфиксный декремент)
        int  aa = f--;
        System.out.println(f);
        System.out.println(aa);
        //Приоритет операций  при выполнении  арифметических выражений:
        int bb = 8;
        int cc = 7;
        int dd = bb + 5 * ++cc;
        System.out.println(dd);
        //Скобки позволяют переопределить порядок вычислений:
        int ee = 8;
        int ff = 7;
        int  gg= (ee + 5) * ++ff;
        System.out.println(gg);
        // операции умножения и деления, прибавления и вычитания,
        // имеют один и тот же приоритет, слева на право
        int hh = 10 / 5 * 2;
        int kk = 11 - 5 + 9;
        System.out.println(hh);
        System.out.println(kk);
        //числа с плавающей точкой не подходят для финансовых и других вычислений,
        // где ошибки при округлении могут быть критичными
        double nn = 2.0 - 1.1;
        System.out.println(nn);
    }
}