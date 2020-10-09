
package Shase;

public class HinhCHuNhat extends HinhHoc{
    public float cdai, crong;
    
    public HinhCHuNhat()////constructor
    {
        ten = "Hinh Chu Nhat";
    }
    public void nhap()
    {
        System.out.println("Nhap vao chieu dai va chieu rong: ");
        cdai = scanner.nextFloat();
        crong = scanner.nextFloat();
    }
    public void ChuVi()
    {
        chuVi = 2*(cdai + crong);
    }
    public void DienTich()
    {
        dienTich = cdai * crong;
    }
}
