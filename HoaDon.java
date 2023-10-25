package đoan;

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
}
