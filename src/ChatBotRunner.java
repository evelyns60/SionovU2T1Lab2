import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        ChatBot debbie = new ChatBot("Debbie", 11);

        System.out.print("Please enter your name: ");
        String name = scan.nextLine();

        debbie.greeting(name);
        String answer = scan.nextLine();

        System.out.print("Good to know. Let's try to get to know each other. What is your height rounded to the nearest foot?");
        int height = scan.nextInt();
        scan.nextLine();

    }
}
