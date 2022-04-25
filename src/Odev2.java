import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(dizi); // [-778, -1, 0, 1, 2, 12, 15, 788]
        int sayi = 0;
        int sayi1 = 0;
        System.out.print("Sayı giriniz : ");
        int gsayi = input.nextInt();
        for (int i=0; i< dizi.length; i++) {
            if (gsayi> dizi[i]) {
                sayi = dizi[i];
            }
            if (gsayi < dizi[i]) {
                sayi1 = dizi[i];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + sayi);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + sayi1);
    }
}
