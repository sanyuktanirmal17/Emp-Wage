public class Employee {
	public static void main(String args[]) {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR =20;
		int empHrs = 0;
		int empWage = 0;
		double empCheck= Math.floor(Math.random()*10)%2;
		System.out.println("Welcome to employee wage computation");
		switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs=0;
		}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage:" + empWage);
		}
		
 	}
