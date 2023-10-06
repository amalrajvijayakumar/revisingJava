package basic;

import java.util.Scanner;

public class loopPrograms {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		System.out.println("Enter the number");
		loopPrograms lp = new loopPrograms();
		lp.print1();
		lp.print2();
		lp.print3();
		lp.print4();
		
		}

	private void print4() {
		//3   6   9   12  15
		for(int i= 1; i<=5; i++) {
			System.out.print (3*i+ " ");
		}
		System.out.println(" ");
	}

	private void print3() {
		//1 3 5 7 9
		for(int i = 1; i<=10; i=i+2) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
	}

	private void print2() {
		//1   2   3   4   5
		for (int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
	}

	private void print1() {
		// 1   1   1   1   1
		for(int i= 1; i<=5; i++) {
			System.out.print(1 + " ");
		}
		System.out.println(" ");
	}

}
