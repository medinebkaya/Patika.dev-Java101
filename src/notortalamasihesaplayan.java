import java.util.Scanner;
public class NotOrtalamasiHesaplayan {
    public static void main(String[] args) {
        //değişkenleri oluştur.
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat=input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik=input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya=input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce=input.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih=input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik=input.nextInt();

        int toplam=mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama=toplam/6d;
        System.out.println("Ortalamanız:"+ortalama);
        String sonuc=(ortalama<60)? "Kaldı":"Geçti";
        System.out.println(sonuc);

    }
}
