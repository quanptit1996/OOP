import java.util.Scanner;

public class MainTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tam giác 0 ");
        TamGiac tamgiac0 = new TamGiac(1,1,8);
        tamgiac0.testTamGiac();
        System.out.println("========================================");
        System.out.println("Tam giác 1 ");
        TamGiac tamgiac1 = new TamGiac(9,8,9);
        tamgiac1.testTamGiac();
        System.out.println("Chu vi Tam giác 1: "+tamgiac1.chuVi());
        System.out.println("Diện tích Tam giác 1: "+ tamgiac1.dienTich());
        System.out.println("========================================");
        TamGiac tamgiac2 = new TamGiac();
        System.out.println("Tam giá 2 ");
        tamgiac2.setCanhA(7);
        tamgiac2.setCanhB(5);
        tamgiac2.setCanhC(9);
        tamgiac2.testTamGiac();
        System.out.println("Chu vi Tam giác 2: "+tamgiac2.chuVi());
        System.out.println("Diện tích Tam giác 2: "+ tamgiac2.dienTich());
        System.out.println("========================================");
        System.out.println("Tam giác 4 ");
        TamGiac tamgiac4 = new TamGiac();
        System.out.println("Mời nhập cạnh A: ");
        tamgiac4.setCanhA(sc.nextInt());
        System.out.println("Mời nhập cạnh B: ");
        tamgiac4.setCanhB(sc.nextInt());
        System.out.println("Mời nhập cạnh C: ");
        tamgiac4.setCanhC(sc.nextInt());
        tamgiac4.testTamGiac();
        System.out.println("Chu vi Tam giác 2: "+tamgiac4.chuVi());
        System.out.println("Diện tích Tam giác 2: "+ tamgiac4.dienTich());









    }



}
