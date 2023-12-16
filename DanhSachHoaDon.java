import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DanhSachHoaDon {
    ChiTietHoaDon []hd;
    Scanner sc = new Scanner(System.in);
    private int n;
	
	//CONSTRUCTOR
	public DanhSachHoaDon() {
	}
    
	//CÁC HÀM NHẬP XUẤT DANH SÁCH
	public void NhapDanhSach() {
		System.out.print("Nhap vao so luon hoa don: ");
		n = sc.nextInt();
		sc.nextLine();
		hd = new ChiTietHoaDon[n];
		for(int i = 0; i < n; i++) {
			System.out.print("\n\t\t\t\t\tHOA DON THU " + (i + 1) + "\n");
			hd[i] = new ChiTietHoaDon();
			hd[i].Nhap();
            GhiFileJava("HoaDon-test.txt");
		}
	}
	public void XuatDanhSach(){
        DocFileJava("HoaDon-test.txt");
		System.out.println("\t\t\t\t\t\t\t\t=====DANH SACH HOA Đ0N=====");
        System.out.println("\n==================================================================================================================================");
        System.out.format("|| %4s | %10s | %20s | %15s | %15s | %8s | %8s | %10s | %10s ||\n", "STT", "Ma Hoa Don"," Ngay Lap Hoa Don", "Ma Khach Hang", "Ma Nhan Vien", "Ma SP", "So Luong"," Don Gia", "Thanh Tien");
	   // DocFileJava("HoaDon-test.txt");
		for(int i = 0; i < n; i++) {
				System.out.format("|| %4s ", (i+1));
				hd[i].Xuat();
			}
		System.out.println("==================================================================================================================================");
	}

    public void them() {
        n=hd.length;
		hd = Arrays.copyOf(hd, n+1);
		hd[n] = new ChiTietHoaDon();
		System.out.print("\t\t\t\t\tHOÁ ĐƠN THỨ " + (n + 1) + "\n");
		hd[n].Nhap();
        n++;
		XuatDanhSach();
        GhiFileJava("HoaDon-test.txt");
	}


    public void xoa(String mahd) {
		boolean flag = false;
		int j = 0;
		for(int i = 0; i < n; i++) {
			if(hd[i].getmaHD().indexOf(mahd) != -1) {
				flag = true;
				j = i;
				break;
			}
		}
		for(int i = j; i < n - 1; i++) {
			hd[i] = hd[i + 1];
		} 
        GhiFileJava("HoaDon-test.txt");
		n--;
		
		if(flag)
			System.out.println("\nĐã xoá thành công hoá đơn");
		else 
			System.out.println("\nKhông tìm thấy hoá đơn cần tìm");
	}
    
    public void sua(String mahd) {
		for(int i = 0; i < n; i++) {
			if(hd[i].getmaHD().indexOf(mahd) != -1) {
					System.out.print("\nSua thong tin hoa don thu " + (i + 1) + "\n");
					System.out.println("\t\t\t\t\t\t\t=====SUA THONG TIN======");
					System.out.println("==================================================================================================================================");
                    System.out.format("|| %4s | %10s | %20s | %15s | %15s | %8s | %8s | %10s | %10s ||\n", "STT", "Ma Hoa Don"," Ngay Lap Hoa Don", "Ma Khach Hang", "Ma Nhan Vien", "Ma SP", "So Luong"," Don Gia", "Thanh Tien");
                    System.out.format("|| %4s ", i);
					hd[i].Xuat();
					System.out.println("==================================================================================================================================");					
					hd[i] = new ChiTietHoaDon();
					hd[i].Nhap();
                    GhiFileJava("HoaDon-test.txt");
					return;
			}
		}
	}

        //TIM KIEM
        public void Search_MaHD(String mahd) {
            System.out.println("==================================================================================================================================");
            System.out.format("|| %4s | %10s | %20s | %15s | %15s | %8s | %8s | %10s | %10s ||\n", "STT", "Ma Hoa Don"," Ngay Lap Hoa Don", "Ma Khach Hang", "Ma Nhan Vien", "Ma SP", "So Luong"," Don Gia", "Thanh Tien");
            for(int i = 0; i < n; i++) {
                if(hd[i].getmaHD().indexOf(mahd) != -1) {
                    System.out.println( i + 1);
                    hd[i].Xuat();
                    break;
                }
            }
            System.out.println("==================================================================================================================================");
        }
        public void Search_MKH(String makh) {
            System.out.println("==================================================================================================================================");
            System.out.format("|| %4s | %10s | %20s | %15s | %15s | %8s | %8s | %10s | %10s ||\n", "STT", "Ma Hoa Don"," Ngay Lap Hoa Don", "Ma Khach Hang", "Ma Nhan Vien", "Ma SP", "So Luong"," Don Gia", "Thanh Tien");
            for(int i = 0; i < n; i++) {
                if(hd[i].getmaKH().indexOf(makh) != -1) {
                    System.out.println( i + 1);
                    hd[i].Xuat();
                    break;
                }
            }
            System.out.println("==================================================================================================================================");
        }
        public void Search_Ho(String ho) {
            System.out.println("\t\t\t\t\t\t\t\t======KET QUA======");
            System.out.println("\n================================================================================================================================================================================================================");		
            for(int i = 0; i < n; i++) {
                if(hd[i].getmaNV().indexOf(ho) != -1) {
                    System.out.println( i + 1);
                    hd[i].Xuat();
                }
            }
            System.out.println("================================================================================================================================================================================================================");
        }
        public void Search_MSP(String msp) {
            System.out.println("\t\t\t\t\t\t\t\t======KET QUA======");
            System.out.println("\n================================================================================================================================================================================================================");
            for(int i = 0; i < n; i++) {
                if(hd[i].getMaSP().indexOf(msp) != -1) {
                    System.out.println( i + 1);
                    hd[i].Xuat();
                    break;
                }
            }
            System.out.println("================================================================================================================================================================================================================");
        }
        public void Search() {
            int select = 0;
            while(true) {
                System.out.println("\t\t\t\t\t======BANG LUA CHON======");
                System.out.println("\t\t\t\t\t1.An phim 1 de tim kiem Hoa Don theo ma");
                System.out.println("\t\t\t\t\t2.An phim 2 de tim kiem ten nhan vien phu trach");
                System.out.println("\t\t\t\t\t3.An phim 3 de tim kiem ma khac hang cua hoa don");
                System.out.println("\t\t\t\t\t4.An phim 4 de thoat");
                System.out.println("\nLua chon cua ban la: ");
                select = sc.nextInt();
                sc.nextLine();
                switch(select) {
                    case 1:
                        System.out.print("Nhap vao ma hoa don can tim: ");
                        String mahd = sc.nextLine();
                        Search_MaHD(mahd);
                        break;
                    case 2:
                        System.out.print("Nhap ho va ten lot hoac ten cua nhan vien phu trach ma ban muon tim: ");
                        String ho = sc.nextLine();
                        Search_Ho(ho);
                        break;
                    case 3:
                        System.out.print("Nhap vao ma khach hang ma ban muon tim trong hoa don: ");
                        String makh = sc.nextLine();
                        Search_MKH(makh);
                        break;
                    case 4: 
                        return;
                    default:
                        System.err.println("Ban da nhap sai lua chon cua minh. Xin moi vao lai chuc nang!!!");
                        break;
                }
            }
        }

        //THAO TAC
        public void ThaoTac() {
            int select = 0;
            String mahd = "";
            loop:
                while(true) {
                    DocFileJava("HoaDon-test.txt");
                    System.out.println("\t\t\t\t\t======BANG LUA CHON======");
                    System.out.println("\t\t\t\t\t1.An phim 1 de them hoa don");
                    System.out.println("\t\t\t\t\t2.An phim 2 de xoa hoa don");
                    System.out.println("\t\t\t\t\t3.An phim 3 de sua thong tin hoa don");
                    System.out.println("\t\t\t\t\t4.An phim 4 de tim kiem hoa don");
                    System.out.println("\t\t\t\t\t5.An phim 5 de xuat danh sach hoa don");
                    System.out.println("\t\t\t\t\t6.An phim 6 de dung cac thao tac");
                    System.out.print("\nLua chon cua ban la: ");
                    select = sc.nextInt();
                    sc.nextLine();
                    switch(select) {
                        case 1:
                            /* System.out.print("Nhap vao so luong hoa don can them: ");
                            int sl = sc.nextInt(); */
                            them();
                            break;
                        case 2:
                            System.out.print("Nhap vao ma hoa don can xoa: ");
                            mahd = sc.nextLine();
                            xoa(mahd);
                            XuatDanhSach();
                            break;
                        case 3:
                            System.out.print("Nhap vao ma hoa don can sua: ");
                            mahd = sc.nextLine();
                            sua(mahd);
                            break;
                        case 4:
                            Search();
                            break;
                        case 5: 
                            XuatDanhSach();
                            break;
                        case 6:
                            break loop;
                        default:
                            System.out.println("Ban da nhap sai lua chon");
                            break;
                    }
                }
        }

    public void themHoaDon(String mahdsp, String ngaylaphoadonsp, String makhsp, String manvsp,String masp,  int slsp, long dongiasp, long thanhtiensp){
        DocFileJava("HoaDon-test.txt");
        n=hd.length;
		hd = Arrays.copyOf(hd, n+1);
		hd[n] = new ChiTietHoaDon(mahdsp, ngaylaphoadonsp, makhsp, manvsp, masp, slsp, dongiasp, thanhtiensp);
        n++;
        GhiFileJava("HoaDon-test.txt");
    }


    
    //DOC GHI FILE
    public void DocFileJava(String filename) {
		int i = 0;
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(filename));
			n = dis.readInt();
			hd = new ChiTietHoaDon[n];
			try {
				while(true) {
					String mahd = dis.readUTF();
                    String ngaylaphoadon = dis.readUTF();
					String makh = dis.readUTF();
                    String manv=dis.readUTF();
    				String masp = dis.readUTF();
					int sl = dis.readInt();
					long dongia = dis.readLong();
					long thanhtien = dis.readLong();
					hd[i] = new ChiTietHoaDon(mahd , ngaylaphoadon, makh,manv, masp, sl, dongia, thanhtien);
					i++;
				}
			}catch(EOFException e) {}
			finally {
				
				dis.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
    public void GhiFileJava(String filename) {
		int j = n;
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
			dos.writeInt(j);
			try {
				for(int i = 0; i < j; i++) {
					hd[i].GhiFile(filename);
				}
			}catch(NullPointerException npe) {
					
			}
			dos.close();
		}catch(IOException e) {}
	}
	
}
