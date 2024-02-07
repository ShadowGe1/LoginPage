import java.util.Scanner;

public class Create_Account {
    private String Name;
    private String Surname;
    private String BirthDay;
    private String Gender;
    private String email;
    private String Password;

    public Create_Account(String Name, String Surname){
        this.Name = Name;
        this.Surname = Surname;
    }

    private void YourBirthday(String BirthDay){
        isBirthdayOk(BirthDay);
    }

    private boolean isBirthdayOk(String BirthDay){
        if(BirthDay == null || BirthDay.length() != "yyyyMMdd".length()){
            return false;
        }

        int date;
        try{
            date = Integer.parseInt(BirthDay);
        }catch (NumberFormatException e){
            System.out.println("Incorrect format");
            return false;
        }

        int year = date / 10000;
        int month = (date / 100) % 100;
        int day = date % 100;

        boolean isYearOk = (year >= 1900) && (year <= 2024);
        boolean isMonthOk;
        return true;
    }
}
