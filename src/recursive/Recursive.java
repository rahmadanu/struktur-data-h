package recursive;

public class Recursive {
    static int countRecursive = 0;
    public static double pangkat(int x, int n) {

        ++countRecursive;
        System.out.println("recursive function " + countRecursive + " called");
        if (n == 0) {
            System.out.println("n is 0.. return 1");
            System.out.println("\nin recursive function " + countRecursive);
            System.out.println("recursive function " + countRecursive + " left");
            --countRecursive;
            return 1;
        } else if (n < 0) {
            System.out.println("n below 0.. n is " + n);
            double result = 1 / pangkat(x, -n);
            System.out.println("\nin recursive function " + countRecursive);
            System.out.println(1 + "/" + x + "^" + n + " is " + result);
            System.out.println("recursive function " + countRecursive + " left");
            --countRecursive;
            return result;
        }
        else if (n % 2 == 0) {
            System.out.println("even in.. n is " + n);
            double value = pangkat(x, n / 2);
            System.out.println("\nin recursive function " + countRecursive);
            System.out.println(x + "^" + n/2 + " * " + x + "^" + n/2 + " is " + value*value + " and n is " + n + " -even" );
            System.out.println("recursive function " + countRecursive + " left");
            --countRecursive;

            return value * value;
        }
        else {
            System.out.println("odd in.. n is " + n);
            double value = pangkat(x, n / 2);
            System.out.println("\nin recursive function " + countRecursive);
            System.out.println(x + "^" + n/2 + " * " + x +  "^" + n/2 + " * " + x + " is " + value*value*x + " and n is " + n + " -odd");
            System.out.println("recursive function " + countRecursive + " left");
            --countRecursive;

            return value * value * x;
        }
    }

    public static void main(String[] args) {
        System.out.println("result: " + pangkat(2, -4));
    }
}
