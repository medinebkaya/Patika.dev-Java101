import java.util.Arrays;

public class TekrarEdenCiftSayiBulma {
    static boolean isOkey(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] bul = {1,1, 2, 2, 3, 3, 4, 5, 6, 6};
        int[] bul2 = new int[bul.length];
        int startIndex = 0;

        for (int i = 0; i < bul.length; i++) {
            for (int j = 0; j < bul.length; j++) {
                if ((i != j) && (bul[i] == bul[j]) && (bul[i] % 2 == 0 && bul[j] % 2 == 0)) {
                    if (!isOkey(bul2, bul[i])) {
                        bul2[startIndex++] = bul[i];
                    }
                    break;
                }
            }
        }

        System.out.println("Dizide Tekrar Eden Çift Sayılar ");
        for (int value : bul2) {
            if (value != 0) {
                System.out.println(" " + value);
            }
        }
    }
}
