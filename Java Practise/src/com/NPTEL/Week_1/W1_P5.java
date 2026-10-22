package com.NPTEL.Week_1;
import java.util.Scanner;
public class W1_P5 {
public static void main(String args[]) {
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int num=sc.nextInt();
System.out.print("Enter the divisor: ");
int div=sc.nextInt();
int quo=num/div;
int rem=num%div;
System.out.println("The quotient is : "+quo);
System.out.println("The rem is: "+rem);

}
}
