import java.util.Scanner;
public class YildizlardanElmas {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n=input.nextInt();
        int i,k,j,l,m;
        for (i=1;i<=n;i++)//Bu döngümüzde baklava dilimimizin üst kısmını yapıyoruz.
        {
            for (k=n;k>i;k--)//bu for döngümüz ekran çıktısının sol tarafındaki boşlukları ayarlıyor.
            {
                System.out.print(" ");
            }
            for (j = 1; j <=i ; j++)//bu for döngümüz ise yıldız şeklimizi çıkartıyor ve yıldızların arasındaki boşluğu ayarlıyor
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //bu döngümüz ile baklava diliminin alt kısımını yapıyoruz
        for (k=1;k<=n;k++)
        {
            for (l =1 ; l <=k; l++)//döngümüz ile baklava diliminin alt kısımının sol tarafındaki boşlukları belirtiyoruz.
            {
                System.out.print(" ");
            }
            for (m = n; m >k ; m--)//bu döngümüz ile baklava diliminin alt kısımındaki yıldızları ve arasındaki boşlukları belirtiyoruz.
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
