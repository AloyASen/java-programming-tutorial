package File_readers;

import java.util.Iterator;
import java.util.Vector;

public class Document_dist_compute {
	Vector<Word_details_enlister> v1,v2;
public Document_dist_compute(Vector<Word_details_enlister> vect1, Vector<Word_details_enlister> vect2) {
	// TODO Auto-generated constructor stub
	this.v1=vect1;
	this.v2=vect2;
}
public Vector<Word_details_enlister> innerProduct() {
	Vector<Word_details_enlister> meCount = new Vector<>();
	Iterator<Word_details_enlister> itr1 =v1.iterator();
	Iterator<Word_details_enlister> itr2 =v2.iterator();
	 while (itr1.hasNext()) {
		Word_details_enlister pattern1=itr1.next();//System.out.println("h");
		int pat1 = 0;
		//Create the new inner product enlister
		Word_details_enlister patt =new Word_details_enlister(pattern1.wordS,pattern1.getCount());
		 while (itr2.hasNext()) {
			Word_details_enlister pattern2=itr2.next();
			//System.out.print("i");
			//check for identical words
			if (pattern1.wordS.equalsIgnoreCase(pattern2.wordS)) {
				pat1++; // incrementing the flags denote that word similarities have been found
				patt.setFreq((pattern1.getFreq()*pattern2.getFreq()));
				patt.setCount((pattern1.getCount()+pattern2.getCount()));
				
				break; //since all the words are unique 
			} else {
				//continue and check the next word in iterator 2
			}
			
		}
		if (pat1==0) {
			//no similarities among present word and iterator word
			patt.setFreq((pattern1.getFreq()));
		} else {
			
		}
		meCount.addElement(patt);// this will be returned 
	}
	return meCount;  
	
}
}
