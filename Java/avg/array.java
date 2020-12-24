import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Odd numbers:");

        for (int i = 0; i < arr.length; i = i + 2)
        {
            System.out.println(arr[i]);
        }
    }
}
