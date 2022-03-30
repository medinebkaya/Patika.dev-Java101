import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Eleman sayını giriniz: ");
        int elemansayisi=input.nextInt();
        int sayi1=0;
        int sayi2=1;
        int toplam=1;
        if (elemansayisi==1)
            System.out.println("0");
        else if (elemansayisi==2) {
            System.out.println("0");
            System.out.println("1");
        }
        else if (elemansayisi>1) {
            System.out.println("0");
            System.out.println("1");
            int i = 1;
            while (i <= elemansayisi-2) {
                toplam = sayi1 + sayi2;
                sayi1 = sayi2;
                sayi2=toplam;
                System.out.println(toplam);
                i++;
            }
        }
    }
}
