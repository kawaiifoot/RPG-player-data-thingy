import java.util.Scanner;

public class Start {

    void start() {
        Scanner sc = new Scanner(System.in);
        Class user1 = new Class();

        System.out.println("Welcome Player! ");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Please enter your Class: ");
        String user1Class = sc.next();

        user1.player(user1Class, name);
    }
}
