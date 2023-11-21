package tuan1_DangKyXe;

import java.util.Scanner;


public class KiemThuDangKyXe 
{

	public static void main(String[] args) 
	{
		System.out.println("Chuong trinh dang ky xe: ");

		int opt;
		xuatTieuDeCot();
		DangKyXe xe1 = new DangKyXe();
		DangKyXe xe2 = new DangKyXe();
		DangKyXe xe3 = new DangKyXe();

		do {
			opt = menu();
			switch(opt)
			{
			case 1:
			{	
				xe1 = nhapXe1();
				xe2 = nhapXe2();
				xe3 = nhapXe3();

				break;
			}
			case 2:
			{
				xuatTieuDeCot();
				System.out.println(xe1);
				System.out.println(xe2);
				System.out.println(xe3);
				break;

			}
			case 3:
			{
				System.out.println("Good bye");
				break;

			}
			}
		}while(opt != 3);

	}

	static int nhapSoNguyen(String str)
	{
		int x;
		System.out.println(str);
		Scanner scn = new Scanner(System.in);
		x = scn.nextInt(); 
		return x;
	}

	static String nhapChuoi(String str)
	{
		String chuoi;
		System.out.println(str);
		Scanner strg = new Scanner(System.in);
		chuoi = strg.nextLine();
		return chuoi;
	}

	static void xuatTieuDeCot()
	{
		System.out.println("  Ten chu xe "+"  Loai xe"+"   Dung tich"+"   Tri gia" + "   Thue phai nop");
	}

	public static int menu()
	{
		int chon;

		System.out.println("*****Menu*****\n"
				+ "1.Nhap thong tin xe\n"
				+ "2.Xuat bang ke khai tien thue truoc ba cua cac xe\n"
				+ "3.Thoat");

		chon = nhapSoNguyen("Moi ban chon: ");// 
		return chon;
	}

	static DangKyXe nhapXe1()
	{
		String ten = nhapChuoi("Nhap ten chu xe 1: ");
		String xe = nhapChuoi("Nhap ten xe 1: ");
		int dt = nhapSoNguyen("Nhap dung tich xe 1: ");
		int tien = nhapSoNguyen("Nhap gia tri xe 1: ");
		DangKyXe xe1 = new DangKyXe();
		xe1.setHoTen(ten);
		xe1.setLoaiXe(xe);
		xe1.setDungTich(dt);
		xe1.setTriGia(tien);
		return xe1;

	}
	static DangKyXe nhapXe2()
	{
		String ten = nhapChuoi("Nhap ten chu xe 2: ");
		String xe = nhapChuoi("Nhap ten xe 2: ");
		int dt = nhapSoNguyen("Nhap dung tich xe 2: ");
		int tien = nhapSoNguyen("Nhap gia tri xe 2: ");
		DangKyXe xe2 = new DangKyXe();
		xe2.setHoTen(ten);
		xe2.setLoaiXe(xe);
		xe2.setDungTich(dt);
		xe2.setTriGia(tien);
		return xe2;

	}
	static DangKyXe nhapXe3()
	{
		String ten = nhapChuoi("Nhap ten chu xe 3: ");
		String xe = nhapChuoi("Nhap ten xe 3: ");
		int dt = nhapSoNguyen("Nhap dung tich xe 3: ");
		int tien = nhapSoNguyen("Nhap gia tri xe 3: ");
		DangKyXe xe3 = new DangKyXe();
		xe3.setHoTen(ten);
		xe3.setLoaiXe(xe);
		xe3.setDungTich(dt);
		xe3.setTriGia(tien);
		return xe3;

	}



}
