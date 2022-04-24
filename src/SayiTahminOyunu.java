import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int number=random.nextInt(100);
        System.out.println(number);
        Scanner input=new Scanner(System.in);
        int right=0;
        int selected;
        int[] wrong=new int[5];
        boolean isWin=false;
        boolean isWrong=false;
        while(right<5){
            System.out.println("Tahmin ettiğiniz sayıyı giriniz: ");
            selected=input.nextInt();

            if (selected<0 || selected>99) {
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz");
                if (isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: "+(5-right));

                }
                else{
                    isWrong=true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if (selected==number) {
                System.out.println("Doğru bildiniz.");
                isWin=true;
                break;
            }
            else{
                System.out.println("Hatalı sayı girdiniz.");
                if (selected>number)
                    System.out.println(selected+" sayısı gizli sayıdan büyüktür.");
                else
                    System.out.println(selected+" sayısı gizli sayıdan küçüktür.");
                wrong[right++]=selected;
                System.out.println("Kalan hakkı: "+ (5-right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz");
            System.out.println("Tahminleriniz: "+ Arrays.toString(wrong));
        }
    }
}
