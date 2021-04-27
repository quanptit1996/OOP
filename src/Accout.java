import java.util.Scanner;
import java.text.NumberFormat;

public class Accout {
    private long soTK;
    private String tenTK;
    private double soTientrongTK;

    Scanner sc = new Scanner(System.in);

    public Accout() {

    }


    public Accout(long soTK, String tenTK, double soTientrongTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTientrongTK = soTientrongTK;
    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTientrongTK() {
        return soTientrongTK;
    }

    public void setSoTientrongTK(double soTientrongTK) {
        this.soTientrongTK = soTientrongTK;
    }

    @Override
    public String toString() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTientrongTK);
        return "Accout{" +
                "soTK=" + soTK +
                ", tenTK='" + tenTK + '\'' +
                ", soTientrongTK=" + soTientrongTK +
                '}';
    }
    public double napTien(){
        System.out.println("Số tiền cần nạp ");
        double nap = sc.nextDouble();
        if( nap < 0){
            System.out.println("Số tiền nộp vào TK không hợp lệ ");
        }
        else {
            soTientrongTK = nap + soTientrongTK;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String st = currencyEN.format(nap);
            System.out.println(" Bạn vừa nạp "+ st +" vào TK");
        }
        return nap;
    }



    public double rutTien(){
        double phi = 5.500;
        System.out.println("Số tiền cần rút ");
        double rut = sc.nextDouble();
        if( rut <= (soTientrongTK - phi)){
            soTientrongTK = soTientrongTK - (rut+phi);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String st = currencyEN.format(rut);
            System.out.println(" Bạn vừa rút "+ st +" từ TK");
        }
        else {
            System.out.println("số tiền trong tài khoản không đủ");

        }
        return rut;
    }


    void inTK() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTientrongTK);
        System.out.printf("%-10d %-20s %-20s \n", soTK, tenTK, str1);
    }





}
