import java.io.Serializable;
import java.util.Scanner;

public class GioHang {
    Scanner sc = new Scanner(System.in);
    private String maSP;
    private int soLuong;
    public GioHang(){}
    public GioHang(String maSP, int soLuong){
        this.maSP = maSP;
        this.soLuong = soLuong;
    }
    public GioHang(GioHang gh){
        maSP = gh.maSP;
        soLuong = gh.soLuong;
    }

    public String getmaSP(){
        return this.maSP;
    }
    public void setmaSP(String maSP){
        this.maSP = maSP;
    }
    public int getsoluong(){
        return this.soLuong;
    }
    public void setsoluong(int soLuong){
        this.soLuong = soLuong;
    }
    
    public void nhap(){
        System.out.print("Ma San Pham: "); maSP = sc.nextLine();
        System.out.print("So luong: "); soLuong = sc.nextInt();
        
    }
    public void xuat(){
        System.out.format("| %15s | %15s |\n", maSP, soLuong);
    }
}
