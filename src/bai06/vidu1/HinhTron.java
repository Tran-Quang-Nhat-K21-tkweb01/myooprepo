/**
 * 
 */
package bai06.vidu1;

/**
 * 
 */
public class HinhTron implements HinhHoc {
	private double bankinh;
	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.bankinh;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI*this.bankinh*Math.PI*this.bankinh;
	}

	public HinhTron(double bankinh) {
		super();
		this.bankinh = bankinh;
	}

	public double getBankinh() {
		return bankinh;
	}

	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}

	@Override
	public String toString() {
		return "HinhTron [bankinh=" + bankinh + ", toString()=" + super.toString() + "]";
	}
	
	

}
