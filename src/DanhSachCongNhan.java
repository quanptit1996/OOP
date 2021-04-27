import java.util.Scanner;
import java.util.Arrays;

public class DanhSachCongNhan {
    private int n  ;
    private int count = 0 ;
    private CongNhan cnlist[];

    public void cnList(){
        System.out.print("Nhập kích thước công nhân cho phép: ");
        n = sc.nextInt();
        cnlist = new CongNhan[n];

    }
    Scanner sc = new Scanner(System.in);
    public boolean check(){
        if(count > n) return false;
        return true;
    }


    public void add(CongNhan cn) {
        if (check()) {
            cnlist[count] = cn;
            count++;

        }
    }

    public void xuat(){
        for (int i = 0; i < n; i++) {
            System.out.println(cnlist[i]);

        }
    }

    public void soCn(){
        int dem = 0;
        for (int i = 0; i < cnlist.length; i++) {
            if(cnlist[i] == null)dem = dem;
            else dem ++;
        }
        System.out.println("Số công nhân là: " + dem);
    }

    public void congNhan200(){
        for (int i = 0; i < cnlist.length; i++) {
            if(cnlist[i].getmSoSP()> 200)
            {
                System.out.println(cnlist[i]);
            }
            
        }
    }

    public void sapXepGiam(){
        CongNhan temp = null;
        for (int i = 0; i < cnlist.length; i++) {
            for (int j = i+1; j < cnlist.length; j++) {
                if(cnlist[j].getmSoSP() > cnlist[i].getmSoSP()){
                    temp = cnlist[i];
                    cnlist[i]= cnlist[j];
                    cnlist[j]= temp;


                }

            }

        }
    }








}
