package OOP;
import java.util.Scanner;

public class NhanVien {
    private String manv;
    private String ho;
    private String ten;
    private String sdt;
    private String diachi;

    Scanner scanner = new Scanner(System.in);

    public NhanVien(String manv, String ho, String ten, String sdt, String diachi) {
        this.manv = manv;
        this.ho = ho;
        this.ten = ten;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void nhap() 
    {
        System.out.print("Nhap ma nhan vien: ");
        manv = sc.nextLine();
        while(!manv.matches("^\\d{5}$"))
        {
            System.out.println("Khong dung dinh dang!");
            System.out.println("Ma nhan vien phai co 5 so");
            System.out.print("Nhap ma nhan vien: ");
            cmnd = sc.nextLine();
        }

        System.out.print("Nhap ho nhan vien: ");
        ho = sc.nextLine();
        while(!ho.matches("^[a-zA-Z ]{"+ ho.length() +"}$"))
        {
            System.out.println("Khong dung dinh dang!");
            System.out.println("Ho khong chua so va cac ky tu dac biet");
            System.out.print("Nhap ho nhan vien: ");
            ten = sc.nextLine();
        }

        System.out.print("Nhap ten nhan vien: ");
        ten = sc.nextLine();
        while(!ten.matches("^[a-zA-Z ]{"+ ten.length() +"}$"))
        {
            System.out.println("Khong dung dinh dang!");
            System.out.println("Ten khong chua so va cac ky tu dac biet");
            System.out.print("Nhap ten nhan vien: ");
            ten = sc.nextLine();
        }
        System.out.print("Nhap so dien thoai: ");
        sdt = sc.nextLine();
        while(!sdt.matches("^0\\d{9}$"))
        {
            System.out.println("Khong dung dinh dang!");
            System.out.println("So dien thoai co 10 so va bat dau bang 0");
            System.out.print("Nhap so dien thoai: s");
            so_dien_thoai = sc.nextLine();
        }

        System.out.print("Nhap dia chi: ");
        diachi = sc.nextLine();
        while(!diachi.matches("^[a-zA-Z ]{"+ diachi.length() +"}$"))
        {
            System.out.println("Khong dung dinh dang!");
            System.out.println("Dia chi khong chua so va cac ky tu dac biet");
            System.out.print("Nhap dia chi nhan vien: ");
            ten = sc.nextLine();
        }        
    }

    public void xuat() 
    {
        System.out.printf("%-20s%-25s%-15s%-15s%-10s\n", manv, ho, ten, sdt, diachi);
    }

    public String toString() 
    {
        return manv + "," + ho + "," + ten + "," + sdt + "," + diachi + "\n";
    }
}
