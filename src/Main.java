import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Create_Account newAcc = new Create_Account();
        Storage storage = new Storage();
        String condition = "yes";
        String name, surname, gender, birthday, email, password, username;
        while(condition.equals("yes")){
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
            storage.addAccount(newAcc, username);
            System.out.println("Do you want to add new account? yes/no");
            condition = sc.nextLine();
        }
        storage.toString("Aesthetic");
    }
}