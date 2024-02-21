import java.util.TreeMap;

public class Storage {
    private Create_Account Acc;
    private TreeMap<String, Create_Account> AccountInfo = new TreeMap<>();
    public void addAccount(Create_Account Acc, String username){
        AccountInfo.put(username, Acc);
    }

    public void toString(String username){
        System.out.println(AccountInfo.get(username).toString());
    }

}
