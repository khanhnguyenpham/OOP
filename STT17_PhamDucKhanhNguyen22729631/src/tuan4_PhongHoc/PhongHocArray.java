package tuan4_PhongHoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhongHocArray implements PhuongThuc_DanhSach {
	ArrayList<PhongHoc> dS;
	public PhongHocArray () {
		dS = new ArrayList<PhongHoc>();
	}
	
	public ArrayList<PhongHoc> getPhong(){
		return dS;
	}
	
	public boolean them(PhongHoc p) throws Exception {
		if(dS.contains(p) == false)
			dS.add(p);
		else 
			throw new Exception("ma phong hoc da trung");
		return false;
	}
	
	public ArrayList<PhongHoc> getDSPLyThuyet(){
		ArrayList<PhongHoc> DSPLyThuyet = new ArrayList<PhongHoc>();
		for(PhongHoc p : dS)
			if(p instanceof LyThuyet)
				DSPLyThuyet.add((LyThuyet)p);
		return DSPLyThuyet;
	}
	
	public ArrayList<PhongHoc> getDSPMayTinh(){
		ArrayList<PhongHoc> DSPMayTinh = new ArrayList<PhongHoc>();
		for(PhongHoc p : dS)
			if(p instanceof MayTinh)
				DSPMayTinh.add((MayTinh)p);
		return DSPMayTinh;
	}
	
	public ArrayList<PhongHoc> getDSPThiNghiem(){
		ArrayList<PhongHoc> DSPThiNghiem = new ArrayList<PhongHoc>();
		for(PhongHoc p : dS)
			if(p instanceof ThiNghiem)
				DSPThiNghiem.add((ThiNghiem)p);
		return DSPThiNghiem;
	}
	@Override
	public int timKiemViTri(int maPhong) {
		PhongHoc findP = timKiem(maPhong);
		if (findP != null)
			return dS.indexOf(maPhong);
		return -1;
	}
	
	public PhongHoc timKiem (int maPhong) {
		for(PhongHoc p : dS)
			if(p.getMaPhong() == maPhong)
				return p;
		return null;
	}
	
	public void sortDienTich() {
		Collections.sort(dS, new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc p1, PhongHoc p2) {
				// TODO Auto-generated method stub
				Double dT1 = (Double) p1.getDienTich();
				Double dT2 = (Double) p2.getDienTich();
				return dT1.compareTo(dT2);
			}
		});
	}
	
	public void sortDayNha() {
		Collections.sort(dS, new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc p1, PhongHoc p2) {
				// TODO Auto-generated method stub
				String dN1 = (String) p1.getDayNha();
				String dN2 = (String) p2.getDayNha();
				return dN1.compareToIgnoreCase(dN2);
			}
		});
	}
	
	public void sortSoBongDen() {
		Collections.sort(dS, new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc p1, PhongHoc p2) {
				// TODO Auto-generated method stub
				Integer b1 = (Integer) p1.getSoBongDen();
				Integer b2 = (Integer) p2.getSoBongDen();
				return b1.compareTo(b2);
			}
		});
	}
	public void xoa(PhongHoc p) {
		dS.remove(p);
	}
	
	public int tongSoPhong() {
		return dS.size();
	}
	public PhongHocArray layDsPhong60May() throws Exception {
		PhongHocArray kq = new PhongHocArray();
		for (PhongHoc p : dS) {
			if (p instanceof MayTinh)
				if(((MayTinh) p).getSoMayTinh() == 60) {
				kq.them(p);
			}
		}
		return kq;
	}
	public boolean capNhatSoMayTinh(int maPhong, int soMayTinh) {
		for (PhongHoc p : dS) {
			if (p instanceof MayTinh) {
				if (p.getMaPhong() == maPhong) {
					((MayTinh) p).setSoMayTinh(soMayTinh);;
					return true;
				}
			}
		}
		return false;
	}
	
	public ArrayList<PhongHoc> layDsDatChuan() throws Exception {
		ArrayList<PhongHoc> kq = new ArrayList<PhongHoc>();
		for (PhongHoc p : dS) {
			if(p.datChuan())
				kq.add(p);
		}
		return kq;
	}

	@Override
	public boolean them() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int timKiemViTri() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PhongHoc timKiem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void xoa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean capNhatSoMayTinh() {
		// TODO Auto-generated method stub
		return false;
	}
}