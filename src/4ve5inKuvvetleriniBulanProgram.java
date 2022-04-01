import java.util.Scanner;
public class IkiUssu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        int i;
        System.out.println("4'ün kuvvetleri");
        for (i=1; i<=sayi; i*=4){
            System.out.println(i);
        }
        System.out.println("5'in kuvvetleri");
        for (i=1; i<=sayi; i*=5){
            System.out.println(i);
        }
    }
}
