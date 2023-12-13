import java.util.Scanner;

import OOP.MENU;

public class MENU_NV {
    private DanhSachNhanVien dsnv;
    Scanner sc = new Scanner(System.in);

    public MENU_NV() {
        dsnv = new dsnv();
        dsnv.tai_du_lieu();
    }

    public MENU_NV(DanhSachNhanVien dsnv) {
        this.dsnv = dsnv;
    }

    public void menu_nv() {
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
                    dsnv.xuat();
                    System.out.print("\nNhap 'enter' de tiep tuc");
                    sc.nextLine();
                    break;
                case 2:
                    dsnv.them();
                    break;
                case 3:
                    dsnv.xoa();
                    break;
                case 4:
                    dsnv.thay_doi_thong_tin();
                    break;
                case 5:
                    dsnv.nhap();
                    break;
                default:
                    dsnv.luu_du_lieu();
                    return;
            }
        }
    }
}