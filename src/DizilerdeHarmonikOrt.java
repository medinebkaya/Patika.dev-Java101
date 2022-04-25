public class Main {
    public static void main(String[] args) {
        int[] dizi={1,2,3,4,5};
        double toplam=0;
        double harmonik;
        for (int i=0; i< dizi.length; i++){
            toplam=toplam+(1.0/dizi[i]);
        }
        int n=dizi.length;
        harmonik= n/toplam;
        System.out.println(harmonik);
    }
}
