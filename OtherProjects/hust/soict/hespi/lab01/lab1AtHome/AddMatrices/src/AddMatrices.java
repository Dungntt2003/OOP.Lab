import java.util.*;
public class AddMatrix {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int option,m,n;
        System.out.println("Please choose : \n1.Input 2 arrays \n2.Use constant array" );
        do {
            option = scanner.nextInt();
        }
        while (option != 1 && option != 2);
        if (option == 1){
            System.out.println("Input row and column of array :");
            do {
                System.out.print("Input row (> 0) : ");
                m = scanner.nextInt();
            }
            while ( m <= 0);
            do {
                System.out.print("Input column (> 0) : ");
                n = scanner.nextInt();
            }
            while ( n <= 0);
            
            Double[][] A = new Double[m][n];
            Double[][] B = new Double[m][n];
            Double[][] C = new Double[m][n];
            System.out.println("Input the first array : ");
            for (int i = 0 ; i < m ; i++){
                for (int j = 0 ; j < n ; j++){
                    A[i][j] = scanner.nextDouble();
                }
            }
            System.out.println("Input the second array : ");
            for (int i = 0 ; i < m ; i++){
                for (int j = 0 ; j < n ; j++){
                    B[i][j] = scanner.nextDouble();
                    C[i][j] = A[i][j] + B[i][j];
                }
            }            
            System.out.println("Sum of 2 arrays : ");
            for (int i = 0 ; i < m ; i++){
                for (int j = 0 ; j < n ; j++){
                    System.out.print(C[i][j] + "\t");
                }
                System.out.println("");
            }
        }
        else {
            final Double[][] A = {{1.2, 2.3}, {4.5, 10.0}};
            final Double[][] B = {{1.3, 2.4}, {4.6, 10.1}};
            Double[][] C = new Double[2][2];
            System.out.println("The first constant array : ");
            for (int i = 0; i < 2; i++){
                for (int j = 0; j < 2; j++){
                     System.out.print(A[i][j] + "\t");
                }
                System.out.println("");
            }
            System.out.println("The second constant array : ");
            for (int i = 0; i < 2; i++){
                for (int j = 0; j < 2; j++){
                     System.out.print(B[i][j] + "\t");
                     C[i][j] = A[i][j] + B[i][j];
                }
                System.out.println("");
            }
            System.out.println("Sum of 2 arrays : ");
            for (int i = 0; i < 2; i++){
                for (int j = 0; j < 2; j++){
                     System.out.print(C[i][j] + "\t");
                }
                System.out.println("");
            }
        }
        scanner.close();
    }
   
    
}
