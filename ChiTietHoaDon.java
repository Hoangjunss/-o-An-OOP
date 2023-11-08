import java.util.Scanner;

public class ChiTietHoaDon {
	 private String maHD;
	    private String maSP;
	    private int SoLuong;
	    private int DonGia;
	    private int ThanhTien;

		Scanner sc=new Scanner(System.in);

	    public String getMaHD(){
	        return this.maHD;
	    }
	    public void setMaHD(String maHD){
	        this.maHD=maHD;
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
			System.out.print("Ma San Pham: "); maSP = sc.nextLine();
			maSP = sc.nextLine();
			System.out.print("Ma Hoa Don: "); maHD = sc.nextLine();
			System.out.print("So luong: "); SoLuong = sc.nextInt();
			System.out.print("Don Gia: "); DonGia = sc.nextInt();
			System.out.print("Thanh Tien: "); ThanhTien = sc.nextInt();
        
		}
		public void xuat(){
			System.out.println("--Thong Tin San Pham--");
			System.out.println("Ma: "+maSP);
			System.out.println("RAM: "+maHD);
			System.out.println("ROM: "+SoLuong);
			System.out.println("CPU: "+DonGia);
			System.out.println("HDD: "+ThanhTien);
       
		}
}
