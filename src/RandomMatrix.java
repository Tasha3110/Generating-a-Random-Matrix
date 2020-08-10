import java.util.Random;

public class RandomMatrix {


    public static void main(String[] args) {
        printMatrix();
        sumMatrix();
    }


    public static void printMatrix() {
        Random randomNumber = new Random();
        int[][] matrix = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = randomNumber.nextInt(100);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }



    public static void sumMatrix() {
        int sum = 0;
        Random randomNumber = new Random();
        int[][] matrix = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = randomNumber.nextInt(100);
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of all elements is: " + sum);

    }
}



