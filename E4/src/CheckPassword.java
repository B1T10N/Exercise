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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        int state = 0;
        boolean length = longEnough(password);
        boolean digit = atLeastTwoDigits(password);
        if (!length){
            System.out.println("Password is not valid");
            state++;
            System.exit(state);
        } else if (!digit) {
            System.out.println("Password is not valid");
            state++;
            System.exit(state);
        }else {
            System.out.println("Usage: java CheckPassword "+ password);
        }
    }
}