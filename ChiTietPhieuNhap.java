public class ChiTietPhieuNhap {
    private String maPN;
    private String maSP;
    private int soLuong;
    private long donGia;
    private long thanhTien;

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
        return this.soLuong;
    }
    public void setMaSoluong(int soluong){
        this.soLuong = soluong;
    }

    public long getDonGia(){
        return this.donGia;
    }
    public void setDonGia(long dongia){
        this.donGia = dongia;
    }

    public long getThanhTien(){
        return this.thanhTien;
    }
    public void setThanhTien(long thanhtien){
        this.thanhTien = thanhtien;
    }
}
