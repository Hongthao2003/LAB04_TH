
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hongthao
 */
public class KhachHangNuocNgoai extends HoaDon {
    
   String quocTich;

    public KhachHangNuocNgoai() {
    }


    public KhachHangNuocNgoai(String quocTich, String maKhachHang, String hoTen, LocalDate ngayRaHoaDon, double soLuong, double donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    
    public String getQuocTich() {
        return quocTich;
    }
    
    public double tinhThanhTien() {
        return getSoLuong() * getDonGia();
    }

}

