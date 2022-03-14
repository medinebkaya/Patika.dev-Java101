import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        double a=input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double b=input.nextDouble();
        System.out.println(" 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        System.out.print("Seçiminiz: ");
        int select= input.nextInt();
        if (select==1)
        {
            double sonuc=a+b;
            System.out.println(sonuc);
        }
        else if (select == 2) {
            System.out.println(a-b);
        }
        else if (select==3)
            System.out.println(a*b);
        else if (select==4)
            System.out.println(a/b);
        else
            System.out.println("Yanlış seçim");
    }

}
