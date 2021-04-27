import java.util.Calendar;
import java.util.Scanner;

public class HangThucPhamMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner( System .in);
        HangThucPham tp = new HangThucPham();
        boolean kt = true;
        boolean kt1 = true;
        boolean kt2 = true;

        do{
            System.out.println("Nhập mã hàng: ");
            tp.setMaHang(sc.nextLine());
        }while (tp.testMaHang(kt));

        do{
            System.out.println("Nhập tên hàng: ");
            tp.setTenHang(sc.nextLine());
        }while (tp.testTenHang(kt1));

        System.out.println("Nhập đơn giá :");
        tp.setDonGia(s.nextInt());
        do{
            System.out.println("Nhập năm,tháng,ngày sản xuất : ");
            tp.setNSX(sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.println("nhập năm,tháng,ngày hết hạn : ");
            tp.setNSD(sc.nextInt(), sc.nextInt(), sc.nextInt());
        } while (tp.kiemTraNSD(kt2));
        System.out.println(tp);
        tp.kiemTraSP();










    }
}
