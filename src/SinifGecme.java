import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik,dersSayisi,toplam;
        toplam=0; dersSayisi=0;
        System.out.println("Matematik notunuz: ");
        mat= input.nextInt();
        if (mat<=100 && mat>=0) {
            toplam += mat;
            dersSayisi++;
        }
        System.out.println("Fizik notunuz: ");
        fizik= input.nextInt();
        if (fizik<=100 && fizik>=0) {
            toplam += fizik;
            dersSayisi++;
        }
        System.out.println("Türkçe notunuz: ");
        turkce= input.nextInt();
        if (turkce<=100 && turkce>=0) {
            toplam += turkce;
            dersSayisi++;
        }
        System.out.println("Kimya notunuz: ");
        kimya= input.nextInt();
        if (kimya<=100 && kimya>=0) {
            toplam += kimya;
            dersSayisi++;
        }
        System.out.println("Müzik notunuz: ");
        muzik= input.nextInt();
        if (muzik<=100 && muzik>=0) {
            toplam += muzik;
            dersSayisi++;
        }

        double ortalama=toplam/dersSayisi;
        if (ortalama>= 55)
            System.out.println("GEÇTİ");
        else if(ortalama<55)
            System.out.println("KALDI");
        else
            System.out.println("Geçersiz giriş.");

        System.out.println("ORTALAMANIZ: "+ortalama);
    }
}
