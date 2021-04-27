public class Teacher {
     int mathPoin;
     int liPoin;



    public Teacher(int liPoin, int mathPoin){
                    if (mathPoin<0 || mathPoin > 10){
                        mathPoin = 0;
                    }
                    else mathPoin = mathPoin;

                    if (liPoin<0 || liPoin > 10){
                        liPoin = 0;
                    }
                    else liPoin = liPoin;

                    this.liPoin= liPoin;
                    this.mathPoin = mathPoin;

                }
public String toString (){
        return String.format("LiPoin %d  mathPoin %d" , liPoin,mathPoin);
}



}
