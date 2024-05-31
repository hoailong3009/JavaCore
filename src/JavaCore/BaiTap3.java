package JavaCore;

import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		System.out.println("Lựa chọn của bạn là: ");

		int option = scanner.nextInt();
		switch (option) {
		case 1:
			giaiPhuongTrinhBacNhat();
			break;
		case 2:
			giaiPhuongTrinhBacHai();
			break;
		case 3:
			tinhTienDien();
			break;
		default:
			System.exit(0);
		}
		scanner.close();
	}

	public static void giaiPhuongTrinhBacNhat() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Giải phương trình bậc 1");
		System.out.println("Nhập a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập b: ");
		int b = scanner.nextInt();
		System.out.printf("\nPhương trình bậc nhất là: %dx +%d", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else {
			float x = -b / a;
			System.out.println("\nPhương trình có nghiệm là: " + x);
		}
		scanner.close();
	}

	public static void giaiPhuongTrinhBacHai() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Giải phương trình bậc 2: ");

		System.out.println("Nhập a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập b: ");
		int b = scanner.nextInt();
		System.out.println("Nhập c: ");
		int c = scanner.nextInt();
		System.out.printf("Phương trình bậc hai là: %dx^2 +%dx + %d =0", a, b, c);
		if (a == 0) {
			giaiPhuongTrinhBacNhat();
		} else {
			int delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("\nPhương trình vô nghiệm");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("\nPhương trình có nghiệm kép x= %.3f ", x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / 2 * a;
				double x2 = (-b - Math.sqrt(delta)) / 2 * a;

				System.out.printf("\nPhương trình co 2 nghiệm x1=%.3f, x2=%.3f", x1, x2);
			}
		}
		scanner.close();
	}

	public static void tinhTienDien() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tính tiền điện");
		System.out.println("Nhận số điện: ");
		int x = scanner.nextInt();
		if (x <= 100) {
			int y = x * 1000;
			System.out.println("Số tiền điện là: " + y);
		} else {
			int y = (x * 1000) + (x - 100) * 1500;
			System.out.println("Số tiền điện là: " + y);
		}
		scanner.close();

	}
}
