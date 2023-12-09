import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ChiTietHoaDon extends HoaDon {

	    private String maSP;
	    private int SoLuong;
	    private int DonGia;
	    private int ThanhTien;

		Scanner sc=new Scanner(System.in);
		public ChiTietHoaDon(){}
		public ChiTietHoaDon(String maHD, String NgayLapHoaDon, String maKH,String maNV,String maSP,int SoLuong,int DonGia,int ThanhTien){
			super(maHD, NgayLapHoaDon, maKH, maNV);
			this.maSP=maSP;
			this.SoLuong=SoLuong;
			this.DonGia=DonGia;
			this.ThanhTien=ThanhTien;
			
		}
		public ChiTietHoaDon(ChiTietHoaDon CTHD){
		super((HoaDon)CTHD);
		maSP=CTHD.maSP;
		SoLuong=CTHD.SoLuong;
		DonGia=CTHD.DonGia;
		ThanhTien=CTHD.ThanhTien;
		   
		}

	  
	    public String getMaSP(){
	        return this.maSP;
	    }
	    public void setMaSP(String maSP){
	        this.maSP=maSP;
	    }
	    public int getSoLuong(){
	        return this.SoLuong;
	    }
	    public void setSoLuong(int SoLuong){
	        this.SoLuong=SoLuong;
	    }
	    

	    public int getDonGia(){
	        return this.DonGia;
	    }
	    public void setDonGia(int DonGia){
	        this.DonGia=DonGia;
	    }

	    public int getThanhTien(){
	        return this.ThanhTien;
	    }
	    public void setThanhTien(int ThanhTien){
	        this.ThanhTien=ThanhTien;
	    }
		public void nhap(){
			System.out.println("***Nhap Thong Tin Hoa Don***");
			super.nhap();
			System.out.print("Ma San Pham: "); maSP = sc.nextLine();
			System.out.print("So luong: "); SoLuong = sc.nextInt();
			System.out.print("Don Gia: "); DonGia = sc.nextInt();
			System.out.print("Thanh Tien: "); ThanhTien = sc.nextInt();
        
		}
		public void xuat(){
			System.out.println("--Thong Tin San Pham--");
			super.xuat();
			System.out.println("Ma San Pham: "+maSP);
			System.out.println("So luong: "+SoLuong);
			System.out.println("Don Gia: "+DonGia);
			System.out.println("ThanhTien: "+ThanhTien);
       
		}
		public void GhiFile(String filename) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename, Boolean.TRUE));
		dos.writeUTF(super.getmaHD());
		dos.writeUTF(super.getNgayLapHoaDon());
		dos.writeUTF(super.getmaKH());
		dos.writeUTF(super.getmaNV());
		dos.writeUTF(maSP);
		dos.writeInt(SoLuong);
		dos.writeInt(DonGia);
		dos.writeInt(ThanhTien);
		dos.close();
	}
}
