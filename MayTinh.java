import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
    public String getMaSP(){
        return maSP;
    }
    public void setMaSP(String MaSP){
        this.maSP = MaSP;
    }
    public String getTenSP(){
        return  tenSP;
    }
    public void setTenSP(String TenSP){
        this.tenSP = TenSP;
    }
    public int getSl(){
        return Sl;
    }
    public void setSl(int Sl){
        this.Sl = Sl;
    }
    public long getDonGia(){
        return DonGia;
    }
    public void setDonGia(long Dongia){
        this.DonGia = Dongia;
    }
    public String getDonViTinh(){
        return DonViTinh;
    }
    public void setDonViTinh(String Donvitinh){
        this.DonViTinh = Donvitinh;
    }
    public String getOCung(){
        return OCung;
    }
    public void setOCung(String Ocung){
        this.OCung = Ocung;
    }
    public String getManHinh(){
        return ManHinh;
    }
    public void setManHinh(String Manhinh){
        this.ManHinh = Manhinh;
    }
    public String getPhim(){
        return Phim;
    }
    public void setPhim(String Phim){
        this.Phim = Phim;
    }
    public String getChuot(){
        return Chuot;
    }
    public void setChuot(String Chuot){
        this.Chuot = Chuot;
    }
    public String getLoa(){
        return Loa;
    }
    public void setLoa(String Loa){
        this.Loa = Loa;
    }
    public String getLoaiCASE(){
        return LoaiCase;
    }
    public void setLoaiCASE(String LoaiCase){
        this.LoaiCase = LoaiCase;
    }
    public int getSlkhecam(){
        return Slkhecam;
    }
    public void setSlkhecam(int Slkhecam){
        this.Slkhecam = Slkhecam;
    }

    @Override public void Nhap(){
        super.Nhap();
        System.out.print("Loai CASE: "); LoaiCase = sc.nextLine();
        System.out.print("So luong khe cam: "); Slkhecam = sc.nextInt();
    }
    @Override public void Xuat(){
        System.out.format("|| %7s | %17s | %3s | %8s | %10s | %10s | %17s | %10s | %17s | %10s | %10s | %10s ||\n",maSP, tenSP, Sl, DonGia, DonViTinh, OCung, ManHinh, Phim, Chuot, Loa, LoaiCase, Slkhecam); 
    }

    public void sua(MayTinh mt){
        super.sua(mt);
        System.out.print("Loai CASE: "); LoaiCase = sc.nextLine(); mt.setLoaiCASE(LoaiCase);
        System.out.print("So luong khe cam: "); Slkhecam = sc.nextInt(); mt.setSlkhecam(Slkhecam);
        
    }

    public void GhiFile(String filename) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename, Boolean.TRUE));
        dos.writeUTF(maSP);
        dos.writeUTF(tenSP);
        dos.writeInt(Sl);
        dos.writeLong(DonGia);
        dos.writeUTF(DonViTinh);
        dos.writeUTF(OCung);
        dos.writeUTF(ManHinh);
        dos.writeUTF(Phim);
        dos.writeUTF(Chuot);
        dos.writeUTF(Loa);
        dos.writeUTF(LoaiCase);
        dos.writeInt(Slkhecam);
        dos.close();
	}

}
