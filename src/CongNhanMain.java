import java.util.Scanner;
import java.util.logging.XMLFormatter;

class CongNhanMain {

    public static void nhap(CongNhan cn){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        cn.setMaCN(scanner.nextLine());
        System.out.println("Nhập Họ nhân viên: ");
        cn.setmHo(scanner.nextLine());
        System.out.println("Nhập tên nhân viên: ");
        cn.setmTen(scanner.nextLine());

        System.out.println("Nhập lượng Sản phẩm của nhân viên: ");
        cn.setmSoSP(scanner.nextInt());

    }

    public static void main(String[] args) {
        CongNhan cn1 = new CongNhan();
        cn1.tinhLuong();

        Scanner sc = new Scanner(System.in);
        System.out.println("== SỐ lượng Công nhân cho phép trong danh sách ==");
        DanhSachCongNhan ds = new DanhSachCongNhan();
        ds.cnList();
        System.out.println("Nhập số lượng CÔng Nhân muốn nhập thêm vào: ");
        int n = sc.nextInt();
        CongNhan cn[]= new CongNhan[n];
        for (int i = 0; i < n; i++) {
            cn[i]= new CongNhan();

            System.out.println("Công Nhận thứ " + (i+1));
            nhap(cn[i]);
            cn[i].tinhLuong();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(cn[i]);

        }
        Scanner scanner = new Scanner(System.in);
        sc.nextLine();
        ds.add(cn1);
        CongNhan cn2 = new CongNhan("CN324","Nguyễn","Minh",245);
        ds.add(cn2);
        CongNhan cn3 = new CongNhan();
        cn3.setMaCN("MK287");
        cn3.setmHo("Ngô");
        cn3.setmTen("An");
        cn3.setmSoSP(563);
        ds.add(cn3);


    }
}
