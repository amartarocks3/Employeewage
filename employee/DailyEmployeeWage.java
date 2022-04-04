package employee;

import java.util.Random;

public class DailyEmployeeWage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR=20;
		int empHrs = 0;
		int empWage = 0;
		Random rand = new Random();
		int random1 = rand.nextInt();
		int empCheck = random1%2;
		if(empCheck == IS_FULL_TIME) {
			empHrs = 8 ;
		}
		else
		{
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
}}
