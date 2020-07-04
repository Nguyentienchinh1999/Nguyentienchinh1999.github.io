package baitap_day1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1 bai1 = new ex1();
		System.out.println("bài 1: ");
		int tinhTong = bai1.total();
		System.out.println("bài 2: ");
		double giaiThua = bai1.factorial();
		
	}
	static Scanner S = new Scanner(System.in);
	public int total() {
			
		int num;
		int total = 0;
		do {
			System.out.println("Nhập số:");

			 num  = S.nextInt();
			 if(num > 0) {
				 total += num;
				 System.out.println("tổng là: " + total);	 	 
			 }
				 
			 
		}while(total < 100);
		return total;
	}
	public int factorial() {
		int n = 10;
		int fac = 1;
		for(int i = 1; i <= n; i++) {
			fac *= i;
		}
		System.out.println("gia thừa của 10 là: "+ fac);
		return fac;
	}
}
