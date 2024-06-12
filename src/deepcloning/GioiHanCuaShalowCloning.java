package deepcloning;

import java.util.ArrayList;

import deepcloning.vidu03.HoaDon;
import deepcloning.vidu03.SanPham;

public class GioiHanCuaShalowCloning {
	public static void main(String[] args) {
		ArrayList<SanPham> dssp = new ArrayList<SanPham>();
		dssp.add(new SanPham(1, "Nokia"));
		dssp.add(new SanPham(2, "Samsung"));
		HoaDon hd1 = new HoaDon(1, dssp);
		System.out.println(hd1);
		
		
	}
}
