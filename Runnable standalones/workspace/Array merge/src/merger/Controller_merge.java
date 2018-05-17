package merger;



import array_no_1.input1;
import array_no_2.input2;

public class Controller_merge {

	int ar3[];
	private int i;
	public Controller_merge() {
		// TODO Auto-generated constructor stub
		
		ar3= new int[(input1.a1.length+input2.a2.length)];
		System.out.println(ar3.length);
		for ( i = 0; i <(input1.a1.length) ; i++) {  // taken input1 is bigger in length than input2
			// check for insert 
			int count=0, flag=0, pipe=0;
			if(i==0){
				if(input2.a2[i]<input1.a1[i]){
					count=input2.a2[i];
					ar3[flag]=count;
					flag++;
					ar3[flag]=input1.a1[i];
				}
			}else{
				int temp;
				if(input2.a2[i]>input1.a1[i]){
					count=input1.a1[i];
					pipe=input2.a2[i];
				}else{
					count=input2.a2[i];
					pipe=input1.a1[i];
				}
				if(count<ar3[flag]){
					temp=ar3[flag];
					ar3[flag]=count;
					flag++;
					ar3[flag]=temp;
					
				}
				else if (count>=ar3[flag]) {
					if(pipe>ar3[flag]){
						temp=ar3[flag];
						ar3[flag]=pipe;
						flag++;
						
					}else {
						temp=ar3[flag];
						ar3[flag]=count;
						flag++;
					}
					ar3[flag]=temp;
					flag++;
				}
			}
		}
		
	}
	private void display() {
		// TODO Auto-generated method stub
		System.out.println("the merged aarray is ");
		for(i=0;i<ar3.length;i++){
			System.out.print( ar3[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a note of disclaimer::\t  ALL the below inuts should be in Ascending Order");
		input1.input(args);
		///the first sorted array is accepted into input1.a1[]  and this array is sorted in ascending order

		input2.input(args);
		//the second sorted array is accepted into input2.a2[]  and this array is sorted in ascending order
		
		
		
		//the logic of merging
		Controller_merge ob = new Controller_merge();
		//display the result 
		ob.display();
	}

}
