package scope;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt());
		}
	}
}
