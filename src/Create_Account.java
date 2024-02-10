import java.util.Scanner;

public class Create_Account {
    private String Name;
    private String Surname;
    private String BirthDay;
    private String Gender;
    private String email;
    private String Password;
    Scanner sc = new Scanner(System.in);

    public Create_Account(String Name, String Surname, String BirthDay, String gender){
        this.Name = Name;
        this.Surname = Surname;
        YourBirthday(BirthDay);
        yourGender(gender);
    }

    private void YourBirthday(String BirthDay){
        while(!isBirthdayOk(BirthDay)){
                System.out.println("Incorect birthday, enter again in format yyyyMMdd: ");
                BirthDay = sc.nextLine();
                isBirthdayOk(BirthDay);
        }
        this.BirthDay = BirthDay;
    }

    private void yourGender(String gender){
        while(!(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))){
            System.out.println("Error!! Enter Male/Female: ");
            gender = sc.nextLine();
        }
        this.Gender = gender;
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
        boolean isMonthOk = (month >= 1) && (month <= 12);
        boolean isDayOk = day <= isDayOk(month, year);
        return isYearOk && isMonthOk && isDayOk;
    }
    private int isDayOk(int month, int year){
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            case 2 -> {
                if (year % 4 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            }
        }
        return -1;
    }
}
