import java.util.Scanner;
public class YildizlarlaTersUcgen {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Üçgen kaç basamaklı olsun? : ");
        int sayi=input.nextInt();
        for (int i=0; i<=sayi; i++){
            for(int j=0; j<(i+1); j++){
                System.out.print(" ");
            }
            for (int k=1; k<(2*(sayi-i)); k++){
                System.out.print("*");}
            System.out.println();
        }
    }
}
