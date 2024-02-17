import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Create_Account newAcc = new Create_Account();
        System.out.println(newAcc);
        Create_Account newAcc2 = new Create_Account();
        Storage accounts = new Storage();
        System.out.println("Introduceti username: ");
        String username = sc.nextLine();
        accounts.addAccount(newAcc, username);
        System.out.println("Introduceti username2: ");
        username = sc.nextLine();
        accounts.addAccount(newAcc2, username);
        System.out.println("Introduceti username: ");
        String userName = sc.nextLine();
        accounts.toString(userName);
        System.out.println("Introduceti alt username: ");
        userName = sc.nextLine();
        accounts.toString(userName);
    }
}