package OopSixExceptions;


public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String logins = "Maksim56";
        String password = "12345_2";
        String confirmPassword = "12345_2";

        validation(logins, password, confirmPassword);
    }

    public static void validation(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        DataValidation validat = new DataValidation(login, password, confirmPassword);
    }
}
