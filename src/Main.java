import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student sv1  = new Student(1111111,"Lê Minh Quân",8.5,7.5);
        System.out.println(sv1.diemTB());
        Scanner scanner = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Student sv2 = new Student();
        sv2.setMaSV(22222222);
        sv2.setTenSV("Lê Minh Quân2");
        sv2.setDiemLT(6.8);
        sv2.setDiemTH(7.8);
        sv2.diemTB();
        System.out.println(sv1);
        System.out.println("MãSV \t\tTênSV \t\t\tĐiểmLT\t  ĐiểmTH\t ĐiểmTB \n" +sv2.getMaSV()+"\t" + sv2.getTenSV()+"\t"+ sv2.getDiemLT()+"\t"+"\t"+"\t"+sv2.getDiemTH()+"\t"+"\t"+"\t"+ sv2.diemTB());
        Student sv3 = new Student();
        System.out.println("Nhập mã sinh viên 3: ");
        sv3.setMaSV(sc.nextInt());
        System.out.println("Nhập tên sinh viên 3: ");
        sv3.setTenSV(scanner.nextLine());
        System.out.println("Nhập điểm LT: ");
        sv3.setDiemLT(scanner.nextDouble());
        System.out.println("Nhập điểm TH: ");
        sv3.setDiemTH(new Scanner(System.in).nextDouble());
        sv3.Print();




    }
}
