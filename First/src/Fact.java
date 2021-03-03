import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.println(fact(a));
		
	}
	
	public static int fact(int num) {
		
		if(num <= 1) {
			return num;
		}else {
			return fact(num - 1) * num;
		}
	}

}
