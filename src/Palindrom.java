import java.util.Scanner;
public class Palindrom {
    static boolean isPalindrom(int number){
        int temp=number, reverseNumber=0, lastNumber;
        while(temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if (number==reverseNumber){
            System.out.println("Girdiğiniz sayı palindromdur.");
            return true;
            }
        else {
            System.out.println("Girdiğiniz sayı palindrom değildir.");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number=input.nextInt();
        System.out.println(isPalindrom(number));
    }
}
