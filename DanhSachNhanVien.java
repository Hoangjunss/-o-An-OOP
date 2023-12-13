
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import java.util.Scanner;

public class DanhSachNhanVien {
    private Vector<NhanVien> dsnv;
    Scanner sc = new Scanner(System.in);

    // khởi tạo giá trị đầu
    public DanhSachNhanVien() {
        dsnv = new Vector<NhanVien>();
    }

    public DanhSachNhanVien(Vector<NhanVien> dsnv) {
        this.dsnv = dsnv;
    }

        public String toString() {
        // xuất toàn bộ phòng
        return dsnv + "\n";
    }

    // các thao tác với danh sách
    public void xoa() {
        System.out.print("Nhap ma nhan vien muon xoa: ");
        String manv = sc.nextLine();
        int tk = tim_kiem_theo_ma(manv);
        if (tk != -1){
            dsnv.remove(viTri); // Xoá nhân viên tại vị trí đã tìm được
            System.out.println("Da xoa nhan vien co ma: " + manv);
        }
        else
            System.out.println("Khong tim thay nhan vien co ma: " + maNV);
    }

    public void tim_kiem() {
        if (dsnv.size() == 0) {
            System.out.println("Danh sach trong!");
            System.out.print("Nhap 'Enter' de tiep tuc!");
            sc.nextLine();
            return;
        }
        while (true) {
            System.out.println("-------------------Tim nhan vien-------------------");
            System.out.println("1: Tim theo ma nhan vien    2: Tim theo ten nhan vien");
            System.out.println("3: Thoat chuong trinh");
            System.out.println("---------------------------------------------------");
            int chon = sc.nextInt();
            sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.print("Nhap ma nhan vien muon tim: ");
                    String manv = sc.nextLine();
                    int tk = tim_kiem_theo_ma(manv);
                    if (tk != -1)
                        dsnv.get(tk).xuat();
                    else
                        System.out.println("Khong tim thay duoc nhan vien!");
                    break;
                case 2:
                    System.out.print("Nhap ten nhan vien muon tim: ");
                    String ten = sc.nextLine();
                    tim_kiem_theo_ten(ten);
                    break;
                case 3:
                    return;
            }
            System.out.print("Nhap 'enter' de tiep tuc!");
            sc.nextLine();
        }
    }

    public void tim_kiem_theo_ten(String ten) {
        for (int i = 0; i < dsnv.size(); i++) {
            if (dsnv.get(i).getTen().contains(ten)) {
                dsnv.get(i).xuat();
            }
        }
    }

    public int tim_kiem_theo_ma(String manv) {
        for (int i = 0; i < dsnv.size(); i++) {
            if (dsnv.get(i).getManv().equals(manv))
                return i;
        }
        return -1;
    }

    public void thay_doi_thong_tin() {
        if (dsnv.size() == 0) {
            System.out.println("Danh sach trong!");
            System.out.print("Nhap 'Enter' de tiep tuc!");
            sc.nextLine();
            return;
        }
        while (true) {
            System.out.println("--------------Thay doi thong tin--------------");
            System.out.println("1: Thay doi ten        2: Thay doi so dien thoai");
            System.out.println("3: Thay doi manv       ");
            System.out.println("4: Thoat chuong trinh");
            System.out.println("----------------------------------------------");
            int chon = sc.nextInt();
            sc.nextInt();
            if (chon == 4)
                return;
            xuat();
            System.out.print("Nhap ma nhan vien: ");
            String manv = sc.nextLine();
            int vi_tri = tim_kiem_theo_ma(manv);
            while (vi_tri == -1) {
                System.out.println("Khong tim thay nhan vien!");
                System.out.print("Nhap ma nhan vien: ");
                manv = sc.nextLine();
                vi_tri = tim_kiem_theo_ma(manv);
            }
            switch (chon) {
                case 1:
                    System.out.print("Nhap ten nhan vien: ");
                    String ten = sc.nextLine();
                    while (!ten.matches("^[a-zA-Z ]{" + ten.length() + "}$")) {
                        System.out.println("Khong dung dinh dang!");
                        System.out.println("Ten khong chua so va cac ky tu dac biet");
                        System.out.print("Nhap ten nhan vien: ");
                        ten = sc.nextLine();
                    }
                    dsnv.get(vi_tri).setTen(ten);
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
                    dsnv.get(vi_tri).setsdt(sdt);
                    break;
                case 3:
                    System.out.print("Nhap ma nhan vien: ");
                    String manv = sc.nextLine();
                    while (!manv.matches("^\\d{5}$")) {
                        System.out.println("Khong dung dinh dang!");
                        System.out.println("Chung minh phai co 5 so");
                        System.out.print("Nhap ma nhan vien: ");
                        manv = sc.nextLine();
                    }
                    dsnv.get(vi_tri).setManv(manv);
                    break;
            }
            System.out.print("Nhap 'enter' de tiep tuc!");
            sc.nextLine();
        }
    }

    public void them() {
        while (true) {
            System.out.println("-----------------Them nhan vien-----------------");
            NhanVien nv = new NhanVien();
            nv.nhap();
            dsnv.add(nv);
            System.out.println("Da them thanh cong!");
            System.out.print("Nhap 'enter' de tiep tuc hoac 'e' de dung lai: ");
            if (sc.nextLine().equalsIgnoreCase("e"))
                return;
        }
    }

    public void nhap() {
        dsnv.removeAll(dsnv);
        while (true) {
            System.out.println("--------------Tao danh sach moi--------------");
            NhanVien nv = new NhanVien();
            nv.nhap();
            dsnv.add(nv);
            System.out.println("Da tao thanh cong!");
            System.out.print("Nhap 'enter' de tiep tuc hoac 'e' de dung lai: ");
            if (sc.nextLine().equalsIgnoreCase("e"))
                return;
        }
    }

    public void xuat() {
        if (dsnv.size() == 0) {
            System.out.println("Danh sach trong!");
            System.out.print("Nhap 'Enter' de tiep tuc!");
            sc.nextLine();
            return;
        }
        System.out.println("-------------------------------DANH SACH NHAN VIEN-------------------------------");
        System.out.printf("%-20s%-25s%-15s%-15s%-10s\n", "Ma nhan vien", "Ho nhan vien", "Ten nhan vien", "Dien thoai",
                "Dia chi");
        for (int i = 0; i < dsnv.size(); i++) {
            dsnv.get(i).xuat();
        }
    }

    // các phương thức tải và lưu dữ liệu
    public void tai_du_lieu() {
        try {
            FileReader f = new FileReader("D:\\data\\data_NhanVien.txt");
            BufferedReader br = new BufferedReader(f);
            String s;
            while ((s = br.readLine()) != null) {
                String data[] = s.split(",");
                NhanVien nv = new NhanVien(data[0], data[1], data[2], data[3], data[4]);
                dsnv.add(nv);
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
            FileWriter f = new FileWriter("D:\\data\\data_NhanVien.txt");
            BufferedWriter bw = new BufferedWriter(f);
            for (int i = 0; i < dsnv.size(); i++) {
                bw.write(dsnv.get(i).toString());
            }
            System.out.println("Luu du lieu thanh cong!");
            bw.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Luu du lieu that bai!");
        }
    }
    

}
