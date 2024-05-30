package Array;

public class MultiDArray {

    public static void main(String[] args) {
        
        // Multi Dimensional Array

        int num [][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<num.length;i++){
            for(int j =0 ; j<num[0].length;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }


        // Assigning random values to an 2D array
        System.out.println();
        System.out.println("Randomly generated 2D array");
        int num1[][] = new  int[3][4];

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[0].length; j++) {
                num1[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i=0;i<num1.length;i++){
            for(int j =0 ; j<num1[0].length;j++){
                System.out.print(num1[i][j] + " ");
            }
            System.out.println();
        }

        // Enhanced for loop
    
        for(int n[] : num){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
<<<<<<< HEAD

        // Jagged Array
        System.out.println();
        System.out.println("Jagged Array");
        int arr[][] = new int[3][];   // jagged array

        arr[0] = new int[3];    // soecifying columns in jagged array
        arr[1] = new int[4];
        arr[2] = new int[2];

        for(int n=0 ; n < arr.length ; n++){
            for(int k = 0; k < arr[n].length ; k++){
                arr[n][k] = (int)(Math.random()*10);
            }
        }

        for(int n[] : arr){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }


        //3D Array

        System.out.println();
        System.out.println("3D array");

        int num3[][][] = new int[4][4][4];

        for(int i =0 ; i < num3.length ; i++){
            for(int j = 0 ; j < num3[0].length ; j++){
                for(int k = 0 ; k < num3[0][0].length;k++){
                    num3[i][j][k] = (int)(Math.random()*10);
                }
            }
        }
=======
>>>>>>> e30030934f350f5e7c648027d432b630513f235c
    }
    
}


