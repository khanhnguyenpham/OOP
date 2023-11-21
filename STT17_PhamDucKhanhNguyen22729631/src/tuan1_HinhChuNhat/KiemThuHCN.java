package tuan1_HinhChuNhat;

import java.util.Scanner;


public class KiemThuHCN 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Chuong trinh xu ly hinh chu nhat");
		
		System.out.println("Chuong trinh: ");
		int opt;
		
		do {
			opt = menu();
			switch(opt)
			{
			case 1:
			{	
				xuatTieuDeCot();// Xuat tieu de cot
				nhapCung();// Nhap va xuat thong tin hinh chu nhat nhap san
				break;
			}
			case 2:
			{
				HinhChuNhat cn1 = nhapMem();// Nhap thong tin tu nguoi dung
				xuatTieuDeCot();// Xuat tieu de cot
				System.out.println(cn1);// Xuat thong tin hinh chu nhat vua nhap
				break;

			}
			case 3:
			{
				System.out.println("Good bye");// Thoat chuong trinh
				break;

			}
			}
			}while(opt != 3);

		}
	
	static void nhapCung()
	{
		HinhChuNhat cn2 = new HinhChuNhat(10,20);// Tao doi tuong hinh chu nhat voi chieu dai va chieu rong co dinh
		System.out.println(cn2);
		HinhChuNhat cn3 = new HinhChuNhat(10,6);// Tao doi tuong hinh chu nhat khac
		System.out.println(cn3);
	}
	static HinhChuNhat nhapMem()
	{
		int cr=nhapSoNguyen("Nhap chieu rong: ");// Nhap chieu rong tu nguoi dung
		int cd=nhapSoNguyen("Nhập chieu dai: ");// Nhap chieu dai tu nguoi dung
		HinhChuNhat cn1 = new HinhChuNhat();// Tao doi tuong hinh chu nhat moi
		cn1.setChieuDai(cd);// Dat chieu dai cho doi tuong
		cn1.setChieuRong(cr);// Dat chieu rong cho doi tuong
		return cn1;// Tra ve doi tuong hinh chu nhat vua nhap
	}

	static int nhapSoNguyen(String str)
	{
		int x;
		System.out.println(str);
		Scanner scn = new Scanner(System.in);
		x = scn.nextInt(); // Nhap mot so nguyen tu nguoi dung
		return x;
	}
	static void xuatTieuDeCot()
	{
		System.out.println("  Chieu dai"+"  Chieu rong"+"   Chu vi"+"   Dien tich");
	}

	public static int menu()
	{
		int chon;

		System.out.println("*****Menu*****\n"
				+ "1.Nhap cung\n"
				+ "2.Nhap mem\n"
				+ "3.Thoat");

		chon = nhapSoNguyen("Moi ban chon: ");// Nhap lua chon tu nguoi dung
		return chon;// Tra ve lua chon
	}
	




	}
