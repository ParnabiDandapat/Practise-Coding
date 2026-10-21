package com.NPTEL.Week_1;
import java.util.Scanner;

public class W1_P3 {
public static void main(String args[]) {
Scanner in= new Scanner(System.in);
System.out.print("enter radius : ");
double r=in.nextDouble();//r=radius
    System.out.print("enter height : ");
    double h=in.nextDouble();//h=height
    double volume=Math.PI*r*r*h;
    System.out.println("The volume pf Cylinder is: "+volume);
}
}
