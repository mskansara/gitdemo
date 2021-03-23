package main;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("This line is added");
		System.out.println("This line has been added from the server");
		System.out.println("This line was added in Branch 1");

		System.out.println("This is the new line in master branch");
		

		System.out.println("This line is added after making changes in Master branch locally");
		

	}
	
	public static void cube(int l) {
		System.out.println(l*l*l);
	}
	public static void cuboid(int l ,int b, int h) {
		System.out.println(l*b*h);
	}
	

	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void sub(int a, int b) {
		System.out.println(a-b);

	}
	public static void mul(int a, int b) {
		System.out.println(a*b);
	}

}
