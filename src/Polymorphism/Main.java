package Polymorphism;

public class Main {

	public static void main(String[] args) {

		SinhVien it1 = new SinhVienIT(10, 9);
		System.out.println("Điểm sinh viên IT: " + it1.getDiem());

		SinhVien ck1 = new SinhVienCoKhi(10, 7);
		System.out.println("Điểm sinh viên cơ khí: " + ck1.getDiem());

	}

}
