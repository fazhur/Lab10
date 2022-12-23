package adapter.task_3;

public class Authorisation {
    Авторизація auth;

    public Authorisation(Авторизація auth) {
        this.auth = auth;
    }
    public boolean authorise(БазаДаних db) {
        auth.авторизуватися(db);
        return true;
    }
}