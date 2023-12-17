import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LapTop extends SanPham {
    private String Pin;
    private Float CanNang;
    private Float KichThuoc;
    public LapTop(){}
    public LapTop(String Masp, String Tensp, int Sl, long Dongia, String Donvitinh, String Ocung, String Manhinh, String Phim, String Chuot, String Loa, String Pin, Float Cannang, Float Kichthuoc){
        super(Masp, Tensp, Sl, Dongia, Donvitinh, Ocung, Manhinh, Phim, Chuot, Loa);
        this.Pin = Pin;
        this.CanNang = Cannang;
        this.KichThuoc = Kichthuoc;
    }
    public LapTop(LapTop LT){
        super((SanPham)LT);
        Pin = LT.Pin;
        CanNang = LT.CanNang;
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
        System.out.print("Kich thuoc: "); KichThuoc = sc.nextFloat();
    }
    @Override public void Xuat(){
        System.out.format("|| %7s | %15s | %3s | %10s | %7s | %10s | %17s | %15s | %17s | %10s | %7s | %5s | %10s ||\n",maSP, tenSP, Sl, DonGia, DonViTinh, OCung, ManHinh, Phim, Chuot, Loa, Pin, CanNang, KichThuoc); 
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
        dos.writeFloat(CanNang);
        dos.writeFloat(KichThuoc);
        dos.close();
	}
}
