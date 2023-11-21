package tuan1_QuanLySinhVien;

import java.util.Scanner;


public class KiemThuQLSV 
{
	public static void main(String[] args) 
	{
		System.out.println("Chuong trinh quan ly sinh vien: ");

		Scanner scn = new Scanner(System.in);
		System.out.println("  MaSV:    Ho ten:           Diem TH:    Diem LT:   Diem TB:");

		QuanLySinhVien sinhVien1 = new QuanLySinhVien(22729631,"Nguyen Duc Nguyen",9,10);
		System.out.println(sinhVien1);

		QuanLySinhVien sinhVien2 = new QuanLySinhVien(22723532,"Pham Thanh Tung",1,7);
		System.out.println(sinhVien2);

		QuanLySinhVien sinhVien3 = new QuanLySinhVien();

		System.out.println("Nhap ho va ten cua sinh vien: ");
		String SV = scn.nextLine();

		System.out.println("Nhap ma so sinh vien: ");
		int x = scn.nextInt();

		System.out.println("Nhap diem ly thuyet cua sinh vien: ");
		float y = scn.nextInt();

		System.out.println("Nhap diem thuc hanh cua sinh vien: ");
		float z = scn.nextInt();

		sinhVien3.setHoten(SV);
		sinhVien3.setMasv(x);
		sinhVien3.setDiemLT(y);
		sinhVien3.setDiemTH(z);
		System.out.println("   MaSV:       Ho ten:     Diem TH:    Diem LT:   Diem TB:");
		System.out.println(sinhVien3.toString());



	}




}