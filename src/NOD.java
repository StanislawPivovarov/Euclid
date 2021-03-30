import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.math.BigInteger;
import java.util.Scanner;

public class NOD {


    public static void main(String[] args) {
        System.out.println("Введите числа через enter");
        Scanner scana = new Scanner(System.in);
        Scanner scanb = new Scanner(System.in);
        BigInteger a = scana.nextBigInteger();
        BigInteger b = scanb.nextBigInteger();


//        BigInteger a = new BigInteger("37995");
//        BigInteger b = new BigInteger("35466");

            System.out.println("НОД " + a + " и " + b + " = " + Euclide(a,b));
        }
    private static BigInteger Euclide (BigInteger a, BigInteger b) {
        // Библиотека
        BigInteger gcd = a.gcd(b);
        return BigInteger.valueOf(gcd.intValue());

    }
}
