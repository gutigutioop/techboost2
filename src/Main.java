
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

		try {
			Path file = Paths.get("./target/sample.txt");
			Files.createFile(file);
			System.out.println("ファイルを作成しました。");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
