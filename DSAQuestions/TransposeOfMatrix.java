package DSAQuestions;

public class TransposeOfMatrix {
        public static void main(String[] args) {

            int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
            int[][] outputMatrix = new int[matrix[0].length][matrix.length];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    outputMatrix[i][j] = matrix[j][i];
                    System.out.println("output :- :" + i + "-" + j + ":" + outputMatrix[i][j]);
                }
            }
        }

}
