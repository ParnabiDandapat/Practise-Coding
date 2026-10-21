package com.NPTEL.Week_1;
import java.util.Scanner;
public class W1_P4 {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number to get table: ");
    int number=sc.nextInt();
    System.out.println(" ");
    for(int i=1;i<=10;i++){
        System.out.printf("%d * %d = %d",number,i,number*i);
        System.out.println(" ");
    }
    }
}
