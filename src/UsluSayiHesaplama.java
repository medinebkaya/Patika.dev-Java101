import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Üssü hesaplanacak sayıyı giriniz: ");
        int taban=input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        int us=input.nextInt();
        int sonuc=1;
        for (int i=1; i<=us; i++){
            sonuc=sonuc*taban;
        }
        System.out.println("sonuç: "+sonuc);
    }
}
