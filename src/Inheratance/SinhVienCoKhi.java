package Inheratance;

public class SinhVienCoKhi extends SinhVien {

	protected String nganhhoc;

	public SinhVienCoKhi(String nganhhoc, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.nganhhoc = nganhhoc;
	}
}
