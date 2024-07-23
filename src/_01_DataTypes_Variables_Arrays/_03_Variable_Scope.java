package _01_DataTypes_Variables_Arrays;

import java.util.Scanner;

public class _03_Variable_Scope {
    public static void main(String[] args){
        int a, b = 20;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        a = sc.nextInt();
        if(a == 10){
            int c = a + b;
            System.out.println("c = " + c);
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //System.out.println("c = " + c);

        for(int x = 0; x < 3; x++){
            int y = 25;
            System.out.println("Value of y is : " + y);
            y = 100;
            System.out.println("Now value of y is : " + y);
        }
        // Uncommenting below lines will throw errors
        // System.out.println("Value of x is: " + x);
        // System.out.println("Value of y is : " + y);
    }
}
