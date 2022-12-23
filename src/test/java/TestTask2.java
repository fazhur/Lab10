import adapter.task_2.FacebookClient;
import adapter.task_2.Login;
import adapter.task_2.TwitterClient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTask2 {
    public static Login login = new Login();

    @Test
    public void testClients() {
        assertTrue(login.login("facebook") instanceof FacebookClient);
        assertTrue(login.login("twitter") instanceof TwitterClient);
        assertThrows(IllegalArgumentException.class, () -> login.login("google"));
    }

}