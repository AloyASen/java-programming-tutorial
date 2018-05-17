package File_readers;

//getter setters and the constructor 

public class Word_details_enlister {
	int count;
	String wordS;
	int Freq;
	Word_details_enlister np;
	public int getFreq() {
		return Freq;
	}
	public void setFreq(int freq) {
		Freq = freq; 
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count+this.count;
	}
	public Word_details_enlister getNp() {
		return np;
	}
	public void setNp(Word_details_enlister np) {
		this.np = np;
	}
	public Word_details_enlister(String wrd ,int i) {
		this.count=i;
		this.wordS=wrd;
		this.Freq=1;
		np=null;
	}

}
