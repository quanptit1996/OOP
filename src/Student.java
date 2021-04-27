
public class Student {
    private int maSV;
    private String tenSV;
    private double diemLT;
    private double diemTH;
    private double diemTB;

    public Student() {

    }

    public Student(int maSV, String tenSV, double diemLT, double diemTH) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemLT = diemLT;
        this.diemTH = diemTH;

    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }
    public double diemTB(){
        return  (diemLT + diemTH)/2;
    }

    @Override
    public String toString() {
        return
                "MãSV \t \tTênSV \t \tĐiểmLT\t  ĐiểmTH\t  ĐiểmTB \n" +maSV  +"\t" +"\t"+tenSV +"\t"+diemLT + "\t\t"+diemTH +"\t"+ "\t\t"+ diemTB ;
    }
    public void Print(){
        System.out.println("MãSV \t\tTênSV \t\t\tĐiểmLT\t  ĐiểmTH\t ĐiểmTB \n" +maSV+"\t" +"\t" +"\t" + tenSV+"\t"+"\t"+ diemLT+"\t"+"\t"+diemTH+"\t"+"\t" +"\t"+diemTB());

    }




}
