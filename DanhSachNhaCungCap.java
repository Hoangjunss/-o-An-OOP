import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DanhSachNhaCungCap {
    private int n,a=0;
    private NhaCungCap[] dsncc = new NhaCungCap[0];
    
    Scanner sc = new Scanner(System.in);
    
    public DanhSachNhaCungCap(){}
    public DanhSachNhaCungCap(int n, NhaCungCap[] dsncc){
        this.n = n;
        this.dsncc = dsncc;
    }
    public DanhSachNhaCungCap(DanhSachNhaCungCap dsncc){
        this.n = dsncc.n;
        this.dsncc = dsncc.dsncc;
    }

    public void nhap(){
        System.out.print("--Nhap So Luong Nha Cung Cap: ");
        n = sc.nextInt();
        dsncc = new NhaCungCap[n];
        System.out.println("--Nhap Thong Tin Nha Cung Cap:");
        for(int i=0;i<n;i++){
            System.out.println("\t\t\t\t\tNHA CUNG CAP THU "+ (i+1));
            dsncc[i] = new NhaCungCap();
            dsncc[i].nhap();
            ghiFileJava("NhaCungCap.txt");
            if(i>0){
                thayMaNCC(i);
            }
            thaySDT(i);
        }
        
    }

    public void xuat(){
        System.out.println("\t\t\t\t\t=====DANH SACH NHA CUNG CAP=====");
        System.out.println("======================================================================================================================");
        System.out.format("|| %4s | %10s | %26s| %40s | %20s ||\n", "STT","MA NCC" , "TEN NCC" , "DIA CHI" , "SDT");
        try {
            docFileJava("NhaCungCap.txt");
			for(int i = 0; i < n; i++) {
				System.out.format("|| %4s ", (i + 1));
                dsncc[i].xuat();
			}
		}catch(NullPointerException npe) {}
        System.out.println("======================================================================================================================");
    }

//KIỂM TRA VÀ BẮT BUỘC THAY ĐỔI NẾU TRÙNG MaNCC
    public void thayMaNCC(int i){
        String maNCC = dsncc[i].getMaNCC();
        String maDoi = "";
        do{
            if(kiemTraMaNCC(maNCC, i)){
                System.out.println();
                xuat();
                System.out.println("\nNha Cung Cap Thu " + (i+1) + " Co Ma " + maNCC + " Bi Trung. Nhan ENTER De Tiep Tuc!");
                sc.nextLine();sc.nextLine();
                System.out.print("Nhap Lai Ma NCC Cho Nha Cung Cap: ");
                maDoi = sc.nextLine();
                dsncc[i].setMaNCC(maDoi);
                ghiFileJava("NhaCungCap.txt");
                maNCC = dsncc[i].getMaNCC();
            }
        }while(kiemTraMaNCC(maNCC, i));
    }

    public boolean kiemTraMaNCC(String maNCC, int k){
        docFileJava("NhaCungCap.txt");
        for(int i=a - 1; i>=0 ; i--){
            if(dsncc[i].getMaNCC().equals(maNCC) && i!=k){
                return true;
            }
        }
        return false;
    }

//KIỂM TRA SDT 
    public void thaySDT(int i){
        String sdt = dsncc[i].getSdt();
        String sdtDoi = "";
        do{
            if(!isNumberic(dsncc[i].getSdt())){
                System.out.println("So dien thoai phai hoan toan la so!!!.\nNhan ENTER de tiep tuc!");
                sc.nextLine();sc.nextLine();
                System.out.print("Nhap Lai SDT Cho Nha Cung Cap: ");
                sdtDoi = sc.nextLine();
                dsncc[i].setSdt(sdtDoi);
                ghiFileJava("NhaCungCap.txt");
                sdt = dsncc[i].getSdt();
            }
        }while(!isNumberic(sdt));
    }
    //Kiểm tra xem chuỗi nhập sdt nhập vào có hoàn toàn là số hoặc 
    public boolean isNumberic(String sdt){
        return sdt.matches("\\d+");
        //return sdt.matches("[+]?\\d+");
        //[+] đại diện cho bất kỳ dấu nào trong [ ], tức là dấu - hoặc dấu +.
        //? đại diện cho việc có hoặc không có dấu (- hoặc +).
        //\\d+ vẫn giữ nguyên, đại diện cho bất kỳ chữ số nào và phải có ít nhất một chữ số.
    }
//THÊM THEO SỐ LƯỢNG
    public void them(){
        System.out.print("So Luong Can Them: ");
        int soLuong = sc.nextInt();
        int j = n;
        int temp = n + soLuong;
        dsncc = Arrays.copyOf(dsncc,n+soLuong);
        n+=soLuong;
        for(int i = j;i<(temp);i++){
            System.out.println("\t\t\t\t\tNHA CUNG CAP THU " + (i+1));
            dsncc[i] = new NhaCungCap();
            dsncc[i].nhap();
            ghiFileJava("NhaCungCap.txt");
            thayMaNCC(i);
            thaySDT(i);
        }
    }
//XÓA NHÀ CUNG CẤP
    public void xoa(){
        System.out.print("Nhap Ma Nha Cung Cap Can Xoa:");
        String maXoa = sc.nextLine();
        boolean daXoa = false; 
        for(int i=0; i<n; i++){
            if(dsncc[i].getMaNCC().equals(maXoa)){
                for(int j=i; j<n-1;j++){
                    dsncc[j] = new NhaCungCap(dsncc[j+1]);
                }
                dsncc = Arrays.copyOf(dsncc, n-1);
                daXoa = true;
                n--;
                ghiFileJava("NhaCungCap.txt");
                break;
            }
        }
        if(daXoa){
            System.out.println("Nha Cung Cap Da Duoc Xoa!");
        }else{ 
            System.out.println("Khong Tim Thay Nha Cung Cap Can Xoa!");
        }
    }
    
    //SỬA THÔNG TIN, SỬA HẾT HOẶC TỪNG THUỘC TÍNH
    public void sua(){
        int choice1 =0;
        do{
            System.out.print("\n--Nhap Ma Nha Cung Cap Can Sua: ");
            String maSua = sc.next();
            NhaCungCap nccCanSua = timKiem_Ma(maSua);
            if(nccCanSua != null){
                NhaCungCap temp = new NhaCungCap(timKiem_Ma(maSua));
                System.out.println("Thong Tin Nha Cung Cap Can Sua:");
                System.out.println("======================================================================================================================");
                System.out.format("|| %10s | %26s| %40s | %20s ||\n", "MA NCC" , "TEN NCC" , "DIA CHI" , "SDT");
                System.out.print("|");
                temp.xuat();
                System.out.println("======================================================================================================================");
                System.out.println("Xac Nhan Dung Nha Cung Cap Can Sua Khong! \n1:Dung \n2:Sai,Can Nhap Lai! \n0:Thoat");
                choice1 = sc.nextInt();
                switch (choice1) {
                    case 1:
                        System.out.println("Chon lua cach sua:");
                        System.out.println("1: Sua tat ca");
                        System.out.println("2: Sua tung dac diem");
                        System.out.println("0: Thoat");
                        System.out.print("Lua chon cua ban: ");
                        int choice2 = sc.nextInt();
                        choice1=0;
                        switch (choice2) {
                            case 1:
                                // Sua tat ca
                                nccCanSua.nhap(); // Nhap lai toan bo thong tin
                                ghiFileJava("NhaCungCap.txt");
                                thayMaNCC(timKiem_Private(nccCanSua));
                                thaySDT(timKiem_Private(nccCanSua));
                                break;
        
                            case 2:
                                // Sua tung dac diem
                                suaTungDacDiem(nccCanSua);
                                break;
        
                            case 0:
                                return;
                            default:
                                System.out.println("Lua Chon Khong Hop Le!");
                                break;
                        }
                        break;
                    case 2:
                    
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Lua Chon Khong Hop Le!");
                        break;
                }
            }else{
                System.out.println("Khong Tim Thay Nha Cung Cap Can Sua!");
            }
        }while(choice1 != 0);
    }

    private void suaTungDacDiem(NhaCungCap ncc) {

        System.out.println("Chon dac diem can sua:");
        System.out.println("1: Ma NCC");
        System.out.println("2: Ten NCC");
        System.out.println("3: Dia Chi NCC");
        System.out.println("4: SDT NCC");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Nhap Ma NCC moi: ");
                ncc.setMaNCC(sc.next());
                ghiFileJava("NhaCungCap.txt");
                thayMaNCC(timKiem_Private(ncc));
                break;

            case 2:
                System.out.print("Nhap Ten NCC moi: ");
                ncc.setTen(sc.next());
                ghiFileJava("NhaCungCap.txt");
                break;
            case 3:
                System.out.print("Nhap Dia Chi NCC mô: ");
                ncc.setDiaChi(sc.next());
                ghiFileJava("NhaCungCap.txt");
                break;
            case 4:
                System.out.print("Nhap SDT NCC moi: ");
                ncc.setSdt(sc.next());
                ghiFileJava("NhaCungCap.txt");
                thaySDT(timKiem_Private(ncc));
                break;
            // Thêm các trường và lựa chọn khác tùy theo cấu trúc NhaCungCap

            default:
                System.out.println("Lua Chon Khong Hop Le!");
                break;
        }
    }

    //TÌM KIẾM TRONG DANH SÁCH
    public NhaCungCap timKiem_Ma(String tkNCC){
        int i=0;
        while(i<n){
            if(dsncc[i].getMaNCC().equals(tkNCC)){
                break;
            }
            i++;
        }
        if(i>=n){
            System.out.println("Ma Nha Cung Cap Sai Hoac Khong Ton Tai!");
            return null;
        }
        return dsncc[i];
    }

    public void timKiem_Ma(){
        System.out.println("Nhap Ma Nha Cung Cap Can Tim: ");
        String maSearch = sc.nextLine();
        int i=0,j=1;
        boolean flag = false;
        System.out.println("======================================================================================================================");
        System.out.format("|| %4s | %10s | %26s| %40s | %20s ||\n", "STT","MA NCC" , "TEN NCC" , "DIA CHI" , "SDT");
        while(i<n){
            if(dsncc[i].getMaNCC().indexOf(maSearch) != -1){
                flag = true;
                try {
                    docFileJava("NhaCungCap.txt");
                    System.out.format("|| %4s ", (j));
                    j++;
                    dsncc[i].xuat();
                }catch(NullPointerException npe) {}
            }
            
            i++;
        }
        System.out.println("======================================================================================================================");
        if(flag == false){
            System.out.println("Ma Nha Cung Cap Sai Hoac Khong Ton Tai!");
        }
    }

    public NhaCungCap timKiem_Ten(String ten){
        int i=0;
        while(i<n){
            if (dsncc[i].getTen().equalsIgnoreCase(ten)) {
                break;
            }
            if(dsncc[i].getTen().indexOf(ten) != -1){
                break;
            }
            i++;
        }
        if(i>=n){
            System.out.println("Ten Nha Cung Cap Sai Hoac Khong Ton Tai!");
            return null;
        }
        return dsncc[i];
    }
    
    public NhaCungCap timKiem_Sdt(String sdt){
        int i=0;
        while(i<n){
           if (dsncc[i].getSdt().equalsIgnoreCase(sdt)) {
                break;
            }
            if(dsncc[i].getSdt().indexOf(sdt) != -1){
                break;
            }
            i++;
        }
        if(i>=n){
            return null;
        }
        return dsncc[i];
    }

    private int timKiem_Private(NhaCungCap tkNCC){
        int i=0;
        while(i<n){
            if(dsncc[i].getMaNCC().equals(tkNCC.getMaNCC())){
                break;
            }
            i++;
        }
        return i;
    }
//TÌM KIẾM CHÍNH
    public void timKiem(){
        int select =0;
        while(true){
            System.out.println("\n\t\t\t\t\t======BANG LUA CHON======");
			System.out.println("\t\t\t\t\t1.An phim 1 de tim kiem nha cung cap theo ma");
			System.out.println("\t\t\t\t\t2.An phim 2 de tim kiem nha cung cap theo ten");
			System.out.println("\t\t\t\t\t3.An phim 3 de tim kiem nha cung cap theo so dien thoai");
			System.out.println("\t\t\t\t\t4.An phim 4 de thoat");
			System.out.print("Lua chon ban la: ");
			select = sc.nextInt();
			sc.nextLine();
			switch(select) {
				case 1:
                    timKiem_Ma();
                    return;
				case 2:
					System.out.print("Nhap vao ten nha cung cap can tim: ");
					String tenNCCTim = sc.nextLine();
                    System.out.println("======================================================================================================================");
                    System.out.format("|| %10s | %26s| %40s | %20s ||\n", "MA NCC" , "TEN NCC" , "DIA CHI" , "SDT");
                    System.out.print("|");
					if(timKiem_Ten(tenNCCTim) != null){
                        timKiem_Ten(tenNCCTim).xuat();
                    }else{
                        System.out.format("| %10s | %26s| %40s | %20s ||\n", "","","","");
                    }
                        System.out.println("Ten Nha Cung Cap Sai Hoac Khong Ton Tai!");
                        System.out.println("======================================================================================================================");
					return;
				case 3:
					System.out.print("So dien thoai nha cung cap can tim: ");
					String sdtNCCTIm = sc.nextLine();
                    System.out.println("======================================================================================================================");
                    System.out.format("|| %10s | %26s| %40s | %20s ||\n", "MA NCC" , "TEN NCC" , "DIA CHI" , "SDT");
                    System.out.print("|");
					if(timKiem_Sdt(sdtNCCTIm) != null){
                        timKiem_Sdt(sdtNCCTIm).xuat();
                    }else{
                        System.out.println("Sdt Nha Cung Cap Sai Hoac Khong Ton Tai!");
                        System.out.format("| %10s | %26s| %40s | %20s ||\n", "","","","");
                    }
                    System.out.println("======================================================================================================================");
					return;
				case 4: 
					return;
				default:
					System.err.println("Bạn đã nhập sai lựa chọn của mình. Xin mời vào lại chức năng!!!");
					break;
			}
        }
    }

//THAO TÁC TRONG DANH SÁCH
    public void thaoTac(){
        int select = 0;
		do{
			System.out.println("\t\t\t\t\t======BANG LUA CHON======");
			System.out.println("\t\t\t\t\t1.An phim 1 de them nha cung cap");
			System.out.println("\t\t\t\t\t2.An phim 2 de xoa nha cung cap");
			System.out.println("\t\t\t\t\t3.An phim 3 de sua thong tin nha cung cap");
			System.out.println("\t\t\t\t\t4.An phim 4 de tim kiem thong tin nha cung cap");
			System.out.println("\t\t\t\t\t5.An phim 5 de xuat danh sach nha cung cap");
            System.out.println("\t\t\t\t\t6.An phim 6 de doi danh nha cung cap moi");
			System.out.println("\t\t\t\t\t7.An phim 7 de dung cac thao tac");
			System.out.print("\nLua chon cua ban la: ");
			select = sc.nextInt();
			sc.nextLine();
			switch(select) {
				case 1:
					them();
                    xuat();
					break;
				case 2:
					xoa();
                    xuat();
					break;
				case 3:
					sua();
                    xuat();
					break;
				case 4:
					timKiem();
					break;
				case 5: 
					xuat();
					break;
                case 6:
                    nhap();
                    break;
				case 7:
					return;
				default:
					System.err.println("Bạn đã nhập sai lựa chọn");
					break;
				}
		}while(select != 7);
    }

//GHI VÀ ĐỌC FILE
    public void ghiFileJava(String filename) {
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
			dos.writeInt(n);
			try {
				for(int i = 0; i < n; i++) {
					dsncc[i].ghiFile(filename);
				}
			}catch(NullPointerException npe) {
				
			}
			
			dos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
    public void docFileJava(String fileName){
        
        try {
            int i = 0;
            DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
            n = dis.readInt();
            dsncc = new NhaCungCap[n];
            try {
				while(true){
					String maNCC = dis.readUTF();
					String ten = dis.readUTF();
					String diaChi = dis.readUTF();
					String sdt = dis.readUTF();
					dsncc[i] = new NhaCungCap(maNCC, ten, diaChi, sdt);
					i++;
				}
			}catch(EOFException ex) {}
			finally {
				a = i;
				dis.close();
			}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}