import java.util.Scanner;
public class MukemmelSayiBulma {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi=input.nextInt();
        int toplam=0;
        for (int i=1; i<sayi; i++){
            if (sayi%i==0){
                toplam+=i;
            }
        }
        if (toplam==sayi)
            System.out.println("Girdiğiniz sayı mükemmel sayıdır.");
        else
            System.out.println("Girdiğiniz sayı mükemmel sayı değildir.");

    }
}
