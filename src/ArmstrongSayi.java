import java.util.Scanner;
public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi=input.nextInt();
        double basSayisi=0;
        int temp=sayi;
        //basamak sayısını bulalım.
        while(temp!=0){
            temp=temp/10;
            basSayisi++;

        }
        temp=sayi;
        double rakam=0;
        double toplam=0;
        while(temp > 0) {
            rakam = temp % 10;
            toplam = toplam + Math.pow(rakam,basSayisi);
            temp = temp / 10;
        }
        if (toplam==sayi){
            System.out.println("armstrong sayıdır");
        }
        else
            System.out.println("armstrong değil");

    }
}
