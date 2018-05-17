package File_readers;

/**
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author Aloy Aditya Sen
 *
 */
public class The_reader implements Runnable {

	/**
	 * @param filepath ,file this the path of the file that is to be operated on
	 */
	Scanner sc;
	
	
	String file1 ;//;
	private int i;					//dummy counter

	 public The_reader(String file1 ){ //, String  file2) {
		// TODO Auto-generated constructor stub
		 this.file1=file1;
		 //this.file2=file2;



	}
	 @SuppressWarnings("unused")
	synchronized private void Display(Vector<Word_details_enlister> e) {
			Iterator<Word_details_enlister> itr =e.iterator();

			while (itr.hasNext()) {
				Word_details_enlister t = itr.next();
				System.out.println("the next word is "+t.wordS);
				System.out.println("the word frequency is "+ t.Freq);

			}
	}
	 synchronized private int total_inner_product(Vector<Word_details_enlister> e) {
			Iterator<Word_details_enlister> itr =e.iterator();
			int temp=0;
			while (itr.hasNext()) {
				Word_details_enlister t = itr.next();
				temp+=t.getFreq()+t.getCount();

			}
			return temp;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Vector<Word_details_enlister> temp1=file1_tokenizer();
		//System.out.println("end of display tablesof file1");
		//Vector<Word_details_enlister> temp2=file2_tokenizer();
		//Document_dist_compute ddc=new Document_dist_compute(temp1,temp2);
		//Vector<Word_details_enlister> temp3=ddc.innerProduct();
		//Display(temp1);
		//int temporary1=total_inner_product(temp3);
		
		//---------------------------
		//System.out.println("First Value : "+ temporary1);//this is the inner product to be used in the calculations
		//---------------------
		//now normalizers
		/*
		Document_dist_compute ddc2=new Document_dist_compute(temp1,temp1);
		double temporary2=Math.sqrt(total_inner_product(ddc2.innerProduct()));
		Document_dist_compute ddc3=new Document_dist_compute(temp2,temp2);
		double temporary3=Math.sqrt(total_inner_product(ddc3.innerProduct()));
		System.out.println(temporary2);
		System.out.println(temporary3);
		System.out.println((temporary2*temporary3));
		double R=(temporary1*1.0)/(temporary2*temporary3);
		System.out.println(R);
		double DR=0;
		//double docdist=Math.acos(temporary1/(temporary2*temporary3));
		DR=R;
		if(temporary2==temporary3){
		DR=R;
		R=1;
		}
			
		if((temporary2*temporary3)==temporary1)
		{
			R=1;
			
		}else
			R=DR;
		
				double docdist=Math.acos(R);
		System.out.println("The document dist is  ::  "+ docdist);
		if (docdist==0.0) {
			//bapi da your code here
			System.out.println("Two documents are  exactly same (Content wise)");
		}
		else
		{
			System.out.println("Two documents are  not  same (Content wise)");
		}
		
		*/
}
	private Vector<Word_details_enlister> file1_tokenizer() {
		Vector<Word_details_enlister> words = new Vector<>();
		List<String> UNI_WORD_list;
		try {
			sc= new Scanner(new File(file1));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("the File is not present see the path is correct ");
		}
		String ReadLine;
		UNI_WORD_list=new ArrayList<>();

		i = 0;
		do {
			ReadLine= sc.next(); i++;
			if (UNI_WORD_list.isEmpty()) {
				UNI_WORD_list.add(ReadLine);
				words.addElement(new Word_details_enlister(ReadLine,i));


			} else {
				if (UNI_WORD_list.contains(ReadLine)) {
					int l=UNI_WORD_list.indexOf(ReadLine);;
					words.elementAt(l).setFreq(words.elementAt(l).getFreq()+1);
					words.elementAt(l).setCount(i);
				} else {
					UNI_WORD_list.add(ReadLine);
					words.addElement(new Word_details_enlister(ReadLine,i));


				}
			}

			} while (sc.hasNext());
		// the word list containing frequency of each word is detected --file1
		return words;
	}
	/*private Vector<Word_details_enlister> file2_tokenizer() {
		Vector<Word_details_enlister> words = new Vector<>();
		List<String> UNI_WORD_list;
		try {
			sc= new Scanner(new File(file2));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("the File is not present see the path is correct ");
		}
		String ReadLine;
		UNI_WORD_list=new ArrayList<>();

		i = 0;
		do {
			ReadLine= sc.next(); i++;
			if (UNI_WORD_list.isEmpty()) {
				UNI_WORD_list.add(ReadLine);
				words.addElement(new Word_details_enlister(ReadLine,i));


			} else {
				if (UNI_WORD_list.contains(ReadLine)) {
					int l=UNI_WORD_list.indexOf(ReadLine);;
					words.elementAt(l).setFreq(words.elementAt(l).getFreq()+1);
					words.elementAt(l).setCount(i);
				} else {
					UNI_WORD_list.add(ReadLine);
					words.addElement(new Word_details_enlister(ReadLine,i));


				}
			}

			} while (sc.hasNext());
		// the word list containing frequency of each word is detected --file2 
		return words;
	}*/
	}
