

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
    public String GetMasp(){
        return Masp;
    }
    public void SetMasp(String Masp){
        this.Masp = Masp;
    }
    public String GetTensp(){
        return Tensp;
    }
    public void SetTensp(String Tensp){
        this.Tensp = Tensp;
    }
    public int GetSl(){
        return Sl;
    }
    public void SetSl(int Sl){
        this.Sl = Sl;
    }
    public long GetDongia(){
        return Dongia;
    }
    public void SetDongia(long Dongia){
        this.Dongia = Dongia;
    }
    public String GetDonvitinh(){
        return Donvitinh;
    }
    public void SetDonvitinh(String Donvitinh){
        this.Donvitinh = Donvitinh;
    }
    public String GetOcungp(){
        return Ocung;
    }
    public void SetOcung(String Ocung){
        this.Ocung = Ocung;
    }
    public String GetManhinh(){
        return Manhinh;
    }
    public void SetManhinh(String Manhinh){
        this.Manhinh = Manhinh;
    }
    public String GetPhim(){
        return Phim;
    }
    public void SetPhim(String Phim){
        this.Phim = Phim;
    }
    public String GetChuot(){
        return Chuot;
    }
    public void SetChuot(String Chuot){
        this.Chuot = Chuot;
    }
    public String GetLoa(){
        return Loa;
    }
    public void SetLoa(String Loa){
        this.Loa = Loa;
    }

    public void Nhap(){
        System.out.println("***Nhap Thong Tin San Pham***");
        System.out.print("Ma San Pham: "); Masp = sc.nextLine();
        System.out.print("Ten San Pham: "); Tensp = sc.nextLine();
        Tensp = sc.nextLine();
        System.out.print("So luong: "); Sl = sc.nextInt();
        System.out.print("Don Gia: "); Dongia = sc.nextLong();
        System.out.print("Don vi tinh: "); Donvitinh = sc.nextLine();
        System.out.print("Man Hinh: "); Manhinh = sc.nextLine();
        Manhinh = sc.nextLine();
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

