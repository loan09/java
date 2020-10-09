package Shase;

public class HinhTron extends HinhHoc{
    float banKinh;
    
    public HinhTron()
    {
        ten = "Hinh Tron";
    }
    public void NhapBK()
    {
        System.out.println("Nhap vao ban kinh hinh tron: ");
        banKinh = scanner.nextFloat();
    }
    @Override ///co @Override cung dduocj , k co cung duoc
    public void inTen()
    {
        super.inTen();///goi den inTen() o lop cha truoc , sau do moi thuc thi lenh ben duoi
        System.out.println("Hello hinh tron !");
    }
    public void ChuVi()
    {
        chuVi = 2*PI*banKinh;
    }
    public void DienTich()
    {
        dienTich = PI*banKinh*banKinh;
    }
}
