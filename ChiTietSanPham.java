import java.util.Scanner;

public class ChiTietSanPham extends SanPham {
	 	private String maSP;
	    private String Ram;
	    private String Rom;
	    private String CPU;
	    private String HDD;

		Scanner sc=new Scanner(System.in);

	    public String getMaSP(){
	        return this.maSP;
	    }
	    public void setMaSP(String maSP){
	        this.maSP=maSP;
	    }

	    public String getRam(){
	        return this.Ram;
	    }
	    public void setRam(String Ram){
	        this.Ram=Ram;
	    }

	    public String getRom(){
	        return this.Rom;
	    }
	    public void setRom(String Rom){
	        this.Rom=Rom;
	    }

	    public String getCPU(){
	        return this.CPU;
	    }
	    public void setCPU(String CPU){
	        this.CPU=CPU;
	    }
	    public String getHDD(){
	        return this.HDD;
	    }
	    public void setHDD(String HDD){
	        this.HDD=HDD;
	    }
		public void nhap(){
			System.out.println("***Nhap Thong Tin San Pham***");
			System.out.print("Ma San Pham: "); maSP = sc.nextLine();
			maSP = sc.nextLine();
			System.out.print("RAM: "); Ram = sc.nextLine();
			System.out.print("ROM: "); Rom = sc.nextLine();
			System.out.print("CPU: "); CPU = sc.nextLine();
			System.out.print("HDD: "); HDD = sc.nextLine();
        
		}
		public void xuat(){
			System.out.println("--Thong Tin San Pham--");
			System.out.println("Ma: "+maSP);
			System.out.println("RAM: "+Ram);
			System.out.println("ROM: "+Rom);
			System.out.println("CPU: "+CPU);
			System.out.println("HDD: "+HDD);
       
		}
}
