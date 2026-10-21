package com.NPTEL.Week_1;
import java.util.Scanner;


public class W1_P2 {
static double AreaOfRec(double len, double width){
    return len*width;
}
static void PerimeterOfRec(double len, double width){
    System.out.println("The Perimeter of Rectangle is: "+(2*(len+width)));
}
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
      System.out.print("Enter length: ");
    double len=sc.nextDouble();
      System.out.print("Enter width: ");
    double width=sc.nextDouble();
    PerimeterOfRec(len,width);
    double area=AreaOfRec(len,width);
    System.out.println("The area of Rectangle is: "+area);
  }
}
