package com.mycompany.sololearn;

import java.util.Scanner;

//public class Something {
//
////    static String toBinary(int x) {
////        String binary = "";
////        while (x > 0) {
////            binary = (x % 2) + binary;
////            x /= 2;
////        }
////        return binary;
////    }
//
//    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        int amount = scanner.nextInt();
////	//your code goes here
////               
////        for (int i = 0; i <= 5; i++){
////            amount = (int)amount - (int)Math.ceil(0.1 * amount); 
////        }
////        
////        System.out.println(amount);
//
////        Scanner scanner = new Scanner(System.in);
////        String text = scanner.nextLine();
////        char[] arr = text.toCharArray();
////        
////        String rev = "";
////        for (char i : arr)
////            rev = i + rev;
////        System.out.println(rev);
//
//
//
////        Scanner sc = new Scanner(System.in);
////        int x = sc.nextInt();
////        System.out.print(Something.toBinary(x));
//
//
//        
//    }
//
//}

abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here

class Square extends Shape{

    Square(int x) {
        width = x;
    }

    @Override
    void area() {
        int area1 = width * width;
        System.out.println(area1);
    }
    
}

class Circle extends Shape{

    Circle(int y) {
        width = y;
    }

    @Override
    void area() {
        double area2 = Math.PI * width * width;
        System.out.println(area2);
    }
    
}

public class Something {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}

