package eksamentester;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2}, {3,4}};
		for(int[] row: a){
			for(int col: row){
				System.out.println(col);
				//iterer et helt array fra min til max, vet ikke index
			}
		}
	}

}
