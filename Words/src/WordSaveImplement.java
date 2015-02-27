import java.io.*;

public class WordSaveImplement implements WordSave {

	private File file;

	public WordSaveImplement(String name) {

		file = new File(name);
	}

	public void save(WordsCounter wordscounter) {

		try {

			file.createNewFile();

			PrintWriter save = new PrintWriter(file);

			for (int i = 0; i < wordscounter.getWordCount(); i++) {

				save.println(wordscounter.getFinalWord(i) + " "
						+ wordscounter.getFinalWordCount());

			}

			save.close();

		} catch (IOException e) {
		}

	}// save

};