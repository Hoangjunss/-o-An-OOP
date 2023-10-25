
import java.util.Scanner;

public class DanhSachSanPham {
    Scanner sc = new Scanner(System.in);
    private int N;
    SanPham[] SP = new SanPham[0];
    public DanhSachSanPham(){}

    public void Nhap(){
        System.out.print("-|Nhap so luong san pham: "); N=sc.nextInt();
        SanPham[] SP = new SanPham[N];
        int CHOOSE;
        for(int i=0; i<SP.length; i++){
            System.out.println("1./ San Pham May Tinh");
            System.out.println("2./ San Pham Lap Top");
            System.out.println("3./ San Pham Phu Kien");
            System.out.print("Chon: "); CHOOSE = sc.nextInt();
            switch(CHOOSE){
                case 1:
                    SP[i] = new MayTinh();
                    SP[i].Nhap();
                    break;
                case 2:
                    SP[i] = new LapTop();
                    SP[i].Nhap();
                    break;
                case 3: 
                    SP[i] = new SanPham();
                    SP[i].Nhap();
                    break;
                default: System.out.println("Chon Lai");
            }
        }
    }
    
    public void Xuat(){
        for(int i=0; i<SP.length; i++){
            if(SP[i] instanceof MayTinh) SP[i].Xuat();
            else if(SP[i] instanceof LapTop) SP[i].Xuat();
        }
    }
}
