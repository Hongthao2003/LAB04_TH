
import java.time.LocalDate;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hongthao
 */
public class giaoDichNha extends GiaoDich {
     private String loaiNha;
    private String diaChi;

    public giaoDichNha(String loaiNha, String diaChi) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public giaoDichNha(String loaiNha, String diaChi, String magiaodich, LocalDate ngaygiaodich, long dongia, float dientich) {
        super(magiaodich, ngaygiaodich, dongia, dientich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    @Override
    public double tinhThanhTien() {
        if (loaiNha.equalsIgnoreCase("cao cấp")) {
            return (dientich * dongia);
        } else {
            return dientich * dongia * 0.9;
        }
    }
}
