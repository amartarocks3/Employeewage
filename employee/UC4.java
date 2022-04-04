package employee;

import java.util.Random;

public class UC4 {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empHrs = 0;
		int empWage = 0;
		Random rand = new Random();
		int random1 = rand.nextInt();
		int empCheck = (int)random1%3;
		switch(empCheck){
		case IS_FULL_TIME: 
			empHrs = 8;
			break;
		case IS_PART_TIME:
			empHrs = 4;
			break;
		default :
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}
}

