import java.util.*;
import java.lang.Math;

public class Hitungrekursif {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n;

        n = Integer.parseInt(input.nextLine());
        n = hitungrekursif(n);
        System.out.println(n);
    }
    
    public static int hitungrekursif(int n) {
        int result;

        if (n == 1) {
            result = 1;
        } else {
            result = hitungrekursif(n - 1) + n;
        }
        
        return result;
    }
}
