package parsererror;

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
import parsererror.Document_dist_compute;
import parsererror.Word_details_enlister;

/**
 * @author Aloy Aditya Sen
 *
 */
public class The_reader implements Runnable {

	/**
	 * @param filepath ,file this the path of the file that is to be operated on
	 */
	
	
	
	String file1 ,file2;
	@SuppressWarnings("unused")
	private int i;

	 public The_reader(String file1 , String  file2) {
		// TODO Auto-generated constructor stub
		 this.file1=file1;
		 this.file2=file2;



	}
	 synchronized private void Display(Vector<Word_details_enlister> e) {
			Iterator<Word_details_enlister> itr =e.iterator();

			while (itr.hasNext()) {
				Word_details_enlister t = itr.next();
				System.out.println("the next word is "+t.getWordS());
				System.out.println("the word frequency is "+ t.getFreq());

			}
	}
	 synchronized private int total_inner_product(Vector<Word_details_enlister> e) {
			Iterator<Word_details_enlister> itr =e.iterator();
			int temp=0;
			while (itr.hasNext()) {
				Word_details_enlister t = itr.next();
				temp+=t.getFreq();

			}
			return temp;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Vector<Word_details_enlister> temp1=file1_tokenizer();
		//System.out.println("end of display tablesof file1");
		Vector<Word_details_enlister> temp2=file2_tokenizer();
		Document_dist_compute ddc=new Document_dist_compute(temp1,temp2);
		Vector<Word_details_enlister> temp3=ddc.innerProduct();
		//Display(temp1);
		int temporary1=total_inner_product(temp3);
		
		//---------------------------
		System.out.println(temporary1);//this is the inner product to be used in the calculations
		//---------------------
		//now normalizers
		System.out.println("blah blah");
		Document_dist_compute ddc2=new Document_dist_compute(temp1,temp1);
		double temporary2=Math.sqrt(total_inner_product(ddc2.innerProduct()));
		Document_dist_compute ddc3=new Document_dist_compute(temp2,temp2);
		double temporary3=Math.sqrt(total_inner_product(ddc3.innerProduct()));
		System.out.println(temporary2);
		System.out.println(temporary3);
		System.out.println((temporary2*temporary3));
		double docdist=Math.acos(temporary1/(temporary2*temporary3));
		if (docdist==0) {
			//bapi da your code here
		}
		System.out.println("ha ha document dist  ::  "+ docdist);
		
}
	private Vector<Word_details_enlister> file1_tokenizer() {
		Vector<Word_details_enlister> words = new Vector<>();
		List<Byte> UNI_WORD_list;
		Scanner sc = null;
		try {
			sc= new Scanner(new File(file1));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("the File is not present see the path is correct ");
		}
		Byte ReadLine;
		UNI_WORD_list=new ArrayList<>();

		i = 0;
		while (sc.hasNextByte()){
			ReadLine= sc.nextByte();
			if (UNI_WORD_list.isEmpty()) {
				UNI_WORD_list.add(ReadLine);
				words.addElement(new Word_details_enlister(ReadLine));


			} else {
				if (UNI_WORD_list.contains(ReadLine)) {
					int l=UNI_WORD_list.indexOf(ReadLine);;
					words.elementAt(l).setFreq(words.elementAt(l).getFreq()+1);
				} else {
					UNI_WORD_list.add(ReadLine);
					words.addElement(new Word_details_enlister(ReadLine));


				}
			}



			i++;
			} 
		// the word list containing frequency of each word is detected --file1
		return words;
	}
	private Vector<Word_details_enlister> file2_tokenizer() {
		Vector<Word_details_enlister> words = new Vector<>();
		List<Byte> UNI_WORD_list;
		Scanner sc = null;
		try {
			sc= new Scanner(new File(file2));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("the File is not present see the path is correct ");
		}
		Byte ReadLine;
		UNI_WORD_list=new ArrayList<>();

		i = 0;
		while (sc.hasNextByte()) {
			ReadLine= sc.nextByte();
			if (UNI_WORD_list.isEmpty()) {
				UNI_WORD_list.add(ReadLine);
				words.addElement(new Word_details_enlister(ReadLine));


			} else {
				if (UNI_WORD_list.contains(ReadLine)) {
					int l=UNI_WORD_list.indexOf(ReadLine);;
					words.elementAt(l).setFreq(words.elementAt(l).getFreq()+1);
				} else {
					UNI_WORD_list.add(ReadLine);
					words.addElement(new Word_details_enlister(ReadLine));


				}
			}



			i++;
			} 
		// the word list containing frequency of each word is detected --file2 
		return words;
	}
	}
