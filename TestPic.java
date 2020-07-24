public class TestPic{

	public static void main(String[] args){

		Picture pic = new Picture(args[0]); // Picture is a pre-defined, abstract data type
		pic.show(); // show to display the image

		Picture pic2 = new Picture(args[1]);
		pic2.show();
	}
}