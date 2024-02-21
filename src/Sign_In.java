public class Sign_In {
    private Storage passwords;
    public Sign_In(Storage storage){
        passwords = storage;
    }
    public boolean correctPassword(String username, String password_user){
        GetPassword userPasswords = new GetPassword(password_user, passwords.userSalt(username));
         if(passwords.userPassword(username).equals(userPasswords.generatedPass)){
             passwords.getAccount(username);
             return true;
        }
         return false;
    }
}
