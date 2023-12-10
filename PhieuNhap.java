import java.util.Scanner;

public class PhieuNhap{
    private String maPN;
    private String ngay;
    private String maNV;
    private String maNCC;
    private long tongTien;

    Scanner sc = new Scanner(System.in);

    public String getMaPN(){
        return this.maPN;
    }
    public void setMaPN(String maPN){
        this.maPN = maPN;
    }

    public String getNgay(){
        return this.ngay;
    }
    public void setNgay(String ngay){
        this.ngay = ngay;
    }

    public String getMaNV(){
        return this.maNV;
    }
    public void setMaNV(String maNV){
        this.maNV = maNV;
    }

    public String getMaNCC(){
        return this.maNCC;
    }
    public void setMaNCC(String maNCC){
        this.maNCC = maNCC;
    }

    public long getTongTien(){
        return this.tongTien;
    }
    public void setTongTien(long tongTien){
        this.tongTien = tongTien;
    }

    public void nhap(){
        sc.nextLine();
        System.out.print("Nhap Ma Phieu Nhap: "); maPN = sc.nextLine();
        System.out.print("Nhap Ma Nha Cung Cap: "); maNCC = sc.nextLine();
        System.out.print("Nhap Ma Nhan Vien Phu Trach: "); maNV = sc.nextLine();
        System.out.print("Nhap Ngay Nhap: "); ngay = sc.nextLine();
        System.out.print("Nhap Tong Tien "); tongTien = sc.nextLong();
    }

    public void xuat(){
        System.out.print("Ma Phieu Nhap: " + getMaPN());
        System.out.print("Ma Nha Cung Cap: "+ getMaNCC());
        System.out.print("Ma Nhan Vien Phu Trach: "+ getMaNV());
        System.out.print("Ngay Nhap: " + getNgay());
        System.out.print("Tong Tien " + getTongTien());
    }

}