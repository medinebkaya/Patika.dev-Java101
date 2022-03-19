import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        String userName=input.nextLine();
        System.out.print("Şifreyi giriniz:");
        String password=input.nextLine();
        if (userName.equals("patika")&& password.equals("java123"))
        {
            System.out.println("Giriş başarılı.");
        }
        else if (!userName.equals("patika")&&password.equals("java123"))
            System.out.println("Kullanıcı adını yanlış girdiniz.");
        else if (!password.equals("java123") && userName.equals("patika") )
            System.out.println("Parolanızı yanlış girdiniz.");
            System.out.println("Parolanızı sıfırlamak ister misiniz ? ");
            System.out.println("1-Evet \n 2-Hayır ");
            int secim=input.nextInt();
            if (secim==1){
                System.out.println("Yeni şifrenizi giriniz: "+ input.nextLine());
                password=input.nextLine();
                if (password.equals("java123"))
                    System.out.println("Girdiğiniz şifre eskisiyle aynı olamaz.");
                else if (!password.equals("java123"))
                    System.out.println("Şifreniz başarıyla değiştirildi.");
            }

    }
}
