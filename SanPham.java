

import java.util.Scanner;

public class SanPham{
    Scanner sc = new Scanner(System.in);
    private String Masp;
    private String Tensp;
    private int Sl;
    private long Dongia;
    private String Donvitinh;
    private String Ocung;
    private String Manhinh;
    private String Phim;
    private String Chuot;
    private String Loa;
    //Contruster
    public SanPham(){}
    public SanPham(String Masp, String Tensp, int Sl, long Dongia, String Donvitinh, String Ocung, String Manhinh, String Phim, String Chuot, String Loa){
        this.Masp = Masp;
        this.Tensp = Tensp;
        this.Sl = Sl;
        this.Dongia = Dongia;
        this.Donvitinh = Donvitinh;
        this.Ocung = Ocung;
        this.Manhinh = Manhinh;
        this.Phim = Phim;
        this.Chuot = Chuot;
        this.Loa = Loa;
    }
    public SanPham(SanPham SP){
        Masp = SP.Masp;
        Tensp = SP.Tensp;
        Sl = SP.Sl;
        Dongia = SP.Dongia;
        Donvitinh = SP.Donvitinh;
        Ocung = SP.Ocung;
        Manhinh = SP.Manhinh;
        Phim = SP.Phim;
        Chuot  = SP.Chuot;
        Loa = SP.Loa;
    }

    //Get-Set
    public String getMasp(){
        return Masp;
    }
    public void setMasp(String Masp){
        this.Masp = Masp;
    }
    public String getTensp(){
        return Tensp;
    }
    public void setTensp(String Tensp){
        this.Tensp = Tensp;
    }
    public int getSl(){
        return Sl;
    }
    public void setSl(int Sl){
        this.Sl = Sl;
    }
    public long getDongia(){
        return Dongia;
    }
    public void setDongia(long Dongia){
        this.Dongia = Dongia;
    }
    public String getDonvitinh(){
        return Donvitinh;
    }
    public void setDonvitinh(String Donvitinh){
        this.Donvitinh = Donvitinh;
    }
    public String getOcung(){
        return Ocung;
    }
    public void setOcung(String Ocung){
        this.Ocung = Ocung;
    }
    public String getManHinh(){
        return Manhinh;
    }
    public void setManHinh(String Manhinh){
        this.Manhinh = Manhinh;
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
        System.out.print("Ma San Pham: "); Masp = sc.nextLine();
        System.out.print("Ten San Pham: "); Tensp = sc.nextLine();
        System.out.print("So luong: "); Sl = sc.nextInt();
        System.out.print("Don Gia: "); Dongia = sc.nextLong();
        System.out.print("Don vi tinh: "); Donvitinh = sc.nextLine();
        Donvitinh = sc.nextLine();
        System.out.print("Man Hinh: "); Manhinh = sc.nextLine();
        System.out.print("Phim: "); Phim = sc.nextLine();
        System.out.print("Chuot: "); Chuot = sc.nextLine();
        System.out.print("Loa: "); Loa = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("--Thong Tin San Pham--");
        System.out.println("Ma: "+Masp);
        System.out.println("Ten: "+Tensp);
        System.out.println("So luong: "+Sl);
        System.out.println("Don Gia: "+Dongia);
        System.out.println("Don vi tinh: "+Donvitinh);
        System.out.println("Man Hinh: "+Manhinh);
        System.out.println("Phim: "+Phim);
        System.out.println("Chuot: "+Chuot);
        System.out.println("Loa: "+Loa);
    }
}

