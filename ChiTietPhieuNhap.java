public class ChiTietPhieuNhap {
    private String maPN;
    private String maSP;
    private int soluong;
    private long dongia;
    private long thanhtien;

    public String getMaPN(){
        return this.maPN;
    }
    public void setMaPN(String maPN){
        this.maPN = maPN;
    }

    public String getMaSP(){
        return this.maSP;
    }
    public void setMaSP(String maSP){
        this.maSP = maSP;
    }

    public int getSoluong(){
        return this.soluong;
    }
    public void setMaSoluong(int soluong){
        this.soluong = soluong;
    }

    public long getDonGia(){
        return this.dongia;
    }
    public void setDongia(long dongia){
        this.dongia = dongia;
    }

    public long getThanhtien(){
        return this.thanhtien;
    }
    public void setThanhTien(long thanhtien){
        this.thanhtien = thanhtien;
    }
}
