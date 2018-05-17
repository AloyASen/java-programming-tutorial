import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Aloy Aditya Sen
 *
 */class b{
static int maze[][];public b() {
	// TODO Auto-generated constructor stub
}static int r;static int c;
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
private static int forward(int a ,int b){
	int move =0;
	if (a==r-1&&b==c-1) {
		return 1;
	} else {
		if (a==0 || b==c-1) {
			if (a==0) {
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
			else if (b==c-1) {
				
				
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
			
		} else if (a==r-1 || b==0) {
			
			if (b==0) {				
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
		 else if (a==r-1){
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
		} else if (a>0 && a<r-1 && b>0 && b<c-1){ 
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
	
}
