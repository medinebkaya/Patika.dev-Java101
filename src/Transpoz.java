public class Transpoz {
    public static void main(String[] args) {


            int[][] matris = {
                    {2, 3, 4},
                    {5, 6, 4}
            };
            int[][] transpose = new int[3][2];

            System.out.println("Matris :");
            for (int i = 0; i < matris.length; i++) {
                for (int j = 0; j < matris[i].length; j++) {
                    System.out.print(matris[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Transpoze :");
            for (int i = 0; i < transpose.length; i++) {
                for (int j = 0; j < transpose[i].length; j++) {
                    transpose[i][j] = 0;
                    for (int k=0;k< transpose.length;k++){
                        transpose[i][j]=matris[j][i];
                    }
                    System.out.print(transpose[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
