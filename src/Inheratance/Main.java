package Inheratance;

public class Main {

	public static void main(String[] args) {
		SinhVienIT sv = new SinhVienIT("IT", "01", "Long", 100, 0.1);
		System.out.println("Thông tin sinh viên IT: " + sv.name);

		SinhVienCoKhi sv1 = new SinhVienCoKhi("CoKhi", "02", "Nam", 100, 0.1);
		System.out.println("Thông tin sinh viên IT: " + sv1.name);
		sv.getMoney();
	}

}
