package bai05.baitap;

public class NhanVat {
	private String ten;
	private String id;
	private String gioitinh;
	private double nangluong;
	public NhanVat(String ten, String id, String gioitinh, double nangluong) {
		super();
		this.ten = ten;
		this.id = id;
		this.gioitinh = gioitinh;
		this.nangluong = nangluong;
	}
	@Override
	public String toString() {
		return "NhanVat [ten=" + ten + ", id=" + id + ", gioitinh=" + gioitinh + ", nangluong=" + nangluong + "]";
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public double getNangluong() {
		return nangluong;
	}
	public void setNangluong(double nangluong) {
		this.nangluong = nangluong;
	}
	
	public void hanhdong() {
		System.out.println(" ... ");
	}
	
	public void sucmanh() {
		System.out.println(" ... ");
	}
}
