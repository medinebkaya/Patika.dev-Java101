import java.util.Scanner;
public class KucuktenBuyuge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        double a=input.nextDouble();
        System.out.print("b sayısını giriniz: ");
        double b=input.nextDouble();
        System.out.print("c sayısını giriniz: ");
        double c=input.nextDouble();
        if (a<b && a<c){
            if (b<c){
                System.out.println("a<b<c");
            }
            else
                System.out.println("a<c<b");
        }

        if (b<a && b<c){
            if (a<c)
                System.out.println("b<a<c");
            else
                System.out.println("b<c<a");
        }
        if(c<a && c<b){
            if (a<b)
                System.out.println("c<a<b");
            else
                System.out.println("c<b<a");
        }
    }
}
