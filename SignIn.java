import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("• Username: ");
        String userEntry = scan.nextLine();
        System.out.print("• Password: ");
        String passEntry = scan.nextLine();

        while (!userEntry.equals(username) || !passEntry.equals(password)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("• Username: ");
            userEntry = scan.nextLine();
            System.out.print("• Password: ");
            passEntry = scan.nextLine();
        }
        System.out.println("\nSign in sucessful. Welcome!");

        scan.close();

        
    }
}
