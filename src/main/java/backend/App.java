/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package backend;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        SchereSteinPapierLogik sspLogik = new SchereSteinPapierLogik();

        Scanner scanner = new Scanner(System.in);
        String playerAnswer = scanner.next();
        String randomAnswer = sspLogik.random_decision();

        System.out.println(sspLogik.schereSteinPapier(playerAnswer, randomAnswer));
    }
}
