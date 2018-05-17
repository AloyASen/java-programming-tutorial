import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Maze_redrawn1 {
	static int maze[][];
	public Maze_redrawn1() {
		// TODO Auto-generated constructor stub
	}
	static int r;static int c;static int move;
	public static void main (String  ... orange) throws NumberFormatException, IOException{
		//create the closed maze
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
		System.out.println("input the dimensions of the maze");
		System.out.println("no of rows");
		 r= Integer.parseInt( br.readLine());
	 	System.out.println("no of columns");
	 	c= Integer.parseInt( br.readLine());
		maze=new int[r][c];

		//make the maze with walls 
		//input '0'no blck --'1'block
		System.out.println("input the maze");
		for(int i=0;i<r;i++){
			System.out.println("input data for row");
			for(int j=0;j<c;j++){
				maze[i][j]=Integer.parseInt( br.readLine());
				
			}
		}
		//let the maze runner start from the top left corner 
		//that is maze[0][0]to right bottom corner ie maze[r-1][c-1]
		int did=forward(0,0);
		if (did==1){
			System.out.println("the maze is run sucessfully");
		}
	 
	}
	private static int forward(int a, int b) {
		// TODO Auto-generated method stub
		 move = 0;
		int flow=0;
		if(a==0){
			Row_one(a,b);flow=1;
		}if (b==c-1){
			Column_end(a,b);flow=1;
		}if (a==r-1) {
			Row_end(a,b);flow=1;
		}if(b==0){
			Column_one(a,b);flow=1;
		}
		if(flow==0){
			if (maze[a-1][b]==0)//top
			{
				move=1;
			}
			if (maze[a][b-1]==0)//left
			{
				move=4;
			}
			if (maze[a][b+1]==0)//right
			{	
				move=2;
			}
			if (maze[a+1][b]==0)//bottom
			{
				move=3;
			}
		}
		
		
		switch (move) {
		case 1:
			forward(a-1, b);
			break;
		case 2:
			forward(a, b+1);
			break;
		case 3:
			forward(a+1, b);
			break;
		case 4:
			forward(a, b-1);
			break;
		case 0:
			break;
		}
	return move;
	}
	private static void Column_one(int a, int b) {
		if (a==0||a==r-1) {
			if(a==0){
				row_left(a,b,1);//on top of the column
			}if(a==r-1){
				row_left(a, b, 2);//on bottom of column
			}
				
		} else {
			if (maze[a-1][b]==0)//top
			{
				move=1;
			}
			if (maze[a][b+1]==0)//right
			{	
				move=2;
			}
			if (maze[a+1][b]==0)//bottom
			{
				move=3;
			}

		}
		return;
		
	}
	private static void Row_end(int a, int b) {
		if (b==0||b==c-1) {
			if(b==0){
				row_left(a, b,1);
			}if(b==c-1){
				row_right(a, b,2);
			}
		} else {
			if (maze[a-1][b]==0)//top
			{
				move=1;
			}
			if (maze[a][b-1]==0)//left
			{
				move=4;
			}
			if (maze[a][b+1]==0)//right
			{	
				move=2;
			}
		}
		return;
		
	}
	private static void Column_end(int a, int b) {
		if (a==0||a==r-1) {
			if(a==0){
				row_right(a, b, 1);
			}if(a==r-1){
				row_right(a, b, 2);
			}
				
		} else {

			
			if (maze[a-1][b]==0)//top
			{
				move=1;
			}
			if (maze[a][b-1]==0)//left
			{
				move=4;
			}
			if (maze[a+1][b]==0)//bottom
			{
				move=3;
			}

		}
		return;
		
	}
	private static void Row_one(int a, int b) {
		if (b==0||b==c-1) {
			if(b==0){
				row_left(a,b,1);
			}if(b==c-1){
				row_right(a,b,2);
			}
		} else {
			if (maze[a][b-1]==0)//left
			{
				move=4;
			}
			if (maze[a][b+1]==0)//right
			{	
				move=2;
			}
			if (maze[a+1][b]==0)//bottom
			{
				move=3;
			}
		}
		return;
		
	}
	private static void row_left(int a, int b, int i) {
		if (i==1) {
			if (maze[a][b+1]==0)//right
			{	
				move=2;
			}
			if (maze[a+1][b]==0)//bottom
			{
				move=3;
			}
		} else {
			if (maze[a-1][b]==0)//top
			{
				move=1;
			}
			if (maze[a][b+1]==0)//right
			{	
				move=2;
			}
		}
		
	}
	private static void row_right(int a, int b, int i) {
		// TODO Auto-generated method stub
		if (i==1) {
			
			if (maze[a+1][b]==0)//bottom
			{
				move=3;
			}
			if (maze[a][b-1]==0)//left
			{
				move=4;
			}
		} else {
			if (maze[a-1][b]==0)//top
			{
				move=1;
			}
			if (maze[a][b-1]==0)//left
			{
				move=4;
			}
			
		}
	}
}
