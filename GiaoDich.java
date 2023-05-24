
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
public abstract class GiaoDich {

 private String magiaodich;
 LocalDate ngaygiaodich;
 long dongia;
 float dientich;

    public GiaoDich() {
    }

    public GiaoDich(String magiaodich, LocalDate ngaygiaodich, long dongia, float dientich) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.dientich = dientich;
    }

    public String getMagiaodich() {
        return magiaodich;
    }

    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }

    public LocalDate getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(LocalDate ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public long getDongia() {
        return dongia;
    }

    public void setDongia(long dongia) {
        this.dongia = dongia;
    }

    public float getDientich() {
        return dientich;
    }

    public void setDientich(float dientich) {
        this.dientich = dientich;
    }
 
 public abstract double tinhThanhTien();
}


