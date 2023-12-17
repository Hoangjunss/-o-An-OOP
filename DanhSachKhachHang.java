import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
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
        System.out.print("Nhap ma khach hang muon xoa: ");
        String makh = sc.nextLine();
        int tk = tim_kiem_theo_ma(makh);
        if (tk != -1) {
            for (int i = tk; i < dskh.length - 1; i++) {
                dskh[i] = dskh[i + 1];
            }
            dskh = Arrays.copyOf(dskh, dskh.length - 1);
            System.out.println("Da xoa khach hang co ma: " + makh);
        } else {
            System.out.println("Khong tim thay khach hang co ma: " + makh);
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
            System.out.println("-------------------Tim khach hang-------------------");
            System.out.println("1: Tim theo ma khach hang    2: Tim theo ten khach hang");
            System.out.println("3: Thoat chuong trinh");
            System.out.println("---------------------------------------------------");
            int chon = sc.nextInt();
            sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.print("Nhap ma khach hang muon tim: ");
                    String makh = sc.nextLine();
                    int tk = tim_kiem_theo_ma(makh);
                    if (tk != -1)
                        dskh[tk].xuat();
                    else
                        System.out.println("Khong tim thay duoc khach hang!");
                    break;
                case 2:
                    System.out.print("Nhap ten khach hang muon tim: ");
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

    //TIM KIEM MA KHACH HANG TU GIO HANG
    public int tim_kiem_theo_ma(String makh) {
        for (int i = 0; i < dskh.length; i++) {
            if (dskh[i].getMakh().equals(makh))
                return i;
        }
        return -1;
    }
    // public void tim_kiem_theoma(String makh) {
    //     tai_du_lieu();
    //     for (int i = 0; i < dskh.length; i++) {
    //         if(dskh[i].getMakh().equals(makh)){
    //             System.out.println("\t\tMA KHANH HANG: "+dskh[i].getMakh());
    //             System.out.println("HO VA TEN: "+dskh[i].getHokh()+" "+dskh[i].getTenkh());
    //             System.out.println("SO DIEN THOAI: "+dskh[i].getSdt()+ " DIA CHI: "+dskh[i].getDiachi());
    //             break;
    //         }
    //         else{
    //             int n = dskh.length;
    //             dskh = Arrays.copyOf(dskh, n+1);
    //             System.out.println("\t\t\tNHAP THONG TIN KHACH HANG MOI");
    //             System.out.printf("Ho Khach Hang Moi: "); String hoKHmoi = sc.nextLine();
    //             System.out.printf("Ten Khach hang moi: "); String tenKHmoi = sc.nextLine();
    //             System.out.printf("So dien thoai: "); String sdtmoi = sc.nextLine();
    //             System.out.printf("Dia Chi: "); String diachimoi = sc.nextLine();
    //             dskh[n] = new KhachHang(makh, hoKHmoi, tenKHmoi, sdtmoi, diachimoi);
    //             luu_du_lieu();
    //             System.out.println("\t\t\tDA LUU THONG TIN");
    //             break;
    //         }
    //     }
    //     return;
    // }
    // //KET THUC 

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
                    String tenkh = sc.nextLine();
                    while (!tenkh.matches("^[a-zA-Z ]+$")) {
                        System.out.println("Khong dung dinh dang!");
                        System.out.println("Ten khong chua so va cac ky tu dac biet");
                        System.out.print("Nhap ten khach hang: ");
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
                    System.out.print("Nhap ma khach hang moi: ");
                    String makhtk = sc.nextLine();
                    while (!makhtk.matches("^[a-zA-Z]{2}\\d{3}$")) {
                        System.out.println("Khong dung dinh dang!");
                        System.out.println("Ma khach hang phai co 5 ky tu (2 chu, 3 so)");
                        System.out.print("Nhap ma khach hang moi: ");
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
            System.out.println("-----------------Them khach hang-----------------");
            KhachHang kh = new KhachHang();
            kh.nhap();
            
            // Tạo mảng mới có độ dài lớn hơn mảng hiện tại 1 đơn vị
            KhachHang[] newDskh = Arrays.copyOf(dskh, dskh.length + 1);
            newDskh[index++] = kh; // Thêm nhân viên mới vào cuối mảng
            dskh = newDskh; // Gán mảng mới vào mảng ban đầu
    
            System.out.println("Da them thanh cong!");
            System.out.print("Nhap 'enter' de tiep tuc hoac 'e' de dung lai: ");
            String chon = sc.next();
            if (chon.equalsIgnoreCase("e"))
                luu_du_lieu();
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
            String chon = sc.next();
            if (chon.equalsIgnoreCase("e")){
                luu_du_lieu();
                break;
            }
        }
    }
    

    public void xuat() {
        if (dskh.length == 0) {
            System.out.println("Danh sach trong!");
            System.out.print("Nhap 'Enter' de tiep tuc!");
            sc.nextLine();
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
            int numberOfLines = 0;
    
            while (br.readLine() != null) {
                numberOfLines++; // Counting lines in the file
            }
    
            // Resetting the reader after counting lines
            br.close();
            f = new FileReader("data_KhachHang.txt");
            br = new BufferedReader(f);
    
            KhachHang[] tempKhachHangArray = new KhachHang[numberOfLines]; // Create an array to hold the data
    
            int index = 0;
            while ((s = br.readLine()) != null) {
                String data[] = s.split(",");
                KhachHang kh = new KhachHang(data[0], data[1], data[2], data[3], data[4]);
                tempKhachHangArray[index] = kh; // Assign KhachHang object to the array
                index++;
            }
    
            dskh = tempKhachHangArray; // Assign the temporary array to your class variable
    
            // System.out.println("Tai du lieu thanh cong!");
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
            FileWriter f = new FileWriter("data_KhachHang.txt",true);
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
    
    
    public void menu_kh() {
        while (true) {
            tai_du_lieu();
            System.out.println("--------------------MENU THAO TAC-------------------");
            System.out.println("1: Xem tat ca cac khach hang   2: Them khach hang");
            System.out.println("3: Xoa khach hang              4: Thay doi thong tin");
            System.out.println("5: Tao moi danh sach          6: Tim kiem khach hang");
            System.out.println("7:Thoat chuong trinh");
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
                case 6:
                    tim_kiem();
                    break;
                default:
                    return;
            }
        }
    }

}
