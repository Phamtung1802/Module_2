package HienThi20SoNguyenToDautien;

import java.util.Scanner;

public class HienThiHaiMuoiSoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 1;
        int j;
        System.out.println("2");
        for (int i = 2;count<=20 ; i++) {
            for ( j = 2; j <=Math.sqrt(i)+1; j++) {
                if (i%j==0) {
                    break;
                }
                if ((Math.sqrt(i)-j)<1){
                    System.out.println(i);
                    j=2;
                    count++;
                    break;
                }
            }
        }
    }
}
