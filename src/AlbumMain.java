import java.util.Scanner;

public class AlbumMain {
    static void nhapAlbum(Album alb) {
        System.out.println("Nhập mã CD: ");
        alb.setMaCD(sc.nextInt());
        System.out.println("Nhập tựa CD: ");
        alb.setTuaCD(sc.nextLine());
        System.out.println("Nhập số lượng Bài Hát: ");
        alb.setSoBH(sc.nextInt());
        System.out.println("Nhập giá thành: ");
        alb.setGiaThanh(sc.nextDouble());
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.printf("%-10s  %-20s %-10s %-20s \n", "Mã CD", "Tên CD",  "Số bài hát", "Giá thành");
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập số lượng CD: ");
        int n = s.nextInt();
        Album alb[] = new Album[n];
        for (int i = 0; i < n; i++) {
            alb[i] = new Album();
            nhapAlbum(alb[i]);
        }

        int tong = 0;
        System.out.println("Tỗng giá thành: "+ tong);
        for (int i = 0; i < n; i++) {
            tong += alb[i].getGiaThanh();
        }
        System.out.println("Sắp xếp giá thành CD: ");
         Album albmax = alb[0];
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if(alb[i].getGiaThanh()< alb[j].getGiaThanh()){
                    albmax = alb[j];
                    alb[j] = alb[i];
                    alb[i] = albmax;

                }

            }
            
        }















    }
}
