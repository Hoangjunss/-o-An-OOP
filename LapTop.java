

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
    public String GetPin(){
        return Pin;
    }
    public void SetPin(String Pin){
        this.Pin = Pin;
    }
    public Float GetCanNang(){
        return CanNang;
    }
    public void SetCanNang(Float Cannang){
        this.CanNang = Cannang;
    }
    public String GetWebCam(){
        return WebCam;
    }
    public void SetWebCam(String Webcam){
        this.WebCam = Webcam;
    }
    public Float GetKichThuoc(){
        return KichThuoc;
    }
    public void SetKichThuoc(Float Kichthuoc){
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
