import java.util.Scanner;
public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1.kenarı giriniz: ");
        int a=input.nextInt();
        System.out.println("2.kenarı giriniz: ");
        int b=input.nextInt();
        System.out.println("3.kenarı giriniz: ");
        int c=input.nextInt();
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        int cevre=a+b+c;
        int u=cevre/2;
        double alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı: "+alan);


    }
}
