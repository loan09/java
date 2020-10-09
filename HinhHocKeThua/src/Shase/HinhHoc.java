
package Shase;

import java.util.Scanner;

public class HinhHoc {
    public final float PI = 3.141519f;
    public String ten;
    float chuVi, dienTich, thetich;
    
    public Scanner scanner = new Scanner(System.in);
    
    public void inTen()
    {
        System.out.println("-------------" + ten + " ---------------");
    }
    public void inChuVi()
    {
        System.out.println("Chu vi = " + chuVi);
    }
    public void inDienTich()
    {
        System.out.println("DienTich = " + dienTich);
    }
    public void inTheTich()
    {
        System.out.println("The Tich = " + thetich);
    }
}
