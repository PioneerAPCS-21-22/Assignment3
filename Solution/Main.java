/**
 * Converts Fahrenheit to Celsius.
 *
 * @author Mr. King
 * @version 8/27/2021
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter degrees in Fahrenheit: ");
        double degF = in.nextDouble();
        double degC = (degF - 32.0) / 1.8;
        System.out.println(degF + "F = " + degC + "C");
    }
}

