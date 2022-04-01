import java.util.Scanner;
public class FiboRecursive {
    static int fib(int n){
        if (n==1 || n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Fibonacci serisinin kaçıncı elemanını görmek istersiniz? :  ");
        int number=input.nextInt();
        System.out.println(fib(number));
    }
}
