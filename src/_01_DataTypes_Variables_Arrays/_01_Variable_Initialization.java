package _01_DataTypes_Variables_Arrays;

import java.util.Scanner;

public class _01_Variable_Initialization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle : ");
        float r = sc.nextFloat();
        float pi = 3.14159f;
        float area = 2 * pi * r;

        System.out.println("Area of the Circle is : " + area);
    }
}
