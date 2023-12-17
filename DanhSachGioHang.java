
import java.util.Arrays;
import java.util.Scanner;

public class DanhSachGioHang{
    private GioHang[] gh = new GioHang[0];
    private int n=0;
    Scanner sc = new Scanner(System.in);
    public DanhSachGioHang(){}
    public DanhSachGioHang(int n, GioHang[] gh){
        this.n = n;
        this.gh = gh;
    }
    public DanhSachGioHang(DanhSachGioHang gh){
        this.n = gh.n;
        this.gh = gh.gh;
    }

    public int getLength(){
        return gh.length;
    }
    public String getMaSP(int i){
        return gh[i].getmaSP();
    }
    public int getSoLuong(int i){
        return gh[i].getsoluong();
    }
    public void xuat(){
        System.out.format("|| %5s | %15s | %15s |\n", "STT", "Ma San Pham", "So Luong");
        for(int i=0; i<n; i++){
            System.out.format("|| %5s ", (i+1));
            gh[i].xuat();
        }
    }
    public void nhapGioHang(int n){
        this.n = n;
        gh = new GioHang[n];
        System.out.println("THEM VAO GIO HANG");
        for(int i=0; i<n; i++){
            System.out.println("San Pham Thu: "+(i+1));
            gh[i] = new GioHang();
            gh[i].nhap();        
        }
    }
    public int timkiem(String maSP){
        for(int i=0; i<n; i++){
            if(gh[i].getmaSP().equals(maSP)){
                gh[i].xuat();
                return i;
            }
        }
        return 0;
    }
    public void suasp(int i){
        System.out.print("1./ SUA 2./KHONG.\n LUA CHON CUA BAN: "); int choose = sc.nextInt();
        if(choose == 2) return;
        else if (choose == 1){
            System.out.print("NHAP LAI MA SAN PHAM: "); String masp = sc.nextLine();masp=sc.nextLine(); gh[i].setmaSP(masp);
            System.out.print("So Luong Dat Hang: "); int sl = sc.nextInt(); gh[i].setsoluong(sl);
            System.out.println("THONG TIN DAT HANG DA DUOC SUA THANH");
            gh[i].xuat();
        }
        else return;
    }
    public void them(int them){
        int j=n;
        int tmp = n+them;
        gh = Arrays.copyOf(gh, n+them);
        n+=them;
        for(int i=j; i<tmp; i++){
            gh[i] = new GioHang();
            gh[i].nhap();
        }
        System.out.println(gh.length);
    }
    public void xoa(String maxoa){
        boolean xoa = false;
        for(int i=0; i<n; i++){
            if(gh[i].getmaSP().equals(maxoa)){
                for(int j=i; j<n-1; j++){
                    gh[j] = new GioHang(gh[j+1]);
                }
                gh = Arrays.copyOf(gh, n-1);
                xoa = true;
                n--;
                break;
            }
        }
        if(xoa) System.out.println("Da Xoa San Pham");
        else System.out.println("Xoa That Bai!!!");
    }
}
