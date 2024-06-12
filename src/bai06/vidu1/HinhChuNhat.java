package bai06.vidu1;

public class HinhChuNhat implements HinhHoc {
	
	private double chieudai;
	private double chieurong;
	
	
	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 0;
	}

	public HinhChuNhat(double chieudai, double chieurong) {
		super();
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getChieudai() {
		return chieudai;
	}

	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}

	public double getChieurong() {
		return chieurong;
	}

	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}

	@Override
	public String toString() {
		return "HinhChuNhat [chieudai=" + chieudai + ", chieurong=" + chieurong + ", toString()=" + super.toString()
				+ "]";
	}
	

}
