package DoppelbauerJ22084.Beispiel4;

import java.util.Scanner;

public class Outputclass {

      static Scanner scanner;
      public static int ax;
      public static int ay;
      public static int bx;
      public static int by;
      public static int input;
    public static void main (String [] args)
    {
         scanner = new Scanner(System.in);
        while(true)
        {
            input = 0;
            System.out.println("Choose claculator:");
            System.out.println("1 - Relational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("3 - Complex calculator");
            System.out.println("4 - Exit programm");
            input = Integer.parseInt(scanner.nextLine());

            if (input >= 4 || input < 0)
            {
                System.out.println("Shutting down...");
                break;
            }

            AbstractCalculator calculator = null;
            switch (input)
            {
                case 1: calculator = new RationalCalculator(); break;
                case 2: calculator = new VectorCalator(); break;
                case 3: calculator = new ComplexCalulator(); break;
            }
            numberinput();

            output();
            int choise =Integer.parseInt(scanner.nextLine());
            if (choise > 5 || choise < 0)
            {
                System.out.println("Invaliad input...");
                System.out.println("Shutting down...");
            }
            if (choise == 5)
            {
                numberinput();
                output();
                choise = Integer.parseInt(scanner.nextLine());
            }
            Number x = new Number(ax, ay);
            Number y = new Number(bx, by);
            Number result = null;
            switch (choise) {
                case 1:
                    result = calculator.add(x, y);
                    break;
                case 2:
                    result = calculator.substract(x, y);
                    break;
                case 3:
                    result = calculator.multiply(x, y);
                    break;
                case 4:
                    result = calculator.divide(x, y);
                    break;
                default:
                    System.out.println("Invalid operation, please try again.");
                    continue;
            }

            // Ausgabe des Ergebnisses
            System.out.println("=========================");
            System.out.println("Solution:");
            System.out.println("a = " + result.getA());
            System.out.println("b = " + result.getB());
            System.out.println("=========================");
        }
    }

    public static void output()
    {
        System.out.println("Choose operation");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter numbers again");
    }
    public static void numberinput()
    {
        ax = 0;
        ay = 0;
        bx = 0;
        by = 0;
        System.out.println("Enter number x a");
        ax = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number x b");
         ay = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number y a");
         bx = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number y b");
         by = Integer.parseInt(scanner.nextLine());
    }
}
