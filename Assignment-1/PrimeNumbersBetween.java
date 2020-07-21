public class PrimeNumbersBetween {//This class predicts the prime numbers between two numbers 2 and 100
	public static void main(String[] args) {
		int n=100;
		for(int i=3;i<n;i++) {
			int temp=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					temp=1;
					break;
				}
			}
			if(temp==0)
				System.out.println(i + " is a prime number");
		}
	}
}
