
abstract class Test {

	public static void test(FactoryWords factory) {

		WordsExtractor wordsextractor = factory.getWordsExtractor();
		WordsCounter countWords = factory.getWordsCounter();
		FileReader file = factory.getFileReader("E:\\work\\rfc2822.txt");
		WordSave fileSave = factory.getWordSave("forSun.txt");

		file.readFile();

		wordsextractor.parseString(file.getFileString());

		countWords.wordsCounter(wordsextractor.getWords());

		fileSave.save(countWords);

	}// test

	public static void main(String[] args) {

		FactoryWords factory = new FactoryWords() {

			public FileReader getFileReader(String fileName) {
				return new FileReaderImplement(fileName);
			}

			public WordSave getWordSave(String fileName) {
				return new WordSaveImplement(fileName);
			}

			public WordsExtractor getWordsExtractor() {
				return new ImplementWordsExtraction();
			}

			public WordsCounter getWordsCounter() {
				return new WordsCounterImplement();
			};

		};

		test(factory);

	}// main

}// class;