import java.util.Scanner;

import OOP.MENU;

public class MENU_NV {
    private DanhSachKhachHang dskh;
    Scanner sc = new Scanner(System.in);

    public MENU_NV() {
        dskh = new dskh();
        dskh.tai_du_lieu();
    }

    public MENU_NV(DanhSachNhanVien dskh) {
        this.dskh = dskh;
    }

    public void menu_kh() {
        while (true) {
            MENU.clearScreen();
            System.out.println("--------------------MENU THAO TAC-------------------");
            System.out.println("1: Xem tat ca cac nhan vien   2: Them nhan vien");
            System.out.println("3: Xoa nhan vien              4: Thay doi thong tin");
            System.out.println("5: Tao moi danh sach          6: Thoat chuong trinh");
            System.out.println("----------------------------------------------------");
            int chon = MENU.check_number(1, 6, "lua chon");
            switch (chon) {
                case 1:
                    MENU.clearScreen();
                    dskh.xuat();
                    System.out.print("\nNhap 'enter' de tiep tuc");
                    sc.nextLine();
                    break;
                case 2:
                    them();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    dskh.thay_doi_thong_tin();
                    break;
                case 5:
                    nhap();
                    break;
                default:
                    dskh.luu_du_lieu();
                    return;
            }
        }
    }
}