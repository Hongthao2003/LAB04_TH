
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hongthao
 */
public class KhachHangVietNam extends HoaDon {
    private String doiTuong;
    private double dinhMuc;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(String doiTuong, double dinhMuc) {
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }

    public KhachHangVietNam(String doiTuong, double dinhMuc, String maKhachHang, String hoTen, LocalDate ngayRaHoaDon, double soLuong, double donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
    
     public double tinhThanhTien() {
        if (getSoLuong() <= dinhMuc) {
            return getSoLuong() * getDonGia();
        } else {
            return getSoLuong() * getDonGia() * dinhMuc + (getSoLuong() - dinhMuc) * getDonGia() * 2.5;
        }
    }

   
}
