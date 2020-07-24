public class TVGuide{
	// inserting cName into array position/indexx cNbr
	public static void add (String[] array, int cNbr, String cName){

	}
	public static void print (String[] array){
		for (int i = 0; i < array.length; i++){
			StdOut.println("[" + i + "] - " + array[i]);
		}
	}
	public static void main (String[] args){
		StdOut.print("Enter number of channels for the guide: ");
		int nbrChannels = StdIn.readInt();

		while ( nbrChannels < 1){
			StdOut.print("Enter a value > 1: ");
			nbrChannels = StdIn.readInt;
		}

		String[] tvGuide = new String[nbrChannels];
		boolean quit = false;

		do{
			StdOut.print("[1-add channel, [2]-quit");
			int option = StdIn.readInt();
			if (option == 1){
				StdOut.print("Enter channel name: ");
				String name = StdIn.readString(); // reads a String

				StdOut.print("Enter channel number: ");
				int number = StdIn.readInt();

				add (tvGuide, number, name);
			} else if (option == 2){
				quit = true;
			}
		} while (quit == false);
	}
}