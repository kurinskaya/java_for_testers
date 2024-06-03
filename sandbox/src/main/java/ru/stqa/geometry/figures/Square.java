package ru.stqa.geometry.figures;

public class Square {
    public static void printSquarePerimeter(double a){
        String text = String.format("Периметр квадрата со стороной %f равен %f", a, perimeter(a));
        System.out.println(text);

    }

    public static double perimeter(double a) {
        return 4*a;
    }

    public static void printSquareArea(double a){
       String text = String.format("Площадь квадрата со стороной %f равна %f", a,  area(a));
        System.out.println(text);

    }

    public static double area(double a) {
        return a*a;
    }


}