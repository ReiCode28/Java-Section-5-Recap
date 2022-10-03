import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    System.out.print("Hi! Choose a number to count to: ");
    int input = scan.nextInt();

    for (int i = 0; i < input; i++){
        System.out.print(i + 1 + " ");
    }

        scan.close();
    }
}
