import java.util.Scanner;
public class HighPeakSolution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] a = new int[size][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				a[i][j] = sc.nextInt();
			}
		}
		int result[] = maxProfit(a);
		for(int i: result){
			System.out.println(i);
		}
		sc.close();
	}
	public static int[] maxProfit(int[][] a){
		int max = a[0][2];
		int sum = 0;
		for(int i=0;i<a.length;i++){
			sum+=a[i][2];
			if(max<a[i][2])
				max = a[i][2];
		}

		int[] result = new int[2];
		result[0] = a.length-1;
		result[1] = sum-max;
		return result;

	}
}
