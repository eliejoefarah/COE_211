package StaffManagement;

import java.util.*;
public class entrypoint {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the name of the first employee");
		String first=scan.nextLine();
		System.out.println("enter the last name of the first employee");
		String last=scan.nextLine();
		System.out.println("enter the age of the first employee");
		int age=scan.nextInt();
		System.out.println("enter the salary of the first employee");
		double salary=scan.nextDouble();
		Employee employ1=new Employee(first, last, age, salary);
		System.out.println("employee's information" + " " +
		 employ1.first+ " "+
		 	employ1.last+ ", " +
				 employ1.age+ ", " +
			 employ1.salary);
	}
	

}

