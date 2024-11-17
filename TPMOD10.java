//class UserData
public class UserData {
    private int userid;
    private int password;
    private boolean isLoggedIn;

    public UserData(int userid, int password) {
        this.userid = userid;
        this.password = password;
    }
    
    public void login() throws LoginFailedException {
        assert (Integer.toString(this.userid).length() == 4) : "userid harus memiliki 4 digit";
        assert (Integer.toString(this.password).length() == 4) : "password harus memiliki 4 digit";

        if (this.userid + this.password != 10000) {
            this.isLoggedIn = false;
            throw new LoginFailedException("Login user " + this.userid + " gagal, telah gagal login " + (LoginFailedException.getFailedCounter(this.userid) + 1) + " kali", this.userid);
        }
        this.isLoggedIn = true;
        System.out.println("Login successful for user " + this.userid);
    }
}

//class LoginFailedException
public class LoginFailedException extends Exception {
    private static final HashMap<Integer, Integer> failedcount = new HashMap<>();
    private final int userid;

    public LoginFailedException(String msg, int user) {
        super(msg);
        this.userid = user;

        if (failedCount.containsKey(this.userid)) {
            failedCount.put(this.userid, failedCount.get(this.userid) + 1);
        } else {
            failedCount.put(this.userid, 1);
        }
    }

    public int getUserId() {
        return this.userid;
    }

    public static int getFailedCounter(int userid) {
        return failedCount.getOrDefault(userid, 0);
    }
}

//class Main
public class Main {
    public static void main(String[] args) {
        UserData user1 = new UserData(1234, 8766);
        UserData user2 = new UserData(1113, 9092);

        try {
            user1.login();
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        }

        try {
            user2.login();
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        }

        try {
            user2.login();
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}
