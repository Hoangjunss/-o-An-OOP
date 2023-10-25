import java.util.Scanner;

public class HoaDon {
	 private String maHD;
	    private String NgayLapHoaDon;
	    private String maKH;
	    private String maNV;
	    private int TongTien;

	    public String getmaHD(){
	        return this.maHD;
	    }
	    public void setmaHD(String maHD){
	        this.maHD=maHD;
	    }

	    public String getNgayLapHoaDon(){
	        return this.NgayLapHoaDon;
	    }
	    public void setNgayLapHoaDon(String NgayLapHoaDon){
	        this.NgayLapHoaDon=NgayLapHoaDon;
	    }

	    public String getmaKH(){
	        return this.maKH;
	    }
	    public void setmaKH(String maKH){
	        this.maKH=maKH;
	    }
	    public String getmaNV(){
	        return this.maNV;
	    }
	    public void setmaNV(String maNV){
	        this.maNV=maNV;
	    }

	    public int getTongTien(){
	        return this.TongTien;
	    }
	    public void setTongTien(int TongTien){
	        this.TongTien=TongTien;
	    }
		public void nhap(){
			Scanner sc=new Scanner(System.in);
			System.out.println("***Nhap Thong Tin San Pham***");
			System.out.print("Ma San Pham: "); maHD = sc.nextLine();
			maHD = sc.nextLine();
			System.out.print("RAM: "); NgayLapHoaDon = sc.nextLine();
			System.out.print("ROM: "); maKH = sc.nextLine();
			System.out.print("CPU: "); maNV = sc.nextLine();
			System.out.print("HDD: "); TongTien = sc.nextInt();
        
		}
		public void xuat(){
			System.out.println("--Thong Tin San Pham--");
			System.out.println("Ma: "+maHD);
			System.out.println("RAM: "+NgayLapHoaDon);
			System.out.println("ROM: "+maKH);
			System.out.println("CPU: "+maNV);
			System.out.println("HDD: "+TongTien);
       
		}
}
