public class TestaArrayMulti {
	public static void main(String[] args) {
		int[][] tabela;

		int[][] cubo[];

		int [][] quatroDimensoes[][];
		

		tabela = new int[10][5];
		cubo = new int[10][][];

		int[][] teste = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

		int[][] arrays = new int[2][];
		arrays[0] = new int[20];
		arrays[1] = new int[10];

		for(int i=0; i<arrays.length; i++){ 
			System.out.println(arrays[i].length);
		}

	}
}
