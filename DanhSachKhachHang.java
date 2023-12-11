import OOP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.Scanner;

public class DanhSachKhachHang {
    private Vector<KhachHang> dskh;
    Scanner sc = new Scanner(System.in);

    // khởi tạo giá trị đầu
    public DanhSachKhachHang() {
        dskh = new Vector<KhachHang>();
    }

    public DanhSachKhachHang(Vector<KhachHang> dskh) {
        this.dskh = dskh;
    }

        public String toString() {
        // xuất toàn bộ phòng
        return dskh + "\n";
    }

    // các thao tác với danh sách
    public void xoa(int i) {
        System.out.print("Nhap ma khach hang muon xoa: ");
        String makh = sc.nextLine();
        int tk = tim_kiem_theo_ma(makh);
        if (tk != -1){
            dskh.remove(viTri); // Xoá nhân viên tại vị trí đã tìm được
            System.out.println("Da xoa khach hang co ma: " + makh);
        }
        else
            System.out.println("Khong tim thay khach hang co ma: " + makh);
    }

    public void tim_kiem() {
        if (dskh.size() == 0) {
            System.out.println("Danh sach trong!");
            System.out.print("Nhap 'Enter' de tiep tuc!");
            sc.nextLine();
            return;
        }
        while (true) {
            MENU.clearScreen();
            System.out.println("-------------------Tim khach hang-------------------");
            System.out.println("1: Tim theo ma khach hang    2: Tim theo ten khach hang");
            System.out.println("3: Thoat chuong trinh");
            System.out.println("---------------------------------------------------");
            int chon = MENU.check_number(1, 3, "lua chon");
            switch (chon) {
                case 1:
                    System.out.print("Nhap ma khach hang muon tim: ");
                    String makh = sc.nextLine();
                    int tk = tim_kiem_theo_ma(makh);
                    if (tk != -1)
                        dskh.get(tk).xuat();
                    else
                        System.out.println("Khong tim thay duoc khach hang!");
                    break;
                case 2:
                    System.out.print("Nhap ten khach hang muon tim: ");
                    String tenkh = sc.nextLine();
                    tim_kiem_theo_tenkh(tenkh);
                    break;
                case 3:
                    return;
            }
            System.out.print("Nhap 'enter' de tiep tuc!");
            sc.nextLine();
        }
    }

    public void tim_kiem_theo_ten(String tenkh) {
        for (int i = 0; i < dskh.size(); i++) {
            if (dskh.get(i).getTenkh().contains(tenkh)) {
                dskh.get(i).xuat();
            }
        }
    }

    public int tim_kiem_theo_ma(String makh) {
        for (int i = 0; i < dskh.size(); i++) {
            if (dskh.get(i).getMakh().equals(makh))
                return i;
        }
        return -1;
    }

    public void thay_doi_thong_tin() {
        if (dskh.size() == 0) {
            System.out.println("Danh sach trong!");
            System.out.print("Nhap 'Enter' de tiep tuc!");
            sc.nextLine();
            return;
        }
        while (true) {
            MENU.clearScreen();
            System.out.println("--------------Thay doi thong tin--------------");
            System.out.println("1: Thay doi ten        2: Thay doi so dien thoai");
            System.out.println("3: Thay doi makh       ");
            System.out.println("4: Thoat chuong trinh");
            System.out.println("----------------------------------------------");
            int chon = MENU.check_number(1, 4, "lua chon");
            if (chon == 4)
                return;
            xuat();
            System.out.print("Nhap ma khach hang: ");
            String makh = sc.nextLine();
            int vi_tri = tim_kiem_theo_ma(makh);
            while (vi_tri == -1) {
                System.out.println("Khong tim thay khach hang!");
                System.out.print("Nhap ma khach hang: ");
                makh = sc.nextLine();
                vi_tri = tim_kiem_theo_ma(makh);
            }
            switch (chon) {
                case 1:
                    System.out.print("Nhap ten khach hang: ");
                    String tenkh = sc.nextLine();
                    while (!tenkh.matches("^[a-zA-Z ]{" + tenkh.length() + "}$")) {
                        System.out.println("Khong dung dinh dang!");
                        System.out.println("Ten khong chua so va cac ky tu dac biet");
                        System.out.print("Nhap ten khach hang: ");
                        tenkh = sc.nextLine();
                    }
                    dskh.get(vi_tri).setTenkh(tenkh);
                    break;
                case 2:
                    System.out.print("Nhap so dien thoai: ");
                    String sdt = sc.nextLine();
                    while (!sdt.matches("^0\\d{9}$")) {
                        System.out.println("Khong dung dinh dang!");
                        System.out.println("So dien thoai co 10 so va bat dau bang 0");
                        System.out.print("Nhap so dien thoai: ");
                        sdt = sc.nextLine();
                    }
                    dskh.get(vi_tri).setsdt(sdt);
                    break;
                case 3:
                    System.out.print("Nhap ma khach hang: ");
                    String cmnd = sc.nextLine();
                    while (!cmnd.matches("^\\d{5}$")) {
                        System.out.println("Khong dung dinh dang!");
                        System.out.println("Chung minh phai co 5 so");
                        System.out.print("Nhap ma khach hang: ");
                        sdt = sc.nextLine();
                    }
                    dskh.get(vi_tri).setMakh(makh);
                    break;
            }
            System.out.print("Nhap 'enter' de tiep tuc!");
            sc.nextLine();
        }
    }

    public void them() {
        while (true) {
            MENU.clearScreen();
            System.out.println("-----------------Them khach hang-----------------");
            KhachHang kh = new KhachHang();
            kh.nhap();
            dskh.add(kh);
            System.out.println("Da them thanh cong!");
            System.out.print("Nhap 'enter' de tiep tuc hoac 'e' de dung lai: ");
            if (sc.nextLine().equalsIgnoreCase("e"))
                return;
        }
    }

    public void nhap() {
        dskh.removeAll(dskh);
        while (true) {
            MENU.clearScreen();
            System.out.println("--------------Tao danh sach moi--------------");
            KhachHang kh = new KhachHang();
            kh.nhap();
            dskh.add(kh);
            System.out.println("Da tao thanh cong!");
            System.out.print("Nhap 'enter' de tiep tuc hoac 'e' de dung lai: ");
            if (sc.nextLine().equalsIgnoreCase("e"))
                return;
        }
    }

    public void xuat() {
        if (dskh.size() == 0) {
            System.out.println("Danh sach trong!");
            System.out.print("Nhap 'Enter' de tiep tuc!");
            sc.nextLine();
            return;
        }
        System.out.println("-------------------------------DANH SACH khach hang-------------------------------");
        System.out.printf("%-20s%-25s%-15s%-15s%-10s\n", "Ma khach hang", "Ho khach hang", "Ten khach hang", "Dien thoai",
                "Dia chi");
        for (int i = 0; i < dskh.size(); i++) {
            dskh.get(i).xuat();
        }
    }

    // các phương thức tải và lưu dữ liệu
    public void tai_du_lieu() {
        try {
            FileReader f = new FileReader("D:\\data\\data_KhachHang.txt");
            BufferedReader br = new BufferedReader(f);
            String s;
            while ((s = br.readLine()) != null) {
                String data[] = s.split(",");
                KhachHang kh = new KhachHang(data[0], data[1], data[2], data[3], data[4]);
                dskh.add(kh);
            }
            System.out.println("Tai du lieu thanh cong!");
            br.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("Loi! Khong the doc du lieu!");
        } catch (IOException e) {
            System.out.println("Loi du lieu!");
        }
    }

    public void luu_du_lieu() {
        try {
            FileWriter f = new FileWriter("D:\\data\\data_KhachHang.txt");
            BufferedWriter bw = new BufferedWriter(f);
            for (int i = 0; i < dskh.size(); i++) {
                bw.write(dskh.get(i).toString());
            }
            System.out.println("Luu du lieu thanh cong!");
            bw.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Luu du lieu that bai!");
        }
    }
    

}
