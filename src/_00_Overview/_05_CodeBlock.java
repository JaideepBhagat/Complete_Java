package _00_Overview;

/*
    This example demonstrates a block of code
*/
public class _05_CodeBlock {
    public static void main(String[] args){
        int x, y;

        y = 100;

        for(x = 0; x < 10; x++){
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            y = y - 5;
        }
    }
}
