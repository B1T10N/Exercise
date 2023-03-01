import java.util.Scanner;

public class Spheroid {
    public static void main(String[] args) {
        System.out.print("Enter equatorial radius in km: ");
        Scanner ipt_01 = new Scanner(System.in);
        double a = ipt_01.nextDouble();
        System.out.print("Enter polar radius in km: ");
        Scanner ipt_02 = new Scanner(System.in);
        double c = ipt_02.nextDouble();
        double e_init = 1-((c*c) / (a*a));
        double e = Math.sqrt(e_init);
        double v = (4*Math.PI*a*a*c)/3;
        System.out.printf("Eccentricity = %.3f\n",e);
        System.out.printf("Volume = %g cubic km", v);
    }
}
