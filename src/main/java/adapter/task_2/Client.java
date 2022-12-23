package adapter.task_2;

import java.time.LocalDate;

public interface Client {
    String getEmail();
    String getCountry();
    LocalDate getLastActiveTime();
}

