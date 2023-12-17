
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class DanhSachSanPham implements ThaoTac{
    DanhSachHoaDon dshd = new DanhSachHoaDon();
    Scanner sc = new Scanner(System.in);
    private int N, a=0;
    SanPham[] SP = new SanPham[0];
    DanhSachGioHang dsgh = new DanhSachGioHang();
    private Object dsSP;
    //HAM THIET LAP
    public DanhSachSanPham(){}
    public DanhSachSanPham(int N, SanPham[] SP){
        this.N = N;
        this.SP = SP;
    }
    public DanhSachSanPham(DanhSachSanPham dsSP){
        this.N = dsSP.N;
        this.dsSP = dsSP.dsSP;
    }
    //NHAP XUAT
    public void Nhap(){
        System.out.print("NHAP SO LUONG SAN PHAM: "); N=sc.nextInt();
        SP = new SanPham[N];
        int CHOOSE;
        for(int i=0; i<SP.length; i++){
            System.out.println("1./ San Pham May Tinh");
            System.out.println("2./ San Pham Lap Top");
            System.out.println("3./ San Pham Phu Kien");
            System.out.print("Chon: "); CHOOSE = sc.nextInt();
            switch(CHOOSE){
                case 1:
                    SP[i] = new MayTinh();
                    SP[i].Nhap();
                    if(i>0){
                        thayMaSP(i);
                    }
                    break;
                case 2:
                    SP[i] = new LapTop();
                    SP[i].Nhap();
                    if(i>0){
                        thayMaSP(i);
                    }
                    break;
                case 3:
                    SP[i] = new SanPham();
                    SP[i].Nhap();
                    if(i>0){
                        thayMaSP(i);
                    }
                    break;
                default: System.out.println("Chon Lai");
            }
        }
        GhiFileJava("SanPham.txt");
    }

    public void xuat(int i){
        if(i == 0){
            System.out.println("DANH SACH SAN PHAM");
            System.out.println("\t\t\t\t\t\t\t\tTHONG TIN SAN PHAM LAPTOP");
            System.out.format("|| %7s | %15s | %3s | %8s | %7s | %10s | %17s | %15s | %17s | %10s | %7s | %5s | %10s ||\n", "MaSP", "TenSP", "SL", "DonGia", "DonVi", "OCung", "ManHinh", "Phim", "Chuot", "Loa", "Pin", "CN", "KichThuoc"); 
            System.out.println("=============================================================================================================================================================================");
            for(int j=0; j<N; j++){
                if(SP[j] instanceof LapTop){
                    xuatLapTop(j);
                }
            }
            System.out.println("=============================================================================================================================================================================\n");
                
            System.out.println("\t\t\t\t\t\t\t\tTHONG TIN SAN PHAM MAY TINH");
            System.out.format("|| %7s | %17s | %3s | %8s | %10s | %10s | %17s | %10s | %17s | %10s | %10s | %10s ||\n", "MaSP", "TenSP", "SL", "DonGia", "DonVi", "OCung", "ManHinh", "Phim", "Chuot", "Loa", "LoaiCase", "Slkhecam"); 
            System.out.println("========================================================================================================================================================================");
            for(int j=0; j<N; j++){
                if(SP[j] instanceof MayTinh){
                    xuatMayTinh(j);
                }
            }
            System.out.println("========================================================================================================================================================================\n");
                
            System.out.println("\t\t\t\t\t\t\t\tTHONG TIN CAC BO SAN PHAM");
            System.out.format("|| %7s | %10s | %5s | %10s | %10s | %15s | %20s | %15s | %15s | %15s |\n", "MaSP", "TenSP", "SL", "DonGia", "DonViTinh", "OCung", "ManHinh", "Phim", "Chuot", "Loa"); 
            System.out.println("==========================================================================================================================================================");
            for(int j=0; j<N; j++){
                if(SP[j] instanceof SanPham){
                    xuatBoSanPham(j);
                }
            }
            System.out.println("==========================================================================================================================================================\n");
        }
        if(i != 0){
            if(SP[i] instanceof LapTop){
                System.out.println("\t\t\t\t\t\t\t\tTHONG TIN SAN PHAM LAPTOP");
                System.out.format("|| %7s | %10s | %5s | %10s | %10s | %10s | %15s | %10s | %10s | %10s | %7s | %5s | %10s ||\n", "MaSP", "TenSP", "SL", "DonGia", "DonViTinh", "OCung", "ManHinh", "Phim", "Chuot", "Loa", "Pin", "CN", "KichThuoc"); 
                System.out.println("=======================================================================================================================================================================");
                xuatLapTop(i);
                System.out.println("=======================================================================================================================================================================\n");

            }
            else if(SP[i] instanceof MayTinh){
                System.out.println("\t\t\t\t\t\t\t\tTHONG TIN SAN PHAM MAY TINH");
                System.out.format("|| %7s | %17s | %3s | %8s | %10s | %10s | %17s | %10s | %17s | %10s | %10s | %10s ||\n", "MaSP", "TenSP", "SL", "DonGia", "DonViTinh", "OCung", "ManHinh", "Phim", "Chuot", "Loa", "LoaiCase", "Slkhecam"); 
                System.out.println("==================================================================================================================================================================");
                xuatMayTinh(i);
                System.out.println("==================================================================================================================================================================\n");
            }
            else if(SP[i] instanceof SanPham){
                System.out.println("\t\t\t\t\t\t\t\tTHONG TIN CAC BO SAN PHAM");
                System.out.format("|| %7s | %10s | %5s | %10s | %10s | %15s | %20s | %15s | %15s | %15s |\n", "MaSP", "TenSP", "SL", "DonGia", "DonViTinh", "OCung", "ManHinh", "Phim", "Chuot", "Loa"); 
                System.out.println("================================================================================================================================================================");
                xuatBoSanPham(i);
                System.out.println("================================================================================================================================================================\n");
            }
        }
    }
    public void xuatLapTop(int i){
        int checklt =0;
            if(SP[i] instanceof LapTop){
                checklt++;
                SP[i].Xuat();
            }
        if(checklt==0) System.out.println("Khong co san pham LAP TOP");
    }
    public void xuatMayTinh(int i){
        int checkmt =0;        
            if(SP[i] instanceof MayTinh){ 
                checkmt ++;
                SP[i].Xuat();
            }
        if(checkmt==0) System.out.println("Khong co san pham MAY TINH");
    }
    public void xuatBoSanPham(int i){
            if(SP[i].getMaSP().indexOf("SP")!=-1){ 
                SP[i].Xuat();
            }
    }

    //TIM KIEM
    public void timkiem(){
        int key;
        //DocFileJava("SanPham.txt");
        do{
            System.out.println("========TIM KIEM SAN PHAM========");
            System.out.println("1./ Tim kiem theo so luong");
            System.out.println("2./ Tim kiem theo don gia");
            System.out.println("3./ Tim kiem theo ma san pham");
            System.out.println("4./ Tuy Chon Tim Kiem");
            System.out.println("0./ QUAY LAI");
            System.out.print("LUA CHON CUA BAN: "); key = sc.nextInt();
            switch (key) {
                case 1:
                    int tk_sl;
                    int check1 = 0;
                    System.out.print("NHAP SO LUONG SAN PHAM MUON TIM KIEM: "); tk_sl = sc.nextInt();
                    for(int i=0; i<SP.length; i++){
                        if(SP[i].getSl() == tk_sl){
                            check1 = 1;
                            xuat(i);
                        }
                    }
                    if(check1==0) System.out.println("Khong co san pham co so luong:  "+tk_sl);
                break;
                case 2:
                    int check2 = 0;
                    double tk_g1, tk_g2;
                    System.out.print("Tim kiem theo gia tu: "); tk_g1 = sc.nextDouble(); System.out.print(" Den: "); tk_g2 = sc.nextDouble();
                    for(int i=0; i<SP.length; i++){
                        if(SP[i].getDonGia() >= tk_g1 && SP[i].getDonGia() <= tk_g2){
                            check2 = 1;
                            xuat(i);
                        }
                    }
                    if(check2 == 0) System.out.println("Khong co san pham gia tu "+ tk_g1+" den "+tk_g2);
                    break;
                case 3:
                    String masp;
                    int check3 = 0;
                    System.out.print("Nhap ma san pham can tim kiem: "); 
                    masp = sc.nextLine();
                    masp = sc.nextLine();
                    for(int i=0; i< SP.length; i++){
                        if((SP[i].getMaSP().indexOf(masp) != -1)){
                            check3 = 1;
                            xuat(i);
                            break;
                        }
                    }
                    if(check3 == 0) System.out.println("Loi ma san pham khong ton tai!");
                break;
                case 4:
                    int select1=0, giatoithieu=0, giatoida=0;
                    System.out.println("Ban Muon Tim Kiem Theo \n1./ May Tinh | 2./Lap Top | 3./ San Pham");
                    System.out.print("LUA CHON CUA BAN: "); select1 = sc.nextInt();
                    do{
                        if(select1<1 || select1 > 3){ 
                            System.out.println("BAN DA NHAP SAI HAY NHAP LAI!");
                            System.out.print("LUA CHON CAU BAN: "); select1 = sc.nextInt();
                        }
                    }while(select1<1 || select1 > 3);
                    System.out.print("Hay Nhap Gia Mong Muon Tu: "); giatoithieu = sc.nextInt(); System.out.print("Den:"); giatoida = sc.nextInt();
                    for(int i=0; i<N; i++){
                        if(select1 == 1){
                            if(SP[i] instanceof MayTinh){
                                if(SP[i].getDonGia() >= giatoithieu && SP[i].getDonGia() <= giatoida){
                                    xuat(i);
                                }
                            }
                        }
                        else if(select1 == 2){
                            if(SP[i] instanceof LapTop){
                                if(SP[i].getDonGia() >= giatoithieu && SP[i].getDonGia() <= giatoida){
                                    xuat(i);
                                }
                            }
                        }
                        else if(select1 == 3){
                            if(SP[i] instanceof SanPham){
                                if(SP[i].getDonGia() >= giatoithieu && SP[i].getDonGia() <= giatoida){
                                    xuat(i);
                                }
                            }
                        }
                    }
                break;
                default:
                    break;
            }
        }while(key != 0);
    }
    public SanPham timkiem_masp(String ma){
        DocFileJava("SanPham.txt");
        int i=0;
        while(i < N){
            if(ma.equals(SP[i].getMaSP())){
                xuat(i);
                break;
            }
            i++;
        }
        if(i>=N){
            System.err.println("Ma Khong Ton Tai");
            return null;
        }
        return SP[i];
    }
    public boolean timKiemChoNCC(String ma){
        
        for(int i = 0; i < N; i++) {
            if(SP[i] instanceof MayTinh){
                MayTinh temp = new MayTinh((MayTinh) SP[i]);
                if(temp.maSP.indexOf(ma) != -1) {
				return true;
			    }
            }else if(SP[i] instanceof LapTop){
                LapTop temp = new LapTop((LapTop) SP[i]);
                if(temp.maSP.indexOf(ma) != -1) {
				return true;
                }
            }else if(SP[i] instanceof SanPham){
                SanPham temp = new SanPham(SP[i]);
                if(temp.maSP.indexOf(ma) != -1) {
				return true;
                }
            }
        }
		return false;
	}

    //KIEM TRA MA SAN PHAM
    public void thayMaSP(int i){
        do{
            if(kiemtraMasp(SP[i].getMaSP(), i)){
                System.out.println();
                xuat(i);
                System.out.println("Ma San Pham Thu"+(i+1)+" co Ma: "+ SP[i].getMaSP()+" Bi Trung Lap. \nHay Bam Enter De Nhap Lai!");
                sc.nextLine();
                System.out.print("NHAP LAI MA SAN PHAM: "); String mamoi = sc.nextLine();
                SP[i].setMaSP(mamoi);
                GhiFileJava("SanPham.txt");
            }
        }while(kiemtraMasp(SP[i].getMaSP(), i));
    }
    public boolean kiemtraMasp(String maSP, int k){
        DocFileJava("SanPham.txt");
        for(int i=a-1; i>=0; i--){
            if(SP[i].getMaSP().equals(maSP) && i!=k) return true;
        }
        return false;
    }

    //THONG KE SAN PHAM
    public void thongke(){
        //DocFileJava("SanPham.txt");
        int choose;
        do{
            System.out.println("========THONG KE========");
            System.out.println("-1./ Loai San Pham");
            System.out.println("-2./ Gia");
            System.out.println("-3./ So luong");
            System.out.println("-0./ Thoat");
            System.out.print("|Lua Chon: "); choose = sc.nextInt();
            switch (choose) {
                case 1:
                    int loaithongke;
                    do{
                        System.out.println("--1./ LAPTOP VA MAY TINH");
                        System.out.println("--2./ Bo Phu Kien");
                        System.out.println("--0./ Quay lai");
                        System.out.print("LUA CHON CUA BAN: "); loaithongke = sc.nextInt();
                        switch (loaithongke) {
                            case 1:
                                int laptop=0, maytinh=0;
                                for(int i=0; i<N; i++){
                                    if(SP[i].getMaSP().indexOf("LAP") != -1){
                                         laptop++;
                                        }
                                    else if(SP[i].getMaSP().indexOf("MAY") != -1){ 
                                        maytinh++;
                                    }
                                }
                                System.out.println("LAP TOP co : "+laptop+" San Pham.");
                                System.out.println("MAY TINH co : "+maytinh+" San Pham.");
                                break;
                            case 2:
                                int boSP=0;
                                for(int i=0; i<N; i++){
                                    if(SP[i].getMaSP().indexOf("SP") != -1){
                                        boSP++;
                                    }
                                }
                                System.out.println("Bo phu kien co: "+boSP+" Bo.");
                                break;
                            case 0:
                                break;
                            default:
                                break;
                        }
                    }while(loaithongke!=0);
                    break;
                case 2:
                    int giathongke;
                    do{
                        System.out.println("---1./ Tu 0 - 5.000.000VND");
                        System.out.println("---2./ Tu 5.000.000VND - 15.000.000VND");
                        System.out.println("---3./ Tu 15.000.000VND - 50.000.000VND");
                        System.out.println("---0./ Quay lai");
                        System.out.print("LUA CHON CUA BAN: "); giathongke = sc.nextInt();
                        switch (giathongke) {
                            case 1:
                                int mucgia1=0;
                                for(int i=0; i<N; i++){
                                    if(SP[i].getDonGia() > 0 && SP[i].getDonGia() <= 5000000){
                                        mucgia1++;
                                        
                                    }
                                }System.out.println("---Muc gia loai 1 co tat ca: "+mucgia1+" San Pham.");
                                mucgia1=0;
                            break;
                            case 2: 
                                int mucgia2=0;
                                for(int i=0; i<N; i++){
                                    if(SP[i].getDonGia() >= 5000000 && SP[i].getDonGia() < 15000000){ 
                                        mucgia2++;
                                        
                                    }
                                }System.out.println("---Muc gia loai 2 co tat ca: "+mucgia2+" San Pham.");
                                mucgia2=0;
                            break;
                            case 3:
                                int mucgia3=0;
                                for(int i=0; i<N; i++){
                                    if(SP[i].getDonGia() >= 15000000 && SP[i].getDonGia() < 50000000){ 
                                        mucgia3++;
                                        
                                    }
                                }System.out.println("---Muc gia loai 3 co tat ca: "+mucgia3+" San Pham.");
                                mucgia3=0;
                            break;
                            case 0:
                                break;
                            }
                    }while(giathongke!=0);
                break;
                case 3:
                    int soluong, demsl=0;
                    System.out.print("NHAP SAN PHAM CO SO LUONG CAN THONG KE: "); soluong = sc.nextInt();
                    for(int i=0; i<N; i++){
                        if(SP[i].getSl() == soluong){
                            demsl++;
                        }
                    }System.out.println("Co Tat Ca: "+demsl+" San Pham co so luong la "+soluong);
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }while(choose!=0);
    }

    //THEM
    public void them(){
        System.out.println("========THEM SAN PHAM========");
        System.out.print("NHAP SO LUONG CAN THEM: "); int soluong = sc.nextInt();
        SP = Arrays.copyOf(SP, N+soluong);
        int select, j=N;
        N+=soluong;
        for(int i=j; i<N; i++){
            System.out.println("1./ Them May Tinh");
            System.out.println("2./ Them Lap Top");
            System.out.println("3./ Them bo San Pham");
            do{
                System.out.print("LUA CHON CUA BAN: "); select = sc.nextInt();
                if(select <1 || select >3){ 
                    System.out.println("LUA CHON SAI NHAP LAI!!");
                    System.out.print("LUA CHON CUA BAN: "); select = sc.nextInt();
                }
            }while(select<1||select>3);
            if(select == 1){
                SP[i] = new MayTinh();
                SP[i].Nhap();
                GhiFileJava("SanPham.txt");
                sc.nextLine();
                thayMaSP(i);
            }
            else if(select == 2){
                SP[i] = new LapTop();
                SP[i].Nhap();
                GhiFileJava("SanPham.txt");
                sc.nextLine();
                thayMaSP(i);
            }
            else if(select == 3){
                SP[i] = new SanPham();
                SP[i].Nhap();
                GhiFileJava("SanPham.txt");
                sc.nextLine();
                thayMaSP(i);
            }
        }
    }
    //SUA 
    public void xoa(){
        System.out.println("========XOA SAN PHAM========");
        String masp_xoa;
        System.out.print("---NHAP MA SAN PHAM CAN XOA:");
        masp_xoa = sc.next();
        int thongtin = 0;
        for(int i=0; i<N; i++){
            if(SP[i].getMaSP().indexOf(masp_xoa) != -1){
                for(int j=i; j<N-1; j++){
                    SP[j] = new SanPham(SP[j+1]);
                    }
                SP = Arrays.copyOf(SP, N-1);
                thongtin = 1;
                N--;
                GhiFileJava("SanPham.txt");
                break;
            }
        }
        if(thongtin == 1) System.out.println("----San pham da duoc xoa");
        else System.out.println("----Khong tim thay san pham can xoa");
    }
    //XOA
    public void sua(){
        System.out.println("========SUA SAN PHAM========");
        String ma_sua;
        System.out.print("NHAP MA SAN PHAM CAN SUA:"); ma_sua = sc.next();
        int i=0,check =0, n = SP.length;
        while(i<n){
            if(SP[i].getMaSP().indexOf(ma_sua) !=-1){
                check =1;
                SP[i].Xuat();
                int key;
                do{
                    System.out.println("1./Sua");
                    System.out.println("0./ Thoat");
                    System.out.print("LUA CHON CUA BAN: "); key = sc.nextInt();
                    switch(key){
                        case 1:
                            if(SP[i] instanceof LapTop){
                                SP[i].sua(SP[i]);
                            }
                            else if(SP[i] instanceof MayTinh){
                                SP[i].sua(SP[i]);
                            }
                            else if(SP[i] instanceof SanPham){
                                SP[i].sua(SP[i]);
                            }
                        case 0:
                        break;
                    }
                }while(key!=0);
                GhiFileJava("SanPham.txt");
            }
            i++;
        }
        if(check==0) System.out.println("Khong tim thay ma san pham can sua!"); 
    }

    //THAO TAC DANH SACH
    public void ThaoTac(){
        int key;
        System.out.println("========THAP TAC VOI DANH SACH SAN PHAM========");
        do{
            DocFileJava("SanPham.txt");
            System.out.println("1./ Them San Pham");
            System.out.println("2./ Xuat San Pham");
            System.out.println("3./ Sua San Pham");
            System.out.println("4./ Xoa San Pham ");
            System.out.println("5./ Tim Kiem San Pham");
            System.out.println("6./ Thong Ke");
            System.out.println("7./ Dat Hang");
            System.out.println("0./ Quay Lai");
            System.out.print("LUA CHON CUA BAN: "); key = sc.nextInt();
            switch (key) {
                case 1:
                    them();
                    break;
                case 2:
                    xuat(0);
                    break;
                case 3:
                    sua();
                    break;
                case 4:
                    xoa();
                    break;
                case 5:
                    timkiem();
                    break;
                case 6:
                    thongke();
                    break;
                case 7:
                    QuanLyGioHang();
                break;
                case 0:
                    break;
                default:
                    break;
            }
        }while(key!=0);
    }
    
    //THAO TAC GIO HANG
    public void QuanLyGioHang(){
        xuat(0);
        int sl;
        System.out.print("NHAP SO LUONG SAN PHAM MUON THEM: "); sl = sc.nextInt();
        dsgh.nhapGioHang(sl);
        ktsltonkho(sl);
        System.out.println("\t\t\tGIO HANG CUA BAN");
        int choose;
        do{
            DocFileJava("SanPham.txt");
            System.out.println("1./ Xem Chi Tiet Gio Hang");
            System.out.println("2./ Sua Gio Hang");
            System.out.println("3./ Bo Sung San Pham Gio Hang");
            System.out.println("4./ Xoa San Pham Gio Hang");
            System.out.println("5./ Dat Hang");
            System.out.println("0./ Quay Lai");
            System.out.print("LUA CHON CUA BAN: "); choose = sc.nextInt();
            switch (choose) {
                case 1:
                    int slgh = dsgh.getLength();
                    System.out.println("\t\t\t\tGIO HANG CUA BAN");
                    xemGioHang(slgh);
                    break;
                case 2:
                    System.out.print("NHAP MA SAN PHAM CAN SUA: "); String suamagh = sc.nextLine(); suamagh = sc.nextLine();
                    System.out.println("Co phai Don Hang ban Muon Sua Khong:");
                    int vitri = dsgh.timkiem(suamagh);
                    dsgh.suasp(vitri);
                break;
                case 3:
                    xuat(0);
                    System.out.print("Nhap So Luong San Pham Can Them: "); int slthem = sc.nextInt();
                    dsgh.them(slthem);
                    ktsltonkho(slthem);
                    dsgh.xuat();
                break;
                case 4:
                    dsgh.xuat();
                    System.out.println("Nhap Ma SP Can Xoa KHoi Gio Hang: "); 
                    String maxoa = sc.nextLine(); maxoa = sc.nextLine();
                    dsgh.xoa(maxoa);
                    dsgh.xuat();
                break;
                case 5:
                    thanhtien();
                break;
                default:
                    break;
            }
        }while(choose!=0);
    }
    public void xemGioHang(int sl){
        for(int i=0; i<sl; i++){
            timkiem_masp(dsgh.getMaSP(i));
            System.out.println("SO LUONG DAT HANG: "+ dsgh.getSoLuong(i));
        }
    }
    public void thanhtien(){
        int slSP = dsgh.getLength();
        xemGioHang(slSP);
        int sltSP; long tong=0;
        String madh;
        System.out.format("|| %5s | %10s | %15s | %15s |\n", "STT", "Thanh Tien", "Ma San Pham", "So Luong");
        for(int i=0; i<slSP; i++){
            madh = dsgh.getMaSP(i);
            sltSP = dsgh.getSoLuong(i);
            for(int j=0; j<N; j++){
                if(SP[j].getMaSP().equals(madh)){
                    if(SP[j].getMaSP().equals(madh)){
                        System.out.format("|| %5s | %10s | %15s | %15s |\n", (i+1), (SP[j].getDonGia()*sltSP), dsgh.getMaSP(i), dsgh.getSoLuong(i));
                        tong+= (SP[j].getDonGia()*sltSP);
                        System.out.println("SO TIEN PHAI THANH TOAN: "+tong);
                        int choose=2;
                    do{
                        System.out.println("BAN CO MUON MUA?");
                        System.out.println("1./ MUA");
                        System.out.println("2./ QUAY LAI");
                        System.out.print("LUA CHON CUA BAN: "); choose = sc.nextInt();
                        switch(choose){
                            case 1:
                                int capnhatsl = SP[j].getSl();
                                capnhatsl -= sltSP;
                                SP[j].setSl(capnhatsl);
                                //GhiFileJava("SanPham.txt");
                                dshd.themHoaDon(SP[j].getMaSP(), sltSP, SP[j].getDonGia(), tong);
                                choose = 2;
                            break;
                            default:
                            break;
                        }
                    }while(choose != 2);
                }
            }
        }
    }
    }

    public void ktsltonkho(int sl){
        int sldh;
        String maSPdh;
        for(int i=0; i<sl; i++){
            sldh = dsgh.getSoLuong(i);
            maSPdh = dsgh.getMaSP(i);
            for(int j=0; j<N; j++){
                if(kiemtraslSP(maSPdh, sldh)){
                    dsgh.suasp(i);
                    break;
                }
            }
        }
    }
    public boolean kiemtraslSP(String maSP, int slSP){
        DocFileJava("SanPham.txt");
        for(int i=0; i<N; i++){
            if(SP[i].getMaSP().equals(maSP)){
                if(slSP > SP[i].getSl()){
                    return true;
                }
            }
        }
        return false;
    }

    public void themSanPham(String maSP, String tenSP,int soLuong, long donGia){
        System.out.println(N);
        SP = Arrays.copyOf(SP, N+1);
        int j=N;
        this.N = N+1;
        if(maSP.startsWith("MAY")){
            MayTinh temp = new MayTinh(maSP, tenSP, soLuong, donGia, "", "", "", "", "", "", "", 0);
            SP[j] = new MayTinh();
            SP[j] = temp;
            SP[j].Xuat();
            GhiFileJava("SanPham.txt");
            xuat(0);
        }else
        if(maSP.startsWith("LAP")){
            LapTop temp= new LapTop(maSP, tenSP, soLuong, donGia, "", "", "", "", "", "", "", 0.0, 0.0);
            SP[j] = new LapTop();
            SP[j] = temp;
            SP[j].Xuat();
            GhiFileJava("SanPham.txt");
            xuat(0);
        }else
        if(maSP.startsWith( "SP")){
            SanPham temp = new SanPham(maSP, tenSP, soLuong, donGia, "", "", "", "", "", "");
            SP[j] = new SanPham();
            SP[j] = temp;
            SP[j].Xuat();
            GhiFileJava("SanPham.txt");
            xuat(0);
        }
    }
    public void capNhatSoLuong(String maCN, int sl){
        DocFileJava("SanPham.txt");
        for(int i=0; i < N; i++){
            if(SP[i].getMaSP().equals(maCN)){
                int temp = SP[i].getSl() + sl;
                SP[i].setSl(temp);
                break;
            }
        }
        GhiFileJava("SanPham.txt");
    }

    @Override
    public void DocFileJava(String fimename){
        int i=0;
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(fimename));
            N = dis.readInt();
            SP = new SanPham[N];
            try {
                while (true) {
                    String maSP = dis.readUTF();
                    String tenSP = dis.readUTF();
                    int Sl = dis.readInt();
                    long DonGia = dis.readLong();
                    String DonViTinh = dis.readUTF();
                    String OCung = dis.readUTF();
                    String ManHinh = dis.readUTF();
                    String Phim = dis.readUTF();
                    String Chuot = dis.readUTF();
                    String Loa = dis.readUTF();
                    if(maSP.indexOf("LAP") != -1){ 
                        String Pin = dis.readUTF();
                        Float CanNang = dis.readFloat();
                        Float KichThuoc = dis.readFloat();
                        SP[i] = new LapTop(maSP, tenSP, Sl, DonGia, DonViTinh, OCung, ManHinh, Phim, Chuot, Loa, Pin, CanNang, KichThuoc);
                    }
                    else if(maSP.indexOf("MAY") != -1){
                        String LoaiCase = dis.readUTF();
                        int Slkhecam = dis.readInt();
                        SP[i] = new MayTinh(maSP, tenSP, Sl, DonGia, DonViTinh, OCung, ManHinh, Phim, Chuot, Loa, LoaiCase, Slkhecam);
                    }
                    else if(maSP.indexOf("SP") != -1){
                        SP[i] = new SanPham(maSP, tenSP, Sl, DonGia, DonViTinh, OCung, ManHinh, Phim, Chuot, Loa);
                    }
                    i++;
                }
            } catch (EOFException e) {
            }
            finally{
                a=i;
                dis.close();
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    @Override
    public void GhiFileJava(String filename){
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
            dos.writeInt(N);
                for(int i=0; i<N; i++){
                    if(SP[i] instanceof LapTop){
                        SP[i] = (LapTop) SP[i];
                        SP[i].GhiFile(filename);
                    }
                    else if(SP[i] instanceof MayTinh){
                        SP[i] = (MayTinh) SP[i];
                        SP[i].GhiFile(filename);
                    }
                    else{
                        SP[i] = (SanPham) SP[i];
                        SP[i].GhiFile(filename);
                    }
                } 
            dos.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }
}
