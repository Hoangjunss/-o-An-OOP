import java.util.Arrays;
import java.util.Scanner;

public class DanhSachNhaCungCap {
    private int n;
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
        System.out.print("-Nhap So Luong Nha Cung Cap: ");
        this.n = sc.nextInt();
        dsncc = new NhaCungCap[n];
        System.out.println("Nhap Thong Tin Nha Cung Cap:");
        for(int i=0;i<n;i++){
            System.out.println("Thong Tin Cua Nha Cung Cap "+ (i+1));
            dsncc[i] = new NhaCungCap();
            dsncc[i].nhap();
        }
    }

    public void xuat(){
        for(int i=0;i<dsncc.length;i++){
            System.out.println("Thong Tin Nha Cung Cap Thu " + (i+1)+ ":");
            dsncc[i].xuat();
        }
    }

    public void them(){
        System.out.print("So Luong Can Them: ");
        int temp = sc.nextInt();
        dsncc = Arrays.copyOf(dsncc,n+temp);
        for(int i = n;i<(n+temp);i++){
            dsncc[i] = new NhaCungCap();
            dsncc[i].nhap();
        }
        n+=temp;
    }

    public NhaCungCap timkiem(String tkNCC){
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

    public void xoa(){
        System.out.print("Nhap Ma Nha Cung Cap Can Xoa:");
        String temp = sc.next();
        int n = dsncc.length, flag=0;
        for(int i=0; i<n; i++){
            if(i == (n -1)){
                dsncc = Arrays.copyOf(dsncc,n-1);
                flag = 1;
                n--;
                
            }
            if(dsncc[i].equals(timkiem(temp))){
                for(int j=i; j<=n-1;j++){
                    dsncc[j] = new NhaCungCap(dsncc[j+1]);
                }
                dsncc = Arrays.copyOf(dsncc, n-1);
                flag = 1;
                n--;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Nha Cung Cap Da Duoc Xoa!");
        }else{ 
            System.out.println("Khong Tim Thay Nha Cung Cap Can Xoa!");
        }
    }

    public void sua(){
        int choice1 =0;
        do{
            System.out.println("Nhap Ma Nha Cung Cap Can Sua");
            String maSua = sc.next();
            NhaCungCap nccCanSua = timkiem(maSua);
            if(nccCanSua != null){
                NhaCungCap temp = new NhaCungCap(timkiem(maSua));
                System.out.println("Thong Tin Nha Cung Cap Can Sua:");
                temp.xuat();
                System.out.println("Xac Nhan Dung Sinh Vien Can Sua Khong! \n1:Dung \n2:Sai,Can Nhap Lai! \n0:Thoat");
                choice1 = sc.nextInt();
                switch (choice1) {
                    case 1:
                        System.out.println("Chon lua cach sua:");
                        System.out.println("1: Sua tat ca");
                        System.out.println("2: Sua tung dac diem");
                        System.out.println("0: Thoat");
                        int choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1:
                                // Sua tat ca
                                nccCanSua.nhap(); // Nhap lai toan bo thong tin
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
                break;

            case 2:
                System.out.print("Nhap Ten NCC moi: ");
                ncc.setTen(sc.next());
                break;
            case 3:
                System.out.print("Nhap Dia Chi NCC mô: ");
                ncc.setDiachi(sc.next());
                break;
            case 4:
                System.out.print("Nhap SDT NCC moi: ");
                ncc.setSdt(sc.nextInt());
                break;
            // Thêm các trường và lựa chọn khác tùy theo cấu trúc NhaCungCap

            default:
                System.out.println("Lua Chon Khong Hop Le!");
                break;
        }
    }
}