package _01_DataTypes_Variables_Arrays;
/* This example demonstrates the use of three-dimensional arrays
a real-world application where we want to store the temperature data for a city over a year*/
public class _08_ThreeD_Array {
    public static void main(String[] args){
        int months = 12, days= 31, readings = 3;

        double[][][] temperatureData = new double[months][days][readings];

        // enter random 3 temperature readings for each day for each month
        for(int m = 0; m < months; m++){
            for(int d = 0; d < days; d++){
                for(int r = 0; r < readings; r++){
                    temperatureData[m][d][r] = Math.random() * 50;
                }
            }
        }

        // print the 3D array
        for(int m = 0; m < months; m++){
            System.out.println("Month " + (m+1) + ": ");
            System.out.println("Day\t\t\tReading 1\tReading 2\tReading 3");
            for(int d = 0; d < days; d++){
                System.out.print("Day " + (d+1) + ": ");
                for(int r = 0; r < readings; r++){
                    System.out.print(" \t" + String.format("%.2f", temperatureData[m][d][r]) + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        // print the temperature data for 30th may
        System.out.println("Temperature data for 30th May: ");
        for(int r = 0; r < readings; r++){
            System.out.println("Reading " + (r+1) + ": " + temperatureData[4][29][r] + "\t");
        }
    }
}
