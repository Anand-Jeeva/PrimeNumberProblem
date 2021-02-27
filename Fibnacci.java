import java.util.Arrays;
import java.util.Scanner;
class Fibnacci{
	public static void findFibnacci(int e){
		int result=0,first=0,second=1;
		System.out.print("0 1");
		for(int i=1;i<=e;i++){
			result=first+second;
			System.out.print(" "+result);
			first=second;
			second=result;
		}
		
	}
	public static void main(String arg[]){
		System.out.print("Enter the Element: ");
		int a=new Scanner(System.in).nextInt();
		findFibnacci(a);
	}
}
	
