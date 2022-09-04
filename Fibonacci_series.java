package week1.day1.assignments;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0;
		int secNum=1;
		int sum = 0;
		System.out.println(firstNum);
		System.out.println(secNum);
for(int i=0; i<=8;i++) {
	sum =firstNum+secNum;
	System.out.println(sum);
	firstNum=secNum;
	secNum=sum;
	
}


	}

}
