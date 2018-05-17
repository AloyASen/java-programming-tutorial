package parsererror;

//getter setters and the constructor 

public class Word_details_enlister {
	Byte wordS;
	int Freq;

    public Byte getWordS() {
        return wordS;
    }
        
	Word_details_enlister np;
	public int getFreq() {
		return Freq;
	}
	public void setFreq(int freq) {
		Freq = freq;
	}
	public Word_details_enlister getNp() {
		return np;
	}
	public void setNp(Word_details_enlister np) {
		this.np = np;
	}
	public Word_details_enlister(byte wrd ) {
		this.wordS=wrd;
		this.Freq=1;
		np=null;
	}

}
