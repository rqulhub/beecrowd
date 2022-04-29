import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int MaiorAB, MaiorT;
		a = sc.nextInt(); 
		b = sc.nextInt();
		c = sc.nextInt();

		MaiorAB= (a + b + Math.abs(a-b))/2;
		MaiorT= (MaiorAB + c + Math.abs(MaiorAB - c))/2;
		System.out.printf("%d eh o maior\n", MaiorT);

		
	}
}