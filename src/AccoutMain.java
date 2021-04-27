import java.util.Arrays;
import java.util.Scanner;

public class AccoutMain {
    static Scanner sc = new Scanner(System.in);
    static Scanner s = new Scanner(System.in);
    static void nhapAccout(Accout ac){
        System.out.println("Nhập số của Tài Khoản: ");
        ac.setSoTK(sc.nextLong());
        System.out.println("Nhập tên của Tài Khoản: ");
        ac.setTenTK(s.nextLine());
        System.out.println("Nhập số tiền trong tài khoản: ");
        ac.setSoTientrongTK(sc.nextLong());

    }
    public static void main(String[] args) {
        Accout ac[] = new Accout[3];
        for (int i = 0; i < 3 ; i++) {
            ac[i] = new Accout();
            System.out.println("Tài Khoản "+(i+1)+":");
            nhapAccout(ac[i]);
        }

        System.out.println(" Nhập số tài khoản mà bạn cần nạp: ");
        long a = sc.nextLong();
        for (int i = 0; i < 3; i++) {
            long d = ac[i].getSoTK();
            if (a == d) {
                System.out.println("Bạn đã chọn tài khoản " + d);
                ac[i].napTien();
                break;
            } else {
                System.out.println(" Tài khoản không hợp lệ ");
            }
        }


        System.out.println("Nhập số tài khoản mà bạn cần rút tiền: ");
        long b = sc.nextLong();
        for (int i = 0; i < 3; i++) {
            long e = ac[i].getSoTK();
            if(b == e){
                System.out.println("tài khoản bạn là "+ b);
                ac[i].rutTien();
                break;
            }
            else {
                System.out.println("Số tài khoản không hợp lệ ");
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(ac[i]);
        }

        double chuyen,nhan;


        System.out.println(" nhập tài khoản :");
        long tk = sc.nextLong();
        for (int i = 0; i < 3; i++) {
            if(tk == ac[i].getSoTK()){
                chuyen = ac[i].getSoTientrongTK();
                System.out.println("tài khoản bạn chọn là "+ tk);
                System.out.println(" Nhập số tài khoản cần chuyển đến  ");
                long tk1 = sc.nextLong();
                for (int j = 0; j < 3; j++) {
                    if(tk1 == ac[j].getSoTK()){
                        nhan = ac[j].getSoTientrongTK();
                        System.out.println("tài khoản bạn cần chuyển là "+ tk1);
                        System.out.println("Nhập số tiền cần chuyển: ");
                        double money = sc.nextDouble();

                        if(money <= chuyen ){
                            chuyen = chuyen - money;
                            nhan = nhan + money;
                            System.out.println(" Tài khoản số "+ tk + " vừa chuyển số tiền là: "+ money);
                            System.out.println(" Tài khoản số "+ tk1 + " vừa nhận được số tiền là: "+ money + "Từ Tài khoản "+ tk);
                        }else {
                            System.out.println("SỐ tiền không hợp lệ");
                        }
                    }else{
                        System.out.println("");
                    }

                }break;

            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(ac[i]);
        }








    }
}
