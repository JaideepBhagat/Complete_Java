package _00_Overview;

/*
    This is the second example in Java
	To illustrate the use of variables
*/
class _02_Variables {
	public static void main(String[] args){
		int num; //this declares a variable called num
		num = 100; // this assigns a value of 100 to the variable num
		
		System.out.println("The value of num is: " + num);
		
		num = num * 2;
		
		System.out.print("The value of num * 2 is: ");
		System.out.println(num);
	}
}