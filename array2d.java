import java.util.Scanner;

public class array2d {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner(System.in);
         int arr[][] = new int [3][4];
         
         
         for (int i=0; i<=arr.length-1; i++) {
             for (int j=0; j<=arr[i].length-1; j++) {
                 System.out.println("provide value for row = " + i +"and column = " + j);
                 arr[i][j] = sc.nextInt();

             }
         }

         //print
        for (int rowindex=0; rowindex<=arr.length-1;rowindex++) {
            for (int colindex=0; colindex<=arr[rowindex].length-11; colindex++) {
                System.out.print(arr[rowindex] [colindex]  + " ");
            }
            System.out.println(" ");
        }
         
         
         
         
    }
}