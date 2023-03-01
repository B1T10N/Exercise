import java.util.Scanner;

public class Spheroid {
    public static void main(String[] args) {
        int state = 0;
        System.out.print("Enter equatorial radius in km: ");
        Scanner ipt_01 = new Scanner(System.in);
        double a = ipt_01.nextDouble();
        if (a < 0 || a == 0){
            System.out.println("Error: equatorial radius must be larger than 0");
            state++;
            System.exit(state);
        }
        System.out.print("Enter polar radius in km: ");
        Scanner ipt_02 = new Scanner(System.in);
        double c = ipt_02.nextDouble();
        if ( c < 0 || c == 0 ) {
            System.out.println("Error: polar radius must be larger than 0");
            state++;
            System.exit(state);
        }
        if ( a < c ) {
            System.out.println("Error: equatorial radius must be larger than polar radius");
            state++;
            System.exit(state);
        }
        double e_init = 1-((c*c) / (a*a));
        double e = Math.sqrt(e_init);
        double v = (4*Math.PI*a*a*c)/3;

        System.out.printf("Eccentricity = %.3f\n",e);
        System.out.printf("Volume = %g cubic km", v);

    }
}
