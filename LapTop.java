

public class LapTop extends SanPham {
    private String Pin;
    private Float Cannang;
    private String Webcam;
    private Float Kichthuoc;
    public LapTop(){}
    public LapTop(String Masp, String Tensp, int Sl, long Dongia, String Donvitinh, String Ocung, String Manhinh, String Phim, String Chuot, String Loa, String Pin, Float Cannang, String Webcam, Float Kichthuoc){
        super(Masp, Tensp, Sl, Dongia, Donvitinh, Ocung, Manhinh, Phim, Chuot, Loa);
        this.Pin = Pin;
        this.Cannang = Cannang;
        this.Webcam = Webcam;
        this.Kichthuoc = Kichthuoc;
    }
    public LapTop(LapTop LT){
        super((SanPham)LT);
        Pin = LT.Pin;
        Cannang = LT.Cannang;
        Webcam = LT.Webcam;
        Kichthuoc = LT.Kichthuoc;
    }
    public String GetPin(){
        return Pin;
    }
    public void SetPin(String Pin){
        this.Pin = Pin;
    }
    public Float GetCanNang(){
        return Cannang;
    }
    public void SetCanNang(Float Cannang){
        this.Cannang = Cannang;
    }
    public String GetWebCam(){
        return Webcam;
    }
    public void SetWebCam(String Webcam){
        this.Webcam = Webcam;
    }
    public Float GetKichthuoc(){
        return Kichthuoc;
    }
    public void SetKichthuoc(Float Kichthuoc){
        this.Kichthuoc = Kichthuoc;
    }

    @Override public void Nhap(){
        super.Nhap();
        System.out.print("Pin: "); Pin = sc.nextLine();
        System.out.print("Can Nang: "); Cannang = sc.nextFloat();
        System.out.print("WebCam: "); Webcam = sc.nextLine();
        System.out.print("Kich thuoc: "); Kichthuoc = sc.nextFloat();
    }
    @Override public void Xuat(){
        System.out.println("*Thong Tin Lap Top*");
        super.Xuat();
        System.out.println("Pin: "+Pin);
        System.out.println("Can Nang: "+Cannang);
        System.out.println("WebCam: "+Webcam);
        System.out.println("Kich Thuoc: "+Kichthuoc);
    }
}
