
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
public class giaoDichDat extends GiaoDich {
    private String loaidat;

    public giaoDichDat(String loaidat, String magiaodich, LocalDate ngaygiaodich, long dongia, float dientich) {
        super(magiaodich, ngaygiaodich, dongia, dientich);
        this.loaidat = loaidat;
    }
    
    @Override
    public String toString() {
        return super.toString() + "GiaoDichDat{" + "loaidat=" + loaidat + '}';
    }

    @Override
    public double tinhThanhTien() {
        return 0;
    }
    
    
}   

