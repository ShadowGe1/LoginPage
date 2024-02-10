import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, surname, birthday;
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your surname: ");
        surname = sc.nextLine();
        System.out.println("Enter your Birthday in format yyyyMMdd: ");
        birthday = sc.nextLine();
        System.out.println("Enter your gender Male/Female: ");
        String gender = sc.nextLine();
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        Create_Account newAcc = new Create_Account(name, surname, birthday,gender,email);
    }
}