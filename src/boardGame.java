import java.util.ArrayList;
import java.util.List;

public class boardGame {
	String [][] board = new String [8][5];
	List<submarines> submarines = new ArrayList<submarines>();
	
	
	public boardGame (String [][] board, List<submarines> sub) {
		this.board = board;
		this.submarines=sub;

	}
	
	public boardGame (String [][] board) {
		this.board = board;

	}


}
