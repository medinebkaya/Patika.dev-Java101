import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        double r=input.nextDouble();
        double pi=3.14;
        double alan=pi*r*r;
        double cevre=2*pi*r;
        System.out.println("Alan:"+alan);
        System.out.println("Çevre:"+ cevre);

    }
}
