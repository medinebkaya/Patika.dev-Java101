import java.util.Scanner;
public class VKİ {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        double kilo=input.nextDouble();
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        double boy=input.nextDouble();
        //VKİ=Kilo (kg) / Boy(m) * Boy(m)
        double VKI=kilo/ (boy*boy);
        System.out.println("Vücut kitle indeksiniz: " + VKI);
    }
}
