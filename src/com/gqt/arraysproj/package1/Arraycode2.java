package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class Arraycode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the count of students");
			int n = sc.nextInt();
			int arry[] = new int[n]; //one dimension
			// TODO Auto-generated method stub
			for(int i=0; i<=n-1 ; i++){
			System.out.println("Enter the marks of student no:" + (i + 1));
			arry[i] = sc.nextInt();
			}
		    for(int i=0; i<=n-1 ; i++){
				System.out.println(" the marks of student no:" + (i + 1) + " is:" +arry[i]);
		    }
		    }
		
		/*System.out.println("Enter the count of classes:");
	int cls = sc.nextInt();
	System.out.println("Enter the count of students:");
	int stu = sc.nextInt();
	int arry [] []= new int [cls] [stu]; //2 dimensional
	for(int i=0; i<cls ; i++){
		System.out.println("Inside the class:" + (i + 1));
		for(int j=0; j<stu ; j++){
			System.out.println("Enter the marks of the student no:" + (j + 1));
			arry[i][j]=sc.nextInt();
		}
	}
			for(int i=0; i<cls ; i++){
				System.out.println("Inside the class:" + (i + 1));
				for(int j=0; j<stu ; j++){
					System.out.println(" the marks of the student no:" + (j + 1)+"is:" +arry [i][j]);
			

	}
			}
	}
	}
	*/
		/*System.out.println("Enter the count of school:");
		int sch = sc.nextInt();
		System.out.println("Enter the count of classes:");
		int cls = sc.nextInt();
		System.out.println("Enter the count of students:");
		int stu = sc.nextInt();
		int arry [] [] [] = new int [sch] [cls] [stu]; 3 dimensional
		for(int i=0; i<sch ; i++){
			System.out.println("Inside the school:" + (i + 1));
		
			for(int j=0; j<cls ; j++){
				System.out.println("Inside the class:" + (j + 1));
			
				for(int k=0; k<stu ; k++){
					System.out.println("Enter the marks of the student:" + (k + 1));
				arry [i][j][k]= sc.nextInt();
				}
			}
		}
		
	    for(int i=0; i<sch ; i++){
					System.out.println("Inside the school:" + (i + 1));
				
					for(int j=0; j<cls ; j++){
						System.out.println("Inside the class:" + (j + 1));
					
						for(int k=0; k<stu ; k++){
							System.out.println(" the marks of the student no:" + (k + 1) + "is:" + arry[i][j][k]);
						
				}
	}
	    }
	}
	}
	*/

		


		

	}

}
