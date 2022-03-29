import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1=input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2=input.nextInt();
        int ebob;
        int enkucuk=n1;
        if (n1<n2)
            enkucuk=n2;
        int k=enkucuk;
        while(k>=1){
            if (n1%k==0 & n2%k==0){
                ebob=k;
                System.out.println("EBOB: "+k);
                break;
            }
            k--;
        }
        int i=1;
        while (i<=(n1*n2)){
            if (i% n1==0 && i%n2==0){
                System.out.println("EKOK: "+i);
                break;
            }
            i++;
        }


    }
}
