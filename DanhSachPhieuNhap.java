import java.util.Arrays;
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
        this.n=sc.nextInt();
        dspn = new PhieuNhap[n];
        System.out.println("Nhap Thong Tin Phieu Nhap");
        for(int i=0;i<dspn.length;i++){
            dspn[i].nhap();
        }
    }

    public void xuat(){
        for(int i=0;i<dspn.length;i++){
            System.out.println("Thong Tin Phieu Nhap " + (i+1)+ ":");
            dspn[i].xuat();
        }
    }

    public void them(){
        System.out.print("So Luong Can Them: ");
        int temp = sc.nextInt();
        dspn = Arrays.copyOf(dspn,n+temp);
        for(int i = n;i<(n+temp);i++){
            dspn[i] = new PhieuNhap();
            dspn[i].nhap();
        }
        n+=temp;
    }
}
