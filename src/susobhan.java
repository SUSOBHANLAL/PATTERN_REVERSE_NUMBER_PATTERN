import java.util.*;
public class susobhan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the row no ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();

		}
				
	}

}
