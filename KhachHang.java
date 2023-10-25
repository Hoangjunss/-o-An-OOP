import java.util.Scanner;

public class KhachHang {
    private String maKH;
    private String hoKH;
    private String tenKH;
    private int sdt;
    private String diachi;

    public KhachHang(String maKH, String hoKH, String tenKH, int sdt, String diachi) {
        this.maKH = maKH;
        this.hoKH = hoKH;
        this.tenKH = tenKH;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoKH() {
        return hoKH;
    }

    public void setHoKH(String hoKH) {
        this.hoKH = hoKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
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

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã KHách hàng: ");
        this.maKH = scanner.nextLine();
        System.out.print("Nhập họ KHách hàng: ");
        this.hoKH = scanner.nextLine();
        System.out.print("Nhập tên KHách hàng: ");
        this.tenKH = scanner.nextLine();
        System.out.print("Nhập số điện thoại KHách hàng: ");
        this.sdt = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập địa chỉ KHách hàng: ");
        this.diachi = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Mã KHách hàng: " + this.maKH);
        System.out.println("Họ KHách hàng: " + this.hoKH);
        System.out.println("Tên KHách hàng: " + this.tenKH);
        System.out.println("Số điện thoại KHách hàng: " + this.sdt);
        System.out.println("Địa chỉ KHách hàng: " + this.diachi);
    }
}
