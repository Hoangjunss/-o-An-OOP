import java.util.Scanner;
import java.util.Arrays;

public class DanhSachKhachHang {
    private int n;
    KhachHang[] dskh = new KhachHang[0];
    
    Scanner sc = new Scanner(System.in);
    
    public DanhSachKhachHang(){}
    public DanhSachKhachHang(int n, KhachHang[] dskh){
        this.n = n;
        this.dskh = dskh;
    }
    public DanhSachKhachHang(DanhSachKhachHang dskh){
        this.n = dskh.n;
        this.dskh = dskh.dskh;
    }

    public void nhap(){
        System.out.print("-Nhap So Luong Khach Hang: ");
        this.n = sc.nextInt();
        dskh = new KhachHang[n];
        System.out.println("Nhap Thong Tin Khach Hang:");
        for(int i=0;i<dskh.length;i++){
            dskh[i].nhap();
        }
    }

    public void xuat(){
        for(int i=0;i<dskh.length;i++){
            dskh[i].xuat();
        }
    }

    public void them(){
        System.out.print("So Luong Can Them: ");
        int temp = sc.nextInt();
        dskh = Arrays.copyOf(dskh,n+temp);
    }
}
