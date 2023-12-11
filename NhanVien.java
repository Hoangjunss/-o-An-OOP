package OOP;
import java.util.Scanner;

public class NhanVien {
    private String manv;
    private String honv;
    private String tennv;
    private String sdt;
    private String diachi;

    Scanner scanner = new Scanner(System.in);

    public NhanVien(String manv, String honv, String tennv, String sdt, String diachi) {
        this.manv = manv;
        this.honv = honv;
        this.tennv = tennv;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHonv() {
        return honv;
    }

    public void setHonv(String honv) {
        this.honv = honv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
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
        honv = sc.nextLine();
        while(!honv.matches("^[a-zA-Z ]{"+ honv.length() +"}$"))
        {
            System.out.println("Khong dung dinh dang!");
            System.out.println("Ho khong chua so va cac ky tu dac biet");
            System.out.print("Nhap ho nhan vien: ");
            tennv = sc.nextLine();
        }

        System.out.print("Nhap ten nhan vien: ");
        tennv = sc.nextLine();
        while(!tennv.matches("^[a-zA-Z ]{"+ tennv.length() +"}$"))
        {
            System.out.println("Khong dung dinh dang!");
            System.out.println("Ten khong chua so va cac ky tu dac biet");
            System.out.print("Nhap ten nhan vien: ");
            tennv = sc.nextLine();
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
            System.out.print("Nhap dia chi nhan vien: ");
            tennv = sc.nextLine();
        }        
    }

    public void xuat() 
    {
        System.out.printf("%-20s%-25s%-15s%-15s%-10s\n", manv, honv, tennv, sdt, diachi);
    }

    public String toString() 
    {
        return manv + "," + honv + "," + tennv + "," + sdt + "," + diachi + "\n";
    }
}
