import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class HangThucPham {
     private String maHang;
     private String tenHang;
     private double donGia;
     private Date ngaySX, ngaySD;

    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySX, Date ngaySD) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.ngaySD = ngaySD;
    }

    public HangThucPham() {
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public Date getNgaySD() {
        return ngaySD;
    }

    public void setNgaySD(Date ngaySD) {
        this.ngaySD = ngaySD;
    }

    @Override
    public String toString() {
        Locale date = new Locale("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = simpleDateFormat.format(ngaySX);
        String str2 = simpleDateFormat.format(ngaySD);
        return "HangThucPham{" +
                "maHang=" + maHang +
                ", tenHang='" + tenHang + '\'' +
                ", donGia=" + donGia +
                ", ngaySX=" + ngaySX +
                ", ngaySD=" + ngaySD +
                '}';
    }

    // Nhập ngày SX


    public void setNSX(int year,int month,int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        this.ngaySX = calendar.getTime();

    }
// nhập hạn SD
    public void setNSD(int year , int month , int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        this.ngaySD = calendar.getTime();
    }

    public boolean testTenHang(boolean k){
        if(this.tenHang == "" ){
            System.out.println("tên hàng không được để trống");

        }
        else {
            k = false;
        }
        return k;

    }

    public boolean testMaHang ( boolean k){
        if (this.maHang == ""){
            System.out.println("tên mã hàng không được để trống");
        }
        else {
            k = false;
        }
        return k;

    }
 //Hàm kiểm tra ngày hết hạn lớn hơn ngày SX
    public boolean kiemTraNSD(boolean k){
        if(this.getNgaySX().compareTo(this.getNgaySD())<0){
            k = false;
        }
        else {
            System.out.println(" Ngày hết hạn không được nhỏ hơn ngày Sx");
        }
        return k ;
    }
// Hàm kiểm tra HSD của sp đã hết hạn hay không
    public void kiemTraSP(){
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String s = simpleDateFormat.format(today);
        if(this.getNgaySD().compareTo(today)<0){
            System.out.println("Hôm nay là ngày "+ s + ", sản phẩm đã hết hạn sd");
        }
        else{
            System.out.println("Hôm nay là ngày "+ s + ",Sãn phẩm vẫn còn hạn sd ");
        }




    }



}
