public class TamGiac {
    private int canhA;
    private int canhB;
    private int canhC;

    public TamGiac() {
        canhA=canhB=canhC=0;
    }

    public TamGiac(int a, int b, int c) {
        this.canhA = a;
        this.canhB = b;
        this.canhC = c;

        if(a < 0 ){
            System.out.println("Cạnh phãi lớn hơn 0");
            a = 0;
            return;

        }
        if(b < 0 ){
            System.out.println("Cạnh phãi lớn hơn 0");
            b = 0;
            return;

        }
        if(c < 0 ){
            System.out.println("Cạnh phãi lớn hơn 0");
            c = 0;
            return;

        }

    }

    public int getCanhA() {
        return canhA;
    }

    public void setCanhA(int canhA) {
        this.canhA = canhA;
    }

    public int getCanhB() {
        return canhB;
    }

    public void setCanhB(int canhB) {
        this.canhB = canhB;
    }

    public int getCanhC() {
        return canhC;
    }

    public void setCanhC(int canhC) {
        this.canhC = canhC;
    }


    public void testTamGiac(){
        int a = canhA * canhA;
        int b = canhB * canhB;
        int c = canhC * canhC;
        if(canhA+canhB < canhC || canhA+canhC < canhB || canhC+canhB < canhA){
            System.out.println("Đây không phải tam giác");
        }

        else if(canhA == canhB || canhA == canhC || canhB == canhC){
            System.out.println("Đây là tam giác cân");
            return;
        }
        else if (canhA == canhB && canhA == canhC && canhB == canhC) {
            System.out.println("Đây là tam giác đều");
            return;
        }
        else if (a == b + c || b == a + c || c == a + b){
            System.out.println("Đây là tam Vuông");
            return;
        }
        else {
            System.out.println("Đây là tam giác thường");
        }


    }
    public int chuVi(){

        return canhA + canhB + canhC;
    }
    public double dienTich(){
        double p = (double) (canhA + canhB + canhC)/2;
        return  Math.sqrt(p*(p-canhA)*(p-canhB)*(p-canhC));

    }

    @Override
    public String toString() {
        int a = canhA * canhA;
        int b = canhB * canhB;
        int c = canhC * canhC;

        return "TamGiac{" +
                "canhA=" + canhA +
                ", canhB=" + canhB +
                ", canhC=" + canhC +
                '}';
    }
}
