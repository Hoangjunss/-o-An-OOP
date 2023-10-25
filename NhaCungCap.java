import java.util.Scanner;

public class NhaCungCap {
    private String maNCC;
    private String ten;
    private String diachi;
    private int sdt;

    Scanner sc = new Scanner(System.in);

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

    public String getDiachi(){
        return this.diachi;
    }
    public void setDiachi(String diachi){
        this.diachi=diachi;
    }

    public int getSdt(){
        return this.sdt;
    }
    public void setSdt(int sdt){
        this.sdt=sdt;
    }

    public void nhap(){
        sc.nextLine();
        System.out.print("Nhap Ma Nha Cung Cap: "); maNCC = sc.nextLine();
        System.out.print("Nhap Ten Nha Cung Cap: "); ten = sc.nextLine();
        System.out.print("Nhap Dia Chi: "); diachi = sc.nextLine();
        System.out.print("Nhap So Dien Thoai: "); sdt = sc.nextInt();
    }

    public void xuat(){
        System.out.print("Ma Nha Cung Cap: " + getMaNCC());
        System.out.print("Ten Nha Cung Cap: " + getTen());
        System.out.print("Dia Chi: " + getDiachi());
        System.out.print("So Dien Thoai: "+ getSdt());
    }
}
