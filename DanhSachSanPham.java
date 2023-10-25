package THONGTIN;
import java.util.Scanner;

public class DanhSachSanPham {
    Scanner sc = new Scanner(System.in);
    private int N;
    SANPHAM[] SP = new SANPHAM[0];
    public DanhSachSanPham(){}

    public void Nhap(){
        //Co can tao them 1 danh sach phu kien khong(bao gom cac thuoc tinh phu kien da chon)
        //Danh sach chi co san pham
        //Doi voi thong tin. co can Set san toan bo thong tin khong.
        //Cach de hien thi so luong muc da chon de xem chi tiet
        //Chi tiet SP?
        System.out.print("-|Nhap so luong san pham: "); N=sc.nextInt();
        SANPHAM[] SP = new SANPHAM[N];
        int CHOOSE;
        for(int i=0; i<SP.length; i++){
            System.out.println("1./ San Pham May Tinh");
            System.out.println("2./ San Pham Lap Top");
            System.out.print("Chon: "); CHOOSE = sc.nextInt();
            switch(CHOOSE){
                case 1:
                    SP[i] = new MayTinh();
                    SP[i].Nhap();
                case 2:
                    SP[i] = new LapTop();
                    SP[i].Nhap();
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
