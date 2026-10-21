package com.NPTEL.Week_1;
import java.util.Scanner;
public class W1_P1 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
     int number=sc.nextInt();
     if(number%2==0){
         System.out.println("It is even");
     }else{
         System.out.println("It is odd");
     }
    }
}
