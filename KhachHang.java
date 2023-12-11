package OOP;

import java.util.Scanner;

public class KhachHang {
    private String makh;
    private String hokh;
    private String tenkh;
    private String sdt;
    private String diachi;

    Scanner scanner = new Scanner(System.in);

    public KhachHang(String makh, String hokh, String tenkh, String sdt, String diachi) {
        this.makh = makh;
        this.hokh = hokh;
        this.tenkh = tenkh;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public String getmakh() {
        return makh;
    }

    public void setmakh(String makh) {
        this.makh = makh;
    }

    public String getHokh() {
        return hokh;
    }

    public void setHokh(String hokh) {
        this.hokh = hokh;
    }

    public String gettenkh() {
        return tenkh;
    }

    public void settenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
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
        System.out.print("Nhap ma khach hang: ");
        makh = sc.nextLine();
        while(!makh.matches("^\\d{5}$"))
        {
            System.out.println("Khong dung dinh dang!");
            System.out.println("Ma khach hang phai co 5 so");
            System.out.print("Nhap ma khach hang: ");
            cmnd = sc.nextLine();
        }

        System.out.print("Nhap ho khach hang: ");
        hokh = sc.nextLine();
        while(!hokh.matches("^[a-zA-Z ]{"+ hokh.length() +"}$"))
        {
            System.out.println("Khong dung dinh dang!");
            System.out.println("Ho khong chua so va cac ky tu dac biet");
            System.out.print("Nhap ho khach hang: ");
            hokh = sc.nextLine();
        }

        System.out.print("Nhap ten khach hang: ");
        tenkh = sc.nextLine();
        while(!tenkh.matches("^[a-zA-Z ]{"+ tenkh.length() +"}$"))
        {
            System.out.println("Khong dung dinh dang!");
            System.out.println("Ten khong chua so va cac ky tu dac biet");
            System.out.print("Nhap ten khach hang: ");
            tenkh = sc.nextLine();
        }
        System.out.print("Nhap so dien thoai: ");
        sdt = sc.nextLine();
        while(!sdt.matches("^0\\d{9}$"))
        {
            System.out.println("Khong dung dinh dang!");
            System.out.println("So dien thoai co 10 so va bat dau bang 0");
            System.out.print("Nhap so dien thoai: s");
            sdt = sc.nextLine();
        }

        System.out.print("Nhap dia chi: ");
        diachi = sc.nextLine();
        while(!diachi.matches("^[a-zA-Z ]{"+ diachi.length() +"}$"))
        {
            System.out.println("Khong dung dinh dang!");
            System.out.println("Dia chi khong chua so va cac ky tu dac biet");
            System.out.print("Nhap dia chi khach hang: ");
            diachi = sc.nextLine();
        }        
    }

    public void xuat() 
    {
        System.out.printf("%-20s%-25s%-15s%-15s%-10s\n", makh, hokh, tenkh, sdt, diachi);
    }

    public String toString() 
    {
        return makh + "," + hokh + "," + tenkh + "," + sdt + "," + diachi + "\n";
    }
}
