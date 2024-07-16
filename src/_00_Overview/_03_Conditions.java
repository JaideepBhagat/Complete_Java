package _00_Overview;

/*
    This example demonstrates the use of conditional IF statements
*/
class _03_Conditions {
    public static void main(String[] args){
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x is less than y");

        x = x * 2; // x = 20

        if (x == y) System.out.println("x is equal to y");

        x = x * 2; // x = 40

        if (x > y) System.out.println("Now x is greater than y");

        if(x == y) System.out.println("x is equal to y"); // this won't show any message
    }
}