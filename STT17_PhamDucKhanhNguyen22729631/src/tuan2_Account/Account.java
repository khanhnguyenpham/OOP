package tuan2_Account;


public class Account 
{
	//Khai báo thông tin
	private long soTK;
	private String tenTK;
	private double soTienTrongTK;
	private final double LAISUAT = 0.035;
	//Thêm get và set
	public long getSoTK() 
	{
		return soTK;
	}
	public void setSoTK(long soTK) 
	{
		this.soTK = soTK;
	}
	public String getTenTK() 
	{
		return tenTK;
	}
	public void setTenTK(String tenTK) 
	{
		this.tenTK = tenTK;
	}
	public double getSoTienTrongTK() 
	{
		return soTienTrongTK;
	}
	public void setSoTienTrongTK(double soTienTrongTK) 
	{
		this.soTienTrongTK = soTienTrongTK;
	}
	// Xây dựng method
	// Contructor
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(long soTK, String tenTK, double soTienTrongTK) {
		super();
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.soTienTrongTK = soTienTrongTK;
	}
	
	public Account(long soTK, String tenTK) {
		super();
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.soTienTrongTK = 50000;
	}
	
	public void napTienTaiKhoan(double tienThemVao) throws Exception
	{
		if (tienThemVao>0)
		{
			this.soTienTrongTK+= tienThemVao;
		}
		else 
			throw new Exception("Tiền Nạp Phải >0");
	}
	
	
	public void rutTienTaiKhoan(double tienRutRa, double phiRutTien)
	{
		if (tienRutRa>0&& this.soTienTrongTK-phiRutTien>50000)
		{
			this.soTienTrongTK-=(tienRutRa+phiRutTien);
		}
	}
	
	public boolean chuyenKhoan(Account nguoiNhan,double soTienChuyen) throws Exception
	{
		if (soTienChuyen > 0&& this.soTienTrongTK-soTienChuyen-(soTienChuyen*0.003)>50000)
		{
			this.rutTienTaiKhoan(soTienChuyen, soTienChuyen*0.003);
			nguoiNhan.napTienTaiKhoan(soTienChuyen);
			return true;
		}
		return false;
	}

	public void daohan()
	{
		this.soTienTrongTK+=(this.soTienTrongTK*LAISUAT);
	}
	@Override
	public String toString() {
		String str= String.format("%20d %-30s %-20.2f",getSoTK(),getTenTK(),getSoTienTrongTK());
		return str;
	}
	
	
	
	
	
	
}
