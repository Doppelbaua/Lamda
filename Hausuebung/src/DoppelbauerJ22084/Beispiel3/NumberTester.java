package DoppelbauerJ22084.Beispiel3;

import DoppelbauerJ22084.Beispiel3.NumberTest;

public class NumberTester
{
    String filepath;

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
    NumberTest palindromeTester;



    public NumberTester (String fileName)
    {
        this.filepath = fileName;
    }
    public void setOddEvenTester (NumberTest oddTest)
    {
        oddTester = oddTest;
    }
    public void setPrimeTester (NumberTest primeTester)
    {
        this.primeTester = primeTester;
    }
    public void setPalindromeTester (NumberTest palindromeTester)
    {
        this.palindromeTester = palindromeTester;
    }
    public void testFile()
    {

    }


}
