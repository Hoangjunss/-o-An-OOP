import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ChiTietPhieuNhap {
    DanhSachNhanVien dsnv = new DanhSachNhanVien();
    DanhSachNhaCungCap dsncc = new DanhSachNhaCungCap();

    private String maPN;
    private String ngay;
    private String maNV;
    private String maNCC;
    private String maSP;
    private String tenSP;
    private int soluong;
    private long dongia;
    private long thanhtien;

    Scanner sc = new Scanner(System.in);

    public ChiTietPhieuNhap(){
    }
    public ChiTietPhieuNhap(String maPN, String ngay, String maNV, String maNCC, String maSP, String tenSP, int soluong, long dongia, long thanhtien){
        this.maPN = maPN;
        this.ngay = ngay;
        this.maNV = maNV;
        this.maNCC = maNCC;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
    }
    public ChiTietPhieuNhap(ChiTietPhieuNhap n){
        this.maPN = n.maPN;
        this.ngay = n.ngay;
        this.maNV = n.maNV;
        this.maNCC = n.maNCC;
        this.maSP = n.maSP;
        this.tenSP = n.tenSP;
        this.soluong = n.soluong;
        this.dongia = n.dongia;
        this.thanhtien = n. thanhtien;
    }

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

    public String getMaSP(){
        return this.maSP;
    }
    public void setMaSP(String maSP){
        this.maSP = maSP;
    }

    public String getTenSP(){
        return this.tenSP;
    }
    public void setTenSP(String tenSP){
        this.tenSP = tenSP;
    }
    public int getSoluong(){
        return this.soluong;
    }
    public void setSoluong(int soluong){
        this.soluong = soluong;
    }

    public long getDonGia(){
        return this.dongia;
    }
    public void setDongia(long dongia){
        this.dongia = dongia;
    }

    public long getThanhtien(){
        return this.thanhtien;
    }
    public void setThanhTien(long thanhtien){
        this.thanhtien = thanhtien;
    }
    
    public void nhap(){
        System.out.print("Nhap vao ma phieu: "); maPN = sc.nextLine();
        do{
            System.out.print("Nhap vao ngay lap phieu(dd/MM/yyy): "); ngay = sc.nextLine();
            if(!isValidDate(ngay)){
                System.out.println("NHAP SAI DINH DANG 'dd/MM/yyyy'!!!\nNhan ENTER de nhap lai. ");
                sc.nextLine();
            }
        }while(!isValidDate(ngay));
        System.out.print("Nhap vao ma nhan vien phu trach: "); maNV = sc.nextLine();
        System.out.print("Nhap vao ma nha cung cap: "); maNCC = sc.nextLine();
        System.out.print("Nhap vao ma san pham: "); maSP = sc.nextLine();
        System.out.print("Nhap vao ten san pham: "); tenSP = sc.nextLine();
        System.out.print("Nhap vao so luong san pham: "); soluong = sc.nextInt();
        System.out.print("Nhap vao gia cua moi san pham: "); dongia = sc.nextLong();
        thanhtien = soluong * dongia;
    }

    public boolean isValidDate(String inputDate){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = sdf.parse(inputDate);
            // Nếu chuyển đổi thành công, định dạng là hợp lệ
            return true;
        } catch (ParseException e) {
            // Nếu có lỗi, định dạng không hợp lệ
            return false;
        }
    }

    public void xuat(){
        System.out.format(" %8s | %12s | %8s | %8s | %8s | %45s | %10s | %10s | %12s ||\n", maPN, ngay, maNV, maNCC, maSP, tenSP, soluong, dongia, thanhtien);
    }

    public void ghiFile(String fielName) throws IOException{
        
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fielName, Boolean.TRUE))){
            dos.writeUTF(maPN);
            dos.writeUTF(ngay);
            dos.writeUTF(maNV);
            dos.writeUTF(maNCC);
            dos.writeUTF(maSP);
            dos.writeUTF(tenSP);
            dos.writeInt(soluong);
            dos.writeLong(dongia);
            dos.writeLong(thanhtien);
            dos.close();
        }
    }
}
