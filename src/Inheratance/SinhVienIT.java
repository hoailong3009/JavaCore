package Inheratance;

public class SinhVienIT extends SinhVien {

	protected String nganhhoc;

	public SinhVienIT(String nganhhoc, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.nganhhoc = nganhhoc;
	}

	public void getMoney() {
		System.out.println("Run getMoney from SinhVienIT");
		super.info();
	}
}
