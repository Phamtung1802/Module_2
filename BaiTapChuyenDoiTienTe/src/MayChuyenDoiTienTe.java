import java.util.Scanner;

public class MayChuyenDoiTienTe {
    public static void main(String[] args){
        final int EXCHANGE_RATE=23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter USD Amount: ");
        int USD=scanner.nextInt();
        int VND=USD*EXCHANGE_RATE;
        System.out.print("VND Amount: "+VND);
    }
}
