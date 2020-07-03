import java.util.Scanner;

public class SoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int soHangChuc;
        int soHangTram;
        int soHangDonVi;
        String chuHangChuc = "";
        String chuHangTram="";
        String chuHangDonVi = "";
        String chuDocRa;
        if (number >= 0 && number <= 9) {
            soHangDonVi = number;
            switch (soHangDonVi) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;
                default:
                    System.out.print("Invalid input!");
                    break;
            }

        } else if (number >= 10 && number < 20) {
            soHangDonVi = number - 10;
            switch (soHangDonVi) {
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
                case 0:
                    System.out.println("Ten");
                    break;
                default:
                    System.out.print("Invalid input!");
                    break;
            }
        } else if (number >= 20 && number <= 99) {
            soHangChuc = (number - (number % 10)) / 10;
            switch (soHangChuc) {
                case 2:
                    chuHangChuc = "Twenty";
                    break;
                case 3:
                    chuHangChuc = "Thirty";
                    break;
                case 4:
                    chuHangChuc = "Fourty";
                    break;
                case 5:
                    chuHangChuc = "Fifty";
                    break;
                case 6:
                    chuHangChuc = "Sixty";
                    break;
                case 7:
                    chuHangChuc = "Seventy";
                    break;
                case 8:
                    chuHangChuc = "Eighty";
                    break;
                case 9:
                    chuHangChuc = "Ninety";
                    break;
                case 0:
                    chuHangChuc = "";
                    break;
            }
            soHangDonVi = number % 10;
            switch (soHangDonVi) {
                case 1:
                    chuHangDonVi = "-One";
                    break;
                case 2:
                    chuHangDonVi = "-Two";
                    break;
                case 3:
                    chuHangDonVi = "-Three";
                    break;
                case 4:
                    chuHangDonVi = "-Four";
                    break;
                case 5:
                    chuHangDonVi = "-Five";
                    break;
                case 6:
                    chuHangDonVi = "-Six";
                    break;
                case 7:
                    chuHangDonVi = "-Seven";
                    break;
                case 8:
                    chuHangDonVi = "-Eight";
                    break;
                case 9:
                    chuHangDonVi = "-Nine";
                    break;
                case 0:
                    chuHangDonVi = "";
                    break;
            }
            System.out.println(chuHangChuc + chuHangDonVi);
        } else if (number > 99 && number < 999) {
            soHangTram = (number - (number % 100)) / 100;
            switch (soHangTram) {
                case 1:
                    chuHangTram = "One Hundred and ";
                    break;
                case 2:
                    chuHangTram = "Two Hundred and ";
                    break;
                case 3:
                    chuHangTram = "Three Hundred and ";
                    break;
                case 4:
                    chuHangTram = "Four Hundred and ";
                    break;
                case 5:
                    chuHangTram = "Five Hundred and ";
                    break;
                case 6:
                    chuHangTram = "Six Hundred and ";
                    break;
                case 7:
                    chuHangTram = "Seven Hundred and ";
                    break;
                case 8:
                    chuHangTram = "Eight Hundred and ";
                    break;
                case 9:
                    chuHangTram = "Nine Hundred and ";
                    break;
                case 0:
                    chuHangTram = "";
                    break;
            }
            soHangDonVi = number % 10;
            switch (soHangDonVi) {
                case 1:
                    chuHangDonVi = "-One";
                    break;
                case 2:
                    chuHangDonVi = "-Two";
                    break;
                case 3:
                    chuHangDonVi = "-Three";
                    break;
                case 4:
                    chuHangDonVi = "-Four";
                    break;
                case 5:
                    chuHangDonVi = "-Five";
                    break;
                case 6:
                    chuHangDonVi = "-Six";
                    break;
                case 7:
                    chuHangDonVi = "-Seven";
                    break;
                case 8:
                    chuHangDonVi = "-Eight";
                    break;
                case 9:
                    chuHangDonVi = "-Nine";
                    break;
                case 0:
                    chuHangDonVi = "";
                    break;
            }
            soHangChuc = ((number % 100)-((number%100)%10))/10;
            switch (soHangChuc) {
                case 2:
                    chuHangChuc = "Twenty";
                    break;
                case 3:
                    chuHangChuc = "Thirty";
                    break;
                case 4:
                    chuHangChuc = "Fourty";
                    break;
                case 5:
                    chuHangChuc = "Fifty";
                    break;
                case 6:
                    chuHangChuc = "Sixty";
                    break;
                case 7:
                    chuHangChuc = "Seventy";
                    break;
                case 8:
                    chuHangChuc = "Eighty";
                    break;
                case 9:
                    chuHangChuc = "Ninety";
                    break;
                case 0:
                    chuHangChuc = "";
                    break;
            }
            System.out.println(chuHangTram+chuHangChuc+chuHangDonVi);
        }
    }
}


