//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program
import java.util.Scanner;
public class Pratik2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int toplam=0;
        int sayi=0;
        do {
            System.out.println("Sayı giriniz: ");
            sayi = input.nextInt();
            if (sayi % 4 == 0)
                toplam += sayi;
        } while(sayi%2==0);
        System.out.println("toplam: "+toplam);

    }
}
