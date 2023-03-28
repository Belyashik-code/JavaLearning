package Lesson_4;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println(verfication("SashaBelyaev", "Belyaev1999B", "8Belyaev1999B"));
    }

    private static boolean verfication(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException ex) {
            System.out.println("Логин содержит запрщенные символы или слишком длинный");
            return false;
        } catch (WrongPasswordException ex) {
            System.out.println("Пароли не совпадают или содержат запрещенные символы");
            return false;
        }
        return true;
    }

    public static void check(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        if (!login.matches("[A-z0-9_]+")) {
            throw new WrongLoginException("Логин содержит запрещенные символы");
        }
        if (login.length() > 20) {
            throw new WrongLoginException("Логин слишком длинный");
        }
        if (!password.matches("[A-z0-9_]+")) {
            throw new WrongPasswordException("Пароль содержит запрещенные символы");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль слишком длинный");
        }
    }


}
