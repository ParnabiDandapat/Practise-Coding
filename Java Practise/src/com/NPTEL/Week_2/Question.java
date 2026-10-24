package com.NPTEL.Week_2;

public class Question {
    public static void main(String[] args){
        int [] A={1,0,1};
        System.out.println(A.length);
        for (int i=0;i<A.length;i++){
            A[i]=A[(A[i]+3)%A.length];
        }
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");;
        }

    }
}
