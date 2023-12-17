
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

public class DanhSachNhanVien {
    private int N;
    Scanner sc = new Scanner(System.in);
    private NhanVien[] dsnv; // Khai báo một mảng của các đối tượng NhanVien
    
    // Khởi tạo với kích thước mặc định N
    public DanhSachNhanVien() {
        dsnv = new NhanVien[N];
    }
    
    // Khởi tạo với một mảng được cung cấp
    public DanhSachNhanVien(NhanVien[] dsnv) {
        this.dsnv = dsnv;
        this.N = dsnv.length; // Đặt N bằng độ dài của mảng được cung cấp
    }
    
    public String toString() {
        // In toàn bộ mảng của các đối tượng NhanVien
        StringBuilder result = new StringBuilder();
        for (NhanVien nv : dsnv) {
            if (nv != null) {
                result.append(nv).append("\n");
            }
        }
        return result.toString();
    }

    // các thao tác với danh sách
    public void xoa() {
        tai_du_lieu();
        System.out.print("Nhap ma nhan vien muon xoa: ");
        String manv = sc.nextLine();
        sc.nextLine();
        int tk = tim_kiem_theo_ma(manv);
        if (tk != -1) {
            for (int i = tk; i < dsnv.length - 1; i++) {
                dsnv[i] = dsnv[i + 1];
            }
            dsnv = Arrays.copyOf(dsnv, dsnv.length - 1);
            System.out.println("Da xoa nhan vien co ma: " + manv);
        } else {
            System.out.println("Khong tim thay nhan vien co ma: " + manv);
        }
    }

    public void tim_kiem() {
        tai_du_lieu();
        if (dsnv.length == 0) {
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
                    sc.nextLine();
                    int tk = tim_kiem_theo_ma(manv);
                    if (tk != -1)
                        dsnv[tk].xuat();
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
        for (int i = 0; i < dsnv.length; i++) {
            if (dsnv[i].getTennv().contains(ten)) {
                dsnv[i].xuat();
            }
        }
    }

    public int tim_kiem_theo_ma(String manv) {
        for (int i = 0; i < dsnv.length; i++) {
            if (dsnv[i].getManv().equals(manv))
                return i;
        }
        return -1;
    }
    
    //TIM KIEM MA NHAN VIEN TU GIO HANG
    public void tim_kiem_theoma(String manv) {
        tai_du_lieu();
        for (int i = 0; i < dsnv.length; i++) {
            if (dsnv[i].getManv().equals(manv))
                dsnv[i].xuat();
                break;
        }
        return;
    }
    //XUAT NHAN VIEN TU GIO HANG
    public void xuatNV(String maNV) {
        tai_du_lieu();
        int n = dsnv.length;
        for(int i=0; i<n; i++){
            if(dsnv[i].getManv().equals(maNV)){
                System.out.println("\t\tMA NHAN VIEN: "+dsnv[i].getManv());
                System.out.println("HO VA TEN: "+dsnv[i].getHonv()+" "+dsnv[i].getTennv());
                System.out.println("SO DIEN THOAI: "+dsnv[i].getSdt());
                break;
            }
        }
    }
    //KET THUC


    public void thay_doi_thong_tin() {
        tai_du_lieu();
        if (dsnv.length == 0) {
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
                    String tennv = sc.nextLine();
                    sc.nextLine();
                    while (!tennv.matches("^[a-zA-Z ]+$")) {
                        System.out.println("Khong dung dinh dang!");
                        System.out.println("Ten khong chua so va cac ky tu dac biet");
                        System.out.print("Nhap ten nhan vien: ");
                        tennv = sc.next();
                    }
                    dsnv[vi_tri].setTennv(tennv);
                    break;
                case 2:
                    System.out.print("Nhap so dien thoai: ");
                    String sdt = sc.next();
                    while (!sdt.matches("^0\\d{9}$")) {
                        System.out.println("Khong dung dinh dang!");
                        System.out.println("So dien thoai co 10 so va bat dau bang 0");
                        System.out.print("Nhap so dien thoai: ");
                        sdt = sc.next();
                    }
                    dsnv[vi_tri].setSdt(sdt);
                    break;
                case 3:
                    System.out.print("Nhap ma nhan vien moi: ");
                    String manvtk = sc.next();
                    while (!manvtk.matches("^[a-zA-Z]{2}\\d{3}$")) {
                        System.out.println("Khong dung dinh dang!");
                        System.out.println("Ma nhan vien phai co 5 ky tu (2 chu, 3 so)");
                        System.out.print("Nhap ma nhan vien moi: ");
                        manvtk = sc.next();
                    }
                    dsnv[vi_tri].setManv(manvtk);
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
            NhanVien nv = new NhanVien();
            nv.nhap();
            
            // Tạo mảng mới có độ dài lớn hơn mảng hiện tại 1 đơn vị
            NhanVien[] newDsnv = Arrays.copyOf(dsnv, dsnv.length + 1);
            newDsnv[index++] = nv; // Thêm nhân viên mới vào cuối mảng
            dsnv = newDsnv; // Gán mảng mới vào mảng ban đầu

            System.out.println("Da them thanh cong!");
            System.out.print("Nhap 'enter' de tiep tuc hoac 'e' de dung lai: ");
            String chon = sc.next();
            if (chon.equalsIgnoreCase("e")){
                luu_du_lieu();                
                break;
            }
        }
    }

    public void nhap() {
        dsnv = new NhanVien[0]; // Khởi tạo mảng rỗng
        int index = 0;
        while (true) {
            System.out.println("--------------Tao danh sach moi--------------");
            NhanVien nv = new NhanVien();
            nv.nhap();
    
            NhanVien[] newDsnv = Arrays.copyOf(dsnv, dsnv.length + 1); // Tạo mảng mới lớn hơn 1 đơn vị
            newDsnv[index++] = nv; // Thêm nhân viên vào cuối mảng mới
            dsnv = newDsnv; // Gán mảng mới vào mảng ban đầu
    
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
        tai_du_lieu();
        if (dsnv.length == 0) {
            System.out.println("Danh sach trong!");
            System.out.print("Nhap 'Enter' de tiep tuc!");
            sc.nextLine();
            return;
        }
        System.out.println("-------------------------------DANH SACH NHAN VIEN-------------------------------");
        System.out.printf("%-20s%-25s%-15s%-15s%-10s\n", "Ma nhan vien", "Ho nhan vien", "Ten nhan vien", "Dien thoai", "Dia chi");
        for (NhanVien nv : dsnv) {
            nv.xuat();
        }
    }
    

    // các phương thức tải và lưu dữ liệu
    public void tai_du_lieu() {
        try {
            FileReader f = new FileReader("data_NhanVien.txt");
            BufferedReader br = new BufferedReader(f);
            String s;
            List<NhanVien> tempNhanVienList = new ArrayList<>(); // Tạo một danh sách tạm thời

            while ((s = br.readLine()) != null) {
                String data[] = s.split(",");
                NhanVien nv = new NhanVien(data[0], data[1], data[2], data[3], data[4]);
                tempNhanVienList.add(nv); // Thêm nhân viên vào danh sách tạm thời
            }

            // Chuyển danh sách tạm thời sang mảng
            dsnv = tempNhanVienList.toArray(new NhanVien[0]);

            //System.out.println("Tai du lieu thanh cong!");
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
            FileWriter f = new FileWriter("data_NhanVien.txt", true);
            BufferedWriter bw = new BufferedWriter(f);
            for (NhanVien nv : dsnv) {
                bw.write(nv.toString());
            }
            System.out.println("Luu du lieu thanh cong!");
            bw.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Luu du lieu that bai!");
        }
    }
    
    
    public void menu_nv() {
        while (true) {
            tai_du_lieu();
            System.out.println("--------------------MENU THAO TAC-------------------");
            System.out.println("1: Xem tat ca cac nhan vien   2: Them nhan vien");
            System.out.println("3: Xoa nhan vien              4: Thay doi thong tin");
            System.out.println("5: Tao moi danh sach          6: Tiem kiem nhan vien");
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
