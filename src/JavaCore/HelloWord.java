package JavaCore;

import java.util.Scanner;

public class HelloWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten cua ban: ");
		String name = scanner.nextLine();
		System.out.println("Nhap tuoi của ban: ");
		int age = scanner.nextInt();
		System.out.println("Nhap so a: ");
		int a = scanner.nextInt();
		System.out.println("Nhap so b: ");
		int b = scanner.nextInt();
		int c = Math.max(a, b);
		System.out.println("Ten cua ban la: " + name + "\ntuoi cua ban la: " + age);
		System.out.println("So len nhat la: " + c);
		scanner.close();
	}
}
