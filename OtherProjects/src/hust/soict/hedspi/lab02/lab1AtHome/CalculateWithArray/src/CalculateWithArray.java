import java.util.Arrays;
import java.util.Scanner;

public class CalculateWithArray {
    public static void Sort(Double[] B, int n){
        double tem, sum = 0;
        for (int i = 0 ; i < n ; i++){
            for (int j = i + 1 ; j < n ; j++){
                if (B[i] > B[j]){
                    tem = B[i];
                    B[i] = B[j];
                    B[j] = tem;
                }
            }
            sum += B[i];
        }
        System.out.println(Arrays.toString(B));
        System.out.println("Sum is  : " + sum);
        System.out.println("Average is : " + sum/n);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose : \n1.Input array \n2.Use constant array");
        int option, n;
        do {
            option = scanner.nextInt();
        }
        while (option != 1 && option !=2);
        if (option == 1){
            do {
                System.out.print("Input size of array (> 0): ");
                n = scanner.nextInt();
            }
            while ( n < 0);
            Double[] B = new Double[n];
            for (int i = 0 ; i < n ; i++)
                B[i] = scanner.nextDouble();
            Sort(B, n);
        }
        else {
            final Double[] A = {2.3 , 4.5 , 10.0 , 0.5 , 18.9 , 0.03};
            int size = A.length;
            System.out.println("Constant array is : ");
            System.out.println(Arrays.toString(A));
            System.out.println("Array after sorting is : ");
            Sort(A, size);
        }
        scanner.close();
    }
}
