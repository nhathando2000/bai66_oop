package donguyennhathan.com.test;

import donguyennhathan.com.model.NhanVien;

public class TestNV {

	public static void main(String[] args) {
		NhanVien nv1= new NhanVien(1, "Obama");
		NhanVien nv2= new NhanVien(2, "Putin");
		nv1=nv2;
		nv2.setTen("Kim Jong Un");
		System.out.println("Tên của Nhân Viên 1= "+nv1.getTen());
		nv1.setTen("Hồ Cảm Đào");
		System.out.println("Tên của Nhân Viên 2= "+nv2.getTen());
		NhanVien nv3= new NhanVien(3,"Thanh");
		NhanVien nv4= new NhanVien(4,"Hùng");
		nv3=nv4.copy();
		System.out.println("Tên của Nhân Viên 3= "+nv3.getTen());
		nv4.setTen("Tèo");
		System.out.println("Tên của Nhân Viên 3= "+nv3.getTen()); // 2 ô nhớ đọc lập
		nv3.setTen("Hàn");
		System.out.println("Tên của Nhân Viên 4= "+nv4.getTen());
	}

}
