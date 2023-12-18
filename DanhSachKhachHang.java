
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        tai_du_lieu();
        System.out.print("Nhap ma khach hang muon xoa: ");
        String makh = sc.next();
    
        int tk = tim_kiem_theo_ma(makh);
        if (tk != -1) {
            KhachHang[] newDskh = new KhachHang[dskh.length - 1];
            System.arraycopy(dskh, 0, newDskh, 0, tk);
            System.arraycopy(dskh, tk + 1, newDskh, tk, dskh.length - tk - 1);
            dskh = newDskh;
            luu_du_lieu();
            System.out.println("Da xoa khach hang co ma: " + makh);
        } else {
            System.out.println("Khong tim thay khach hang co ma: " + makh);
        }
    }

    public void tim_kiem() {
        tai_du_lieu();
        if (dskh.length == 0) {
            System.out.println("Danh sach trong!");
            System.out.print("Nhap 'Enter' de tiep tuc!");
            sc.nextLine();
            return;
        }
        while (true) {
            System.out.println("-------------------Tim khach hang-------------------");
            System.out.println("1: Tim theo ma khach hang    2: Tim theo ten khach hang");
            System.out.println("3: Thoat chuong trinh");
            System.out.println("---------------------------------------------------");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.print("Nhap ma khach hang muon tim: ");
                    String makh = sc.next();
                    int tk = tim_kiem_theo_ma(makh);
                    if (tk != -1)
                        dskh[tk].xuat();
                    else
                        System.out.println("Khong tim thay duoc khach hang!");
                    break;
                case 2:
                    System.out.print("Nhap ten khach hang muon tim: ");
                    String ten = sc.next();
                    int tkt = tim_kiem_theo_ten(ten);
                    if (tkt != -1)
                        dskh[tkt].xuat();
                    else
                        System.out.println("Khong tim thay duoc khach hang!");
                    break;
                case 3:
                    return;
            }
            System.out.print("Nhap 'e' de tiep tuc!");
            String choos = sc.next();
            if (choos.equalsIgnoreCase("e"))               
                break;
        }
    }

    public int tim_kiem_theo_ten(String ten) {
        for (int i = 0; i < dskh.length; i++) {
            if (dskh[i].getTenkh().equals(ten)) {
                return i;
            }
        }
        return -1;
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
            System.out.println("3: Thay doi ma khach hang");
            System.out.println("4: Thoat chuong trinh");
            System.out.println("----------------------------------------------");
            int chon = sc.nextInt();
            sc.nextLine(); // Consume newline after nextInt() to prevent issues with nextLine()
    
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
                    String tenkh = sc.next();
                    while (!tenkh.matches("^[a-zA-Z ]+$")) {
                        System.out.println("Khong dung dinh dang!");
                        System.out.println("Ten khong chua so va cac ky tu dac biet");
                        System.out.print("Nhap ten khach hang: ");
                        tenkh = sc.next();
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
                    System.out.print("Nhap dia chi moi: ");
                    String diachi = sc.next();
                    while (!diachi.matches("^[a-zA-Z ]+$")) {
                        System.out.println("Khong dung dinh dang!");
                        System.out.println("Dia hi khong chua so va cac ky tu dac biet");
                        System.out.print("Nhap dia chi moi: ");
                        diachi = sc.next();
                    }
                    dskh[vi_tri].setDiachi(diachi);
                    break;
            }
            luu_du_lieu();
            System.out.print("Nhap 'enter' de tiep tuc!");
            sc.nextLine();
        }
    }

    public void them() {
        while (true) {
            System.out.println("-----------------Them khach hang-----------------");
            KhachHang kh = new KhachHang();
            kh.nhap();

            if (tim_kiem_theo_ma(kh.getMakh()) != -1) {
                System.out.println("Ma khach hang da ton tai! Vui long nhap lai.");
                continue; // Quay lại vòng lặp để nhập lại thông tin
            }
            
            // Tạo một mảng mới có độ dài lớn hơn mảng cũ một đơn vị để thêm đối tượng mới
            KhachHang[] newDskh = new KhachHang[dskh.length + 1];
            
            // Copy tất cả các phần tử từ mảng cũ sang mảng mới
            System.arraycopy(dskh, 0, newDskh, 0, dskh.length);
            
            // Thêm đối tượng mới vào cuối mảng mới
            newDskh[dskh.length] = kh;
            
            // Gán mảng cũ bằng mảng mới với đối tượng mới đã được thêm vào
            dskh = newDskh;
    

            System.out.println("Da them thanh cong!");
            System.out.print("Nhap 'c' de tiep tuc hoac 'e' de dung lai: ");
            String chon = sc.next();
            if (chon.equalsIgnoreCase("e")){                
                break;
            }
        }
        luu_du_lieu();
    }
    

    public void xuat() {
        if (dskh.length == 0) {
            System.out.println("Danh sach trong!");
            return;
        }
        System.out.println("-------------------------------DANH SACH khach hang-------------------------------");
        System.out.printf("%-20s%-25s%-15s%-15s%-10s\n", "Ma khach hang", "Ho khach hang", "Ten khach hang", "Dien thoai", "Dia chi");
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
            FileWriter f = new FileWriter("data_KhachHang.txt", false);
            BufferedWriter bw = new BufferedWriter(f);
            for (KhachHang kh : dskh) {
                bw.write(kh.toString());
            }
            System.out.println("Luu du lieu thanh cong!");
            bw.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Luu du lieu that bai!");
        }
    }

    private void thongke() {
        // Tạo một Map để lưu trữ số lượng nhân viên theo địa chỉ
        Map<String, Integer> addressCount = new HashMap<>();
        
        // Thực hiện thống kê theo địa chỉ từ mảng đã được sắp xếp
        String currentAddress = dskh[0].getDiachi();
        int count = 1;

        for (int i = 1; i < dskh.length; i++) {
            String address = dskh[i].getDiachi();
            if (address.equals(currentAddress)) {
                count++;
            } else {
                addressCount.put(currentAddress, count);
                currentAddress = address;
                count = 1;
            }
        }
        addressCount.put(currentAddress, count);

        // Hiển thị kết quả thống kê theo địa chỉ
        for (Map.Entry<String, Integer> entry : addressCount.entrySet()) {
            System.out.println("Dia Chi " + entry.getKey() + " co " + entry.getValue() + " khach hang.");
        }
    }
    
    public void menu_kh() {
        while (true) {
            System.out.println("--------------------MENU THAO TAC-------------------");
            System.out.println("1: Xem tat ca cac khach hang   2: Them khach hang");
            System.out.println("3: Xoa khach hang              4: Thay doi thong tin");
            System.out.println("5: Tim kiem khach hang          6: Thong ke theo dia chi");
            System.out.println("7: Thoat chuong trinh");
            System.out.println("----------------------------------------------------");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    tai_du_lieu();
                    xuat();
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
                    tim_kiem();
                    break;
                case 6:
                    thongke();
                    break;
                default:
                    return;
            }
        }
    }

}
