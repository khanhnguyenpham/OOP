package tuan4_PhongHoc;


import java.util.ArrayList;

public interface PhuongThuc_DanhSach {
	ArrayList<PhongHoc> getPhong();
	boolean them();
	int timKiemViTri();
	PhongHoc timKiem();
	void sortDienTich();
	void sortDayNha();
	void sortSoBongDen();
	void xoa();
	int tongSoPhong();
	PhongHocArray layDsPhong60May() throws Exception;
	boolean capNhatSoMayTinh();
	ArrayList<PhongHoc> layDsDatChuan() throws Exception;
	int timKiemViTri(int maPhong);
}