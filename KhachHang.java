
import java.util.Scanner;

public class KhachHang {
    private String makh;
    private String hokh;
    private String tenkh;
    private String sdt;
    private String diachi;

    Scanner sc = new Scanner(System.in);

    public KhachHang(){}
    public KhachHang(String makh, String hokh, String tenkh, String sdt, String diachi) {
        this.makh = makh;
        this.hokh = hokh;
        this.tenkh = tenkh;
        this.sdt = sdt;
        this.diachi = diachi;
    }
    public KhachHang(KhachHang kh) {
        this.makh = kh.makh;
        this.hokh = kh.hokh;
        this.tenkh = kh.tenkh;
        this.sdt = kh.sdt;
        this.diachi = kh.diachi;
    }   


    public String getMakh() {
        return this.makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getHokh() {
        return this.hokh;
    }

    public void setHokh(String hokh) {
        this.hokh = hokh;
    }

    public String getTenkh() {
        return this.tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getSdt() {
        return this.sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return this.diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void nhap() 
    {
        System.out.print("Nhap ma khach hang: ");
        makh = sc.nextLine();
        while(!makh.matches("^[a-zA-Z]{2}\\d{3}$"))
        {
            System.out.println("Khong dung dinh dang!");
            System.out.println("Ma khach hang phai co 5 so(2 chu, 3 so)");
            System.out.print("Nhap ma khach hang: ");
            makh = sc.nextLine();
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
            System.out.print("Nhap so dien thoai: ");
            sdt = sc.nextLine();
        }

        System.out.print("Nhap dia chi: ");
        diachi = sc.nextLine();
        while(!diachi.matches("^[a-zA-Z0-9 ]{"+ diachi.length() +"}$"))
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
