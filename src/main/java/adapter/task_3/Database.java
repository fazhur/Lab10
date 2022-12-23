package adapter.task_3;

public class Database {
    private БазаДаних db;

    public Database(БазаДаних db) {
        this.db = db;
    }

    public String getUserData() {
        return db.отриматиДаніКористувача();
    }
    public String getStatisticsData() {
        return db.отриматиСтатистичніДані();
    }
}
