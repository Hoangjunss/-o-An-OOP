
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class NhaCungCap {
    private String maNCC;
    private String ten;
    private String diaChi;
    private String sdt;

    Scanner sc = new Scanner(System.in);

    public NhaCungCap(){}
    public NhaCungCap(String maNCC, String ten, String diaChi, String sdt){
        this.maNCC = maNCC;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    public NhaCungCap(NhaCungCap ncc){
        this.maNCC = ncc.maNCC;
        this.ten = ncc.ten;
        this.diaChi = ncc.diaChi;
        this.sdt = ncc.sdt;
    }

    public String getMaNCC(){
        return this.maNCC;
    }
    public void setMaNCC(String maNCC){
        this.maNCC=maNCC;
    }

    public String getTen(){
        return this.ten;
    }
    public void setTen(String ten){
        this.ten=ten;
    }

    public String getDiaChi(){
        return this.diaChi;
    }
    public void setDiaChi(String diaChi){
        this.diaChi=diaChi;
    }

    public String getSdt(){
        return this.sdt;
    }
    public void setSdt(String sdt){
        this.sdt=sdt;
    }

    public void nhap(){
        System.out.print("Nhap Ma Nha Cung Cap: "); maNCC = sc.next();sc.nextLine();
        System.out.print("Nhap Ten Nha Cung Cap: "); ten = sc.nextLine();
        System.out.print("Nhap Dia Chi: "); diaChi = sc.nextLine();
        System.out.print("Nhap So Dien Thoai: "); sdt = sc.next();
    }

    public void xuat(){
        System.out.format("| %10s | %25s | %40s | %20s ||\n", maNCC, ten, diaChi, sdt); 
    }

    public void ghiFile(String fileName) throws IOException{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName, Boolean.TRUE));
        dos.writeUTF(maNCC);
        dos.writeUTF(ten);
        dos.writeUTF(diaChi);
        dos.writeUTF(sdt);
        dos.close();
    }
}
