import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {
        //Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.
        Scanner input=new Scanner(System.in);
        System.out.print("km bilgisini giriniz: ");
        double km=input.nextDouble();
        double tutar=(km/2.20)+10;
        tutar=(tutar<20)? 20:tutar;
        System.out.println(tutar);
    }
}
