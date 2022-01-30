import java.util.Scanner;
public class SumAndMulti {
	
	public static int sum() {
		int a=10;
		int b=20;
		int sum=a+b;
		return sum;
	}
	public static int multi() {
		return 10*20;
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int sumres=sum();
		System.out.println(sumres);
		int multires=multi();
		System.out.println(multires);
	}

}
