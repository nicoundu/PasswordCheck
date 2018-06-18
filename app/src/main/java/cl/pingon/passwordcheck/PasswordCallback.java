package cl.pingon.passwordcheck;

public interface PasswordCallback {

    void correct(String pass);

    void incorrect();

}
