import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    double A, B, M;
    A = sc.nextDouble();
    B = sc.nextDouble();
    M = ((A *3.5) + (B* 7.5))/11;
    System.out.printf("MEDIA = %.5f\n", M);
    }
 
}