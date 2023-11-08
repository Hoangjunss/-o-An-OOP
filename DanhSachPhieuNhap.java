import java.util.Scanner;

public class DanhSachPhieuNhap {
    private int n;
    private  PhieuNhap[] dspn = new PhieuNhap[0];

    Scanner sc = new Scanner(System.in);

    public DanhSachPhieuNhap(){
    }
    public DanhSachPhieuNhap(int n, PhieuNhap[] dspn){
        this.n = n;
        this.dspn = dspn;
    }
    public DanhSachPhieuNhap(DanhSachPhieuNhap dspn){
        this.n=dspn.n;
        this.dspn=dspn.dspn;
    }

    public void nhap(){
        System.out.print("Nhap So Luong Phieu Nhap");
    }
}
