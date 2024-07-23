package _01_DataTypes_Variables_Arrays;

public class _05_Type_Promotion {
    public static void main(String[] args){
        byte b = 50;
        char c = 'a';
        double d = 123.456;
        int e = 5000;
        float f = 5.67f;

        double a = (b * c) + d + (e / f);
        System.out.println("result = " + (b * c ) + " + " + d + " + " + (e/f) + " = " + a);
    }
}
