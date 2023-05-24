
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thaih
 */
public class DanhSachGiaoDich {
    
 private List<GiaoDich> danhSach;

    public DanhSachGiaoDich() {
        danhSach = new ArrayList<>();
    }

    public void themGiaoDich(GiaoDich giaoDich) {
        danhSach.add(giaoDich);
    }
public void tinhsoluong() {
        int slnha = 0;
        int sldat = 0;
        for (GiaoDich giaodich : danhSach) {
            if (giaodich instanceof giaoDichNha) {
                slnha++;
            } else if (giaodich instanceof giaoDichDat) {
                sldat++;
            }
        }
        System.out.println("Tong so luong giao dich nha la: " + slnha);
        System.out.println("Tong so luong giao dich dat la: " + sldat);
    }
public void TB(){
        int sld = 0;
        double thanhtien=0;
        for (GiaoDich gd : danhSach) {
            if(gd instanceof giaoDichDat){
                sld++;
                thanhtien += gd.getDongia()* gd.getDientich();
            }
        }
        if(sld > 0){
            double trungbinhthanhtien = thanhtien/sld;
            System.out.println("Trung binh thanh tienla" + trungbinhthanhtien);
        }else{
            System.out.println("Chua co giao dich nao");
        }
    }

    public List<GiaoDich> timGiaoDichThangNam(int thang, int nam) {
        List<GiaoDich> ketQua = new ArrayList<>();
        for (GiaoDich giaoDich : danhSach) {
            LocalDate ngayGiaoDich = giaoDich.ngaygiaodich;
            if (ngayGiaoDich.getMonthValue() == thang && ngayGiaoDich.getYear() == nam) {
                ketQua.add(giaoDich);
            }
        }
        return ketQua;
    }

    public void xuatDanhSach() {
        for (GiaoDich giaoDich : danhSach) {
            System.out.println(giaoDich);
        }
        }
    }
