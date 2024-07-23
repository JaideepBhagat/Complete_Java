package _01_DataTypes_Variables_Arrays;

public class _06_Arrays {
    public static void main(String[] args){
        String[] week; // Declaration
        week = new String[7]; // Allocation
        week[0] = "Sun";
        week[1] = "Mon";
        week[2] = "Tue";
        week[3] = "Wed";
        week[4] = "Thu";
        week[5] = "Fri";
        week[6] = "Sat";

        System.out.println("Forth day in the week is " + week[3]);

        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("August has " + month_days[7] + " days in a month");
    }
}
