package bai05.baitap.quanlynhanvat;

import bai05.baitap.KyBinh;

public class GameHanhDong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KyBinh kb = new KyBinh("Adventure", "DISNEY","nam", 150, true, false, false, false);
		System.out.println(kb);
		kb.hanhdong();
		kb.sucmanh();
	}
}
