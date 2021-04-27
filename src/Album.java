public class Album {


    private int maCD;
    private String tuaCD;
    private double giaThanh;
    private int soBH;


    public Album() {

    }

    public Album(int maCD, String tuaCD, double giaThanh, int soBH) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.giaThanh = giaThanh;
        this.soBH = soBH;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    public int getSoBH() {
        return soBH;
    }

    public void setSoBH(int soBH) {
        this.soBH = soBH;
    }

    @Override
    public String toString() {
        return "Album{" +
                "maCD=" + maCD +
                ", tuaCD='" + tuaCD + '\'' +
                ", giaThanh=" + giaThanh +
                ", soBH=" + soBH +
                '}';
    }

    public void hienThiAlbum(){
        System.out.printf("%-10d -20s %-10d %-20.1f \n",maCD,tuaCD,soBH,giaThanh);
    }




}
