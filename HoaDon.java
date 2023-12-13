import java.io.Serializable;
import java.util.Scanner;

public abstract class HoaDon implements Serializable {
	 	public static String txt;
    	protected String maHD;
	    protected String NgayLapHoaDon;
	    protected String maKH;
	    protected String maNV;
		Scanner sc=new Scanner(System.in);
		public HoaDon(){}
    public HoaDon(String maHD, String NgayLapHoaDon, String maKH,String maNV){
        this.maHD =maHD;
        this.NgayLapHoaDon = NgayLapHoaDon;
        this.maKH = maKH;
        this.maNV = maNV;
    }
    public HoaDon(HoaDon HD){
        maHD =HD.maHD;
       	NgayLapHoaDon= HD.NgayLapHoaDon;
        maKH = HD.maKH;
       	maNV = HD.maNV;
    }

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

	public abstract void Nhap();
	public abstract void Xuat();	
}
