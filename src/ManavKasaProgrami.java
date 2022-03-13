import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        //Meyveler ve KG Fiyatları
        //        Armut : 2,14 TL
        //        Elma : 3,67 TL
        //        Domates : 1,11 TL
        //        Muz: 0,95 TL
        //        Patlıcan : 5,00 TL
        Scanner input=new Scanner(System.in);
        System.out.println("Armut miktarı(kg): ");
        double armutmiktar=input.nextDouble();
        System.out.println("Elma miktarı(kg): ");
        double elmamiktar=input.nextDouble();
        System.out.println("Domates miktarı(kg): ");
        double domatesmiktar=input.nextDouble();
        System.out.println("Muz miktarı(kg): ");
        double muzmiktar=input.nextDouble();
        System.out.println("Patlıcan miktarı(kg): ");
        double patlıcanmiktar=input.nextDouble();
        double toplam=(armutmiktar*2.14)+(elmamiktar*3.67)+(domatesmiktar*1.11)+(muzmiktar*0.95)+(patlıcanmiktar*5);
        System.out.println("Toplam tutar: "+ toplam);
    }
}
