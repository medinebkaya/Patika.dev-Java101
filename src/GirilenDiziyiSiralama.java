import java.util.Arrays;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Dizinin eleman sayısını giriniz: ");
        int n=input.nextInt();
        int[] dizi=new int[n];
        for (int i=0; i<n; i++){
            System.out.print(i+1+". elemanı giriniz: ");
            int eleman=input.nextInt();
            dizi[i]=eleman;

        }
        Arrays.sort(dizi);
        System.out.println("Dizideki elemanların küçükten büyüğe sıralaması; ");
        for (int i:dizi){
            System.out.println(i);
        }
    }
}
