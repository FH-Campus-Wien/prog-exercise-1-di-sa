package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.print("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|"+ System.lineSeparator() +
                "(__/\\__ \\--/ __"+ System.lineSeparator() +
                "   \\___|----|  |   __"+ System.lineSeparator()  +
                "       \\ }{ /\\ )_ / _\\"+ System.lineSeparator()  +
                "       /\\__/\\ \\__O (__"+ System.lineSeparator()  +
                "      (--/\\--)    \\__/"+ System.lineSeparator()  +
                "      _)(  )(_"+ System.lineSeparator()  +
                "     `---''---`"+ System.lineSeparator() );
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char literal_char = 'Z';
        int literal_int_oct = 012;
        long literal_long = 80L;
        float literal_float = 44e-1f;
        float literal_float2 = 5.5f;
        double literal_double_e_num = 8.88e1;
        int literal_int_hex = 0xface;
        double literal_double = 99.9;

        int sum = (int)literal_char + literal_int_oct + (int)literal_long + (int)literal_float +
                (int)literal_float2 + (int)literal_double_e_num + literal_int_hex + (int)literal_double;

        System.out.println( sum );
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int value_1 = scanner.nextInt();
        int value_2 = scanner.nextInt();

        System.out.println(value_1 + value_2);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        System.out.println("Before Swap:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After Swap:");
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner( System.in );
        int n1;
        int n2;

        System.out.print( "n1: " );
        n1 = scanner.nextInt();
        System.out.print( "n2: " );
        n2 = scanner.nextInt();

        if( n1 > n2 ){
            System.out.println( "n1 > n2" );
        }
        else if( n2 > n1 ){
            System.out.println( "n2 > n1" );
        }
        else{
            System.out.println( "n1 == n2" );
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int revenue = scanner.nextInt();

        if (revenue < 0 || revenue >= 100000)
            System.out.println("Invalid Revenue");
        else if (revenue <= 0 || revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (revenue <= 20000 || revenue < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (revenue <= 50000 || revenue < 80000) {
            System.out.println("Good Sales Revenue");
        } else if (revenue <= 80000 || revenue < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int eingabe = scanner.nextInt();
        double commr = 0;

        switch (eingabe){
            case 1:
                commr = 0.01;
                break;
            case 2:
                commr = 0.02;
                break;
            case 3:
                commr = 0.03;
                break;
            case 4:
                commr = 0.04;
                break;
            default:
                commr = 0;
        }
        System.out.println("Your Commission Rate was set to "+commr);
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner scanner = new Scanner( System.in );
        int year;

        System.out.print( "Year: ");
        year = scanner.nextInt();

        if( ( year % 4 == 0 ) && ( year % 100 != 0 ) || ( year % 400 == 0 ) ){
            System.out.println( "Leapyear" );
        }
        else{
            System.out.println( "Not a Leapyear" );
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int x = scanner.nextInt();
        int y = 0;


        while (x!= 0) {
            y *= 10;
            y += x % 10;
            x /= 10;
        }
        System.out.println(y);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}