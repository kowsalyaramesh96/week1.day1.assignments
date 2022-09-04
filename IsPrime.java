package week1.day1.assignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=11;int temp=0;	
for (int i=2; i<=n-1; i++) {
	if(n%i==0) {
		
		temp=temp+1;
	}
}
	if(temp>0){
		
		System.out.println(n + " is not prime number");
		
	}
	else {
		System.out.println(n + " is  a Prime number");
	}
}
	}


