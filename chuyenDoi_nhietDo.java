import java.util.Scanner;

public class chuyenDoi_nhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 3;
        while (input!=0) {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");

            System.out.println("Input Choice :");
            input = scanner.nextInt();
            double fah = 0;
            double cel = 0;

            switch (input) {
                case 0:
                    //System.exit(0);
                    break;
                case 1:
                    System.out.println("Input Fahrenheit :");
                    fah = scanner.nextDouble();
                    cel = (5.0 / 9) * (fah - 32);
                    System.out.println(fah + " Fahrenheit = " + cel + " Celsius");
                    break;
                case 2:
                    System.out.println("Input Celsius :");
                    cel = scanner.nextDouble();
                    fah = cel / (5.0 / 9) + 32;
                    System.out.println(cel + " Celsius = " + fah + " Fahrenheit");
                    break;
                default:
                    System.out.println("No choice");
            }
        }
    }
}
