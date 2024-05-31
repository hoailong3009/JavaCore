package Chapter2;

public class Lab {

	public static void main(String[] args) {
		Product test = new Product();

		Product pr1 = test.nhapThongTin("apple", 200, 0.1);
		test.xuatThongTin(pr1);
		System.out.println("tax= " + test.getTexPrice(pr1.getPrice(), pr1.getTax()));
	}

}
