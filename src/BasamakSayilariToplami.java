import java.util.Scanner;
public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi=input.nextInt();
        int rakam=0;
        int toplam=0;
        while(sayi > 0) {
            rakam = sayi % 10;
            toplam = toplam + rakam;
            sayi = sayi / 10;
        }
        System.out.println(toplam);

    }
}
