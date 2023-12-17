import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SanPham{
    Scanner sc = new Scanner(System.in);
    protected String maSP;
    protected String tenSP;
    protected int Sl;
    protected long DonGia;
    protected String DonViTinh;
    protected String OCung;
    protected String ManHinh;
    protected String Phim;
    protected String Chuot;
    protected String Loa;
    //Contruster
    public SanPham(){}
    public SanPham(String MaSP, String TenSP, int Sl, long Dongia, String Donvitinh, String Ocung, String Manhinh, String Phim, String Chuot, String Loa){
        this.maSP = MaSP;
        this.tenSP = TenSP;
        this.Sl = Sl;
        this.DonGia = Dongia;
        this.DonViTinh = Donvitinh;
        this.OCung = Ocung;
        this.ManHinh = Manhinh;
        this.Phim = Phim;
        this.Chuot = Chuot;
        this.Loa = Loa;
    }
    public SanPham(SanPham SP){
        maSP = SP.maSP;
        tenSP = SP.tenSP;
        Sl = SP.Sl;
        DonGia = SP.DonGia;
        DonViTinh = SP.DonViTinh;
        OCung = SP.OCung;
        ManHinh = SP.ManHinh;
        Phim = SP.Phim;
        Chuot  = SP.Chuot;
        Loa = SP.Loa;
    }

    //Get-Set
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

    public void Nhap(){
        System.out.println("***Nhap Thong Tin San Pham***");
        System.out.print("Ma San Pham: "); maSP = sc.nextLine();
        System.out.print("Ten San Pham: "); tenSP = sc.nextLine();
        System.out.print("So luong: "); Sl = sc.nextInt();
        System.out.print("Don Gia: "); DonGia = sc.nextLong();
        System.out.print("Don vi tinh: "); DonViTinh = sc.nextLine();
        DonViTinh = sc.nextLine();
        System.out.print("O Cung: "); OCung = sc.nextLine();
        System.out.print("Man Hinh: "); ManHinh = sc.nextLine();
        System.out.print("Phim: "); Phim = sc.nextLine();
        System.out.print("Chuot: "); Chuot = sc.nextLine();
        System.out.print("Loa: "); Loa = sc.nextLine();
    }
    public void Xuat(){
        System.out.format("|| %7s | %10s | %5s | %10s | %10s | %15s | %20s | %15s | %15s | %15s |\n",maSP, tenSP, Sl, DonGia, DonViTinh, OCung, ManHinh, Phim, Chuot, Loa); 
    }

    public void sua(SanPham SP){
        System.out.println("NHAP THONG TIN CAN SUA");
        System.out.print("Ten San Pham: "); tenSP = sc.nextLine(); SP.setTenSP(tenSP);
        System.out.print("So luong: "); Sl = sc.nextInt(); SP.setSl(Sl);
        System.out.print("Don Gia: "); DonGia = sc.nextLong(); SP.setDonGia(DonGia);
        System.out.print("Don vi tinh: "); DonViTinh = sc.nextLine();DonViTinh = sc.nextLine(); SP.setDonViTinh(DonViTinh);
        System.out.print("O cung: "); OCung = sc.nextLine(); SP.setOCung(OCung);
        System.out.print("Man Hinh: "); ManHinh = sc.nextLine(); SP.setManHinh(ManHinh);
        System.out.print("Phim: "); Phim = sc.nextLine(); SP.setPhim(Phim);
        System.out.print("Chuot: "); Chuot = sc.nextLine(); SP.setChuot(Chuot);
        System.out.print("Loa: "); Loa = sc.nextLine(); SP.setLoa(Loa);
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
        dos.close();
	}
}

