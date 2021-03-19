package com.mycompany.sololearn;

import java.util.Scanner;

/* Shapes */

abstract class Shape
{
    int width;
    abstract void area();
}

class Square extends Shape
{

    Square(int x)
    {
        width = x;
    }

    @Override
    void area()
    {
        int area1 = width * width;
        System.out.println(area1);
    }
}

class Circle extends Shape
{

    Circle(int y)
    {
        width = y;
    }

    @Override
    void area()
    {
        double area2 = Math.PI * width * width;
        System.out.println(area2);
    }
}

public class Shapes {

    public static void main(String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();

    }
}