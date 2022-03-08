package com.company;

import java.util.Scanner;

class XY{
    void Sum(double x, double y){
        double z;
        z = (x+y)/(y+1);
        if (y+1 == 0){
            System.out.println("Z = 0");
        }
        else {
            System.out.println("Z = " + z);
        }
    }
}


public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выполняет выражение: Z = (x+y)/(y+1)");
        System.out.println("Введите число X: ");
        double x = scanner.nextDouble();
        System.out.println("Введите число Y: ");
        double y = scanner.nextDouble();
        XY dn = new XY();
        dn.Sum(x, y);
    }
}
