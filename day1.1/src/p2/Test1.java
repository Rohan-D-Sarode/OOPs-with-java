package p2;
import static p2.Printer.SPEED;
public class Test1 {

	public static void main(String[] args) {
		//direct ref.
		ConsolePrinter printer=new ConsolePrinter();
		printer.print("mesg1");
		//Non implemented calss can accesss interface conttents using " InterfaceName.constName
		System.out.println(SPEED);
	
		
		
	}

}
