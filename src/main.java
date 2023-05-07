import java.util.ArrayList;
import java.util.List;

public class main {
	static List<submarines> submarinesList = new ArrayList<submarines>();

	public static void main(String[] args) {
		String [] [] board = new String [8][5];
		board = initilazeBoard(board);
		
		// Create board grid
		boardGame goardGrid = new boardGame (board);
		
		// Create 4 battlefield ships
		submarines smallBattlefield = new submarines ("OneSizeBlock", 1, "whole");
		submarines mediumBattlefield = new submarines ("OneSizeBlock", 2, "whole");
		submarines largeBattlefield = new submarines ("OneSizeBlock", 3, "whole");
		submarines xlargeBattlefield = new submarines ("OneSizeBlock", 4, "whole");
		
		submarinesList.add(smallBattlefield);
		submarinesList.add(mediumBattlefield);
		submarinesList.add(largeBattlefield);
		submarinesList.add(xlargeBattlefield);

	}
	
	public static String [][] initilazeBoard(String [][] board){
		String initilazeChar = "?";
		
		for (int x = 0; x <8 ; x++ ) {
			for (int y = 0; y<5 ; y++ ) {
				board[x][y]= initilazeChar;
			}
		}
		return board;	
	}
	
	public static void placeSubmarinesOnBoard (List<submarines> submarinesList, boardGame goardGrid ) {
		
		for (submarines sub : submarinesList) {
			int subSize = sub.getSize();
			// ToDo (not enough time to implement)
			
		}
	}

	
	public static String hit (int xCoordinate, int yCoordinate, boardGame goardGrid) {
		
		if (goardGrid.getBoard()[xCoordinate][yCoordinate].equals("sub")) {
			goardGrid.getBoard()[xCoordinate][yCoordinate]= "hit";
			
		}
		else {
			goardGrid.getBoard()[xCoordinate][yCoordinate]= "miss";
			return "miss";
		}
		return "Hit";
	}

}
