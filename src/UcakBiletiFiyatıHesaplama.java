import java.util.Scanner;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Mesafeyi giriniz: ");
        double mesafe=input.nextDouble();
        System.out.println("Yaşınızı giriniz: ");
        int yas=input.nextInt();
        if (mesafe<0 || yas<0)
            System.out.println("Hatalı veri girdiniz.");
        System.out.println("Yolculuk tipini giriniz: ");
        System.out.println(" 1=Tek Yön \n 2=Gidiş-dönüş");
        int tip=input.nextInt();
        if (tip!=1 && tip!=2)
            System.out.println("Hatalı giriş yaptınız.");
        else{
            double tutar=mesafe*0.10;

            if (yas<12)
                tutar=tutar-(tutar/2);
            else if(yas>12 && yas<24)
                tutar=tutar-(tutar*0.10);
            else if (yas>65)
                tutar=tutar-(tutar*0.30);

            if (tip==2)
                tutar=2*(tutar-(tutar*0.20));

            System.out.println("Toplam tutar: "+tutar); }

    }
}
