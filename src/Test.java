import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("dfghjkl");
        System.out.println();
        //tek satırlı yorum satırı
        /* çok satırlı
         yorum satırı */
        char karakter='T';
        System.out.println(karakter);
        String str;
        Scanner input = new Scanner(System.in);
        System.out.print("metni giriniz:");
        str=input.nextLine();
        System.out.println("girmiş olduğunuz metin: "+ str);
        int a;
        System.out.print("sayı giriniz:");
        a=input.nextInt();
        System.out.println("girilen sayı: "+ a);

    }
}
