package InSoNguyenToNhoHon100;

public class InSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int j;
        System.out.println("2");
        for (int i = 2; i < 100; i++) {
            for (j = 2; j <= Math.sqrt(i) + 1; j++) {
                if (i % j == 0) {
                    break;
                }
                if ((Math.sqrt(i) - j) < 1) {
                    System.out.println(i);
                    j = 2;
                    break;
                }
            }
        }
    }
}
