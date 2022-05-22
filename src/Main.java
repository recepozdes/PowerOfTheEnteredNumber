import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, k;
        double pow = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Üssü alıncak tam sayıyı giriniz : ");
        n = sc.nextInt();
        System.out.print("Üs olacak tam sayıyı giriniz : ");
        k = sc.nextInt();
        if (k > 0) {
            for (int i = 1; i <= k; i++) {
                pow *= n;
            }
        } else if (k < 0) {
            k = Math.abs(k);
            for (int i = 1; i <= k; i++) {
                pow *= n;
            }
            pow = 1 / pow;
        }

        System.out.println(n + " üssü " + k + " = " + pow);
    }
}
