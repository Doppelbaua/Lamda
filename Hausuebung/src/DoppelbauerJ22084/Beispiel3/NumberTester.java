package DoppelbauerJ22084.Beispiel3;

import DoppelbauerJ22084.Beispiel3.NumberTest;

import java.io.*;
import java.util.Scanner;

public class NumberTester
{


     String  filepath;

    NumberTest oddTester = number -> (number % 2) != 0;
      NumberTest primeTester = n -> {
        if (n <= 1) {
            return false;
        }
        // 2 und 3 sind Primzahlen
        if (n <= 3) {
            return true;
        }
        // Ausschluss von geraden Zahlen und Vielfachen von 3
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        // Testen von potenziellen Teilern
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    };
     NumberTest palindromeTester = a -> {
        String str = Integer.toString(a);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    };



    public  NumberTester (String fileName)
    {
        this.filepath = fileName;
    }
    public  void setOddEvenTester (NumberTest oddTest)
    {
        oddTester = oddTest;
    }
    public  void setPrimeTester (NumberTest primeTester)
    {
        this.primeTester = primeTester;
    }
    public void setPalindromeTester (NumberTest palindromeTester)
    {
        this.palindromeTester = palindromeTester;
    }
    public  void testFile() {
        Scanner scanner = new Scanner(filepath);
        int runnings = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < runnings; i++) {
            String line = String.valueOf(scanner.nextLine());
            String[] cases = line.split(" ");
            int chose = Integer.parseInt(cases[0]);
            int number = Integer.parseInt(cases[1]);
            System.out.println(i + ". Zeile:");
            switch (chose) {
                case 1:
                    if (oddTester.testNumber(number)) {
                        System.out.println(number + " EVEN");
                    } else {
                        System.out.println(number + " ODD");
                    }
                    break;
                case 2:
                    if (primeTester.testNumber(number)) {
                        System.out.println(number + " PRIME");
                    } else {
                        System.out.println(number + " NO PRIME");
                    }
                    break;
                case 3:
                    if (palindromeTester.testNumber(number)) {
                        System.out.println(number + " PALINDROME");
                    } else {
                        System.out.println(number + " NOT PALINDROME");
                    }
                    break;
            }

            System.out.println();
        }
    }
    public static void main (String [] args)
    {
        NumberTester tester = new NumberTester("werte.csv");
        tester.testFile();
    }



}
