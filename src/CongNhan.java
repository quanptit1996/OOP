import java.security.PublicKey;
import java.util.Scanner;

public class CongNhan {
    private String maCN, mHo, mTen;
    private int mSoSP;
    protected double luong;
    Scanner scanner = new Scanner(System.in);


    public CongNhan() {

    }

    public  CongNhan(String maCN, String mHo, String mTen, int mSoSP) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSP = mSoSP;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        maCN = maCN;
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) {
        this.mSoSP = mSoSP;
    }

    public void nhap(CongNhan cn){

        System.out.println("Nhập mã nhân viên: ");
        maCN = scanner.nextLine();
        System.out.println("Nhập Họ nhân viên: ");
        mHo = scanner.nextLine();
        System.out.println("Nhập tên nhân viên: ");
        mTen = scanner.nextLine();

        System.out.println("Nhập lượng Sản phẩm của nhân viên: ");
        mSoSP = scanner.nextInt();

    }

    public  double tinhLuong(){

        if(1< mSoSP && mSoSP<199){
            luong = (double) (mSoSP*0.5);
        }
        else if(199 < mSoSP && mSoSP<400) {
            luong = (double) (mSoSP * 0.55);
        }
        else if(mSoSP < 600){
            luong = (double) (mSoSP * 0.6);
        }
        else {
            luong = (double) (mSoSP * 0.65);
        }

        return luong;
    }

    @Override
    public String toString() {
        return "NhanVien" +
                "mã Nhân viên='" + maCN + '\'' +
                ", Họ: '" + mHo + '\'' +
                ", Tên: '" + mTen + '\'' +
                ", Mã SP: " + mSoSP +
                ", Lương: " + luong; }
}
