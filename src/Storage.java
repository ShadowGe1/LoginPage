import java.io.*;
import java.util.TreeMap;

public class Storage {
    private TreeMap<String, Create_Account> AccountInfo = new TreeMap<>();
    public void addAccount(Create_Account Acc, String username){
        AccountInfo.put(username, Acc);
    }

    public boolean verifyUsername(String username){
        if(AccountInfo.containsKey(username)){
            return false;
        }
        return true;
    }

    public void getAccount(String username){
        System.out.println(AccountInfo.get(username).toString());
    }

    public boolean deleteAccount(String username){
        if(AccountInfo.containsKey(username)) {
            AccountInfo.remove(username);
            return true;
        }
        return false;
    }

    public void saveInfo() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("InfoAccounts.ser")
            );
            out.writeObject(AccountInfo);
            out.close();
            System.out.println("The information was well written in the files");
        }catch (IOException e){
            System.out.println("The file cannot be opened or does not exist");
        }
    }

    public void loadInfo() throws ClassNotFoundException {
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("InfoAccounts.ser")
            );
            AccountInfo = (TreeMap<String, Create_Account>) in.readObject();
            in.close();
            System.out.println("The information was successfully extracted from the file");
        }catch (IOException e){
            System.out.println("The file cannot be opened or does not exist");
        }
    }

    public void toDisplay(){
        System.out.println(AccountInfo.toString());
    }

    public String userPassword(String username){
        return AccountInfo.get(username).getPassword();
    }

    public byte[] userSalt(String username){
        return AccountInfo.get(username).getSalt();
    }

}
