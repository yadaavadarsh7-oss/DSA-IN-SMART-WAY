import java.util.Scanner;

public class inputinarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr [] = { 10,34,-4,5};
        int n = arr.length;
        int max = arr[0];
        for (int index=0;index<n;index++) {
            if (max < arr[index]) {
                max = arr[index];

            }


        }
        System.out.println(max);


        }




    }

