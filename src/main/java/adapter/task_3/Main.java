package adapter.task_3;

public class Main {
    public static void main(String[] args) {
        Database db = new Database(new БазаДаних());
        Authorisation authorisation = new Authorisation(new Авторизація());
        if (authorisation.authorise(new БазаДаних())) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}