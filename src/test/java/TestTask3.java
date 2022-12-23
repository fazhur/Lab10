import adapter.task_3.Authorisation;
import adapter.task_3.Database;
import adapter.task_3.Авторизація;
import adapter.task_3.БазаДаних;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTask3 {
    @Test
    public void testDatabase() {
        БазаДаних db = new БазаДаних();
        Database database = new Database(db);
        assertEquals("hello", database.getUserData());
        assertEquals("hello2", database.getStatisticsData());
    }
    @Test
    public void testAuthorisation() {
        Авторизація auth = new Авторизація();
        Authorisation authorisation = new Authorisation(auth);
        БазаДаних db = new БазаДаних();
        assertTrue(authorisation.authorise(db));
    }
}
