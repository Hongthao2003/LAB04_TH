
import java.time.LocalDate;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thaih
 */
public class main1 {
   public static void main(String[] args) {
        DanhSachGiaoDich dsgd = new DanhSachGiaoDich();
        giaoDichDat gddat;
        giaoDichNha gdnha;
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. them giao dich");
            System.out.println("2. in danh sach giao dich");
            System.out.println("3. so luong cua tung loai gia dich");
            System.out.println("4. thanh tien trung binh cua giao dich dat");
            System.out.println("0. thoat chuong trinh");
            System.out.print("Lua chon: ");
            menu = sc.nextInt();
            
            switch(menu){
                case 1:
                    sc.nextLine(); 
                    System.out.println("Nhap loai giao dich");
                    System.out.println("1. Giao dich dat");
                    System.out.println("2. giao dich nha");
                    System.out.println("lua chon: ");
                    int LoaiGD = sc.nextInt(); sc.nextLine();
                    
                    sc.nextLine();
                    System.out.println("Ma giao dich: "); String MaGiaDich = sc.nextLine();
                    
                    System.out.println("ngay giao dich vi du: a/b/c"); String NgayGiaoDich = sc.nextLine();
                    
                    System.out.println("Don gia: "); double DonGia = sc.nextDouble();
                    
                    System.out.println("dien tich: "); double DienTich = sc.nextDouble();
                    
                    if(LoaiGD == 1){
                        System.out.println("Nhap loai dat, chi co 3 loai dat ");
                        System.out.println("A, B, C"); sc.nextLine();
                        System.out.print("Nhap loai: ");
                        String LoaiDat = sc.nextLine();
                        gddat= new giaoDichDat(LoaiDat, MaGiaDich, LocalDate.EPOCH, LoaiGD, menu);
                        dsgd.themGiaoDich(gddat);
                    }else if(LoaiGD == 2 ){
                        sc.nextLine(); System.out.println("Nhap loai nha");
                        System.out.println("Cao cap hoac Thuong");
                        System.out.println("loai nao: ");
                        String LoaiNha = sc.nextLine();
                        System.out.println("dia chi giao dich nha: "); String DiaChi = sc.nextLine();
                        gdnha = new giaoDichNha(LoaiNha, DiaChi);
                        dsgd.themGiaoDich(gdnha);
                    }else{
                        System.out.println("chi co 2 loai giao dich 1 va 2");
                        System.out.println("Vui long chon lai giao dich");
                    }
                    break;
                case 2:
                    System.out.println("=== Danh sach cac giao dich ===");
                    dsgd.xuatDanhSach();
                    System.out.println("===");
                    break;
                case 3:
                    dsgd.tinhsoluong();
                    break;
                case 4:
                    dsgd.TB();
                    break;
                case 5:
                    break;
                default:
                    if(menu!=0){
                    System.out.println("\n==================");
                    System.out.println("nhap sai, chuc nang khong ton tai");
                    System.out.println("==================");
                    }else{
                    System.out.println("Da thoat");
                    }
                }
        }while(menu!=0);
    }
}
