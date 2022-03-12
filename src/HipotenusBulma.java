import java.util.Scanner;
public class HipotenusBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("1.kenarı giriniz: ");
        int a=input.nextInt();
        System.out.print("2.kenarı giriniz: ");
        int b=input.nextInt();
        double hipotenus=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs: "+hipotenus);

    }
}
