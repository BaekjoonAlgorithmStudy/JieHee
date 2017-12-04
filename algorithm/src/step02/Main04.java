package step02;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int a= scan.nextInt();
		int b= scan.nextInt();
		while(b!=0) {
			System.out.println(a/b);
		}
	}
}