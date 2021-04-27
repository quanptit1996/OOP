import java.util.Scanner;
import java.util.ArrayList;
public class MainVehicle {


    static void nhapxe(Vehicle xe){
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        System.out.print("Nhập loại xe: ");
        xe.setLoaiXe(s.nextLine());
        System.out.print("Nhập tên chủ xe: ");
        xe.setTenChuXe(s.nextLine());
        System.out.print("Nhập dung tích xe: ");
        xe.setDungTich(sc.nextInt());
        System.out.print("Nhập trị giá xe: ");
        xe.setTriGia(sc.nextInt());

    }
    public static void main(String[] args) {
        System.out.println("Nhập số Lượng xe: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Vehicle xe[] = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Xe thứ " +( i + 1)+":");
            xe[i] = new Vehicle();
            nhapxe(xe[i]);
        }

        System.out.printf("%5s %10s %10s %10s %8s \n","Loại xe"," tên Chủ xe","Dung tích","Trị giá","Thuế");
        for (int i = 0; i < n; i++) {
            xe[i].print();
        }








    }
}
