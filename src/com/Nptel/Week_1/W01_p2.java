package com.Nptel.Week_1;
import java.util.Scanner;
public class W01_p2 {
    static double areaOfRectangle(double len,double width){
        return (len*width);
    }
    static void perimeterOfRectangle(double len,double width){
       System.out.println("Perimeter of Rectangle is: "+ (2*(len+width)));
    }
    public static void main(String args[]) {
        double len;//length
        double width;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of Rectangle:");
        len=sc.nextDouble();
        System.out.print("Enter width of Rectangle:");
        width=sc.nextDouble();
        perimeterOfRectangle(len,width);
        double area=areaOfRectangle(len,width);
        System.out.println("Area of Rectangle is:"+area);

    }
}
