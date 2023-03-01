import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("please enter 2 digits");
        int number = user.nextInt();
        Random r = new Random();
        int reward = r.nextInt(100);
        int count = 0;
        if (number == reward){
            System.out.println("Reward is $10000");
        }else {
            if (number%10 == reward%10){
                count++;
            }
            if (number/10 == reward%10){
                count++;
            }
            if (number%10 == reward/10){
                count++;
            }
            if (number/10 == reward/10){
                count++;
            }
            switch (count){
                case 0 -> System.out.println("Reward is 0");
                case 1 -> System.out.println("Reward is $1000");
                case 2 -> System.out.println("Reward is $3000");
            }
        }
    }
}