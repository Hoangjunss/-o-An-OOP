//package THONGTIN;
import java.util.Arrays;
import java.util.Scanner;
public class DanhSachSanPham {
    Scanner sc = new Scanner(System.in);
    int N;
    SanPham[] SP = new SanPham[1];
    private Object dssp;
    public DanhSachSanPham(){}
    public DanhSachSanPham(int N, SanPham[] SP){
        this.N = N;
        this.SP = SP;
    }
    public DanhSachSanPham(DanhSachSanPham dssp){
        this.N = dssp.N;
        this.dssp = dssp.dssp;
    }

    /* private void ThongtinSP(){
        SP = new SanPham[53];
        SP[0] = new LapTop("lap001", "Acer Aspire 3 A314 35 P3G9", 5, 10990000, "May", "256 GB SSD", "14 inch, Full HD", "Ban Phim chiclet", "Touchpad da diem", "Am thanh stereo", "52 Wh", 1.7f, "720p", "323 x 228 x 19,9 mm");
        SP[1] = new LapTop("lap002", "Asus Vivobook X515EA i3", 5, 12990000, "May", "256 GB SSD", "15,6 inch, Full HD", "Ban phim chiclet", "Touchpad da diem", "Am thanh stereo", "42 Wh", 1.8f, "720p", "360 x 244 x 19,9 mm");
        SP[2] = new LapTop("lap003","HP 15s fq2716TU i3", 5, 13990000, "May", "256 GB SSD", "15,6 inch, Full HD", "Ban phim chiclet", "Touchpad da diem", "Am thanh stereo", "41 Wh", 1.7f, "720p", "363 x 242 x 19,9 mm");
        SP[3] = new LapTop("lap004","HP Pavilion 15 eg2082TU i5", 5, 16990000, "May", "512 GB SSD", "15,6 inch, Full HD", "Ban phim chiclet", "Touchpad da diem", "Am thanh stereo", "41 Wh", 1.7f, "720p", "363 x 242 x 19,9 mm");
        SP[4] = new LapTop("lap005","Acer Swift 3 SF314 511 55QE i5", 5, 20990000, "May", "512 GB SSD", "14 inch, Full HD", "Ban phim chiclet", "Touchpad da diem", "Am thanh stereo", "52 Wh", 1.19f, "720p", "323 x 228 x 15,9 mm");
        SP[5] = new LapTop("lap006","Asus Vivobook 16 X1605VA i5", 5, 23990000, "May", "512 GB SSD", "16 inch, Full HD", "Ban phim chiclet", "Touchpad da diem", "Am thanh stereo", "42 Wh", 1.8f, "720p", "360 x 244 x 19,9 mm");
        SP[6] = new LapTop("lap007","MacBook Air M2 2023", 5, 33990000, "May", "256 GB SSD", "13,6 inch, Liquid Retina", "Ban phim Magic Keyboard", "Touchpad Force Touch", "Am thanh stereo", "52,5 Wh", 1.29f, "720p", "304 x 212 x 16,1 mm");
        SP[7] = new LapTop("lap008","Dell XPS 13 9310", 5, 39990000, "May", "512 GB SSD", "13,4 inch, InfinityEdge", "Ban phim XPS", "Touchpad Precision", "Am thanh stereo", "52 Wh", 1.23f, "720p", "284 x 193 x 11,6 mm");
        SP[8] = new MayTinh("may001", "Dell Optiplex 9020 MT", 5, 10990000, "Bo", "SSD 120GB + HDD 500GB", "19 inch, Full HD", "Ban phim roi", "Logitech M170", "Am thanh stereo", "Mini Tower", 4);
        SP[9] = new MayTinh("may002", "Asus VivoPC VM62-G1029T", 5, 12990000, "Bo", "SSD 120GB + HDD 500GB", "21,5 inch, Full HD", "Ban phim roi", "Rapoo M200", "Am thanh stereo", "MicroATX", 2);
        SP[10] = new MayTinh("may003", "HP Pavilion 590-p0002TU", 5, 13990000, "Bo", "1TB 7200 rpm SATA HDD", "21,5 inch, Full HD", "Ban phim roi", "Zadez M218", "Am thanh stereo", "MicroATX", 2);
        SP[11] = new MayTinh("may004", "Lenovo ThinkCentre M920s SFF", 5, 16990000, "Bo", "500 GB 7200 RPM HDD", "23,8 inch, Full HD", "Ban phim roi", "Logitech M170", "Am thanh stereo", "MicroATX", 2);
        SP[12] = new MayTinh("may005", "MSI Trident X 10SF-012US", 5, 29990000, "Bo", "1TB SSD", "24,5 inch, 4K, OLED", "Ban phim co", "Logitech G102", "Am thanh vom 7.1", "Mini Tower", 7);
        SP[13] = new SanPham("oc001", "O cung", 5, 4990000, "cai", "Samsung 980 Pro", null, null, null, null);
        SP[14] = new SanPham("oc002", "O cung", 5, 4490000, "cai", "Western Digital Black SN850", null, null, null, null);
        SP[15] = new SanPham("oc003", "O cung", 5, 3990000, "cai", "Crucial P5 Plus", null, null, null, null);
        SP[16] = new SanPham("oc004", "O cung", 5, 3790000, "cai", "Seagate Barracuda Q5", null, null, null, null);
        SP[17] = new SanPham("oc005", "O cung", 5, 2990000, "cai", "Samsung 870 QVO", null, null, null, null);
        SP[18] = new SanPham("oc006", "O cung", 5, 2790000, "cai", "Seagate Barracuda", null, null, null, null);
        SP[19] = new SanPham("oc007", "O cung", 5, 2590000, "cai", "WD Blue", null, null, null, null);
        SP[20] = new SanPham("oc008", "O cung", 5, 2490000, "cai", "Western Digital Black", null, null, null, null);
        SP[21] = new SanPham("mh001", "Man Hinh", 5, 31990000, "cai", null, "LG UltraGear 27GP950", null, null, null);
        SP[22] = new SanPham("mh002", "Man Hinh", 5, 29990000, "cai", null, "ASUS ROG Swift PG27UQ", null, null, null);
        SP[23] = new SanPham("mh003", "Man Hinh", 5, 28990000, "cai", null, "Acer Predator XB273U", null, null, null);
        SP[24] = new SanPham("mh004", "Man Hinh", 5, 26990000, "cai", null, "Samsung Odyssey G7", null, null, null);
        SP[25] = new SanPham("mh005", "Man Hinh", 5, 24990000, "cai", null, "MSI Optix MAG274QRF-QD", null, null, null);
        SP[26] = new SanPham("mh006", "Man Hinh", 5, 23900000, "cai", null, "Dell Alienware AW2720HF", null, null, null);
        SP[27] = new SanPham("mh007", "Man Hinh", 5, 22990000, "cai", null, "ASUS TUF Gaming VG27AQ", null, null, null);
        SP[28] = new SanPham("mh008", "Man Hinh", 5, 21990000, "cai", null, "LG 27GL650F-B", null, null, null);
        SP[29] = new SanPham("bp001", "Ban Phim", 5, 4990000, "cai", null, null, "Razer BlackWidow V3", null, null);
        SP[30] = new SanPham("bp002", "Ban Phim", 5, 3990000, "cai", null, null, "Logitech G915 TKL", null, null);
        SP[31] = new SanPham("bp003", "Ban Phim", 5, 3490000, "cai", null, null, "Corsair K100 RGB", null, null);
        SP[32] = new SanPham("bp004", "Ban Phim", 5, 2990000, "cai", null, null, "HyperX Alloy Origins Core", null, null);
        SP[33] = new SanPham("bp005", "Ban Phim", 5, 2490000, "cai", null, null, "Logitech G512 Carbon", null, null);
        SP[34] = new SanPham("bp006", "Ban Phim", 5, 2290000, "cai", null, null, "Razer Huntsman Mini", null, null);
        SP[35] = new SanPham("bp007", "Ban Phim", 5, 2990000, "cai", null, null, "Filco Majestouch 2 TKL", null, null);
        SP[36] = new SanPham("bp008", "Ban Phim", 5, 2490000, "cai", null, null, "Gigabyte Aorus K1", null, null);
        SP[37] = new SanPham("c001", "Chuot", 5, 1990000, "cai", null, null, null, "Logitech G502 Hero", null);
        SP[38] = new SanPham("c002", "Chuot", 5, 3490000, "cai", null, null, null, "Logitech G Pro X Superlight", null);
        SP[39] = new SanPham("c003", "Chuot", 5, 3290000, "cai", null, null, null, "Razer DeathAdder V2 Pro", null);
        SP[40] = new SanPham("c004", "Chuot", 5, 2490000, "cai", null, null, null, "Zowie EC3-C", null);
        SP[41] = new SanPham("c005", "Chuot", 5, 1790000, "cai", null, null, null, "SteelSeries Rival 3", null);
        SP[42] = new SanPham("c006", "Chuot", 5, 1990000, "cai", null, null, null, "HyperX Pulsefire Haste", null);
        SP[43] = new SanPham("c007", "Chuot", 5, 2990000, "cai", null, null, null, "Asus ROG Keris", null);
        SP[44] = new SanPham("c008", "Chuot", 5, 2490000, "cai", null, null, null, "Gigabyte Aorus M5", null);
        SP[45] = new SanPham("l001", "Loa", 5, 2990000, "cai", null, null, null, null, "Edifier R1280T");
        SP[46] = new SanPham("l002", "Loa", 5, 1990000, "cai", null, null, null, null, "Logitech Z207");
        SP[47] = new SanPham("l003", "Loa", 5, 4990000, "cai", null, null, null, null, "Bose Companion 2 Series III");
        SP[48] = new SanPham("l004", "Loa", 5, 1490000, "cai", null, null, null, null, "JBL Quantum 200");
        SP[49] = new SanPham("l005", "Loa", 5, 1290000, "cai", null, null, null, null, "Logitech Z133");
        SP[50] = new SanPham("l006", "Loa", 5, 2990000, "cai", null, null, null, null, "Creative Stage Air");
        SP[51] = new SanPham("l007", "Loa", 5, 3490000, "cai", null, null, null, null, "Logitech Z407");
        SP[52] = new SanPham("l008", "Loa", 5, 5490000, "cai", null, null, null, null, "Edifier R1700BT");
    } */

    public void Nhap(){
        System.out.print("-|Nhap so luong san pham: "); N=sc.nextInt();
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
                    break;
                case 2:
                    SP[i] = new LapTop();
                    SP[i].Nhap();
                    break;
                case 3:
                    SP[i] = new SanPham();
                    SP[i].Nhap();
                    break;
                default: System.out.println("Chon Lai");
            }
        }
    }

    public void Xuat(){
        //ThongtinSP();
                int key;
                    do{
                        System.out.println("**Thong tin san pham**");
                        System.out.println("1./ San Pham LapTop");
                        System.out.println("2./ San Pham PC");
                        System.out.println("3./ Xem phu kien");
                        System.out.println("4./Xuat tat ca");
                        System.out.println("0./ Quay Lai");
                        System.out.print("Chon: "); key = sc.nextInt();
                        switch(key){
                            case 1:
                                int checklt =0;
                                for(int i=0; i<SP.length; i++){
                                    if(SP[i] instanceof LapTop){
                                        SP[i].Xuat();
                                        System.out.println("--------------------------------------");
                                        checklt = 1;
                                    }
                                }
                                if(checklt==0) System.out.println("Khong co san pham LAP TOP");
                                
                                break;
                            case 2:
                                int checkmt =0;
                                for(int i=0; i<SP.length; i++){
                                    if(SP[i] instanceof MayTinh){ 
                                        SP[i].Xuat();
                                        System.out.println("--------------------------------------");
                                        checkmt = 1;
                                    }
                                }
                                if(checkmt==0) System.out.println("Khong co san pham MAY TINH");
                                break;
                            /* case 3:
                                        int choose = 0;
                                        do{
                                            System.out.println("| Lua Chon Muc Phu Kien |");
                                            System.out.println("1./ O cung");
                                            System.out.println("2./ Man hinh");
                                            System.out.println("3./ Phim");
                                            System.out.println("4./ Chuot");
                                            System.out.println("5./ Loa");
                                            System.out.println("0./ Quay lai");
                                            System.out.print("--Nhap Lua Chon: "); choose = sc.nextInt();
                                            switch (choose){
                                                case 1:
                                                    for(int i=0; i<SP.length; i++){
                                                        if(SP[i].getOcung() != null && SP[i].getManhinh() == null){
                                                            System.out.println("******************");
                                                            System.out.println("Ma san pham: "+SP[i].getMasp()+" | O cung: "+SP[i].getOcung());
                                                            System.out.println("Gia: "+SP[i].getDongia()+ "VND/"+SP[i].getDonvitinh()+ " | So luong con lai: "+SP[i].getSl());
                                                        }   
                                                    }
                                                    break;
                                                case 2: 
                                                    for(int i=0; i<SP.length; i++){
                                                        if(SP[i].getManhinh() != null && SP[i].getOcung() == null){
                                                            System.out.println("******************");
                                                            System.out.println("Ma san pham: "+SP[i].getMasp()+" | Man Hinh: "+SP[i].getManhinh());
                                                            System.out.println("Gia: "+SP[i].getDongia()+ "VND/"+SP[i].getDonvitinh()+ " | So luong con lai: "+SP[i].getSl());
                                                        }   
                                                    }
                                                    break;
                                                case 3: 
                                                    for(int i=0; i<SP.length; i++){
                                                        if(SP[i].getPhim() != null && SP[i].getOcung() == null){
                                                            System.out.println("******************");
                                                            System.out.println("Ma san pham: "+SP[i].getMasp()+" | Phim: "+SP[i].getPhim());
                                                            System.out.println("Gia: "+SP[i].getDongia()+ "VND/"+SP[i].getDonvitinh()+ " | So luong con lai: "+SP[i].getSl());
                                                        }   
                                                    }
                                                    break;
                                                case 4: 
                                                    for(int i=0; i<SP.length; i++){
                                                        if(SP[i].getChuot() != null && SP[i].getOcung() == null){
                                                            System.out.println("******************");
                                                            System.out.println("Ma san pham: "+SP[i].getMasp()+" | Chuot: "+SP[i].getChuot());
                                                            System.out.println("Gia: "+SP[i].getDongia()+ "VND/"+SP[i].getDonvitinh()+ " | So luong con lai: "+SP[i].getSl());
                                                        }   
                                                    }
                                                    break;
                                                case 5: 
                                                    for(int i=0; i<SP.length; i++){
                                                        if(SP[i].getLoa() != null && SP[i].getOcung() == null){
                                                            System.out.println("******************");
                                                            System.out.println("Ma san pham: "+SP[i].getMasp()+" | Loa: "+SP[i].getLoa());
                                                            System.out.println("Gia: "+SP[i].getDongia()+ "VND/"+SP[i].getDonvitinh()+ " | So luong con lai: "+SP[i].getSl());
                                                        }   
                                                    }
                                                    break;
                                                case 0:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }while(choose!=0); */
                            case 3:  
                                int check = 0;
                                for(int i=0; i<SP.length; i++){
                                    if(SP[i] instanceof SanPham){ 
                                        SP[i].Xuat();
                                        System.out.println("--------------------------------------");
                                        check = 1;
                                    }
                                }
                                if(check == 0) System.out.println("Khong co bo san pham!");
                            case 4:
                                for(int i=0; i<SP.length; i++){
                                        SP[i].Xuat();
                                }
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Chon Lai");
                        }
                    }while(key!=0);
    }

    public void timkiem_sp(){
        int key;
        do{
            System.out.println("1./ Tim kiem theo so luong");
            System.out.println("2./ Tim kiem theo don gia");
            System.out.println("3./ Tim kiem theo ma san pham");
            System.out.println("0./ QUAY LAI");
            System.out.print("LUA CHON CUA BAN: "); key = sc.nextInt();
            switch (key) {
                case 1:
                    int tk_sl;
                    int check1 = 0;
                    System.out.print("NHAP SO LUONG SAN PHAM MUON TIM KIEM: "); tk_sl = sc.nextInt();
                    for(int i=0; i<SP.length; i++){
                        if(SP[i].getSl() == tk_sl){
                            SP[i].Xuat();
                            check1 = 1;
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
                            SP[i].Xuat();
                            check2 = 1;
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
                        if((SP[i] == timkiem_masp(masp))){
                            SP[i].Xuat();
                            check3 = 1;
                            break;
                        }
                    }
                    if(check3 == 0) System.out.println("Loi ma san pham khong ton tai!");
                break;
                default:
                    break;
            }
        }while(key != 0);

    }

    public void timkiem_masp(){
        //ThongtinSP();
        String masp;
        int check = 0;
        System.out.print("Nhap ma san pham can tim kiem: "); masp = sc.nextLine();
        for(int i=0; i< SP.length; i++){
            if((SP[i].getMasp()).equals(masp)){
                SP[i].Xuat();
                check = 1;
                break;
            }
        }
        if(check==0) System.out.println("Loi ma san pham khong ton tai!");
    }

    public SanPham timkiem_masp(String ma){
        int i=0;
        while(i < N){
            if(ma.equals(SP[i].getMasp())){
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

    public void thongke1(){
        //ThongtinSP();
        int choose;
        do{
            System.out.println("-|Thong Ke|");
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
                        System.out.println("--2./ Cac Loai Phu Kien");
                        System.out.println("--0./ Quay lai");
                        System.out.print("|Lua Chon: "); loaithongke = sc.nextInt();
                        switch (loaithongke) {
                            case 1:
                                int laptop=0, maytinh=0;
                                for(int i=0; i<SP.length; i++){
                                    if(SP[i] instanceof LapTop) laptop++;
                                    else if(SP[i] instanceof MayTinh) maytinh++;
                                }
                                System.out.println("LAP TOP co : "+laptop+" San Pham.");
                                System.out.println("MAY TINH co : "+maytinh+" San Pham.");
                                break;
                            case 2:
                                int oc=0, mh=0, bp=0, ch=0, loa=0;
                                for(int i=0; i<SP.length; i++){
                                    if(SP[i] instanceof SanPham){
                                        if(SP[i].getOCung() != null && SP[i].getManHinh() == null) oc++;
                                        else if(SP[i].getManHinh()!=null && SP[i].getOCung() == null) mh++;
                                        else if(SP[i].getPhim()!=null && SP[i].getOCung() == null) bp++;
                                        else if(SP[i].getChuot()!=null && SP[i].getOCung() == null ) ch++;
                                        else if(SP[i].getLoa()!=null && SP[i].getOCung() == null) loa++;
                                    }
                                }
                                System.out.println("O cung hien co: "+oc+" San Pham.");
                                System.out.println("Man Hinh hien co: "+mh+" San Pham.");
                                System.out.println("Ban Phim hien co: "+bp+" San Pham.");
                                System.out.println("Chuot hien co: "+ch+" San Pham.");
                                System.out.println("Loa hien co: "+loa+" San Pham.");
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
                        System.out.println("--1./ Gia LAPTOP & MAY TINH");
                        System.out.println("--2./ Gia Cac Loai Phu Kien");
                        System.out.println("--0./ Quay lai");
                        System.out.print("|Lua Chon: "); giathongke = sc.nextInt();
                        switch (giathongke) {
                            case 1:
                                int mucgiatk;
                                int mucgia1=0, mucgia2 = 0, mucgia3 = 0;
                                do{
                                    System.out.println("---1./ Tu 0 - 5.000.000VND");
                                    System.out.println("---2./ Tu 5.000.000VND - 15.000.000VND");
                                    System.out.println("---3./ Tu 15.000.000VND - 50.000.000VND");
                                    System.out.println("---0./ Quay lai");
                                    System.out.print("Lua chon : "); mucgiatk = sc.nextInt();
                                    switch(mucgiatk){
                                        case 1:
                                            for(int i=0; i<SP.length; i++){
                                                if(SP[i] instanceof LapTop || SP[i] instanceof MayTinh){
                                                    if(SP[i].getDonGia() >= 0 && SP[i].getDonGia() < 5000000){
                                                        SP[i].Xuat();
                                                        mucgia1++;
                                                    }
                                                }
                                            }System.out.println("---Muc gia loai 1 co tat ca: "+mucgia1+" San Pham.");
                                            mucgia1=0;
                                            break;
                                        case 2: 
                                            for(int i=0; i<SP.length; i++){
                                                if(SP[i] instanceof LapTop || SP[i] instanceof MayTinh){
                                                    if(SP[i].getDonGia() >= 5000000 && SP[i].getDonGia() < 15000000){
                                                        SP[i].Xuat();
                                                        mucgia2++;
                                                    }
                                                }
                                            }System.out.println("---Muc gia loai 2 co tat ca: "+mucgia2+" San Pham.");
                                            mucgia2=0;
                                            break;
                                        case 3:
                                            for(int i=0; i<SP.length; i++){
                                                if(SP[i] instanceof LapTop || SP[i] instanceof MayTinh){
                                                    if(SP[i].getDonGia() >= 15000000 && SP[i].getDonGia() < 50000000){
                                                        SP[i].Xuat();
                                                        mucgia3++;
                                                    }
                                                }
                                            }System.out.println("---Muc gia loai 3 co tat ca: "+mucgia3+" San Pham.");
                                            mucgia3=0;
                                            break;
                                        case 0:
                                            break;
                                    }
                                }while(mucgiatk!=0);
                                
                                break;
                            case 2:
                                int mucgiapk, giapk1=0, giapk2=0, giapk3=0;
                                do{
                                    System.out.println("---1./ Tu 0 - 5.000.000VND");
                                    System.out.println("---2./ Tu 5.000.000VND - 15.000.000VND");
                                    System.out.println("---3./ Tu 15.000.000VND - 50.000.000VND");
                                    System.out.println("---0./ Quay lai");
                                    System.out.print("Lua chon : "); mucgiapk = sc.nextInt();
                                    switch(mucgiapk){
                                        case 1:
                                            for(int i=0; i<SP.length; i++){
                                                if(!(SP[i] instanceof LapTop) || !(SP[i] instanceof MayTinh)){
                                                    if(SP[i].getDonGia() >= 0 && SP[i].getDonGia() < 5000000){
                                                        SP[i].Xuat();
                                                        giapk1++;
                                                    }
                                                }
                                            }System.out.println("---Muc gia loai 1 co tat ca: "+giapk1+" San Pham.");
                                            giapk1=0;
                                            break;
                                        case 2: 
                                            for(int i=0; i<SP.length; i++){
                                                if(!(SP[i] instanceof LapTop) || !(SP[i] instanceof MayTinh)){
                                                    if(SP[i].getDonGia() >= 5000000 && SP[i].getDonGia() < 15000000){
                                                        SP[i].Xuat();
                                                        giapk2++;
                                                    }
                                                }
                                            }System.out.println("---Muc gia loai 2 co tat ca: "+giapk2+" San Pham.");
                                            giapk2=0;
                                            break;
                                        case 3:
                                            for(int i=0; i<SP.length; i++){
                                                if(!(SP[i] instanceof LapTop) || !(SP[i] instanceof MayTinh)){
                                                    if(SP[i].getDonGia() >= 15000000 && SP[i].getDonGia() < 50000000){
                                                        SP[i].Xuat();
                                                        giapk3++;
                                                    }
                                                }
                                            }System.out.println("---Muc gia loai 3 co tat ca: "+giapk3+" San Pham.");
                                            giapk3=0;
                                            break;
                                        case 0:
                                            break;
                                    }
                                }while(mucgiapk!=0);
                                break;
                            case 0:
                                break;
                            default:
                                break;
                        }
                    }while(giathongke!=0);
                case 3:
                    int soluong, demsl=0;
                    System.out.print("--Nhap so luong san pham: "); soluong = sc.nextInt();
                    for(int i=0; i<SP.length; i++){
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

    public void themsp(){
        //ThongtinSP();
        N = SP.length;
        SP = Arrays.copyOf(SP, N+1);
        SP[N] = new SanPham();
        System.out.println("--Lua chon san pham can them");
        int key;
        System.out.println("1./ Lap Top");
        System.out.println("2./ May tinh");
        System.out.println("3./ San pham khac");
        System.out.print("Chon: "); key = sc.nextInt();
        switch (key) {
            case 1:
                SP[N] = new LapTop();
                SP[N].Nhap();
                break;
            case 2:
                SP[N] = new MayTinh();
                SP[N].Nhap();
                break;
            case 3:
                SP[N] = new SanPham();
                SP[N].Nhap();
            default:
                break;
        }
    }

    public void xoa_sp(){
        String masp_xoa;
        System.out.print("---NHAP MA SAN PHAM CAN XOA:");
        masp_xoa = sc.next();
        int thongtin = 0;
        int n = SP.length;
        for(int i=0; i<n; i++){
            if(SP[i] == timkiem_masp(masp_xoa)){
                for(int j=i; j<n-1; j++){
                    SP[j] = new SanPham(SP[j+1]);
                    /* if(SP[j] instanceof MayTinh){
                        if(SP[j+1] instanceof MayTinh){
                            MayTinh mt = new MayTinh();
                            mt = (MayTinh)SP[j];
                            mt = (MayTinh)SP[j+1];
                        }
                        else if(SP[j+1] instanceof LapTop || SP[j+1] instanceof SanPham){

                        }
                    }
                    else if(SP[j] instanceof LapTop){
                        if(SP[j+1] instanceof LapTop){
                            LapTop lt = new LapTop();
                            lt = (LapTop)SP[j];
                            lt = (LapTop)SP[j+1];
                        }
                        else if(SP[j+1] instanceof MayTinh | SP[j] instanceof SanPham){

                        }
                    }
                    else if(SP[j] instanceof SanPham){
                        if(SP[j+1] instanceof SanPham){
                            SanPham lt = new SanPham();
                            lt = (SanPham)SP[j];
                            lt = (SanPham)SP[j+1];
                        }
                        else if(SP[j+1] instanceof MayTinh | SP[j] instanceof LapTop){

                        } */
                    }
                
                SP = Arrays.copyOf(SP, n-1);
                thongtin = 1;
                n--;
                break;
            }
            if (i == (n-1)){
                SP = Arrays.copyOf(SP, n-1);
                thongtin = 1;
                n--;
            }
        }
        if(thongtin == 1) System.out.println("----San pham da duoc xoa");
        else System.out.println("----Khong tim thay san pham can xoa");
    }

    public void sua_sp(){
        String ma_sua;
        System.out.print("----NHAP MA SAN PHAM CAN SUA:"); ma_sua = sc.next();
        int thongtin = 0, check, i=0, n = SP.length;
        while(i<n){
            if(SP[i] == timkiem_masp(ma_sua)){
                SP[i].Xuat();
                System.err.println("CO PHAI MA SAN PHAM CAN SUA? 1./CO | 2./KHONG");
                check = sc.nextInt();
                if(check == 2) break;
                int key;
                do{
                    System.out.println("1./Sua tat ca");
                    System.out.println("2./Sua chi tiet");
                    System.out.println("3./ Thoat");
                    System.out.print("LUA CHON CUA BAN: "); key = sc.nextInt();
                    switch(key){
                        case 1:
                            String Tensp;
                            int Sl;
                            long Dongia;
                            String Donvitinh;
                            String Ocung;
                            String Manhinh;
                            String Phim;
                            String Chuot;
                            String Loa;
                            if(SP[i] instanceof SanPham){
                                    System.out.println("NHAP THONG TIN CAN SUA");
                                    System.out.print("Ten San Pham: "); Tensp = sc.nextLine(); SP[i].setTensp(Tensp);
                                    System.out.print("So luong: "); Sl = sc.nextInt(); SP[i].setSl(Sl);
                                    System.out.print("Don Gia: "); Dongia = sc.nextLong(); SP[i].setDonGia(Dongia);
                                    System.out.print("Don vi tinh: "); Donvitinh = sc.nextLine(); SP[i].setDonViTinh(Donvitinh);
                                    sc.nextLine();
                                    System.out.print("O cung: "); Ocung = sc.nextLine(); SP[i].setOCung(Ocung);
                                    System.out.print("Man Hinh: "); Manhinh = sc.nextLine(); SP[i].setManHinh(Manhinh);
                                    System.out.print("Phim: "); Phim = sc.nextLine(); SP[i].setPhim(Phim);
                                    System.out.print("Chuot: "); Chuot = sc.nextLine(); SP[i].setChuot(Chuot);
                                    System.out.print("Loa: "); Loa = sc.nextLine(); SP[i].setLoa(Loa);
                            }
                            else if(SP[i] instanceof MayTinh){
                                String LoaiCase;
                                int Slkhecam;
                                System.out.println("NHAP THONG TIN CAN SUA");
                                System.out.print("Ten San Pham: "); Tensp = sc.nextLine(); SP[i].setTensp(Tensp);
                                System.out.print("So luong: "); Sl = sc.nextInt(); SP[i].setSl(Sl);
                                System.out.print("Don Gia: "); Dongia = sc.nextLong(); SP[i].setDonGia(Dongia);
                                System.out.print("Don vi tinh: "); Donvitinh = sc.nextLine(); SP[i].setDonViTinh(Donvitinh);
                                sc.nextLine();
                                System.out.print("O cung: "); Ocung = sc.nextLine(); SP[i].setOCung(Ocung);
                                System.out.print("Man Hinh: "); Manhinh = sc.nextLine(); SP[i].setManHinh(Manhinh);
                                System.out.print("Phim: "); Phim = sc.nextLine(); SP[i].setPhim(Phim);
                                System.out.print("Chuot: "); Chuot = sc.nextLine(); SP[i].setChuot(Chuot);
                                System.out.print("Loa: "); Loa = sc.nextLine(); SP[i].setLoa(Loa);

                            }
                            else if(SP[i] instanceof LapTop){
                                String Pin;
                                Float Cannang;
                                String Webcam;
                                String Kichthuoc;
                                System.out.println("NHAP THONG TIN CAN SUA");
                                System.out.print("Ten San Pham: "); Tensp = sc.nextLine(); SP[i].setTensp(Tensp);
                                System.out.print("So luong: "); Sl = sc.nextInt(); SP[i].setSl(Sl);
                                System.out.print("Don Gia: "); Dongia = sc.nextLong(); SP[i].setDonGia(Dongia);
                                System.out.print("Don vi tinh: "); Donvitinh = sc.nextLine(); SP[i].setDonViTinh(Donvitinh);
                                sc.nextLine();
                                System.out.print("O cung: "); Ocung = sc.nextLine(); SP[i].setOCung(Ocung);
                                System.out.print("Man Hinh: "); Manhinh = sc.nextLine(); SP[i].setManHinh(Manhinh);
                                System.out.print("Phim: "); Phim = sc.nextLine(); SP[i].setPhim(Phim);
                                System.out.print("Chuot: "); Chuot = sc.nextLine(); SP[i].setChuot(Chuot);
                                System.out.print("Loa: "); Loa = sc.nextLine(); SP[i].setLoa(Loa);

                            }
                        break;
                            case 2:
                                String Tensp1;
                                int Sl1;
                                long Dongia1;
                                String Donvitinh1;
                                String Ocung1;
                                String Manhinh1;
                                String Phim1;
                                String Chuot1;
                                String Loa1;
                                int key_1;
                                do{
                                    System.out.println("CHON THONG TIN CAN SUA");
                                    System.out.println("1./ Ten San Pham ");
                                    System.out.println("2./ So luong");
                                    System.out.println("3./ Don Gia");
                                    System.out.println("4./ Don vi tinh");
                                    System.out.println("5./ O cung");
                                    System.out.println("6./ Man Hinh");
                                    System.out.println("7./ Phim");
                                    System.out.println("8./ Chuot");
                                    System.out.println("9./ Loa");
                                    if(SP[i] instanceof LapTop){
                                        System.out.println("10./ Loa");
                                        System.out.println("11./ Loa");
                                        System.out.println("12./ Loa");
                                        System.out.println("13./ Loa");
                                    }
                                    else if(SP[i] instanceof MayTinh){
                                        System.out.println("10./ Loai case");
                                        System.out.println("11./ So luong khe cam");
                                    }
                                    System.out.println("0./ Quay Lai");
                                    System.out.print("LUA CHON CUA BAN: "); key_1 = sc.nextInt();
                                    switch(key_1){
                                        case 1:
                                            System.out.print("Ten San Pham: "); Tensp1 = sc.nextLine(); SP[i].setTensp(Tensp1);
                                        break;
                                        case 2:
                                            System.out.print("So luong: "); Sl1 = sc.nextInt(); SP[i].setSl(Sl1);
                                        break;
                                        case 3:
                                             System.out.print("Don Gia: "); Dongia1 = sc.nextLong(); SP[i].setDonGia(Dongia1);
                                        break;
                                        case 4:
                                            System.out.print("Don vi tinh: "); Donvitinh1 = sc.nextLine(); SP[i].setDonViTinh(Donvitinh1);
                                        break;
                                        case 5:
                                            System.out.print("O cung: "); Ocung = sc.nextLine(); SP[i].setOCung(Ocung);
                                        break;
                                        case 6:
                                            System.out.print("Man Hinh: "); Manhinh = sc.nextLine(); SP[i].setManHinh(Manhinh);
                                        break;
                                        case 7:
                                            System.out.print("Phim: "); Phim = sc.nextLine(); SP[i].setPhim(Phim);
                                        break;
                                        case 8:
                                            System.out.print("Chuot: "); Chuot = sc.nextLine(); SP[i].setChuot(Chuot);
                                        break;
                                        case 9:
                                            System.out.print("Loa: "); Loa = sc.nextLine(); SP[i].setLoa(Loa);
                                        break;
                                        case 0:
                                        break;
                                        default:

                                    }

                                }while(key_1!=0);
                                break;

                            case 0:
                             break;
                    }

                }while(key!=0);
            }
        }
    }
}
