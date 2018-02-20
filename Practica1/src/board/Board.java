package board;
/** 
 *class of the board for the A* algorithm
 *S is the starting node
 *X obstacule on the way
 *E ending node
 *We define the board as NxM board size
 * @author usuario_local
 *
 */
public class Board {
private int n;
private int m;
private char [][] board;

public Board(){
	board=null;
}
public Board(int n,int m){
	board=new char[n][m];
	this.n=n;
	this.m=m;
	fillBoard();
}	
private void fillBoard(){
	
}

public char getPos(int n,int m)throws Exception{
	if(n>=this.n || m>=this.m)
		throw new Exception("Out of the board");
	return this.board[n][m];
}
public void setPos(int n,int m,char value)throws Exception{
	if(n>=this.n || m>=this.m)
		throw new Exception("Out of the board");
	this.board[n][m]=value;
	
}
}
