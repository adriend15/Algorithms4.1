import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("C:\\Users\\BT_1N3_17\\Desktop\\Numbers.txt");
        int a = mean();
        System.out.println(a);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while(s.hasNext()) {
            if(s.nextInt() % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }

    public static int twoDigit() throws FileNotFoundException{
        s = new Scanner(f);
        int twoDigits = 0;
        while(s.hasNext()) {
            int length = String.valueOf(s.nextInt()).length();
            if(length == 2) {
                twoDigits++;
            }
        }
        return twoDigits;
    }

    public static int greaterThan500() throws FileNotFoundException{
        s = new Scanner(f);
        int greaterThan5000x = 0;
        while(s.hasNext()) {

            if(s.nextInt() > 500) {
                greaterThan5000x++;
            }
        }
        return greaterThan5000x;
    }

    public static int greatestNumber() throws FileNotFoundException{
        s = new Scanner(f);
        int greatest = s.nextInt();
        while(s.hasNext()) {

            if(s.nextInt() > greatest) {
                greatest = s.nextInt();
            }
        }
        return greatest;
    }

    public static int smallest() throws FileNotFoundException{
        s = new Scanner(f);
        int smallest = s.nextInt();
        while(s.hasNext()) {

            if(s.nextInt() < smallest) {
                smallest = s.nextInt();
            }
        }
        return smallest;
    }

    public static int sumOfNumbers() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while(s.hasNext()) {
            sum += s.nextInt();
        }
        return sum;
    }

    public static int mean() throws FileNotFoundException{
        s = new Scanner(f);
        int amountOfNumbers = 0;
        int sum = 0;
        while(s.hasNext()) {
            sum += s.nextInt();
            amountOfNumbers++;
        }
        return sumOfNumbers() / amountOfNumbers;
    }



}