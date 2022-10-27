package OopSixExceptions;

public class DataValidation {

    private String login;
    private String password;
    private String confirmPassword;

    public DataValidation(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            setLogin(login);
            setPassword(password);
            setConfirmPassword(confirmPassword);
        } catch (WrongLoginException e) {
            System.err.printf(e.getMessage());
        } catch (WrongPasswordException ex) {
            System.err.printf(ex.getMessage());
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws WrongLoginException {
        if (validation(login)) {
            throw new WrongLoginException("WrongLoginException");
        }
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws WrongPasswordException {
        if (validation(password)) {
            throw new WrongPasswordException("WrongPasswordException");
        }
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) throws WrongPasswordException {
        if (confirmPassword == password) {
            this.confirmPassword = confirmPassword;
            System.out.println(true);
        } else {
            throw new WrongPasswordException("WrongPasswordException");
        }
    }

    public static boolean validation(String s) {
        return s == null || s.isEmpty() || !s.matches("^[a-zA-Z_0-9]*$") || s.length() >= 20 || s.length() <= 1;
    }
}
