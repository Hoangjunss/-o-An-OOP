import java.util.Scanner;
import java.util.Arrays;

public class DanhSachNhanVien {
    private int n;
    NhanVien[] dsnv = new NhanVien[0];
    
    Scanner sc = new Scanner(System.in);
    
    public DanhSachNhanVien(){}
    public DanhSachNhanVien(int n, NhanVien[] dsnv){
        this.n = n;
        this.dsnv = dsnv;
    }
    public DanhSachNhanVien(DanhSachNhanVien dsnv){
        this.n = dsnv.n;
        this.dsnv = dsnv.dsnv;
    }

    public void nhap(){
        System.out.print("-Nhap So Luong Nhan Vien: ");
        this.n = sc.nextInt();
        dsnv = new NhanVien[n];
        System.out.println("Nhap Thong Tin Nhan Vien:");
        for(int i=0;i<dsnv.length;i++){
            dsnv[i].nhap();
        }
    }

    public void xuat(){
        for(int i=0;i<dsnv.length;i++){
            dsnv[i].xuat();
        }
    }

    public void them(){
        System.out.print("So Luong Can Them: ");
        int temp = sc.nextInt();
        dsnv = Arrays.copyOf(dsnv,n+temp);
    }
}
