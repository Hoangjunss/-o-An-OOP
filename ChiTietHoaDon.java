import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ChiTietHoaDon extends HoaDon {
	
	    private String maSP;
	    private int SoLuong;
	    private long DonGia;
	    private long ThanhTien;

		Scanner sc=new Scanner(System.in);
		public ChiTietHoaDon(){}
		public ChiTietHoaDon(String maHD, String NgayLapHoaDon, String maKH,String maNV,String maSP,int SoLuong,long DonGia,long ThanhTien){
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
	    public long getDonGia(){
	        return this.DonGia;
	    }
	    public void setDonGia(long DonGia){
	        this.DonGia=DonGia;
	    }
	    public long getThanhTien(){
	        return this.ThanhTien;
	    }
	    public void setThanhTien(long ThanhTien){
	        this.ThanhTien=ThanhTien;
	    }
		@Override
		public void Nhap(){
			System.out.println("***NHAP THONG TIN HOA DON***");
			System.out.print("Ma Hoa Don "); maHD = sc.nextLine();
			System.out.print("Ngay Lap Hoa Don(DD/MM/YYYY): "); NgayLapHoaDon = sc.nextLine();
			System.out.print("Ma Khach Hang: "); maKH = sc.nextLine();
			System.out.print("Ma Nhan Vien: "); maNV = sc.nextLine();
			System.out.print("Ma San Pham: "); maSP = sc.nextLine();
			System.out.print("So luong: "); SoLuong = sc.nextInt();
			System.out.print("Don Gia: "); DonGia = sc.nextLong();
			System.out.print("Thanh Tien: "); ThanhTien = sc.nextLong();
			
		}
		@Override
		public void Xuat(){
			System.out.format("| %10s | %20s | %15s | %15s | %8s | %8s | %10s | %10s ||\n", maHD, NgayLapHoaDon, maKH, maNV, maSP, SoLuong, DonGia, ThanhTien);
		}
		public void GhiFile(String filename) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename, Boolean.TRUE));
		dos.writeUTF(maHD);
		dos.writeUTF(NgayLapHoaDon);
		dos.writeUTF(maKH);
		dos.writeUTF(maNV);
		dos.writeUTF(maSP);
		dos.writeInt(SoLuong);
		dos.writeLong(DonGia);
		dos.writeLong(ThanhTien);
		dos.close();
	}
}

