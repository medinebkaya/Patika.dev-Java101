import java.util.Scanner;
public class EnBuyukEnKucukSayiyiBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? : ");
        int sayi=input.nextInt();
        int max=0; int min=0;
        int i=1;
        while( i<=sayi){
            System.out.println(i+". sayıyı giriniz: ");
            int gsayi=input.nextInt();
            if (gsayi==1){
                min=gsayi;
            }
            if (gsayi>max){
                max=gsayi;
            }
            if (gsayi<min){
                min=gsayi;
            }
            i++;
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}
