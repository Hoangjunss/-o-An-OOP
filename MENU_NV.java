package OOP;

import java.util.Scanner;

public class MENU_NV 
{
    private DanhSachKhachHang dskh;
    private DanhSachSanPham dssp;
    static Scanner sc = new Scanner(System.in);
 
     public MENU_NV()
    {
        dskh = new DanhSachKhachHang();
        dskh.tai_du_lieu();
        dssp = new DanhSachSanPham();
        dssp.tai_du_lieu();      
    }

    //Menu chính khi gọi nhan vien
    public void Menu()
    {
        while(true)
        {
            MENU.clearScreen();
            System.out.println("--------------------------QUAY THUOC--------------------------");
            System.out.println("1: Xem san pham co trong kho       2: Tim san pham  ");
            System.out.println("3: Thoat chuong trinh");
            System.out.println("----------------------------------------------------------");   
            int chon = MENU.check_number(1, 3, "lua chon");
             switch(chon)
            {
                case 1:
                    dssp.xuat();
                    System.out.print("Nhap 'Enter' de tiep tuc!");
                    sc.nextLine();
                    break;
                case 2:
                    dssp.tim_kiem();
                    break;              
                default: 
                    dskh.luu_du_lieu();
                    dssp.luu_du_lieu();
                    return;
            }
        } 
    }
}