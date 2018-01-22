import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OkabeAndFutureGadgetLaboratory {

	public static void main(String[] args) {
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			int n = Integer.parseInt(reader.readLine());

			int grid[][] = new int[50][50];
			int m = 0;
			int x = 0;
			int z = 0;
			for (int i = 0; i < n; i++) {
				String a = reader.readLine();
				String a1[] = a.split(" ");
				for (int s = 0; s < a1.length; s++) {
					grid[z][s] = Integer.parseInt(a1[s]);

				}
				z++;

			}

			int abcd = matrix(grid, n);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static int matrix(int[][] grid, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1)
					continue;
				boolean pass = false;
				for (int r = 0; r < n; r++) {
					if (r == i)
						continue;
					for (int c = 0; c < n; c++) {
						if (c == j)
							continue;
						int sum = grid[r][j] + grid[i][c];
						if (sum == grid[i][j]) {
							pass = true;
							break;

						}
					}
					if (pass)
						break;
				}
				if (!pass) {
					System.out.println("NO");
					return 0;
				}
			}
		}

		System.out.println("YES");
		return 0;

	}
}
