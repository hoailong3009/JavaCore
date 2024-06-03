package Chapter6;

public class SinhVien {
	private String masv;
	private String hoten;
	private double diem;
	private int tuoi;

	public SinhVien(String masv, String hoten, double diem, int tuoi) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.diem = diem;
		this.tuoi = tuoi;
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", hoten=" + hoten + ", diem=" + diem + ", tuoi=" + tuoi + "]";
	}

}
