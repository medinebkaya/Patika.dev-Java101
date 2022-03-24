import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n=input.nextInt();
        double sonuc=0;
        for (double i=1; i<=n; i++){
            sonuc+=1/i;
        }
        System.out.println(sonuc);
    }
}
