import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n sayısını giriniz: ");
        int n=input.nextInt();
        System.out.print("r sayısını giriniz: ");
        int r=input.nextInt();
        //C(n,r) = n! / (r! * (n-r)!)
        int nfaktoriyel = 1;
        for(int i = 1; i<= n; i++){
            nfaktoriyel = nfaktoriyel * i;
        }
        int rfaktoriyel=1;
        for (int i=1; i<=r; i++){
            rfaktoriyel=rfaktoriyel*i;
        }
        int n_rfaktoriyel=1;
        for (int i=1; i<=n-r; i++){
            n_rfaktoriyel=n_rfaktoriyel*i;

        }
        int kombinasyon=nfaktoriyel/(rfaktoriyel*n_rfaktoriyel);
        System.out.println(n+" sayısının"+r+" sayısına göre kombinasyonu: "+kombinasyon);

    }
}
