import java.util.Scanner;
public class AdvCalc {

     static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;


        while (true) {
            System.out.println(i++ + " .sayıyı girin: ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result+=number;
        }
         System.out.println("Sonuç = " + result);

    }
    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz? ");

        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.println(i + " .sayı: ");
            number = scan.nextInt();

            if (number == 1) {
                result+=number;
                continue;
            }
            result-=number;
        }
        System.out.println("Sonuç = " + result);


    }



    public static void main(String[] args) {

         minus();

    }
}
