package com.Nptel.Week_1;
import java.util.Scanner;
//check whether the number is odd or even
public class W01_p1 {
    public static void main(String args[]) {
Scanner sc= new Scanner(System.in) ;

System.out.println("Enter the number: ");
        int number =sc.nextInt();
        if(number%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
