
package Shase;

public class HinhTru extends HinhTron{
    public float chieuCao;

    public HinhTru()
    {
        ten = "Hinh Tru";
    }
    public void NhapCC()
    {
        NhapBK();
        System.out.println("Nhap vao chieu cao hinh tru: ");
        chieuCao = scanner.nextFloat();
    }
    @Override
    public void DienTich()
    {
        dienTich = 2*PI*banKinh*banKinh;
    }
    @Override ////Overiding ghi de: ten phuong thuc co cung ten phuong thuc voi lop cha, nhung o lop nay no da duoc dinh nghia lai
    public void inDienTich()
    {
        System.out.println("Tong dien tich 2 day la : " + dienTich);
    }
    public void theTich()
    {
        DienTich();
        thetich = chieuCao*dienTich/2;
    }
}
