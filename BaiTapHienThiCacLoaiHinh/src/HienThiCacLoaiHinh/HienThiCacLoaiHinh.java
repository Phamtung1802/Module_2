package HienThiCacLoaiHinh;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int choice=1;
        while(choice!=0){
            System.out.println("");
            System.out.println("1.Print the rectangle");
            System.out.println("2.print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            choice=input.nextInt();
            int i=0,j=0,k=0;
            if(choice==1){
                for(i=0;i<3;i++) {
                    System.out.println("");
                    for (j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                }
            }
            if(choice==2){
                for(i=0;i<5;i++) {
                    System.out.println("");
                    k=5-i;
                    for (; k <=5; k++) {
                        System.out.print("*");
                    }
                }

                for(i=5;i>0;i--) {
                    System.out.println("");
                    j=i; k=0;
                    for(;j>1;j--) {
                        System.out.print(" ");
                    }
                    for (; k <= 5-i; k++) {
                        System.out.print("*");
                    }

                }

                for(i=0;i<5;i++) {
                    System.out.println("");
                    j=i;
                    for (; j < 5; j++) {
                        System.out.print("*");
                    }
                }

                for(i=0;i<5;i++) {
                    System.out.println("");
                    j=i; k=5-i;
                    for(;j>0;j--) {
                        System.out.print(" ");
                    }
                    for (; k >0; k--) {
                        System.out.print("*");
                    }

                }
            }
            if(choice==3){
                int l=9;
                for(i=0;i<5;i++) {
                    System.out.println("");
                    j=5-i; k=1; l-=2;
                    for(;j>1;j--) {
                        System.out.print(" ");
                    }
                    for (; k <9-l; k++) {
                        System.out.print("*");
                    }
                }
            }
        }
    }
}
