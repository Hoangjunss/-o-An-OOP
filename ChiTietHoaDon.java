import java.util.Scanner;

public class ChiTietHoaDon extends HoaDon {
	
	    private String maSP;
	    private int SoLuong;
	    private int DonGia;
	    private int ThanhTien;

		Scanner sc=new Scanner(System.in);
		public ChiTietHoaDon(){}
		public ChiTietHoaDon(String maHD, String NgayLapHoaDon, String maKH,String maNV, int TongTien,String maSP,int SoLuong,int DonGia,int ThanhTien){
			super(maHD, NgayLapHoaDon, maKH, maNV, TongTien);
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
			maSP = sc.nextLine();
	
			System.out.print("So luong: "); SoLuong = sc.nextInt();
			System.out.print("Don Gia: "); DonGia = sc.nextInt();
			System.out.print("Thanh Tien: "); ThanhTien = sc.nextInt();
        
		}
		public void xuat(){
			System.out.println("--Thong Tin San Pham--");
			super.xuat();
			System.out.println("Ma: "+maSP);
			System.out.println("ROM: "+SoLuong);
			System.out.println("CPU: "+DonGia);
			System.out.println("HDD: "+ThanhTien);
       
		}
}
