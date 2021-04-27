public class Vehicle {
    private String loaiXe,tenChuXe;
    private int dungTich;
    private double thueXe,triGia;

    public Vehicle() {
    }

    public Vehicle(String loaiXe, String tenChuXe, int dungTich, double thueXe, double triGia) {
        this.loaiXe = loaiXe;
        this.tenChuXe = tenChuXe;
        this.dungTich = dungTich;
        this.thueXe = thueXe;
        this.triGia = triGia;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getThueXe() {
        return thueXe;
    }

    public void setThueXe(double thueXe) {
        this.thueXe = thueXe;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double tinhThue(){
        double thue;
        if(getDungTich()<100){
            thue = triGia * 0.01;
        }
        else if (getDungTich() >= 100 && getDungTich() <= 200 ){
            thue = triGia * 0.03;
        }
        else {
            thue = triGia * 0.05;
        }
        return thue;
    }

    @Override
    public String toString() {
        return loaiXe + "-"+ tenChuXe +"-"+dungTich+ "-" + triGia +"-"+ thueXe;
    }
    public void print(){
        System.out.printf("%5s %10s %10s %10s %10s  \n ",loaiXe,tenChuXe, dungTich,triGia,tinhThue());
    }




}
