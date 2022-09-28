import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        ChatBot debbie = new ChatBot("Debbie", 11);

        System.out.print("Please enter your name: ");
        String name = scan.nextLine();

        debbie.greeting(name);

        System.out.print("Hopefully you're doing well. Let's try to get to know each other. What is your height rounded to the nearest foot?");
        int height = scan.nextInt();
        scan.nextLine();

        double heightInMeters = debbie.convertFeetToMeters(height);

        System.out.println("Wow! That means that you're around " + heightInMeters + " in meters. Cool!");
        System.out.println("--------------------------------------");

        System.out.println("Wow, its pretty cold outside right now, isn't it?");
        System.out.print("Oh, that wasn't a question, that was more of a conversation starter. To be frank, ");
        debbie.weather();

        System.out.println("--------------------------------------");
        System.out.println("Anyways, let's play a little game to pass the time. Guess my favorite number!");
        int guessFav = scan.nextInt();
        scan.nextLine();

        while (guessFav != 11)
        {
            System.out.println("Not quite...try again!");
            guessFav = scan.nextInt();
            scan.nextLine();
        }

        System.out.print("Good job! ");
        debbie.favoriteNumber(11);

        System.out.println("Now, try to guess my age. ");
        int guessAge = scan.nextInt();
        scan.nextLine();

        while (guessAge != 16)
        {
            System.out.println("Good guess, but try again. ");
            guessFav = scan.nextInt();
            scan.nextLine();
        }

        System.out.println("Correct! My siblings and I are all 15, 16 and 17 years old. ");

        int sumOfNumbers = debbie.addNumbers(15,16,21);
        System.out.println("Together, our ages combine to " + sumOfNumbers + " years old. Very interesting!");
        System.out.println();

        System.out.println("Now, before I leave, can you help me with a homework problem I'm struggling with? Here it is: ");
        System.out.println("42 * 13 = ");
        int guessProduct = scan.nextInt();
        scan.nextLine();

        while (guessProduct != debbie.calculateProduct())
        {
            System.out.println("That doesn't seem right...");
            guessProduct = scan.nextInt();
            scan.nextLine();
        }

        System.out.print("Great, thanks for the help!");
        debbie.printProduct();
        System.out.println("Wow, it's getting pretty late. " + debbie.goodbye());
    }
}
