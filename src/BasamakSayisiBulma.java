import java.util.Scanner;
public class BasamakSayisiBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi=input.nextInt();
        int sayac=0;
        while(sayi!=0){
            sayi=sayi/10;
            sayac++;

        }
        System.out.println(sayac);
    }
}
