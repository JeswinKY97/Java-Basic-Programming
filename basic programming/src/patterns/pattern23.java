package patterns;
import java.util.*;
public class pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i, j, k = 65;
		for (i = 0; i <n; i++) {
			for (j = 0; j <=i; j++) {
				System.out.printf("%c", k+j);
			}

			System.out.println();
		}
	}

}
