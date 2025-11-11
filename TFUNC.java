// Nadin Situmeang - 12S25052
// Miransya Gresia Siagian - 12S25031
import java.util.*;
import java.lang.Math;

public class  TFUNC{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, result;

        n = Integer.parseInt(input.nextLine());
        result = hitungrekursif(n);
        System.out.println("Bilangan yang dimasukkan : " + n);
        System.out.println("Hasil perhitungan rekursif : " + result);
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


