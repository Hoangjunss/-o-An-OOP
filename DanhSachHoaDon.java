import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
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
		System.out.print("Nhập vào số lượng hoá đơn: ");
		n = sc.nextInt();
		sc.nextLine();
		hd = new ChiTietHoaDon[n];
		for(int i = 0; i < n; i++) {
			System.out.print("\n\t\t\t\t\tHOÁ ĐƠN THỨ " + (i + 1) + "\n");
			hd[i] = new ChiTietHoaDon();
			hd[i].nhap();
            GhiFileJava(HoaDon.txt);

		
		}
	}
	public void XuatDanhSach(){
		System.out.println("\t\t\t\t\t\t\t\t=====DANH SÁCH HOÁ ĐƠN=====");
		System.out.println("\n================================================================================================================================================================================================================");
	    DocFileJava("hoadon.txt");
	
		for(int i = 0; i < n; i++) {
				System.out.println( (i + 1));
				hd[i].xuat();
			}
		
		System.out.println("================================================================================================================================================================================================================");
		
	}
    public void them() {
        n=hd.length;
		hd = Arrays.copyOf(hd, n+1);
		hd[n] = new ChiTietHoaDon();
		System.out.print("\t\t\t\t\tHOÁ ĐƠN THỨ " + (n + 1) + "\n");

		hd[n].nhap();
        n++;
		XuatDanhSach();
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
		n--;
		
		if(flag)
			System.out.println("\nĐã xoá thành công hoá đơn");
		else 
			System.out.println("\nKhông tìm thấy hoá đơn cần tìm");
	}
    public void sua(String mahd) {
		
		for(int i = 0; i < n; i++) {
			if(hd[i].getmaHD().indexOf(mahd) != -1) {
			
					System.out.print("\nSửa thông tin của hoá đơn thứ " + (i + 1) + "\n");
					System.out.println("\t\t\t\t\t\t\t=====SỬA THÔNG TIN======");
					System.out.println("\n================================================================================================================================================================================================================");
					hd[i].xuat();
					System.out.println("================================================================================================================================================================================================================");					
					hd[i] = new ChiTietHoaDon();
					hd[i].nhap();
					
					return;
				}
				
				
			}
		}
        public void Search_MaHD(String mahd) {
            System.out.println("\n================================================================================================================================================================================================================");		
            for(int i = 0; i < n; i++) {
                if(hd[i].getmaHD().indexOf(mahd) != -1) {
                    System.out.println( i + 1);
                    hd[i].xuat();
                    
                    break;
                }
            }
            System.out.println("================================================================================================================================================================================================================");
        }
        public void Search_MKH(String makh) {
            System.out.println("\n================================================================================================================================================================================================================");		
            for(int i = 0; i < n; i++) {
                if(hd[i].getmaKH().indexOf(makh) != -1) {
                    System.out.println( i + 1);
                    hd[i].xuat();
                    break;
                }
            }
            System.out.println("================================================================================================================================================================================================================");
        }
        public void Search_Ho(String ho) {
            System.out.println("\t\t\t\t\t\t\t\t======KẾT QUẢ======");
            System.out.println("\n================================================================================================================================================================================================================");		
            for(int i = 0; i < n; i++) {
                if(hd[i].getmaNV().indexOf(ho) != -1) {
                    System.out.println( i + 1);
                    hd[i].xuat();
                }
            }
            System.out.println("================================================================================================================================================================================================================");
        }
        public void Search_MSP(String msp) {
            System.out.println("\t\t\t\t\t\t\t\t======KẾT QUẢ======");
            System.out.println("\n================================================================================================================================================================================================================");
            for(int i = 0; i < n; i++) {
                if(hd[i].getMaSP().indexOf(msp) != -1) {
                    System.out.println( i + 1);
                    hd[i].xuat();
                    break;
                }
            }
            System.out.println("================================================================================================================================================================================================================");
        }
        
        public void Search() {
            int select = 0;
            while(true) {
                System.out.println("\t\t\t\t\t======BẢNG LỰA CHỌN======");
                System.out.println("\t\t\t\t\t1.Ấn phím 1 để tìm kiếm Hoá đơn theo mã");
                System.out.println("\t\t\t\t\t2.Ấn phím 2 để tìm kiếm tên nhân viên phụ trách");
                System.out.println("\t\t\t\t\t3.Ấn phím 3 để tìm kiếm mã khách hàng của hoá đơn");
                System.out.println("\t\t\t\t\t4.Ấn phím 4 để thoát");
                System.out.println("\nLựa chọn của bạn là: ");
                select = sc.nextInt();
                sc.nextLine();
                switch(select) {
                    case 1:
                        System.out.print("Nhập vào mã hoá đơn cần tìm: ");
                        String mahd = sc.nextLine();
                        Search_MaHD(mahd);
                        break;
                    case 2:
                        System.out.print("Nhập họ và tên lót hoặc tên của nhân viên phụ trách mà bạn muốn tìm: ");
                        String ho = sc.nextLine();
                        Search_Ho(ho);
                        break;
                    case 3:
                        System.out.print("Nhập vào mã khách hàng mà bạn muốn tìm trong hoá đơn: ");
                        String makh = sc.nextLine();
                        Search_MKH(makh);
                        break;
                    case 4: 
                        return;
                    default:
                        System.err.println("Bạn đã nhập sai lựa chọn của mình. Xin mời vào lại chức năng!!!");
                        break;
                }
            }
            
        }
        public void ThaoTac() {
            int select = 0;
            String mahd = "";
            loop:
                while(true) {
                    System.out.println("\t\t\t\t\t======BẢNG LỰA CHỌN======");
                    System.out.println("\t\t\t\t\t1.Ấn phím 1 để thêm hoá đơn");
                    System.out.println("\t\t\t\t\t2.Ấn phím 2 để xoá hoá đơn");
                    System.out.println("\t\t\t\t\t3.Ấn phím 3 để sửa thông tin hoá đơn");
                    System.out.println("\t\t\t\t\t4.Ấn phím 4 để tìm kiếm hoá đơn");
                    System.out.println("\t\t\t\t\t5.Ấn phím 5 để xuất danh sách hoá đơn");
                    System.out.println("\t\t\t\t\t6.Ấn phím 6 để dừng các thao tác");
                    System.out.print("\nLựa chọn của bạn là: ");
                    select = sc.nextInt();
                    sc.nextLine();
                    switch(select) {
                        case 1:
                            System.out.print("Nhập vào số lượng hoá đơn cần thêm: ");
                            int sl = sc.nextInt();
                            them();
                            break;
                        case 2:
                            System.out.print("Nhập vào mã hoá đơn cần xoá: ");
                            mahd = sc.nextLine();
                            xoa(mahd);
                            XuatDanhSach();
                            break;
                        case 3:
                            System.out.print("Nhập vào mã hoá đơn cần sửa: ");
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
                            System.out.println("Bạn đã nhập sai lựa chọn");
                            break;
                    }
                }
        }
       public void DocFileJava(String filename) {
		int i = 0;
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(filename));
			n = dis.readInt();
			hd = new ChiTietHoaDon[n];
			try {
				while(true) {
					String mahd = dis.readUTF();
					String makh = dis.readUTF();
					String ngaylaphoadon = dis.readUTF();
                    String manv=dis.readUTF();
    				String masp = dis.readUTF();
					int sl = dis.readInt();
					int dongia = dis.readInt();
					int thanhtien = dis.readInt();
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
