import java.util.Scanner;

public class CheckPassword {
    public static boolean longEnough(String password) {
        return password.length() >= 12;
    }

    public static boolean atLeastTwoDigits(String password) {
        int number = 0;
        byte [] b = password.getBytes();
        for (int i = 0; i < password.length(); i++) {
            if (b[i] >= 48 && b[i] <= 57){
                number++;
            }
        }
        return number>=2;
    }

    public static boolean logIn(){

        System.out.print("$ java CheckPassword ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        boolean length = longEnough(password);
        boolean digit = atLeastTwoDigits(password);

        boolean result = true;

        if (!length){
            System.out.println("Password is not valid");
            return false;
        } else if (!digit) {
            System.out.println("Password is not valid");
            return false;
        } else if (password.length() == 0){
            System.out.println("Usage: java CheckPassword <password>");
            return false;
        }

        return result;
    }

    public static void main(String[] args) {

        boolean log = logIn();

        while(true){
            if (!log){
                logIn();
            } else {
                System.out.println("Password is valid");
                break;
            }
        }

    }
}