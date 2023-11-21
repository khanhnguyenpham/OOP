package tuan1_HinhChuNhat;

public class HinhChuNhat 
{
	private int chieuDai;// Khai bao chieu dai hinh chu nhat
	private int chieuRong;// Khai bao chieu rong hinh chu nhat
	
	
	// Them get va set cho chieu dai
	public int getChieuDai() 
	{
		return chieuDai;
	}

	public void setChieuDai(int cDai) 
	{
		this.chieuDai = cDai;
	}
	
	// Them get va set cho chieu rong
	public int getChieuRong() 
	{
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) 
	{
		this.chieuRong = chieuRong;
	}

	//Xay dung methods
	//Constructor
	public HinhChuNhat() 
	{
		super();
	}

	// Constructor voi tham so
	public HinhChuNhat(int cDai, int chieuRong) 
	{
		super();
		this.chieuDai = cDai;
		this.chieuRong = chieuRong;
	}
	// Tinh chu vi hinh chu nhat
	public int chuVi()
	{
		int cd = this.getChieuDai();
		int cr = getChieuRong();
		int cv = (cd+cr)*2;
		return cv;

	}
	// Tinh dien tich chu nhat
	public long dienTich()
	{
		int cd = this.getChieuDai();
		int cr = getChieuRong();
		int dt = (cd*cr);
		return dt;
	}
	
	@Override
	public String toString() 
	{
		String str = String.format("%10d %10d %10d %10d", getChieuDai(), getChieuRong(),
				chuVi(), dienTich());
			
		return str;
	}








}
