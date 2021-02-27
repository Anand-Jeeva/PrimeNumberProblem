import java.util.Scanner;
class Prime{
	public static void findPrimeNumber(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i == 0){
				count++;
			}
		}
		if(count == 2){
			System.out.println(n+" It's a Prime Number");
		}else{
			System.out.println(n+" It's a Not a prime Number");
		}
	
	}
	
	public static void main(String argu[]){
		System.out.print("Enter the Number: ");
		int n=new Scanner(System.in).nextInt();
		findPrimeNumber(n);
	}
}
	