import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        Storage storage = new Storage();
        String condition = "no";
        String name, surname, gender, birthday, email, password, username;
        int menu;
        storage.loadInfo();
        while(condition.equalsIgnoreCase("no")) {
            System.out.println("Menu:");
            System.out.println("1. Log in");
            System.out.println("2. Sing up");
            System.out.println("3. Delete account");
            System.out.println("4. Exit");
            menu = sc.nextInt();
            switch (menu) {
                case 1 -> {
                    Sign_In sign_in = new Sign_In(storage);
                    sc.nextLine();
                    System.out.println("Enter username: ");
                    username = sc.nextLine();
                    while (storage.verifyUsername(username)) {
                        System.out.println("This username doesn't exist, enter another: ");
                        username = sc.nextLine();
                    }
                    System.out.println("Enter password: ");
                    password = sc.nextLine();
                    while(!sign_in.correctPassword(username, password)){
                        System.out.println("Incorrect password, enter again: ");
                        password = sc.nextLine();
                    }
                }
                case 2 -> {
                    sc.nextLine();
                    Create_Account newAcc = new Create_Account();
                    System.out.println("Enter your name: ");
                    name = sc.nextLine();
                    newAcc.setName(name);
                    System.out.println("Enter your surname: ");
                    surname = sc.nextLine();
                    newAcc.setSurname(surname);
                    System.out.println("Enter your birthday: ");
                    birthday = sc.nextLine();
                    newAcc.setBirthDay(birthday);
                    System.out.println("Enter your gender: ");
                    gender = sc.nextLine();
                    newAcc.setGender(gender);
                    System.out.println("Enter your email: ");
                    email = sc.nextLine();
                    newAcc.setEmail(email);
                    System.out.println("Enter your password: ");
                    password = sc.nextLine();
                    newAcc.setPassword(password);
                    System.out.println("Enter your username: ");
                    username = sc.nextLine();
                    while (!storage.verifyUsername(username)) {
                        System.out.println("This username is already exist!!!");
                        username = sc.nextLine();
                    }
                    storage.addAccount(newAcc, username);
                }
                case 3 -> {
                    Sign_In sign_in = new Sign_In(storage);
                    sc.nextLine();
                    System.out.println("Enter your username for delete de account: ");
                    username = sc.nextLine();
                    while (storage.verifyUsername(username)) {
                        System.out.println("This username doesn't exist, enter another: ");
                        username = sc.nextLine();
                    }
                    System.out.println("Enter password: ");
                    password = sc.nextLine();
                    while(!sign_in.correctPassword(username, password)){
                        System.out.println("Incorrect password, enter again: ");
                        password = sc.nextLine();
                    }
                    storage.deleteAccount(username);
                    System.out.println("Successful");
                }
                case 4 -> {
                    condition = "yes";
                    storage.saveInfo();
                }
                default -> System.out.println("The entered option does not exist");
            }
        }
    }
}