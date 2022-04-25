import java.util.Arrays;
public class Frekans {
    public static void main(String[] args) {
        int tekrar = 0;
        int[] list = {3, 7, 3, 3, 2, 9, 4, 10, 21, 1, 33, 9, 1, 2, 4};
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    tekrar++;
                }
            }
            System.out.println(list[i]+" sayisi "+tekrar+" kez tekrarlandi.");
            i=i+tekrar-1;
            tekrar=0;
        }

    }
}
