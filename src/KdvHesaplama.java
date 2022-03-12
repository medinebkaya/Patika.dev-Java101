
import java.util.Scanner;
public class KdvTutarıHesaplayanProgram {
    public static void main(String[] args) {
        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        double tutar, kdvOran, kdvlitutar, kdvtutari;
        Scanner input=new Scanner(System.in);
        System.out.print("Tutarı giriniz: ");
        tutar= input.nextDouble();
        kdvOran=(0<tutar && tutar<100? 0.18:0.08);
        kdvlitutar=tutar+tutar*kdvOran;
        kdvtutari=tutar*kdvOran;
        System.out.println("Tutar: "+tutar);
        System.out.println("KDV'li tutar: "+kdvlitutar);
        System.out.println("KDV tutarı: "+ kdvtutari);
        System.out.println("KDV Oranı: "+ kdvOran);
    }
}
