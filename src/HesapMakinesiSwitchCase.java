import java.util.Scanner;
public class swcase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("1.sayıyı giriniz: ");
        double a= input.nextDouble();
        System.out.print("2.sayıyı giriniz: ");
        double b= input.nextDouble();
        System.out.println(" 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        System.out.println("Seçtiğiniz işlem: ");
        int secim= input.nextInt();
        double sonuc;
        switch (secim){
            case 1:
                sonuc=a+b; System.out.println("İşlemin sonucu: "+sonuc);
                break;
            case 2:
                sonuc=a-b; System.out.println("İşlemin sonucu: "+sonuc);
                break;
            case 3:
                sonuc=a*b; System.out.println("İşlemin sonucu: "+sonuc);
                break;
            case 4:
                sonuc=a/b; System.out.println("İşlemin sonucu: "+sonuc);
                break;
            default:
                System.out.println("Gçersiz sayı girdiniz.");
        }
        
    }
}
