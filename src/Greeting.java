import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");

        String name = scanner.nextLine();

        scanner.close();

        System.out.println("Hi " + name);
    }
}