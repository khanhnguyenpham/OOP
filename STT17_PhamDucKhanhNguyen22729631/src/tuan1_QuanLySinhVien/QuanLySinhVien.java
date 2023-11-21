package tuan1_QuanLySinhVien;

public class QuanLySinhVien 
{
	private int Masv;
	private String Hoten;
	private float diemLT;
	private float diemTH;

	//Them get va set
	public int getMasv() 
	{
		return Masv;
	}
	public void setMasv(int masv) 
	{
		Masv = masv;
	}
	public String getHoten() 
	{
		return Hoten;
	}
	public void setHoten(String hoten) 
	{
		Hoten = hoten;
	}
	public float getDiemLT() 
	{
		return diemLT;
	}
	public void setDiemLT(float diemLT) 
	{
		this.diemLT = diemLT;
	}
	public float getDiemTH() 
	{
		return diemTH;
	}
	public void setDiemTH(float diemTH) 
	{
		this.diemTH = diemTH;
	}

	//Xay dung methods
	//Constructor
	public QuanLySinhVien() 
	{
		super();
	}
	public QuanLySinhVien(int masv, String hoten, float diemLT, float diemTH) 
	{
		super();
		Masv = masv;
		Hoten = hoten;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}


	public float diemTB()
	{
		float dth = this.getDiemTH();
		float dlt = getDiemLT();
		float dtb = (dth + dlt)/2;
		return dtb;
	}


	@Override
	public String toString() {
		String str = String.format("%10d %10s %10.2f %10.2f %10.2f", getMasv(), getHoten(),
				getDiemTH(), getDiemLT(), diemTB());
		return str;
	}








}

