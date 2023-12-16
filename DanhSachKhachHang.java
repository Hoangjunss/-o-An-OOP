
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DanhSachKhachHang {
    private int N;
    Scanner sc = new Scanner(System.in);
    private KhachHang[] dskh; // Khai báo một mảng của các đối tượng KhachHang
    
    // Khởi tạo với kích thước mặc định N
    public DanhSachKhachHang() {
        dskh = new KhachHang[N];
    }
    
    // Khởi tạo với một mảng được cung cấp
    public DanhSachKhachHang(KhachHang[] dskh) {
        this.dskh = dskh;
        this.N = dskh.length; // Đặt N bằng độ dài của mảng được cung cấp
    }
    
    public String toString() {
        // In toàn bộ mảng của các đối tượng KhachHang
        StringBuilder result = new StringBuilder();
        for (KhachHang kh : dskh) {
            if (kh != null) {
                result.append(kh).append("\n");
            }
        }
        return result.toString();
    }

    // các thao tác với danh sách
    public void xoa() {
        System.out.print("Nhap ma nhan vien muon xoa: ");
        String makh = sc.nextLine();
        int tk = tim_kiem_theo_ma(makh);
        if (tk != -1) {
            for (int i = tk; i < dskh.length - 1; i++) {
                dskh[i] = dskh[i + 1];
            }
            dskh = Arrays.copyOf(dskh, dskh.length - 1);
            System.out.println("Da xoa nhan vien co ma: " + makh);
        } else {
            System.out.println("Khong tim thay nhan vien co ma: " + makh);
        }
    }

    public void tim_kiem() {
        if (dskh.length == 0) {
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
                    String makh = sc.nextLine();
                    int tk = tim_kiem_theo_ma(makh);
                    if (tk != -1)
                        dskh[tk].xuat();
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
        for (int i = 0; i < dskh.length; i++) {
            if (dskh[i].getTenkh().contains(ten)) {
                dskh[i].xuat();
            }
        }
    }

    public int tim_kiem_theo_ma(String makh) {
        for (int i = 0; i < dskh.length; i++) {
            if (dskh[i].getMakh().equals(makh))
                return i;
        }
        return -1;
    }

    public void thay_doi_thong_tin() {
        if (dskh.length == 0) {
            System.out.println("Danh sach trong!");
            System.out.print("Nhap 'Enter' de tiep tuc!");
            sc.nextLine();
            return;
        }
        while (true) {
            System.out.println("--------------Thay doi thong tin--------------");
            System.out.println("1: Thay doi ten        2: Thay doi so dien thoai");
            System.out.println("3: Thay doi ma nhan vien");
            System.out.println("4: Thoat chuong trinh");
            System.out.println("----------------------------------------------");
            int chon = sc.nextInt();
            sc.nextLine(); // Consume newline after nextInt() to prevent issues with nextLine()
    
            if (chon == 4)
                return;
    
            xuat();
            System.out.print("Nhap ma nhan vien: ");
            String makh = sc.nextLine();
            int vi_tri = tim_kiem_theo_ma(makh);
    
            while (vi_tri == -1) {
                System.out.println("Khong tim thay nhan vien!");
                System.out.print("Nhap ma nhan vien: ");
                makh = sc.nextLine();
                vi_tri = tim_kiem_theo_ma(makh);
            }
    
            switch (chon) {
                case 1:
                    System.out.print("Nhap ten nhan vien: ");
                    String tenkh = sc.nextLine();
                    while (!tenkh.matches("^[a-zA-Z ]+$")) {
                        System.out.println("Khong dung dinh dang!");
                        System.out.println("Ten khong chua so va cac ky tu dac biet");
                        System.out.print("Nhap ten nhan vien: ");
                        tenkh = sc.nextLine();
                    }
                    dskh[vi_tri].setTenkh(tenkh);
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
                    dskh[vi_tri].setSdt(sdt);
                    break;
                case 3:
                    System.out.print("Nhap ma nhan vien moi: ");
                    String makhtk = sc.nextLine();
                    while (!makhtk.matches("^[a-zA-Z]{2}\\d{3}$")) {
                        System.out.println("Khong dung dinh dang!");
                        System.out.println("Ma nhan vien phai co 5 ky tu (2 chu, 3 so)");
                        System.out.print("Nhap ma nhan vien moi: ");
                        makhtk = sc.nextLine();
                    }
                    dskh[vi_tri].setMakh(makhtk);
                    break;
            }
            System.out.print("Nhap 'enter' de tiep tuc!");
            sc.nextLine();
        }
    }

    public void them() {
        int index = 0;
        while (true) {
            System.out.println("-----------------Them nhan vien-----------------");
            KhachHang kh = new KhachHang();
            kh.nhap();
            
            // Tạo mảng mới có độ dài lớn hơn mảng hiện tại 1 đơn vị
            KhachHang[] newDskh = Arrays.copyOf(dskh, dskh.length + 1);
            newDskh[index++] = kh; // Thêm nhân viên mới vào cuối mảng
            dskh = newDskh; // Gán mảng mới vào mảng ban đầu
    
            System.out.println("Da them thanh cong!");
            System.out.print("Nhap 'enter' de tiep tuc hoac 'e' de dung lai: ");
            String chon = sc.nextLine();
            sc.nextLine();
            if (chon.equalsIgnoreCase("e"))
                break;
        }
    }

    public void nhap() {
        dskh = new KhachHang[0]; // Khởi tạo mảng rỗng
    
        int index = 0;
        while (true) {
            System.out.println("--------------Tao danh sach moi--------------");
            KhachHang kh = new KhachHang();
            kh.nhap();
    
            KhachHang[] newDskh = Arrays.copyOf(dskh, dskh.length + 1); // Tạo mảng mới lớn hơn 1 đơn vị
            newDskh[index++] = kh; // Thêm nhân viên vào cuối mảng mới
            dskh = newDskh; // Gán mảng mới vào mảng ban đầu
    
            System.out.println("Da tao thanh cong!");
            System.out.print("Nhap 'enter' de tiep tuc hoac 'e' de dung lai: ");
            String chon = sc.nextLine();
            sc.nextLine();
            if (chon.equalsIgnoreCase("e"))
                break;
        }
    }
    

    public void xuat() {
        if (dskh.length == 0) {
            System.out.println("Danh sach trong!");
            System.out.print("Nhap 'Enter' de tiep tuc!");
            sc.nextLine();
            return;
        }
        System.out.println("-------------------------------DANH SACH NHAN VIEN-------------------------------");
        System.out.printf("%-20s%-25s%-15s%-15s%-10s\n", "Ma nhan vien", "Ho nhan vien", "Ten nhan vien", "Dien thoai", "Dia chi");
        for (KhachHang kh : dskh) {
            kh.xuat();
        }
    }
    

    // các phương thức tải và lưu dữ liệu
    public void tai_du_lieu() {
        try {
            FileReader f = new FileReader("data_KhachHang.txt");
            BufferedReader br = new BufferedReader(f);
            String s;
            List<KhachHang> tempKhachHangList = new ArrayList<>(); // Tạo một danh sách tạm thời

            while ((s = br.readLine()) != null) {
                String data[] = s.split(",");
                KhachHang kh = new KhachHang(data[0], data[1], data[2], data[3], data[4]);
                tempKhachHangList.add(kh); // Thêm nhân viên vào danh sách tạm thời
            }

            // Chuyển danh sách tạm thời sang mảng
            dskh = tempKhachHangList.toArray(new KhachHang[0]);

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
            FileWriter f = new FileWriter("data_KhachHang.txt");
            BufferedWriter bw = new BufferedWriter(f);
            for (KhachHang kh : dskh) {
                bw.write(kh.toString());
                bw.newLine(); // Thêm dòng mới sau mỗi nhân viên
            }
            System.out.println("Luu du lieu thanh cong!");
            bw.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Luu du lieu that bai!");
        }
    }
    
    
    public void menu_kh() {
        while (true) {
            System.out.println("--------------------MENU THAO TAC-------------------");
            System.out.println("1: Xem tat ca cac nhan vien   2: Them nhan vien");
            System.out.println("3: Xoa nhan vien              4: Thay doi thong tin");
            System.out.println("5: Tao moi danh sach          6: Thoat chuong trinh");
            System.out.println("----------------------------------------------------");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    xuat();
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
                    thay_doi_thong_tin();
                    break;
                case 5:
                    nhap();
                    break;
                default:
                    luu_du_lieu();
                    return;
            }
        }
    }

}
