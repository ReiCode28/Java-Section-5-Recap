import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        String input = scan.nextLine();
        
        for (int i = 0; i < 99; i++){
            System.out.println(i + 1 + ". " + input);
        }
        
    }
    
}

// I will not forget semi-colons;
// Prints user input 99 times, numbering each line starting from 1