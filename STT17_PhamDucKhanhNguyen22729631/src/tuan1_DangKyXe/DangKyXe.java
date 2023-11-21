package tuan1_DangKyXe;

public class DangKyXe 
{
	private String hoTen;
	private String loaiXe;
	private int dungTich;
	private int triGia;

	//Them get va set
	public String getHoTen() 
	{
		return hoTen;
	}
	public void setHoTen(String hoTen) 
	{
		this.hoTen = hoTen;
	}
	public String getLoaiXe() 
	{
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) 
	{
		this.loaiXe = loaiXe;
	}
	public int getDungTich() 
	{
		return dungTich;
	}
	public void setDungTich(int dungTich) 
	{
		this.dungTich = dungTich;
	}
	public int getTriGia() {
		return triGia;
	}
	public void setTriGia(int triGia) 
	{
		this.triGia = triGia;
	}

	//Xay dung methods
	//Constructor

	public DangKyXe() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public DangKyXe(String hoTen, String loaiXe, int dungTich, int triGia) {
		super();
		this.hoTen = hoTen;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
	}


	public int thueXe()
	{
		int x;
		if(this.getDungTich() >= 200)
		{
			x = (getTriGia()/ 100)*5;
		}
		else if (getDungTich() >= 100)
		{
			x = (getTriGia()/ 100)*3;
		}
		else
		{
			x = (getTriGia()/ 100)*1;
		}
		return x;
	}

	@Override
	public String toString() {
		String str = String.format("%10s %10s %10d %10d %10d", getHoTen(), getLoaiXe(),
				getDungTich(), getTriGia(), thueXe());
		return str;
	}





}
