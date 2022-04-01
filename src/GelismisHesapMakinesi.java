import java.util.Scanner;
public class GelismisHesapMakinesi {
    static int sum(int a,int b){
        int result=a+b;
        System.out.println("Toplam: "+result);
        return result;
    }
    static int minus(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma: "+ result);
        return result;
    }
    static int times(int a,int b){
        int result=a*b;
        System.out.println("Çarpma: "+result);
        return result;
    }
    static double divided(int a,int b){
        if (b==0){
            System.out.println("İkinci sayı sıfırdan farklı olmalıdır.");
        }
        double result=a/b;
        System.out.println("Bölüm: "+result);
        return result;
    }
    static int power(int a,int b){
        int result=1;
        for (int i=1; i<=b; i++){
            result*=a;
        }
        return result;
    }
    static int mod(int a,int b){
        int result=a%b;
        return result;
    }
    static  int calc(int a,int b){
        System.out.println("Çevresi: "+ 2*(a+b)+ "Alanı: "+ a*b);
        return 1;
    }

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.print("1.sayıyı giriniz: ");
        int number1=input.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        int number2=input.nextInt();
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        while(true) {

            System.out.print("İşlem seçiniz: ");
            select=input.nextInt();
            if (select==0)
                break;
            switch (select){
                case 1:
                    sum(number1,number2);
                    break;
                case 2:
                    minus(number1,number2);
                    break;
                case 3:
                    times(number1,number2);
                    break;
                case 4:
                    divided(number1,number2);
                    break;
                case 5:
                    System.out.println("Üs Hesabı: "+ power(number1,number2));
                    break;
                case 6:
                    System.out.println("Mod İşlemi: "+ mod(number1,number2));
                    break;
                case 7:
                    System.out.println("Çevre ve Alan Hesabı "+calc(number1,number2));
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");
            }
        }
    }
}
