import java.util.Scanner;
import java.util.Arrays;


public class DanhSachNhaCungCap {
    private int n;
    private NhaCungCap[] dsncc = new NhaCungCap[0];
    
    Scanner sc = new Scanner(System.in);
    
    public DanhSachNhaCungCap(){}
    public DanhSachNhaCungCap(int n, NhaCungCap[] dsncc){
        this.n = n;
        this.dsncc = dsncc;
    }
    public DanhSachNhaCungCap(DanhSachNhaCungCap dsncc){
        this.n = dsncc.n;
        this.dsncc = dsncc.dsncc;
    }

    public void nhap(){
        System.out.print("-Nhap So Luong Nha Cung Cap: ");
        this.n = sc.nextInt();
        dsncc = new NhaCungCap[n];
        System.out.println("Nhap Thong Tin Nha Cung Cap:");
        for(int i=0;i<dsncc.length;i++){
            dsncc[i].nhap();
        }
    }

    public void xuat(){
        for(int i=0;i<dsncc.length;i++){
            dsncc[i].xuat();
        }
    }

    public void them(){
        System.out.print("So Luong Can Them: ");
        int temp = sc.nextInt();
        dsncc = Arrays.copyOf(dsncc,n+temp);
        for(int i = n;i<(n+temp);i++){
            dsncc[i] = new NhaCungCap();
            dsncc[i].nhap();
        }
        n+=temp;
    }

    public void timkiem(){
        System.out.print("Nhap Ma Nha Cung Cap Can Tim Kiem: "); 
    }

    public void xoa(){

    }
}