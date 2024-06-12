package bai09.vidu01;
import bai09.vidu01.LopHoc;
public class SinhVien {
	private String hoten;
	private LopHoc lopHoc;
	/**
	 * @param hoten
	 * @param lopHoc
	 */
	public SinhVien(String hoten, LopHoc lopHoc) {
		super();
		this.hoten = hoten;
		this.lopHoc = lopHoc;
	}
	/**
	 * @return the hoten
	 */
	public String getHoten() {
		return hoten;
	}
	/**
	 * @param hoten the hoten to set
	 */
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	/**
	 * @return the lopHoc
	 */
	public LopHoc getLopHoc() {
		return lopHoc;
	}
	/**
	 * @param lopHoc the lopHoc to set
	 */
	public void setLopHoc(LopHoc lopHoc) {
		this.lopHoc = lopHoc;
	}
	@Override
	public String toString() {
		return "SinhVien [hoten=" + hoten + ", lopHoc=" + lopHoc + "]";
	}
	
}
