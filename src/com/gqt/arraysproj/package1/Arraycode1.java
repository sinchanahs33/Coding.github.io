package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class Arraycode1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of students");
		int n = sc.nextInt();
		int arry[] = new int[n];//one dimention
		// TODO Auto-generated method stub
		for(int i=0; i<=n-1 ; i++){
		System.out.println("Enter the marks of student no:" + (i + 1));
		arry[i] = sc.nextInt();
		}
	    for(int i=0; i<=n-1 ; i++){
			System.out.println(" the marks of student no:" + (i + 1) + " is:" +arry[i]);


	}

	}
}

