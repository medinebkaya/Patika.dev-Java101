import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Yılı giriniz: ");
        int year=input.nextInt();
        if (year%4==0)
            if (year%100==0 && year%400==0)
                System.out.println("Artık yıldır.");
            else
                System.out.println("Artık yıl değildir.");
        else
            System.out.println("Artık yıl değildir.");
    }
}
