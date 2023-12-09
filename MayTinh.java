

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
        super.Xuat();
        System.out.println("Loai CASE: "+LoaiCase+" | So luong khe cam: "+Slkhecam);
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
