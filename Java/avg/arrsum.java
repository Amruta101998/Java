import java.util.Scanner;

public class arrsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum=0;
        System.out.println("Enter number:");

        for(int i=0;i<5;i++) {
            arr[i] = sc.nextInt();
        }
        for( int num : arr) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:"+sum);
    }
}

   

