package Chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTap1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> arrNumber = new ArrayList();

		while (true) {
			System.out.println("Nhap so: ");
			double number = scanner.nextDouble();
			arrNumber.add(number);
			scanner.nextLine();
			System.out.println("Ban co muon nhap nua k? Y or N ???");
			String option = scanner.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}
		System.out.println("Cac so bao gom: " + arrNumber);
		double sum = 0;
		for (int i = 0; i < arrNumber.size(); i++) {
			sum += arrNumber.get(i);
		}
		System.out.println("Tong= " + sum);
		scanner.close();
	}
}
