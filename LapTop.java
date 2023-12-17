import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LapTop extends SanPham {
    private String Pin;
    private double CanNang;
    private double KichThuoc;
    public LapTop(){}
    public LapTop(String Masp, String Tensp, int Sl, long Dongia, String Donvitinh, String Ocung, String Manhinh, String Phim, String Chuot, String Loa, String Pin, double d, double e){
        super(Masp, Tensp, Sl, Dongia, Donvitinh, Ocung, Manhinh, Phim, Chuot, Loa);
        this.Pin = Pin;
        this.CanNang = d;
        this.KichThuoc = e;
    }
    public LapTop(LapTop LT){
        super((SanPham)LT);
        Pin = LT.Pin;
        CanNang = LT.CanNang;
        KichThuoc = LT.KichThuoc;
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
    public String getPin(){
        return Pin;
    }
    public void setPin(String Pin){
        this.Pin = Pin;
    }
    public double getCanNang(){
        return CanNang;
    }
    public void setCanNang(double Cannang){
        this.CanNang = Cannang;
    }
    public double getKichThuoc(){
        return KichThuoc;
    }
    public void setKichThuoc(double Kichthuoc){
        this.KichThuoc = Kichthuoc;
    }

    @Override public void Nhap(){
        super.Nhap();
        System.out.print("Pin: "); Pin = sc.nextLine();
        System.out.print("Can Nang: "); CanNang = sc.nextFloat();
        System.out.print("Kich thuoc: "); KichThuoc = sc.nextFloat();
    }
    @Override public void Xuat(){
        System.out.format("|| %7s | %15s | %3s | %8s | %7s | %10s | %17s | %15s | %17s | %10s | %7s | %5s | %10s ||\n",maSP, tenSP, Sl, DonGia, DonViTinh, OCung, ManHinh, Phim, Chuot, Loa, Pin, CanNang, KichThuoc); 
    }

    public void sua(LapTop lt){
        super.sua(lt);
        System.out.print("Pin: "); Pin = sc.nextLine(); lt.setPin(Pin);
        System.out.print("Can Nang: "); CanNang = sc.nextFloat();  lt.setCanNang(CanNang);
        System.out.print("Kich thuoc: "); KichThuoc = sc.nextFloat(); lt.setKichThuoc(KichThuoc);
    }

    @Override
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
        dos.writeUTF(Pin);
        dos.writeDouble(CanNang);
        dos.writeDouble(KichThuoc);
        dos.close();
	}
}
