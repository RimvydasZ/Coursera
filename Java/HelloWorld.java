import edu.duke.*;

public class HelloWorld {
	public void runHello () {
		FileResource res = new FileResource("HelloWorld_importfile.txt");
		for (String line : res.lines()) {
			System.out.println(line);
		}
	}
}
