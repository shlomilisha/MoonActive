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

	public String[][] getBoard() {
		return board;
	}

	public void setBoard(String[][] board) {
		this.board = board;
	}

	public List<submarines> getSubmarines() {
		return submarines;
	}

	public void setSubmarines(List<submarines> submarines) {
		this.submarines = submarines;
	}


}
