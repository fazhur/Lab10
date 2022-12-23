package adapter.task_2;

import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser("fedir.zhurba@ucu.edu.ua", "Ukraine", "2022-10-17"));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser("fedir.zhurba@ucu.edu.ua", Country.Ukraine, LocalDate.now()));
        }
        throw new IllegalArgumentException("No such login method, try twitter or facebook.");
    }
}
