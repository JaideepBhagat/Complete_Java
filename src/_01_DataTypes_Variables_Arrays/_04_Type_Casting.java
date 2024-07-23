package _01_DataTypes_Variables_Arrays;

public class _04_Type_Casting {
    public static void main(String[] args){
        byte b;
        int i = 257;
        double d = 357.159;

        System.out.print("Conversion of int to byte: " );
        b = (byte) i; //Modulo of byte
        System.out.println("i = " + i + " b = " + b);

        System.out.print("Conversion of double to int: ");
        i = (int) d;
        System.out.println("d = " + d + " i = " + i);

        System.out.print("Conversion of double to byte: ");
        b = (byte) d;
        System.out.println("d = " + d + " b = " + b);
    }
}
