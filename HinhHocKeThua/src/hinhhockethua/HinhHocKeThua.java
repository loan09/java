
package hinhhockethua;

import Shase.HinhCHuNhat;
import Shase.HinhTron;
import Shase.HinhTru;
import Shase.HinhVuong;


public class HinhHocKeThua {

    
    public static void main(String[] args) {
        // TODO code application logic here
        HinhCHuNhat HCN = new HinhCHuNhat();
        HCN.inTen();
        HCN.nhap();
        HCN.ChuVi();
        HCN.DienTich();
        HCN.inChuVi();
        HCN.inDienTich();
        
        HinhTron hinhtron = new HinhTron();
        hinhtron.inTen();
        hinhtron.NhapBK();
        hinhtron.ChuVi();
        hinhtron.DienTich();
        hinhtron.inChuVi();
        hinhtron.inDienTich();
        
        HinhTru hinhtru = new HinhTru();
        hinhtru.inTen();
        hinhtru.NhapCC();
        hinhtru.DienTich();
        hinhtru.inDienTich();
        hinhtru.theTich();
        hinhtru.inTheTich();
        
        HinhVuong hinhvuong = new HinhVuong();
        hinhvuong.inTen();
        hinhvuong.nhap2();
        hinhvuong.ChuVi();
        hinhvuong.DienTich();
        hinhvuong.inChuVi();
        hinhvuong.inDienTich();
        
        HinhTron hinhTron1 = new HinhTron();
        HinhTron hinhTron2 = hinhTron1;
        System.out.println(hinhTron1.equals(hinhTron2));///kq: true///so sanh 2 doi tuong, cung giong nhu ss 2 chuoi string
        
        //tuong tu
        HinhCHuNhat hcn1 = new HinhCHuNhat();
        HinhCHuNhat hcn2 = new HinhCHuNhat();
        System.out.println(hcn1.equals(hcn2));//kq: false
    
    }
    
}
