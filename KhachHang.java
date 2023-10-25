public class KhachHang {
    private String makh;
    private String hokh;
    private String tenkh;
    private int sdt;
    private String diachi;

    public KhachHang(String makh, String hokh, String tenkh, int sdt, String diachi) {
        this.makh = makh;
        this.hokh = hokh;
        this.tenkh = tenkh;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getHokh() {
        return hokh;
    }

    public void setHokh(String hokh) {
        this.hokh = hokh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
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
        System.out.print("Nhập mã khách hàng: ");
        this.makh = scanner.nextLine();
        System.out.print("Nhập họ khách hàng: ");
        this.hokh = scanner.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        this.tenkh = scanner.nextLine();
        System.out.print("Nhập số điện thoại khách hàng: ");
        this.sdt = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập địa chỉ khách hàng: ");
        this.diachi = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Mã khách hàng: " + this.makh);
        System.out.println("Họ khách hàng: " + this.hokh);
        System.out.println("Tên khách hàng: " + this.tenkh);
        System.out.println("Số điện thoại khách hàng: " + this.sdt);
        System.out.println("Địa chỉ khách hàng: " + this.diachi);
    }
}
