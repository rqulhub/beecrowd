import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double A, pi, r;
        
        pi = 3.14159;
        r = sc.nextDouble();
        A = Math.pow(r, 2) * pi;
        
        System.out.printf("A=%.4f\n", A);
 
    }
 
}