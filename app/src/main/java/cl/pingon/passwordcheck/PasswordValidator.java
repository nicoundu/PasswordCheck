package cl.pingon.passwordcheck;

public class PasswordValidator {

    private PasswordCallback callback;

    public PasswordValidator(PasswordCallback callback) {
        this.callback = callback;
    }

    public void validation(String pass) {

        if (pass.trim().length() >= 8) {

            callback.correct(pass);
        }else {

            callback.incorrect();
        }


    }
}
