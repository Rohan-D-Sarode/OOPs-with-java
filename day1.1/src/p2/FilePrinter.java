package p2;

public class FilePrinter implements Printer {
	@Override
	public void print(String message) {
		System.out.println("Saving  a message " + message 
				+ "in the file ");
	}
	public void openFile()// subtype
	{
		System.out.println("opening a file");
	}
	public void closeFile()//subtype
	{
		System.out.println("closing a file");
	}

}

