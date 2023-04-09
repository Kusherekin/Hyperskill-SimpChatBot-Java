import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Aid", "2023");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ". I`m a simply test bot");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        System.out.println("One second, please. I`m counting");
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static void test() {
        System.out.println("Now let ma ask you a simple question.");
        // write your code here
        System.out.println("What does the Fox say?\n1. Moo\n2. Bark\n3. What?\n4. Digulidigulidagulidoo");
        int choice = scanner.nextInt();
        if (choice != 4){
            System.out.println("Maybe this is a correct answer, but I don`t think so.");
        }else{
            System.out.println("Yeah!");
        }
    }

    static void end() {
        System.out.println("Have a nice day, you are super!");
    }
}
