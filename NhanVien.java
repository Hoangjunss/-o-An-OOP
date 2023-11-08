import java.util.Scanner;

public class NhanVien {
    private String manv;
    private String ho;
    private String ten;
    private int sdt;
    private String diachi;

    Scanner scanner = new Scanner(System.in);

    public NhanVien(String manv, String ho, String ten, int sdt, String diachi) {
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

    public int getSdt() {
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

    public void nhap() {
        System.out.print("Nhập mã nhân viên: ");
        this.manv = scanner.nextLine();
        System.out.print("Nhập họ nhân viên: ");
        this.ho = scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        this.ten = scanner.nextLine();
        System.out.print("Nhập số điện thoại nhân viên: ");
        this.sdt = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập địa chỉ nhân viên: ");
        this.diachi = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Mã nhân viên: " + this.manv);
        System.out.println("Họ nhân viên: " + this.ho);
        System.out.println("Tên nhân viên: " + this.ten);
        System.out.println("Số điện thoại nhân viên: " + this.sdt);
        System.out.println("Địa chỉ nhân viên: " + this.diachi);
    }
}
