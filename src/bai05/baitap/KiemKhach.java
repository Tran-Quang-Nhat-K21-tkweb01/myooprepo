package bai05.baitap;

public class KiemKhach extends NhanVat {
	private int sokiem;
	private int capdosudung;
	
	public KiemKhach(String ten, String id, String gioitinh, double nangluong, int sokiem, int capdosudung) {
		super(ten, id, gioitinh, nangluong);
		this.sokiem = sokiem;
		this.capdosudung = capdosudung;
	}
	public int getSokiem() {
		return sokiem;
	}
	public void setSokiem(int sokiem) {
		this.sokiem = sokiem;
	}
	public int getCapdosudung() {
		return capdosudung;
	}
	public void setCapdosudung(int capdosudung) {
		this.capdosudung = capdosudung;
	}
	@Override
	public String toString() {
		return "KiemKhach [sokiem=" + sokiem + ", capdosudung=" + capdosudung + "]";
	}
	@Override
	public void hanhdong() {
		// TODO Auto-generated method stub
		System.out.println("Vung kiem chem");
	}
	@Override
	public void sucmanh() {
		// TODO Auto-generated method stub
		double energy = this.getNangluong()*1.5;
		System.out.println("Suc manh cua kiem khach la: " + energy);
	}
	
	
	
}
