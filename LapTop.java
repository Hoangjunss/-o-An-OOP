

public class LapTop extends SanPham {
    private String Pin;
    private Float CanNang;
    private String WebCam;
    private Float KichThuoc;
    public LapTop(){}
    public LapTop(String Masp, String Tensp, int Sl, long Dongia, String Donvitinh, String Ocung, String Manhinh, String Phim, String Chuot, String Loa, String Pin, Float Cannang, String Webcam, Float Kichthuoc){
        super(Masp, Tensp, Sl, Dongia, Donvitinh, Ocung, Manhinh, Phim, Chuot, Loa);
        this.Pin = Pin;
        this.CanNang = Cannang;
        this.WebCam = Webcam;
        this.KichThuoc = Kichthuoc;
    }
    public LapTop(LapTop LT){
        super((SanPham)LT);
        Pin = LT.Pin;
        CanNang = LT.CanNang;
        WebCam = LT.WebCam;
        KichThuoc = LT.KichThuoc;
    }
    public String getPin(){
        return Pin;
    }
    public void setPin(String Pin){
        this.Pin = Pin;
    }
    public Float getCanNang(){
        return CanNang;
    }
    public void setCanNang(Float Cannang){
        this.CanNang = Cannang;
    }
    public String getWebCam(){
        return WebCam;
    }
    public void setWebCam(String Webcam){
        this.WebCam = Webcam;
    }
    public Float getKichThuoc(){
        return KichThuoc;
    }
    public void setKichThuoc(Float Kichthuoc){
        this.KichThuoc = Kichthuoc;
    }

    @Override public void Nhap(){
        super.Nhap();
        System.out.print("Pin: "); Pin = sc.nextLine();
        System.out.print("Can Nang: "); CanNang = sc.nextFloat();
        System.out.print("WebCam: "); WebCam = sc.nextLine();
        System.out.print("Kich thuoc: "); KichThuoc = sc.nextFloat();
    }
    @Override public void Xuat(){
        System.out.println("*Thong Tin Lap Top*");
        super.Xuat();
        System.out.println("Pin: "+Pin);
        System.out.println("Can Nang: "+CanNang);
        System.out.println("WebCam: "+WebCam);
        System.out.println("Kich Thuoc: "+KichThuoc);
    }
}
