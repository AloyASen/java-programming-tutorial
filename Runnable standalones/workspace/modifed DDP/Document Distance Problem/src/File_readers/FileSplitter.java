package File_readers;
import java.io.*;

/**
  * A class to take a file and split it into smaller files
  * (for example, for fitting a file on floppy disks).
  * <P>To execute the program to split files apart, pass the -split
  * option and specify a filename:<BR>
  * <I>java FileSplitter -split bigFile.zip</I>
  * <P>To join a file back together, specify the -join flag and
  * give the base filename:<BR>
  * <I>java FileSplitter -join bigFile.zip</I><BR>
  * @author Aloy A Sen
  */
public class FileSplitter
	{
	/**
	  * a constant representing the size of a chunk that would be processed at a time.
	  * 10 MB each .
	  */


	/** the maximum size of each file "chunk" generated, in bytes 
	 * @throws IOException 
	 * @throws FileNotFoundException */
	public FileSplitter(String operation, String filepath ) throws FileNotFoundException, IOException {
		if (operation.equalsIgnoreCase("split")){
			split(filepath);
		}
		if (operation.equalsIgnoreCase("join")) {
			join(filepath);
		}
	}
	public static long chunkSize =(10*1024) ; //MB

	/*public static void main(String[] args) throws Exception
		{
		if (args.length != 2)
			{
			System.out.println("Must specify a flag -split or -join and a file argument. The file argument for splitting is the file to split and for joining is the base filename to join on.");
			System.exit(0);
			}

		try
			{
			if (args[0].equalsIgnoreCase("-split"))
				split(args[1]);
			else if (args[0].equalsIgnoreCase("-join"))
				join(args[1]);
			else
				{
				System.out.println("The first argument must be an option:");
				System.out.println("\t-split: split the specified file");
				System.out.println("\t-join: join all splitter outfiles with the specified base filename");
				System.exit(0);
				}
			}
		catch (FileNotFoundException e)
			{
			System.out.println("File not found: " + args[1]);
			}
		catch (IOException e)
			{
			System.out.println("IO Error");
			}
		}
*/
	/**
	  * split the file specified by filename into pieces, each of size
	  * chunkSize except for the last one, which may be smaller
	  */
	public void split(String filename) throws FileNotFoundException, IOException
		{
		// open the file
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(filename));

		// get the file length
		File f = new File(filename);
		long fileSize = f.length();
		long subfileSize=(1024*1024);
	 	long chunknos=(fileSize/(subfileSize*chunkSize));
		System.out.println(chunknos+"is the no of chunks for the file");
		// loop for each full chunk
		int subfile,chunk;


		for(chunk=0; chunk<chunknos;chunk++){

			// open the output file
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filename + "." + chunk));


		for (subfile = 0; subfile < fileSize / chunkSize; subfile++)
			{


			// write the right amount of bytes
			for (int currentKiloByte = 0; currentKiloByte < subfileSize; currentKiloByte++)
				{
				// load one byte from the input file and write it to the output file
				out.write(in.read());
				}

			// close the file

			}
			out.close();
		}

		// loop for the last chunk (which may be smaller than the chunk size)
		if (fileSize !=   (chunk - 1)*subfileSize*chunkSize)
			{
			// open the output file
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filename + "." + chunk));

			// write the rest of the file
			int b;
			while ((b = in.read()) != -1)
				out.write(b);

			// close the output file
			out.close();
			}

		// close the input file
		in.close();
		}

	/**
	  * list all files in the directory specified by the baseFilename
	  * , find out how many parts there are, and then concatenate them
	  * together to create a file with the filename <I>baseFilename</I>.
	  */
	public void join(String baseFilename) throws IOException
		{
		int numberParts = getNumberParts(baseFilename);

		// now, assume that the files are correctly numbered in order (that some joker didn't delete any part)
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(baseFilename));
		for (int part = 0; part < numberParts; part++)
			{
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(baseFilename + "." + part));

			int b;
			while ( (b = in.read()) != -1 )
				out.write(b);

			in.close();
			}
		out.close();
		}

	/**
	  * find out how many chunks there are to the base filename
	  */
	private static int getNumberParts(String baseFilename) throws IOException
		{
		// list all files in the same directory
		File directory = new File(baseFilename).getAbsoluteFile().getParentFile();
		final String justFilename = new File(baseFilename).getName();
		String[] matchingFiles = directory.list(new FilenameFilter()
			{
			public boolean accept(File dir, String name)
				{
				return name.startsWith(justFilename) && name.substring(justFilename.length()).matches("^\\.\\d+$");
				}
			});
		return matchingFiles.length;
		}
	}
