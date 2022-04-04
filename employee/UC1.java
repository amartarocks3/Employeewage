package employee;

import java.util.Random;

public class UC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int random1 = rand.nextInt();
		int a = random1%2;
		if(a==0) {
			System.out.println("Absent");
		}
		else
		{
			System.out.println("Present");
		}
	}

}
