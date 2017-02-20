package likeaboss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
	PrintWriter writer;
	File newFile;

	public FileWriter(String outputFile) throws FileNotFoundException {
		newFile = new File(outputFile);
		writer = new PrintWriter(newFile);
	}

	public void writeIntoOutput(int actualDamage) {
		String output = "" + actualDamage;
		writer.write(output);
		writer.flush();
		System.out.println(newFile.getAbsolutePath());
	}
}
