import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        String data;
        do {
            System.out.println("Introduceti data nasterii in format yyyyMMdd: ");
            data = dat.nextLine();
            int date;
            try {
                date = Integer.parseInt(data);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect format");
                return;
            }

            int year = date / 10000;
            int month = (date / 100) % 100;
            int day = date % 100;
            System.out.println("Day: " + day + "\nMonth: " + month + "\nYear: " + year);
            //awdfawef
        }while(true);
    }
}