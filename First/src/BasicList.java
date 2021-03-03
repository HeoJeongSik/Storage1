import java.util.Scanner;

public class BasicList {

	public static void main(String[] args) {
		int[] number;
		number = new int[5];
		Scanner in = new Scanner(System.in);
		int num;
		
		for(int i = 0; i < 5; i++) {
			number[i] = in.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(number[i]);
		}
		

	}

}
