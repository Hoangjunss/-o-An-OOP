

public class MayTinh extends SanPham {
    private String LoaiCase;
    private int Slkhecam;
    public MayTinh(){}
    public MayTinh(String Masp, String Tensp, int Sl, long Dongia, String Donvitinh, String Ocung, String Manhinh, String Phim, String Chuot, String Loa, String LoaiCase, int Slkhecam){
        super(Masp, Tensp, Sl, Dongia, Donvitinh, Ocung, Manhinh, Phim, Chuot, Loa);
        this.LoaiCase = LoaiCase;
        this.Slkhecam = Slkhecam;
    }
    public MayTinh(MayTinh MT){
        super((SanPham)MT);
        LoaiCase = MT.LoaiCase;
        Slkhecam = MT.Slkhecam;
    }
    public String GetLoaiCASE(){
        return LoaiCase;
    }
    public void SetLoaiCASE(String LoaiCase){
        this.LoaiCase = LoaiCase;
    }
    public int GetSlkhecam(){
        return Slkhecam;
    }
    public void SetSlkhecam(int Slkhecam){
        this.Slkhecam = Slkhecam;
    }

    @Override public void Nhap(){
        super.Nhap();
        System.out.print("Loai CASE: "); LoaiCase = sc.nextLine();
        System.out.print("So luong khe cam: "); Slkhecam = sc.nextInt();
    }
    @Override public void Xuat(){
        System.out.println("*Thong Tin May Tinh*");
        super.Xuat();
        System.out.println("Loai CASE: "+LoaiCase+" | So luong khe cam: "+Slkhecam);
    }

}
