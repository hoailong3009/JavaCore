package Inheratance;

public class SinhVien {
	protected String id;
	protected String name;
	protected double price;
	protected double tax;

	public SinhVien(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public void info() {
		System.out.println("info form SinhVien");
	}

}
