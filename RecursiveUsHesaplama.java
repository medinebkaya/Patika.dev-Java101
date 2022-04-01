import java.util.Scanner;

public class RecursiveUs {

    static int power(int taban, int us){
        if(us == 0)
            return 1;

        int sonuc = 1;
        sonuc *= power(taban,us-1) * taban;
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int taban, us;
        System.out.print("taban: ");
        taban= input.nextInt();
        System.out.print("üs ");
        us = input.nextInt();

        System.out.println(power(taban,us));

    }
}
