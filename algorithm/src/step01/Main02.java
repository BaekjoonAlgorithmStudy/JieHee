package step01;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("A �Է� (0<A<10) : ");
		int A= scan.nextInt();
		System.out.print("B �Է� (0<B<10) : ");
		int B= scan.nextInt();
		int result= A + B;
		
		System.out.println("A+B = " + result);
	}
}

/* ���� ����ÿ��� 
 * System.out.print("A �Է� (0<A<10) : ");
 * System.out.print("B �Է� (0<B<10) : ");
 * System.out.println("A+B = " + result); ���� "A+B = " +  ���� ����� ��
 */
