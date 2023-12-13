import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    DanhSachHoaDon dshd = new DanhSachHoaDon();
    DanhSachKhachHang dskh = new DanhSachKhachHang();
    DanhSachNhaCungCap dsncc = new DanhSachNhaCungCap();
    DanhSachNhanVien dsnv = new DanhSachNhanVien();
    DanhSachPhieuNhap dspn = new DanhSachPhieuNhap();
    DanhSachSanPham dssp = new DanhSachSanPham();
    public void Menushop(){
    int key;
        do{
            System.out.println("1./ Quan Ly San Pham");
            System.out.println("2./ Quan Ly Hoa Don");
            System.out.println("3./ Quan Ly Phieu Nhap");
            System.out.println("4./ Quan Ly Khach Hang");
            System.out.println("5./ Quan Ly Nhan Vien");
            System.out.println("6./ Quan Ly Nha Cung Cap");
            System.out.println("0./ Hoan Thanh");
            System.out.print("LUA CHON CUA BAN: "); key = sc.nextInt();
            switch(key){
                case 1:
                    dssp.ThaoTac();
                    break;
                case 2:
                    dshd.ThaoTac();
                    break;
                case 3:
                    dspn.thaoTac();
                    break;
                case 4:
                    dskh.menu_kh();
                    break;
                case 5:
                    dsnv.menu_nv();
                    break;
                case 6:
                    dsncc.thaoTac();
                    break;
                case 0:
                    break;
                default: 
                    System.out.println("LUA CHON KHONG HOP LE!. VUI LONG CHON LAI");
            }
        }while(key!=0);
    }
}
