public class Editor4 {

	public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[2]);
		Color[][] sourceImage = Runigram.read(source);
		Runigram.setCanvas(sourceImage);
		color[][] newImage = Runigram.grayScaled(sourceImage);
		Runigram.morph(sourceImage, newImage, n);
	}
}
