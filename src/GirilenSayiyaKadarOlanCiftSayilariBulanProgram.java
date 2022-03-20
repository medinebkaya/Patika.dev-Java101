import java.util.Scanner;
public class Pratik1 {
    public static void main(String[] args) {
        int k;
        int toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k=input.nextInt();

        for (int i=1; i<=k; i++)
        {
            if (i%3==0 && i%4==0){
            System.out.println(i);
            toplam+=i;
            }
        }
    }
}
