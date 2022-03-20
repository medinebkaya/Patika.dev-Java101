//java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program
import java.util.Scanner;
public class Pratik1 {
    public static void main(String[] args) {
        int k;
        int toplam=0;
        int sayisayisi=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k=input.nextInt();

        for (int i=0; i<=k; i++)
        {
            if (i%3==0 && i%4==0){
            System.out.println(i);
            toplam+=i;
            sayisayisi++;
            }
        }
        double ortalama=toplam/sayisayisi;
        System.out.println("ortalama: "+ortalama);
    }
}
